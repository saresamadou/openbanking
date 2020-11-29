/*
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.6
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.betterbanking.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides further details on an entry in the report.
 */
@Schema(description = "Provides further details on an entry in the report.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBTransaction6Basic {
    @SerializedName("AccountId")
    private String accountId = null;

    @SerializedName("TransactionId")
    private String transactionId = null;

    @SerializedName("TransactionReference")
    private String transactionReference = null;

    @SerializedName("StatementReference")
    private List<String> statementReference = null;

    @SerializedName("CreditDebitIndicator")
    private OBCreditDebitCode1 creditDebitIndicator = null;

    @SerializedName("Status")
    private OBEntryStatus1Code status = null;

    @SerializedName("TransactionMutability")
    private OBTransactionMutability1Code transactionMutability = null;

    @SerializedName("BookingDateTime")
    private OffsetDateTime bookingDateTime = null;

    @SerializedName("ValueDateTime")
    private OffsetDateTime valueDateTime = null;

    @SerializedName("AddressLine")
    private String addressLine = null;

    @SerializedName("Amount")
    private OBActiveOrHistoricCurrencyAndAmount9 amount = null;

    @SerializedName("ChargeAmount")
    private OBActiveOrHistoricCurrencyAndAmount10 chargeAmount = null;

    @SerializedName("CurrencyExchange")
    private OBCurrencyExchange5 currencyExchange = null;

    @SerializedName("BankTransactionCode")
    private OBBankTransactionCodeStructure1 bankTransactionCode = null;

    @SerializedName("ProprietaryBankTransactionCode")
    private ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode = null;

    @SerializedName("CardInstrument")
    private OBTransactionCardInstrument1 cardInstrument = null;

    @SerializedName("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBTransaction6Basic accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @Schema(required = true, description = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBTransaction6Basic transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     **/
    @Schema(description = "")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public OBTransaction6Basic transactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
        return this;
    }

    /**
     * Get transactionReference
     *
     * @return transactionReference
     **/
    @Schema(description = "")
    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public OBTransaction6Basic statementReference(List<String> statementReference) {
        this.statementReference = statementReference;
        return this;
    }

    public OBTransaction6Basic addStatementReferenceItem(String statementReferenceItem) {
        if (this.statementReference == null) {
            this.statementReference = new ArrayList<String>();
        }
        this.statementReference.add(statementReferenceItem);
        return this;
    }

    /**
     * Get statementReference
     *
     * @return statementReference
     **/
    @Schema(description = "")
    public List<String> getStatementReference() {
        return statementReference;
    }

    public void setStatementReference(List<String> statementReference) {
        this.statementReference = statementReference;
    }

    public OBTransaction6Basic creditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     **/
    @Schema(required = true, description = "")
    public OBCreditDebitCode1 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode1 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBTransaction6Basic status(OBEntryStatus1Code status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(required = true, description = "")
    public OBEntryStatus1Code getStatus() {
        return status;
    }

    public void setStatus(OBEntryStatus1Code status) {
        this.status = status;
    }

    public OBTransaction6Basic transactionMutability(OBTransactionMutability1Code transactionMutability) {
        this.transactionMutability = transactionMutability;
        return this;
    }

    /**
     * Get transactionMutability
     *
     * @return transactionMutability
     **/
    @Schema(description = "")
    public OBTransactionMutability1Code getTransactionMutability() {
        return transactionMutability;
    }

    public void setTransactionMutability(OBTransactionMutability1Code transactionMutability) {
        this.transactionMutability = transactionMutability;
    }

    public OBTransaction6Basic bookingDateTime(OffsetDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
        return this;
    }

    /**
     * Get bookingDateTime
     *
     * @return bookingDateTime
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(OffsetDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public OBTransaction6Basic valueDateTime(OffsetDateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
        return this;
    }

    /**
     * Get valueDateTime
     *
     * @return valueDateTime
     **/
    @Schema(description = "")
    public OffsetDateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(OffsetDateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    public OBTransaction6Basic addressLine(String addressLine) {
        this.addressLine = addressLine;
        return this;
    }

    /**
     * Get addressLine
     *
     * @return addressLine
     **/
    @Schema(description = "")
    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public OBTransaction6Basic amount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @Schema(required = true, description = "")
    public OBActiveOrHistoricCurrencyAndAmount9 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount9 amount) {
        this.amount = amount;
    }

    public OBTransaction6Basic chargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
        this.chargeAmount = chargeAmount;
        return this;
    }

    /**
     * Get chargeAmount
     *
     * @return chargeAmount
     **/
    @Schema(description = "")
    public OBActiveOrHistoricCurrencyAndAmount10 getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(OBActiveOrHistoricCurrencyAndAmount10 chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public OBTransaction6Basic currencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
        return this;
    }

    /**
     * Get currencyExchange
     *
     * @return currencyExchange
     **/
    @Schema(description = "")
    public OBCurrencyExchange5 getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(OBCurrencyExchange5 currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public OBTransaction6Basic bankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
        return this;
    }

    /**
     * Get bankTransactionCode
     *
     * @return bankTransactionCode
     **/
    @Schema(description = "")
    public OBBankTransactionCodeStructure1 getBankTransactionCode() {
        return bankTransactionCode;
    }

    public void setBankTransactionCode(OBBankTransactionCodeStructure1 bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    public OBTransaction6Basic proprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
        return this;
    }

    /**
     * Get proprietaryBankTransactionCode
     *
     * @return proprietaryBankTransactionCode
     **/
    @Schema(description = "")
    public ProprietaryBankTransactionCodeStructure1 getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCodeStructure1 proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    public OBTransaction6Basic cardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
        return this;
    }

    /**
     * Get cardInstrument
     *
     * @return cardInstrument
     **/
    @Schema(description = "")
    public OBTransactionCardInstrument1 getCardInstrument() {
        return cardInstrument;
    }

    public void setCardInstrument(OBTransactionCardInstrument1 cardInstrument) {
        this.cardInstrument = cardInstrument;
    }

    public OBTransaction6Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Schema(description = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBTransaction6Basic obTransaction6Basic = (OBTransaction6Basic) o;
        return Objects.equals(this.accountId, obTransaction6Basic.accountId) &&
                Objects.equals(this.transactionId, obTransaction6Basic.transactionId) &&
                Objects.equals(this.transactionReference, obTransaction6Basic.transactionReference) &&
                Objects.equals(this.statementReference, obTransaction6Basic.statementReference) &&
                Objects.equals(this.creditDebitIndicator, obTransaction6Basic.creditDebitIndicator) &&
                Objects.equals(this.status, obTransaction6Basic.status) &&
                Objects.equals(this.transactionMutability, obTransaction6Basic.transactionMutability) &&
                Objects.equals(this.bookingDateTime, obTransaction6Basic.bookingDateTime) &&
                Objects.equals(this.valueDateTime, obTransaction6Basic.valueDateTime) &&
                Objects.equals(this.addressLine, obTransaction6Basic.addressLine) &&
                Objects.equals(this.amount, obTransaction6Basic.amount) &&
                Objects.equals(this.chargeAmount, obTransaction6Basic.chargeAmount) &&
                Objects.equals(this.currencyExchange, obTransaction6Basic.currencyExchange) &&
                Objects.equals(this.bankTransactionCode, obTransaction6Basic.bankTransactionCode) &&
                Objects.equals(this.proprietaryBankTransactionCode, obTransaction6Basic.proprietaryBankTransactionCode) &&
                Objects.equals(this.cardInstrument, obTransaction6Basic.cardInstrument) &&
                Objects.equals(this.supplementaryData, obTransaction6Basic.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, transactionId, transactionReference, statementReference, creditDebitIndicator, status, transactionMutability, bookingDateTime, valueDateTime, addressLine, amount, chargeAmount, currencyExchange, bankTransactionCode, proprietaryBankTransactionCode, cardInstrument, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBTransaction6Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
        sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    transactionMutability: ").append(toIndentedString(transactionMutability)).append("\n");
        sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
        sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
        sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
        sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
        sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
        sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
        sb.append("    cardInstrument: ").append(toIndentedString(cardInstrument)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
