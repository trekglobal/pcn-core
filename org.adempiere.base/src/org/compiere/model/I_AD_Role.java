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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_Role
 *  @author iDempiere (generated) 
 *  @version Release 12
 */
public interface I_AD_Role 
{

    /** TableName=AD_Role */
    public static final String Table_Name = "AD_Role";

    /** AD_Table_ID=156 */
    public static final int Table_ID = 156;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_Role_ID */
    public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

	/** Set Role.
	  * Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID);

	/** Get Role.
	  * Responsibility Role
	  */
	public int getAD_Role_ID();

    /** Column name AD_Role_UU */
    public static final String COLUMNNAME_AD_Role_UU = "AD_Role_UU";

	/** Set AD_Role_UU	  */
	public void setAD_Role_UU (String AD_Role_UU);

	/** Get AD_Role_UU	  */
	public String getAD_Role_UU();

    /** Column name AD_Tree_Menu_ID */
    public static final String COLUMNNAME_AD_Tree_Menu_ID = "AD_Tree_Menu_ID";

	/** Set Menu Tree.
	  * Tree of the menu
	  */
	public void setAD_Tree_Menu_ID (int AD_Tree_Menu_ID);

	/** Get Menu Tree.
	  * Tree of the menu
	  */
	public int getAD_Tree_Menu_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Menu() throws RuntimeException;

    /** Column name AD_Tree_Org_ID */
    public static final String COLUMNNAME_AD_Tree_Org_ID = "AD_Tree_Org_ID";

	/** Set Organization Tree.
	  * Trees are used for (financial) reporting and security access (via role)
	  */
	public void setAD_Tree_Org_ID (int AD_Tree_Org_ID);

	/** Get Organization Tree.
	  * Trees are used for (financial) reporting and security access (via role)
	  */
	public int getAD_Tree_Org_ID();

	public org.compiere.model.I_AD_Tree getAD_Tree_Org() throws RuntimeException;

    /** Column name Allow_Info_Account */
    public static final String COLUMNNAME_Allow_Info_Account = "Allow_Info_Account";

	/** Set Allow Info Account	  */
	public void setAllow_Info_Account (boolean Allow_Info_Account);

	/** Get Allow Info Account	  */
	public boolean isAllow_Info_Account();

    /** Column name Allow_Info_Asset */
    public static final String COLUMNNAME_Allow_Info_Asset = "Allow_Info_Asset";

	/** Set Allow Info Asset	  */
	public void setAllow_Info_Asset (boolean Allow_Info_Asset);

	/** Get Allow Info Asset	  */
	public boolean isAllow_Info_Asset();

    /** Column name Allow_Info_BPartner */
    public static final String COLUMNNAME_Allow_Info_BPartner = "Allow_Info_BPartner";

	/** Set Allow Info BPartner	  */
	public void setAllow_Info_BPartner (boolean Allow_Info_BPartner);

	/** Get Allow Info BPartner	  */
	public boolean isAllow_Info_BPartner();

    /** Column name Allow_Info_InOut */
    public static final String COLUMNNAME_Allow_Info_InOut = "Allow_Info_InOut";

	/** Set Allow Shipment Info	  */
	public void setAllow_Info_InOut (boolean Allow_Info_InOut);

	/** Get Allow Shipment Info	  */
	public boolean isAllow_Info_InOut();

    /** Column name Allow_Info_Invoice */
    public static final String COLUMNNAME_Allow_Info_Invoice = "Allow_Info_Invoice";

	/** Set Allow Info Invoice	  */
	public void setAllow_Info_Invoice (boolean Allow_Info_Invoice);

	/** Get Allow Info Invoice	  */
	public boolean isAllow_Info_Invoice();

    /** Column name Allow_Info_Order */
    public static final String COLUMNNAME_Allow_Info_Order = "Allow_Info_Order";

	/** Set Allow Info Order	  */
	public void setAllow_Info_Order (boolean Allow_Info_Order);

	/** Get Allow Info Order	  */
	public boolean isAllow_Info_Order();

    /** Column name Allow_Info_Payment */
    public static final String COLUMNNAME_Allow_Info_Payment = "Allow_Info_Payment";

