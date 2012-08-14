package com.site.UCMScenarioViewer.dnd;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Support for future editing capabilities. Currently used only by MSCTransferDropTargetListener.
 * 
 * @see MSCTransferDropTargetListener 
 */
public class DataElementFactory implements CreationFactory {

	private Object template;

	/**
	 * Default constructor.
	 */
	public DataElementFactory() {
		super();
	}
	
	/**
	 * @param o
	 */
	public DataElementFactory(Object o) {
		template = o;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
	 */
	public Object getNewObject() {
		try
		{
			return ((Class) template).newInstance();
		}
		catch (Exception e)
		{
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
	 */
	public Object getObjectType() {
		return template;
	}

}
