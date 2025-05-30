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

/** Generated Model for A_FundingMode
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="A_FundingMode")
public class X_A_FundingMode extends PO implements I_A_FundingMode, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_A_FundingMode (Properties ctx, int A_FundingMode_ID, String trxName)
    {
      super (ctx, A_FundingMode_ID, trxName);
      /** if (A_FundingMode_ID == 0)
        {
			setA_FundingMode_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_A_FundingMode (Properties ctx, int A_FundingMode_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, A_FundingMode_ID, trxName, virtualColumns);
      /** if (A_FundingMode_ID == 0)
        {
			setA_FundingMode_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_A_FundingMode (Properties ctx, String A_FundingMode_UU, String trxName)
    {
      super (ctx, A_FundingMode_UU, trxName);
      /** if (A_FundingMode_UU == null)
        {
			setA_FundingMode_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Standard Constructor */
    public X_A_FundingMode (Properties ctx, String A_FundingMode_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, A_FundingMode_UU, trxName, virtualColumns);
      /** if (A_FundingMode_UU == null)
        {
			setA_FundingMode_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_A_FundingMode (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org
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
      StringBuilder sb = new StringBuilder ("X_A_FundingMode[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Asset Funding Mode.
		@param A_FundingMode_ID Asset Funding Mode
	*/
	public void setA_FundingMode_ID (int A_FundingMode_ID)
	{
		if (A_FundingMode_ID < 1)
			set_ValueNoCheck (COLUMNNAME_A_FundingMode_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_A_FundingMode_ID, Integer.valueOf(A_FundingMode_ID));
	}

	/** Get Asset Funding Mode.
		@return Asset Funding Mode	  */
	public int getA_FundingMode_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_FundingMode_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_FundingMode_UU.
		@param A_FundingMode_UU A_FundingMode_UU
	*/
	public void setA_FundingMode_UU (String A_FundingMode_UU)
	{
		set_Value (COLUMNNAME_A_FundingMode_UU, A_FundingMode_UU);
	}

	/** Get A_FundingMode_UU.
		@return A_FundingMode_UU	  */
	public String getA_FundingMode_UU()
	{
		return (String)get_Value(COLUMNNAME_A_FundingMode_UU);
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

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getValue());
    }
}