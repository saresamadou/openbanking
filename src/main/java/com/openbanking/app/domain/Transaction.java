package com.openbanking.app.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Class represnting a bank transaction
 *
 * @author sareaboudousamadou.
 */
@Data
@Builder
public class Transaction {
    private String type;
    private Integer accountNumber;
    private String currency;
    private BigDecimal amount;
    private String merchantName;
    private String getMerchantLogo;
}