	/** Set Allow Info Payment	  */
	public void setAllow_Info_Payment (boolean Allow_Info_Payment);

	/** Get Allow Info Payment	  */
	public boolean isAllow_Info_Payment();

    /** Column name Allow_Info_Product */
    public static final String COLUMNNAME_Allow_Info_Product = "Allow_Info_Product";

	/** Set Allow Info Product	  */
	public void setAllow_Info_Product (boolean Allow_Info_Product);

	/** Get Allow Info Product	  */
	public boolean isAllow_Info_Product();

    /** Column name Allow_Info_Resource */
    public static final String COLUMNNAME_Allow_Info_Resource = "Allow_Info_Resource";

	/** Set Allow Info Resource	  */
	public void setAllow_Info_Resource (boolean Allow_Info_Resource);

	/** Get Allow Info Resource	  */
	public boolean isAllow_Info_Resource();

    /** Column name Allow_Info_Schedule */
    public static final String COLUMNNAME_Allow_Info_Schedule = "Allow_Info_Schedule";

	/** Set Allow Info Schedule	  */
	public void setAllow_Info_Schedule (boolean Allow_Info_Schedule);

	/** Get Allow Info Schedule	  */
	public boolean isAllow_Info_Schedule();

    /** Column name AmtApproval */
    public static final String COLUMNNAME_AmtApproval = "AmtApproval";

	/** Set Approval Amount.
	  * The approval amount limit for this role
	  */
	public void setAmtApproval (BigDecimal AmtApproval);

	/** Get Approval Amount.
	  * The approval amount limit for this role
	  */
	public BigDecimal getAmtApproval();

    /** Column name AmtApprovalAccum */
    public static final String COLUMNNAME_AmtApprovalAccum = "AmtApprovalAccum";

	/** Set Approval Amount Accumulated.
	  * The approval amount limit for this role accumulated on a period
	  */
	public void setAmtApprovalAccum (BigDecimal AmtApprovalAccum);

	/** Get Approval Amount Accumulated.
	  * The approval amount limit for this role accumulated on a period
	  */
	public BigDecimal getAmtApprovalAccum();

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name ConfirmQueryRecords */
    public static final String COLUMNNAME_ConfirmQueryRecords = "ConfirmQueryRecords";

	/** Set Confirm Query Records.
	  * Require Confirmation if more records will be returned by the query (If not defined 500)
	  */
	public void setConfirmQueryRecords (int ConfirmQueryRecords);

	/** Get Confirm Query Records.
	  * Require Confirmation if more records will be returned by the query (If not defined 500)
	  */
	public int getConfirmQueryRecords();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name DaysApprovalAccum */
    public static final String COLUMNNAME_DaysApprovalAccum = "DaysApprovalAccum";

	/** Set Days Approval Accumulated.
	  * The days approval indicates the days to take into account to verify the accumulated approval amount.
	  */
	public void setDaysApprovalAccum (int DaysApprovalAccum);

	/** Get Days Approval Accumulated.
	  * The days approval indicates the days to take into account to verify the accumulated approval amount.
	  */
	public int getDaysApprovalAccum();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsAccessAdvanced */
    public static final String COLUMNNAME_IsAccessAdvanced = "IsAccessAdvanced";

	/** Set Access Advanced	  */
	public void setIsAccessAdvanced (boolean IsAccessAdvanced);

	/** Get Access Advanced	  */
	public boolean isAccessAdvanced();

    /** Column name IsAccessAllOrgs */
    public static final String COLUMNNAME_IsAccessAllOrgs = "IsAccessAllOrgs";

	/** Set Access all Orgs.
	  * Access all Organizations (no org access control) of the tenant
	  */
	public void setIsAccessAllOrgs (boolean IsAccessAllOrgs);

	/** Get Access all Orgs.
	  * Access all Organizations (no org access control) of the tenant
	  */
	public boolean isAccessAllOrgs();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsCanApproveOwnDoc */
    public static final String COLUMNNAME_IsCanApproveOwnDoc = "IsCanApproveOwnDoc";

	/** Set Approve own Documents.
	  * Users with this role can approve their own documents
	  */
	public void setIsCanApproveOwnDoc (boolean IsCanApproveOwnDoc);

