package org.fintx.finance.voucher.entity;



import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;


@Getter
@Setter
public class Voucher {

    
    private BigInteger Id;
    private String businessDate;
    private String businessId;
    
    private boolean signature;
    private String voucherMakingSystem;
    private BigInteger revokeFlag;
    private List<Entry> entries;
}
