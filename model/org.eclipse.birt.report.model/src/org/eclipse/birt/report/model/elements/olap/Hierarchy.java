/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.elements.olap;

import org.eclipse.birt.report.model.api.DesignElementHandle;
import org.eclipse.birt.report.model.api.elements.ReportDesignConstants;
import org.eclipse.birt.report.model.api.olap.HierarchyHandle;
import org.eclipse.birt.report.model.core.ContainerSlot;
import org.eclipse.birt.report.model.core.Module;
import org.eclipse.birt.report.model.core.ReferenceableElement;
import org.eclipse.birt.report.model.elements.ElementVisitor;
import org.eclipse.birt.report.model.elements.interfaces.IHierarchyModel;

/**
 * This class represents a Hierarchy element. Hierarchy contains list of Level
 * elements. It also can define its own dataset which can join with the outer
 * dataset defined on the cube by the foreign key defined on dimension. Use the
 * {@link org.eclipse.birt.report.model.api.olap.HierarchyHandle}class to
 * change the properties.
 * 
 */

public class Hierarchy extends ReferenceableElement implements IHierarchyModel
{

	/**
	 * Default constructor.
	 */

	public Hierarchy( )
	{
		initSlots( );
	}

	/**
	 * Constructs the hierarchy with a name.
	 * 
	 * @param name
	 *            name of the hierarchy element
	 */

	public Hierarchy( String name )
	{
		super( name );
		initSlots( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.core.DesignElement#apply(org.eclipse.birt.report.model.elements.ElementVisitor)
	 */
	public void apply( ElementVisitor visitor )
	{
		visitor.visitHierarchy( this );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.core.DesignElement#getElementName()
	 */
	public String getElementName( )
	{
		return ReportDesignConstants.HIERARCHY_ELEMENT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.core.IDesignElement#getHandle(org.eclipse.birt.report.model.core.Module)
	 */
	public DesignElementHandle getHandle( Module module )
	{
		return handle( module );
	}

	/**
	 * Returns an API handle for this element.
	 * 
	 * @param module
	 *            the module of the hierarchy
	 * 
	 * @return an API handle for this element.
	 */

	public HierarchyHandle handle( Module module )
	{
		if ( handle == null )
		{
			handle = new HierarchyHandle( module, this );
		}
		return (HierarchyHandle) handle;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.core.DesignElement#getSlot(int)
	 */
	public ContainerSlot getSlot( int slot )
	{
		assert slot == LEVEL_SLOT;
		return slots[LEVEL_SLOT];
	}
}
