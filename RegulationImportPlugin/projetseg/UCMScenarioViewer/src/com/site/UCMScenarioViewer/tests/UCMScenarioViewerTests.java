package com.site.UCMScenarioViewer.tests;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWTError;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import com.site.UCMScenarioViewer.UCMScenarioViewer;

public class UCMScenarioViewerTests extends TestCase {
    private UCMScenarioViewer editor;
    private IFile testfile;
    private IWorkbenchPage page;

    protected void setUp() throws Exception {
        super.setUp();

        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject testproject = workspaceRoot.getProject("ucmscenarioviewer-tests"); //$NON-NLS-1$
        if (!testproject.exists())
            testproject.create(null);

        if (!testproject.isOpen())
            testproject.open(null);

        String testFilename = "test.jucmscenarios"; //$NON-NLS-1$

        testfile = testproject.getFile(testFilename);
        // start with clean file
        if (testfile.exists())
            testfile.delete(true, false, null);

        testfile.create(UCMScenarioViewerTests.class.getResourceAsStream(testFilename), false, null);

        page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(testfile.getName());
        editor = (UCMScenarioViewer) page.openEditor(new FileEditorInput(testfile), desc.getId());
    }

    public void testHandleProblem() throws Exception {
        // try to make it run out of handles.
        int i = 0;
        try {
            for (i = 0; i < 100; i++) {
                page.closeEditor(editor, false);
                IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(testfile.getName());
                editor = (UCMScenarioViewer) page.openEditor(new FileEditorInput(testfile), desc.getId());
            }
        } catch (SWTError error) {
            System.err.println("Out of handles after " + i + " iterations");
            error.printStackTrace();
        }

    }

    protected void tearDown() throws Exception {
        page.closeEditor(editor, false);
        super.tearDown();
    }

}
