/******************************************************************************
 * Product: Posterita Ajax UI 												  *
 * Copyright (C) 2007 Posterita Ltd.  All Rights Reserved.                    *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Posterita Ltd., 3, Draper Avenue, Quatre Bornes, Mauritius                 *
 * or via info@posterita.org or http://www.posterita.org/                     *
 *****************************************************************************/

package org.adempiere.webui.editor;

import org.adempiere.webui.component.Textbox;
import org.compiere.model.GridField;

/**
 * Default editor for encrypted (AD_Field.IsEncrypted=Y) text display type (String, PrinterName, Text, TextLong and Memo).<br/>
 * Extend {@link WStringEditor} and set {@link Textbox} to type="password".
 * @author  <a href="mailto:agramdass@gmail.com">Ashley G Ramdass</a>
 * @date    Mar 12, 2007
 */
public class WPasswordEditor extends WStringEditor
{	
	/** 
	 * Default constructor
	 */
    public WPasswordEditor()
    {
        super();
        super.setTypePassword(true);
        setChangeEventWhenEditing(false);
    }
    
	/**
	 * 
	 * @param gridField
	 */
    public WPasswordEditor(GridField gridField)
    {
        super(gridField);
        super.setTypePassword(true);
        setChangeEventWhenEditing (true);
    }

    /**
     * 
     * @param gridField
     * @param tableEditor
     */
    public WPasswordEditor(GridField gridField, boolean tableEditor)
    {
    	this(gridField, tableEditor, null);
    }
    
    /**
     * 
     * @param gridField
     * @param tableEditor
     * @param editorConfiguration
     */
    public WPasswordEditor(GridField gridField, boolean tableEditor, IEditorConfiguration editorConfiguration)
    {
    	super(gridField, tableEditor, editorConfiguration);
    	super.setTypePassword(true);
    	setChangeEventWhenEditing (false);
    }
}
