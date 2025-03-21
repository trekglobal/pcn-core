/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for PA_Ratio
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="PA_Ratio")
public class X_PA_Ratio extends PO implements I_PA_Ratio, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_PA_Ratio (Properties ctx, int PA_Ratio_ID, String trxName)
    {
      super (ctx, PA_Ratio_ID, trxName);
      /** if (PA_Ratio_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setName (null);
			setPA_Ratio_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_Ratio (Properties ctx, int PA_Ratio_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_Ratio_ID, trxName, virtualColumns);
      /** if (PA_Ratio_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setName (null);
			setPA_Ratio_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_Ratio (Properties ctx, String PA_Ratio_UU, String trxName)
    {
      super (ctx, PA_Ratio_UU, trxName);
      /** if (PA_Ratio_UU == null)
        {
			setC_AcctSchema_ID (0);
			setName (null);
			setPA_Ratio_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_PA_Ratio (Properties ctx, String PA_Ratio_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, PA_Ratio_UU, trxName, virtualColumns);
      /** if (PA_Ratio_UU == null)
        {
			setC_AcctSchema_ID (0);
			setName (null);
			setPA_Ratio_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PA_Ratio (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_PA_Ratio[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_AcctSchema getC_AcctSchema() throws RuntimeException
	{
		return (org.compiere.model.I_C_AcctSchema)MTable.get(getCtx(), org.compiere.model.I_C_AcctSchema.Table_ID)
			.getPO(getC_AcctSchema_ID(), get_TrxName());
	}

	/** Set Accounting Schema.
		@param C_AcctSchema_ID Rules for accounting
	*/
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1)
			set_Value (COLUMNNAME_C_AcctSchema_ID, null);
		else
			set_Value (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Ratio.
		@param PA_Ratio_ID Performance Ratio
	*/
	public void setPA_Ratio_ID (int PA_Ratio_ID)
	{
		if (PA_Ratio_ID < 1)
			set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_PA_Ratio_ID, Integer.valueOf(PA_Ratio_ID));
	}

	/** Get Ratio.
		@return Performance Ratio
	  */
	public int getPA_Ratio_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_Ratio_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set PA_Ratio_UU.
		@param PA_Ratio_UU PA_Ratio_UU
	*/
	public void setPA_Ratio_UU (String PA_Ratio_UU)
	{
		set_Value (COLUMNNAME_PA_Ratio_UU, PA_Ratio_UU);
	}

	/** Get PA_Ratio_UU.
		@return PA_Ratio_UU	  */
	public String getPA_Ratio_UU()
	{
		return (String)get_Value(COLUMNNAME_PA_Ratio_UU);
	}
}