-- IDEMPIERE-5910 Invoice > Create Lines From>Shipment/Receipt>No shipment/receipt lines.
SELECT register_migration_script('202311151022_IDEMPIERE-5910.sql') FROM dual;

-- Nov 15, 2023, 10:22:37 AM MYT
UPDATE AD_InfoWindow SET WhereClause='(CASE WHEN (SELECT COUNT(*)=1 from C_DocType WHERE C_DocType_ID=@C_DocTypeTarget_ID@ AND DocBaseType IN (''APC'',''ARC'')) THEN v.CreditQty*v.Multiplier <> 0 ELSE v.Qty*v.Multiplier <> 0 END) 
AND (v.C_OrderLine_ID IS NULL OR v.C_OrderLine_ID NOT IN (SELECT il.C_OrderLine_ID FROM C_InvoiceLine il, C_Invoice i WHERE il.C_Invoice_ID = i.C_Invoice_ID AND i.DocStatus=''IP'' AND il.C_OrderLine_ID > 0)) 
AND (v.M_InOutLine_ID IS NULL OR v.M_InOutLine_ID NOT IN (SELECT il.M_InOutLine_ID FROM C_InvoiceLine il, C_Invoice i WHERE il.C_Invoice_ID = i.C_Invoice_ID AND i.DocStatus=''IP'' AND il.M_InOutLine_ID > 0))
AND (v.M_RMALine_ID IS NULL OR v.M_RMALine_ID NOT IN (SELECT il.M_RMALine_ID FROM C_InvoiceLine il, C_Invoice i WHERE il.C_Invoice_ID = i.C_Invoice_ID AND i.DocStatus=''IP'' AND il.M_RMALine_ID > 0))', IsValid='Y',Updated=TO_TIMESTAMP('2023-11-15 10:22:37','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_InfoWindow_ID=200024
;

-- Nov 15, 2023, 10:23:45 AM MYT
UPDATE AD_InfoWindow SET WhereClause='v.M_InOut_ID=@InOut_ID@ 
AND (v.M_InOutLine_ID IS NULL OR v.M_InOutLine_ID NOT IN (SELECT rmal.M_InOutLine_ID FROM M_RMALine rmal WHERE rmal.M_RMA_ID=@M_RMA_ID@)) 
AND v.MovementQty <> 0
AND (v.M_InOutLine_ID IS NULL OR v.M_InOutLine_ID NOT IN (SELECT rl.M_InOutLine_ID FROM M_RMALine rl, M_RMA r WHERE rl.M_RMA_ID = r.M_RMA_ID AND r.DocStatus=''IP'' AND rl.M_InOutLine_ID > 0))', IsValid='Y',Updated=TO_TIMESTAMP('2023-11-15 10:23:45','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_InfoWindow_ID=200023
;

-- Nov 15, 2023, 10:24:33 AM MYT
UPDATE AD_InfoWindow SET WhereClause='v.Qty*v.Multiplier <> 0 
AND (v.C_OrderLine_ID IS NULL OR v.C_OrderLine_ID NOT IN (SELECT iol.C_OrderLine_ID FROM M_InOutLine iol, M_InOut io WHERE iol.M_InOut_ID = io.M_InOut_ID AND io.DocStatus=''IP'' AND iol.C_OrderLine_ID > 0)) 
AND (v.M_RMALine_ID IS NULL OR v.M_RMALine_ID NOT IN (SELECT iol.M_RMALine_ID FROM M_InOutLine iol, M_InOut io WHERE iol.M_InOut_ID = io.M_InOut_ID AND io.DocStatus=''IP'' AND iol.M_RMALine_ID > 0))', IsValid='Y',Updated=TO_TIMESTAMP('2023-11-15 10:24:33','YYYY-MM-DD HH24:MI:SS'),UpdatedBy=100 WHERE AD_InfoWindow_ID=200022
;

