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

import java.util.Objects;

/**
 * Account to or from which a cash entry is made.
 */
@Schema(description = "Account to or from which a cash entry is made.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadDirectDebit2DataDirectDebit {
    @SerializedName("AccountId")
    private String accountId = null;

    @SerializedName("DirectDebitId")
    private String directDebitId = null;

    @SerializedName("MandateIdentification")
    private String mandateIdentification = null;

    @SerializedName("DirectDebitStatusCode")
    private OBExternalDirectDebitStatus1Code directDebitStatusCode = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("PreviousPaymentDateTime")
    private OffsetDateTime previousPaymentDateTime = null;

    @SerializedName("Frequency")
    private String frequency = null;

    @SerializedName("PreviousPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount = null;

    public OBReadDirectDebit2DataDirectDebit accountId(String accountId) {
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

    public OBReadDirectDebit2DataDirectDebit directDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
        return this;
    }

    /**
     * Get directDebitId
     *
     * @return directDebitId
     **/
    @Schema(description = "")
    public String getDirectDebitId() {
        return directDebitId;
    }

    public void setDirectDebitId(String directDebitId) {
        this.directDebitId = directDebitId;
    }

    public OBReadDirectDebit2DataDirectDebit mandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
        return this;
    }

    /**
     * Get mandateIdentification
     *
     * @return mandateIdentification
     **/
    @Schema(required = true, description = "")
    public String getMandateIdentification() {
        return mandateIdentification;
    }

    public void setMandateIdentification(String mandateIdentification) {
        this.mandateIdentification = mandateIdentification;
    }

    public OBReadDirectDebit2DataDirectDebit directDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
        return this;
    }

    /**
     * Get directDebitStatusCode
     *
     * @return directDebitStatusCode
     **/
    @Schema(description = "")
    public OBExternalDirectDebitStatus1Code getDirectDebitStatusCode() {
        return directDebitStatusCode;
    }

    public void setDirectDebitStatusCode(OBExternalDirectDebitStatus1Code directDebitStatusCode) {
        this.directDebitStatusCode = directDebitStatusCode;
    }

    public OBReadDirectDebit2DataDirectDebit name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(required = true, description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBReadDirectDebit2DataDirectDebit previousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
        return this;
    }

    /**
     * Get previousPaymentDateTime
     *
     * @return previousPaymentDateTime
     **/
    @Schema(description = "")
    public OffsetDateTime getPreviousPaymentDateTime() {
        return previousPaymentDateTime;
    }

    public void setPreviousPaymentDateTime(OffsetDateTime previousPaymentDateTime) {
        this.previousPaymentDateTime = previousPaymentDateTime;
    }

    public OBReadDirectDebit2DataDirectDebit frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Regularity with which direct debit instructions are to be created and processed.
     *
     * @return frequency
     **/
    @Schema(description = "Regularity with which direct debit instructions are to be created and processed.")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBReadDirectDebit2DataDirectDebit previousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
        this.previousPaymentAmount = previousPaymentAmount;
        return this;
    }

    /**
     * Get previousPaymentAmount
     *
     * @return previousPaymentAmount
     **/
    @Schema(description = "")
    public OBActiveOrHistoricCurrencyAndAmount0 getPreviousPaymentAmount() {
        return previousPaymentAmount;
    }

    public void setPreviousPaymentAmount(OBActiveOrHistoricCurrencyAndAmount0 previousPaymentAmount) {
        this.previousPaymentAmount = previousPaymentAmount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadDirectDebit2DataDirectDebit obReadDirectDebit2DataDirectDebit = (OBReadDirectDebit2DataDirectDebit) o;
        return Objects.equals(this.accountId, obReadDirectDebit2DataDirectDebit.accountId) &&
                Objects.equals(this.directDebitId, obReadDirectDebit2DataDirectDebit.directDebitId) &&
                Objects.equals(this.mandateIdentification, obReadDirectDebit2DataDirectDebit.mandateIdentification) &&
                Objects.equals(this.directDebitStatusCode, obReadDirectDebit2DataDirectDebit.directDebitStatusCode) &&
                Objects.equals(this.name, obReadDirectDebit2DataDirectDebit.name) &&
                Objects.equals(this.previousPaymentDateTime, obReadDirectDebit2DataDirectDebit.previousPaymentDateTime) &&
                Objects.equals(this.frequency, obReadDirectDebit2DataDirectDebit.frequency) &&
                Objects.equals(this.previousPaymentAmount, obReadDirectDebit2DataDirectDebit.previousPaymentAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, frequency, previousPaymentAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadDirectDebit2DataDirectDebit {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
        sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
        sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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
