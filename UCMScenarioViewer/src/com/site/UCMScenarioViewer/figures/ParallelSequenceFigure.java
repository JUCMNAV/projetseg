/*
 * Created on 03.03.2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.site.UCMScenarioViewer.figures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

import com.site.UCMScenarioViewer.utils.DefaultFigureSize;

/**
 * @author Sasha
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ParallelSequenceFigure extends Figure {
	
	private Label label = new Label();
	private LineBorder border= new LineBorder();
	ArrayList lines = new ArrayList();

	/**
	 * Default constructor.
	 */
	public ParallelSequenceFigure() {
		super();
		add(label);
	}
	
	public void setParallelSequenceFigure(String name, int labelWidth, List splitPoints) {
		remove(label);
		while(!lines.isEmpty()) {
			remove((Polyline)lines.remove(0));
		}
		
		Rectangle r = getBounds();
		
		border.setColor(ColorConstants.gray);
		border.setWidth(2);

		label.setFont(getFont());
		label.setText(name);
		LineBorder labelBorder = new LineBorder();
		labelBorder.setColor(ColorConstants.gray);
		label.setBorder(labelBorder);
		label.setBounds(new Rectangle(r.x + 1, r.y + 1, labelWidth, label.getTextBounds().height
				+ 2*DefaultFigureSize.TEXT_PADDING));
		
		Iterator i = splitPoints.iterator();
		while (i.hasNext()) {
			int y = ((Integer)i.next()).intValue();
			Polyline l = new Polyline();
			l.addPoint(new Point(r.x, r.y + y));
			l.addPoint(new Point(r.right(), r.y + y));
			l.setLineStyle(SWT.LINE_DASH);
			lines.add(l);
		}
		
		setBorder(border);
		add(label);
		i = lines.iterator();
		while (i.hasNext())
			add((Polyline)i.next());
	}

}
