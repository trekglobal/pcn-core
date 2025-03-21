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

/** Generated Model for CM_ChatTypeUpdate
 *  @author iDempiere (generated)
 *  @version Release 12 - $Id$ */
@org.adempiere.base.Model(table="CM_ChatTypeUpdate")
public class X_CM_ChatTypeUpdate extends PO implements I_CM_ChatTypeUpdate, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241222L;

    /** Standard Constructor */
    public X_CM_ChatTypeUpdate (Properties ctx, int CM_ChatTypeUpdate_ID, String trxName)
    {
      super (ctx, CM_ChatTypeUpdate_ID, trxName);
      /** if (CM_ChatTypeUpdate_ID == 0)
        {
			setAD_User_ID (0);
			setCM_ChatType_ID (0);
			setIsSelfService (false);
        } */
    }

    /** Standard Constructor */
    public X_CM_ChatTypeUpdate (Properties ctx, int CM_ChatTypeUpdate_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, CM_ChatTypeUpdate_ID, trxName, virtualColumns);
      /** if (CM_ChatTypeUpdate_ID == 0)
        {
			setAD_User_ID (0);
			setCM_ChatType_ID (0);
			setIsSelfService (false);
        } */
    }

    /** Standard Constructor */
    public X_CM_ChatTypeUpdate (Properties ctx, String CM_ChatTypeUpdate_UU, String trxName)
    {
      super (ctx, CM_ChatTypeUpdate_UU, trxName);
      /** if (CM_ChatTypeUpdate_UU == null)
        {
			setAD_User_ID (0);
			setCM_ChatType_ID (0);
			setIsSelfService (false);
        } */
    }

    /** Standard Constructor */
    public X_CM_ChatTypeUpdate (Properties ctx, String CM_ChatTypeUpdate_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, CM_ChatTypeUpdate_UU, trxName, virtualColumns);
      /** if (CM_ChatTypeUpdate_UU == null)
        {
			setAD_User_ID (0);
			setCM_ChatType_ID (0);
			setIsSelfService (false);
        } */
    }

    /** Load Constructor */
    public X_CM_ChatTypeUpdate (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_CM_ChatTypeUpdate[")
        .append(get_UUID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CM_ChatTypeUpdate_UU.
		@param CM_ChatTypeUpdate_UU CM_ChatTypeUpdate_UU
	*/
	public void setCM_ChatTypeUpdate_UU (String CM_ChatTypeUpdate_UU)
	{
		set_Value (COLUMNNAME_CM_ChatTypeUpdate_UU, CM_ChatTypeUpdate_UU);
	}

	/** Get CM_ChatTypeUpdate_UU.
		@return CM_ChatTypeUpdate_UU	  */
	public String getCM_ChatTypeUpdate_UU()
	{
		return (String)get_Value(COLUMNNAME_CM_ChatTypeUpdate_UU);
	}

	public org.compiere.model.I_CM_ChatType getCM_ChatType() throws RuntimeException
	{
		return (org.compiere.model.I_CM_ChatType)MTable.get(getCtx(), org.compiere.model.I_CM_ChatType.Table_ID)
			.getPO(getCM_ChatType_ID(), get_TrxName());
	}

	/** Set Chat Type.
		@param CM_ChatType_ID Type of discussion / chat
	*/
	public void setCM_ChatType_ID (int CM_ChatType_ID)
	{
		if (CM_ChatType_ID < 1)
			set_ValueNoCheck (COLUMNNAME_CM_ChatType_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_CM_ChatType_ID, Integer.valueOf(CM_ChatType_ID));
	}

	/** Get Chat Type.
		@return Type of discussion / chat
	  */
	public int getCM_ChatType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_ChatType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Self-Service.
		@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service
	*/
	public void setIsSelfService (boolean IsSelfService)
	{
		set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
	}

	/** Get Self-Service.
		@return This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService()
	{
		Object oo = get_Value(COLUMNNAME_IsSelfService);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}
}