package org.fintx.finance.voucher.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Cash Flow infor for cash flow statement.
 *
 */
@Getter
@Setter
@ToString
public class CashFlow {

    private String cashItem;
   
    private String naturalCreditAmount;
 
    private String naturalDebitAmount;
}
