package org.fintx.finance.voucher.entity;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author admin
 *
 */
public class CashFlowTest {

    @Test
    public void test() {
        CashFlow flow=new CashFlow();
        flow.setCashItem("XXXXXXX");
        flow.setNaturalCreditAmount("xxxxxxxx");
        System.out.println(flow.toString());
    }

}