	/** Get Approve own Documents.
	  * Users with this role can approve their own documents
	  */
	public boolean isCanApproveOwnDoc();

    /** Column name IsCanExport */
    public static final String COLUMNNAME_IsCanExport = "IsCanExport";

	/** Set Can Export.
	  * Users with this role can export data
	  */
	public void setIsCanExport (boolean IsCanExport);

	/** Get Can Export.
	  * Users with this role can export data
	  */
	public boolean isCanExport();

    /** Column name IsCanReport */
    public static final String COLUMNNAME_IsCanReport = "IsCanReport";

	/** Set Can Report.
	  * Users with this role can create reports
	  */
	public void setIsCanReport (boolean IsCanReport);

	/** Get Can Report.
	  * Users with this role can create reports
	  */
	public boolean isCanReport();

    /** Column name IsChangeLog */
    public static final String COLUMNNAME_IsChangeLog = "IsChangeLog";

	/** Set Maintain Change Log.
	  * Maintain a log of changes
	  */
	public void setIsChangeLog (boolean IsChangeLog);

	/** Get Maintain Change Log.
	  * Maintain a log of changes
	  */
	public boolean isChangeLog();

    /** Column name IsClientAdministrator */
    public static final String COLUMNNAME_IsClientAdministrator = "IsClientAdministrator";

	/** Set Tenant Administrator.
	  * This role is a tenant administrator
	  */
	public void setIsClientAdministrator (boolean IsClientAdministrator);

	/** Get Tenant Administrator.
	  * This role is a tenant administrator
	  */
	public boolean isClientAdministrator();

    /** Column name IsDiscountAllowedOnTotal */
    public static final String COLUMNNAME_IsDiscountAllowedOnTotal = "IsDiscountAllowedOnTotal";

	/** Set Is Discount Allowed On Total	  */
	public void setIsDiscountAllowedOnTotal (boolean IsDiscountAllowedOnTotal);

	/** Get Is Discount Allowed On Total	  */
	public boolean isDiscountAllowedOnTotal();

    /** Column name IsDiscountUptoLimitPrice */
    public static final String COLUMNNAME_IsDiscountUptoLimitPrice = "IsDiscountUptoLimitPrice";

	/** Set Is Discount Up to Limit Price	  */
	public void setIsDiscountUptoLimitPrice (boolean IsDiscountUptoLimitPrice);

	/** Get Is Discount Up to Limit Price	  */
	public boolean isDiscountUptoLimitPrice();

    /** Column name IsManual */
    public static final String COLUMNNAME_IsManual = "IsManual";

	/** Set Manual.
	  * This is a manual process
	  */
	public void setIsManual (boolean IsManual);

	/** Get Manual.
	  * This is a manual process
	  */
	public boolean isManual();

    /** Column name IsMasterRole */
    public static final String COLUMNNAME_IsMasterRole = "IsMasterRole";

	/** Set Master Role.
	  * A master role cannot be assigned to users, it is intended to define access to menu option and documents and inherit to other roles
	  */
	public void setIsMasterRole (boolean IsMasterRole);

	/** Get Master Role.
	  * A master role cannot be assigned to users, it is intended to define access to menu option and documents and inherit to other roles
	  */
	public boolean isMasterRole();

    /** Column name IsMenuAutoExpand */
    public static final String COLUMNNAME_IsMenuAutoExpand = "IsMenuAutoExpand";

	/** Set Auto expand menu.
	  * If ticked, the menu is automatically expanded
	  */
	public void setIsMenuAutoExpand (boolean IsMenuAutoExpand);

	/** Get Auto expand menu.
	  * If ticked, the menu is automatically expanded
	  */
	public boolean isMenuAutoExpand();

    /** Column name IsPersonalAccess */
    public static final String COLUMNNAME_IsPersonalAccess = "IsPersonalAccess";

	/** Set Personal Access.
	  * Allow access to all personal records
	  */
	public void setIsPersonalAccess (boolean IsPersonalAccess);

	/** Get Personal Access.
	  * Allow access to all personal records
	  */
	public boolean isPersonalAccess();

    /** Column name IsPersonalLock */
    public static final String COLUMNNAME_IsPersonalLock = "IsPersonalLock";

