/*
 * Created on 31-Mar-2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.wizards;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;

import com.site.UCMScenarioViewer.model.ScenarioGroup;
import com.site.UCMScenarioViewer.utils.Helper;

/**
 * jkealey: Tree should not be extended; this class can no longer be used and has to be refactored. 
 * 
 * @author mkova062
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WorkspaceModelsTree extends Tree {
    public static final String NOT_SELECTED_ERROR = "UCM Scenario model file to export isn't selected";
    public static final String FILE_CORRUPTED_ERROR = ".scenarios file is corrupted. Model can't be read";
    
    private IWorkspace workspace;
    private IFile defaultSelection;
    
    public WorkspaceModelsTree(Composite parent, IFile defaultSelected) {
        super(parent, SWT.BORDER | SWT.SINGLE);        

        this.defaultSelection = isUCMScenarioResource(defaultSelected) ? defaultSelected : null;
    }

    // Page data manipulation
    public void setWorkspace(IWorkspace workspace) {
        if (workspace == null) {
            throw new IllegalArgumentException("Workspace can not be null");        
        }
        
        this.workspace = workspace;
        fillModelsTree();
    }
    
    public void setSelected(String modelFileName) {
        setSelected(findModelFile(modelFileName));
    }

    public void setSelected(IFile res) {
        if (res == null) {
            return;
        }
        
        TreeItem ti = findItem(this, res, new Comparator() {
            public int compare(Object o1, Object o2) {
                
                return o1.equals(o2) ? 0 : -1;
            }
        });
        
        setSelection(new TreeItem[] {ti});
    }
    
    public ScenarioGroup getSelectedModel() {
        return findModel(getSelected());
    }
    
    public IFile getSelected() {
        IResource newSelected = null;
        if (getSelectionCount() > 0) {
            TreeItem selected = getSelection()[0];
            IResource iResource = (IResource) selected.getData();
            if (isUCMScenarioResource(iResource)) {
                newSelected = iResource;
            }
        }
        
        return (IFile)newSelected;
    }
    
    private void fillModelsTree() {
        removeAll();
        IProject[] projects = workspace.getRoot().getProjects();
        for (int i = 0; i < projects.length; i++) {
            TreeItem projectItem = createProjectTreeItem(projects[i]);
            if (projects[i].isAccessible()) {
                fillProjectTree(projectItem, projects[i]);
            }
        }
    }
    
    public String testModelSelected() {
        return getSelected() == null || !isUCMScenarioResource(getSelected()) ? NOT_SELECTED_ERROR : null;
    }

    public String testModelCorrectness() {
        return getSelectedModel() == null ? FILE_CORRUPTED_ERROR: null;
    }
    
    private TreeItem createProjectTreeItem(IProject project) {
        TreeItem projectItem = new TreeItem(this, SWT.NONE);
//        ImageDescriptor icon;
//
//        if (project.isAccessible()) {
//            icon = /*Helper.EXPORT_WIZARD_BANNER*/ null;
//        } else {
//            icon = /*Helper.IMPORT_WIZARD_BANNER*/ null;
//        }

        projectItem.setText(project.getName());
        //projectItem.setImage(icon.createImage());
        projectItem.setData(project);

        return projectItem;
    }

    private void fillProjectTree(TreeItem projectItem, IProject project) {
        DiTree diTree = new DiTree(project);
        TreeItem selectedItem = diTree.fillProjectTree(projectItem, defaultSelection);
        if (selectedItem != null) {
            setSelection(new TreeItem[] {selectedItem});
        }
    }
    
    
    /**
     * Tree where every non-leaf node has leaf children or at least two non-leaf
     * children after normalization.
     */
    static class DiTree {
        private NonLeafNode root;

        public static abstract class Node {
            abstract public IResource getData();

            abstract public boolean isLeaf();

            abstract public ImageDescriptor getImageDescriptor();
        }

        private static class LeafNode extends Node {
            private IResource data;

            public LeafNode(IResource data) {
                this.data = data;
            }

            public IResource getData() {
                return data;
            }

            public ImageDescriptor getImageDescriptor() {
                return Helper.FONT_CHANGE_BUTTON;
            }

            public boolean isLeaf() {
                return true;
            }

            public String toString() {
                return data.getName();
            }
        }

        private static class NonLeafNode extends Node {
            private LinkedList data = new LinkedList();
            private LinkedList children = new LinkedList();

            public NonLeafNode(IContainer data) {
                this.data.add(data);
            }

            public List getChildren() {
                return children;
            }

            public void addChild(Node child) {
                children.add(child);
            }

            public Node getChild(int index) {
                return (Node) children.get(index);
            }

            public int countChildren() {
                return children.size();
            }

            public IResource getData() {
                return (IResource) data.getLast();
            }

            public ImageDescriptor getImageDescriptor() {
                return Helper.FONT_CHANGE_BUTTON;
            }

            public boolean isLeaf() {
                return false;
            }

            public String toString() {
                StringBuffer buffer = new StringBuffer();
                for (Iterator i = data.iterator(); i.hasNext();) {
                    IResource element = (IResource) i.next();
                    buffer.append(element.getName());
                    if (i.hasNext()) {
                        buffer.append("/");
                    }
                }
                return buffer.toString();
            }
        }

        public DiTree(IContainer rootData) {
            root = createNonLeafNode(rootData, true);
        }

        public TreeItem fillProjectTree(TreeItem projectItem, IResource defaultSelected) {
            return fillNonLeafTreeItem(projectItem, root, defaultSelected);
        }

        private static TreeItem fillNonLeafTreeItem(TreeItem item, NonLeafNode node, IResource defaultSelected) {
            TreeItem selectedItem = null;
            for (Iterator i = node.getChildren().iterator(); i.hasNext();) {
                Node child = (Node) i.next();
                TreeItem childItem = createNodeTreeItem(item, child);

                if (! child.isLeaf()) {
                    TreeItem si = fillNonLeafTreeItem(childItem, (NonLeafNode) child, defaultSelected);
                    selectedItem = si != null ? si : selectedItem;
                } else if (child.getData().equals(defaultSelected)) {
                    selectedItem = childItem;
                }
            }
            return selectedItem;
        }

        private static TreeItem createNodeTreeItem(TreeItem parent, Node node) {
            TreeItem item = new TreeItem(parent, SWT.NONE);
            item.setText(node.toString());
            item.setData(node.getData());
            item.setImage(node.getImageDescriptor().createImage());
            return item;
        }

        private static NonLeafNode createNonLeafNode(IContainer data, boolean isRoot) {
            NonLeafNode node = new NonLeafNode(data);
            try {
                if (data.isAccessible()) {
                    IResource[] members = data.members();
                    fillNonLeafNode(node, members);
                    if (!isRoot && node.countChildren() == 1 &&
                        !node.getChild(0).isLeaf()) {
                    	NonLeafNode child = (NonLeafNode) node.getChild(0);
                        child.data.addFirst(node.getData());
                        node = child;
                    }
                }
            } catch (CoreException e) {
            	System.err.println(e);
            }
            return node;
        }

        private static LeafNode createLeafNode(IResource data) {
            return new LeafNode(data);
        }

        private static void fillNonLeafNode(NonLeafNode node, IResource[] data) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] instanceof IContainer) {
                    NonLeafNode child = createNonLeafNode((IContainer) data[i], false);
                    if (child.countChildren() > 0) {
                        node.addChild(child);
                    }
                } else if (isUCMScenarioResource(data[i])) {
                    LeafNode child = createLeafNode(data[i]);
                    node.addChild(child);
                }
            }
            Collections.sort(node.getChildren(), new Comparator() {
                public int compare(Object o1, Object o2) {
                    if (o1 instanceof Node && o2 instanceof Node) {
                        Node node1 = (Node) o1;
                        Node node2 = (Node) o2;

                        int isLeaf1 = node1.isLeaf() ? 1 : 0;
                        int isLeaf2 = node2.isLeaf() ? 1 : 0;

                        if (isLeaf1 != isLeaf2) {
                            return isLeaf1 - isLeaf2;
                        } else {
                            return node1.toString().compareToIgnoreCase(node2.toString());
                        }
                    } else {
                        return 0;
                    }
                }
            });
        }
    }
    
    public static boolean isUCMScenarioResource(IResource iResource) {
        return true/*iResource != null && Helper.EXTENSION_SCENARIOS.equalsIgnoreCase(iResource.getFileExtension())*/;
    }
    
    public static IFile findModelFile(String modelFileName) {
        if (modelFileName == null) {
            return null;
        }
        
        IResource res = ResourcesPlugin.getWorkspace().getRoot().findMember(modelFileName);
        
        if (res != null && res.exists() && res instanceof IFile) {
            return (IFile)res;
        }
        
        return null;
    }

    public static TreeItem findItem(Tree tree, Object data, Comparator c) {
        if (tree == null || data == null) {
            return null;
        }
        
        TreeItem ti;
        TreeItem[] children = tree.getItems();
        for (int i = 0; i < children.length; i++) {
            ti = findItem(children[i], data, c);
            
            if (ti != null) {
                return ti;
            }
        }
        
        return null;
    }

    private static TreeItem findItem(TreeItem parent, Object data, Comparator c) {
        if (c.compare(data, parent.getData()) == 0) {
            return parent;
        }
        
        TreeItem ti;
        TreeItem[] children = parent.getItems();
        if (children != null && children.length > 0) {
            for (int i = 0; i < children.length; i++) {
                ti = findItem(children[i], data, c);
                
                if (ti != null) {
                    return ti;
                }
            }
        }
        return null;
    }
    
    public static ScenarioGroup findModel(IFile modelFile) {
        if (modelFile == null) {
            return null;
        }
        ScenarioGroup model = Helper.findModelInWorkbench(PlatformUI.getWorkbench(), modelFile);
        if (model != null) {
            return model;
        } else {
            return Helper.readModel(modelFile);
        }
    }
    
}
