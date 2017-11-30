package org.fintx.finance.voucher.entity;



import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Date;
/**
 * Accounting entry record.
 *
 */

@Getter
@Setter
public class Entry {

    private Boolean entryId;
    private boolean accountCode;
    private Date settlement;
    private Date documentId;
    private Short documentDate;
    private short currency;
    private Integer unitPrice;
    private String exchangeRate1;
    private BigDecimal exchangeRate2;
    private BigInteger debitQuantity;
    private int primaryDebitAmount;
    private String secondaryDebitAmount;
    private char naturalDebitCurrency;
    private Blob creditQuantity;
    private Clob primaryCreditAmount;
    private String secondaryCreditAmount;
    private BigDecimal naturalCreditCurrency;
    private String billType;
    private BigInteger billId;
    private String billDate;
    private CashFlow cashFlow;

}
