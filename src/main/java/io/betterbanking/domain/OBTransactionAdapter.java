package io.betterbanking.domain;

import io.betterbanking.model.OBTransaction6;

/**
 * @author sareaboudousamadou.
 */
public class OBTransactionAdapter {

    public static Transaction adaptOBTransaction6ToTransaction(OBTransaction6 obTransaction6) {
        return Transaction.builder()
                .accountNumber(Integer.valueOf(obTransaction6.getAccountId()))
                .type(obTransaction6.getCreditDebitIndicator().getValue())
                .currency(obTransaction6.getCurrencyExchange().getUnitCurrency())
                .amount(obTransaction6.getAmount().getAmount())
                .merchantName(obTransaction6.getMerchantDetails().getMerchantName())
                .build();
    }
}
