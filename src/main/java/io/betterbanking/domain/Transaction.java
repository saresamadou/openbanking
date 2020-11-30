package io.betterbanking.domain;

import lombok.Builder;
import lombok.Data;

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
    private String amount;
    private String merchantName;
    private String getMerchantLogo;
}