	/** Set Personal Lock.
	  * Allow users with role to lock access to personal records
	  */
	public void setIsPersonalLock (boolean IsPersonalLock);

	/** Get Personal Lock.
	  * Allow users with role to lock access to personal records
	  */
	public boolean isPersonalLock();

    /** Column name IsShowAcct */
    public static final String COLUMNNAME_IsShowAcct = "IsShowAcct";

	/** Set Show Accounting.
	  * Users with this role can see accounting information
	  */
	public void setIsShowAcct (boolean IsShowAcct);

	/** Get Show Accounting.
	  * Users with this role can see accounting information
	  */
	public boolean isShowAcct();

    /** Column name IsUseUserOrgAccess */
    public static final String COLUMNNAME_IsUseUserOrgAccess = "IsUseUserOrgAccess";

	/** Set Use User Org Access.
	  * Use Org Access defined by user instead of Role Org Access
	  */
	public void setIsUseUserOrgAccess (boolean IsUseUserOrgAccess);

	/** Get Use User Org Access.
	  * Use Org Access defined by user instead of Role Org Access
	  */
	public boolean isUseUserOrgAccess();

    /** Column name MaxQueryRecords */
    public static final String COLUMNNAME_MaxQueryRecords = "MaxQueryRecords";

	/** Set Max Query Records.
	  * If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records
	  */
	public void setMaxQueryRecords (int MaxQueryRecords);

	/** Get Max Query Records.
	  * If defined, you cannot query more records as defined - the query criteria needs to be changed to query less records
	  */
	public int getMaxQueryRecords();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name OverwritePriceLimit */
    public static final String COLUMNNAME_OverwritePriceLimit = "OverwritePriceLimit";

	/** Set Overwrite Price Limit.
	  * Overwrite Price Limit if the Price List  enforces the Price Limit
	  */
	public void setOverwritePriceLimit (boolean OverwritePriceLimit);

	/** Get Overwrite Price Limit.
	  * Overwrite Price Limit if the Price List  enforces the Price Limit
	  */
	public boolean isOverwritePriceLimit();

    /** Column name PredefinedContextVariables */
    public static final String COLUMNNAME_PredefinedContextVariables = "PredefinedContextVariables";

	/** Set Predefined Context Variables.
	  * Predefined context variables to inject when opening a menu entry or a window
	  */
	public void setPredefinedContextVariables (String PredefinedContextVariables);

	/** Get Predefined Context Variables.
	  * Predefined context variables to inject when opening a menu entry or a window
	  */
	public String getPredefinedContextVariables();

    /** Column name PreferenceType */
    public static final String COLUMNNAME_PreferenceType = "PreferenceType";

	/** Set Preference Level.
	  * Determines what preferences the user can set
	  */
	public void setPreferenceType (String PreferenceType);

	/** Get Preference Level.
	  * Determines what preferences the user can set
	  */
	public String getPreferenceType();

    /** Column name RoleType */
    public static final String COLUMNNAME_RoleType = "RoleType";

	/** Set Role Type	  */
	public void setRoleType (String RoleType);

	/** Get Role Type	  */
	public String getRoleType();

    /** Column name Supervisor_ID */
    public static final String COLUMNNAME_Supervisor_ID = "Supervisor_ID";

	/** Set Supervisor.
	  * Supervisor for this user/organization - used for escalation and approval
	  */
	public void setSupervisor_ID (int Supervisor_ID);

	/** Get Supervisor.
	  * Supervisor for this user/organization - used for escalation and approval
	  */
	public int getSupervisor_ID();

	public org.compiere.model.I_AD_User getSupervisor() throws RuntimeException;

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name UserDiscount */
    public static final String COLUMNNAME_UserDiscount = "UserDiscount";

	/** Set User Discount	  */
	public void setUserDiscount (BigDecimal UserDiscount);

	/** Get User Discount	  */
	public BigDecimal getUserDiscount();

    /** Column name UserLevel */
    public static final String COLUMNNAME_UserLevel = "UserLevel";

	/** Set User Level.
	  * System Tenant Organization
	  */
	public void setUserLevel (String UserLevel);

	/** Get User Level.
	  * System Tenant Organization
	  */
	public String getUserLevel();
}
