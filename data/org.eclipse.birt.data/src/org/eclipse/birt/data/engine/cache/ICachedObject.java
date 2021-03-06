
/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.data.engine.cache;

/**
 * A interface defined a method which is used to get all field objects of cached
 * Object.
 */

public interface ICachedObject
{
	/**
	 * 
	 * @return
	 */
	public Object[] getFieldValues();
	
}
