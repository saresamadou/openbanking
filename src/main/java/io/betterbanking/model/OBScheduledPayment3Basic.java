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
 * OBScheduledPayment3Basic
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBScheduledPayment3Basic {
    @SerializedName("AccountId")
    private String accountId = null;

    @SerializedName("ScheduledPaymentId")
    private String scheduledPaymentId = null;

    @SerializedName("ScheduledPaymentDateTime")
    private OffsetDateTime scheduledPaymentDateTime = null;

    @SerializedName("ScheduledType")
    private OBExternalScheduleType1Code scheduledType = null;

    @SerializedName("Reference")
    private String reference = null;

    @SerializedName("DebtorReference")
    private String debtorReference = null;

    @SerializedName("InstructedAmount")
    private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount = null;

    public OBScheduledPayment3Basic accountId(String accountId) {
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

    public OBScheduledPayment3Basic scheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
        return this;
    }

    /**
     * Get scheduledPaymentId
     *
     * @return scheduledPaymentId
     **/
    @Schema(description = "")
    public String getScheduledPaymentId() {
        return scheduledPaymentId;
    }

    public void setScheduledPaymentId(String scheduledPaymentId) {
        this.scheduledPaymentId = scheduledPaymentId;
    }

    public OBScheduledPayment3Basic scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
        return this;
    }

    /**
     * Get scheduledPaymentDateTime
     *
     * @return scheduledPaymentDateTime
     **/
    @Schema(required = true, description = "")
    public OffsetDateTime getScheduledPaymentDateTime() {
        return scheduledPaymentDateTime;
    }

    public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
        this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    }

    public OBScheduledPayment3Basic scheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * Get scheduledType
     *
     * @return scheduledType
     **/
    @Schema(required = true, description = "")
    public OBExternalScheduleType1Code getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
        this.scheduledType = scheduledType;
    }

    public OBScheduledPayment3Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @Schema(description = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBScheduledPayment3Basic debtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
        return this;
    }

    /**
     * Get debtorReference
     *
     * @return debtorReference
     **/
    @Schema(description = "")
    public String getDebtorReference() {
        return debtorReference;
    }

    public void setDebtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
    }

    public OBScheduledPayment3Basic instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.instructedAmount = instructedAmount;
        return this;
    }

    /**
     * Get instructedAmount
     *
     * @return instructedAmount
     **/
    @Schema(required = true, description = "")
    public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
        this.instructedAmount = instructedAmount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBScheduledPayment3Basic obScheduledPayment3Basic = (OBScheduledPayment3Basic) o;
        return Objects.equals(this.accountId, obScheduledPayment3Basic.accountId) &&
                Objects.equals(this.scheduledPaymentId, obScheduledPayment3Basic.scheduledPaymentId) &&
                Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3Basic.scheduledPaymentDateTime) &&
                Objects.equals(this.scheduledType, obScheduledPayment3Basic.scheduledType) &&
                Objects.equals(this.reference, obScheduledPayment3Basic.reference) &&
                Objects.equals(this.debtorReference, obScheduledPayment3Basic.debtorReference) &&
                Objects.equals(this.instructedAmount, obScheduledPayment3Basic.instructedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBScheduledPayment3Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
        sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
        sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
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
