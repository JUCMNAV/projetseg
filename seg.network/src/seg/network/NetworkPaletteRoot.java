/*
 * Created on 2005-01-30
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package seg.network;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.MarqueeToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.gef.palette.ToolEntry;

import seg.network.model.ModelCreationFactory;
import seg.network.model.network.Link;
import seg.network.model.network.Node;


public class NetworkPaletteRoot extends PaletteRoot
{

    /**
     * Creates a new NetworkPaletteRoot instance.
     * 
     */
    public NetworkPaletteRoot()
    {
        // create root
        super();

        // a group of default control tools
        PaletteGroup controls = new PaletteGroup("Controls");
        add(controls);

        // the selection tool
        ToolEntry tool = new SelectionToolEntry();
        controls.add(tool);

        // use selection tool as default entry
        setDefaultEntry(tool);

        // the marquee selection tool
        controls.add(new MarqueeToolEntry());


        CreationToolEntry entry;

        entry =
            new CreationToolEntry(
                "Node",
                "Creates a node",
                new ModelCreationFactory(Node.class),
                null,
                null);
        add(entry);
 
        

  		entry =
			new ConnectionCreationToolEntry(
				"Link",
				"Creates a link",
				new ModelCreationFactory(Link.class),
				null,
				null);
		add(entry);
    }
}
