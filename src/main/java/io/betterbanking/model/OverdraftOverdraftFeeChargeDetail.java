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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details about the fees/charges
 */
@Schema(description = "Details about the fees/charges")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OverdraftOverdraftFeeChargeDetail {
    @SerializedName("FeeType")
    private FeeTypeEnum feeType = null;
    @SerializedName("NegotiableIndicator")
    private Boolean negotiableIndicator = null;
    @SerializedName("OverdraftControlIndicator")
    private Boolean overdraftControlIndicator = null;
    @SerializedName("IncrementalBorrowingAmount")
    private String incrementalBorrowingAmount = null;
    @SerializedName("FeeAmount")
    private String feeAmount = null;
    @SerializedName("FeeRate")
    private String feeRate = null;
    @SerializedName("FeeRateType")
    private FeeRateTypeEnum feeRateType = null;
    @SerializedName("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency = null;
    @SerializedName("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency = null;
    @SerializedName("Notes")
    private List<String> notes = null;
    @SerializedName("OverdraftFeeChargeCap")
    private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;
    @SerializedName("OtherFeeType")
    private OtherFeeType otherFeeType = null;
    @SerializedName("OtherFeeRateType")
    private OtherFeeRateType otherFeeRateType = null;
    @SerializedName("OtherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency = null;
    @SerializedName("OtherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency = null;

    public OverdraftOverdraftFeeChargeDetail feeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
        return this;
    }

    /**
     * Overdraft fee type
     *
     * @return feeType
     **/
    @Schema(required = true, description = "Overdraft fee type")
    public FeeTypeEnum getFeeType() {
        return feeType;
    }

    public void setFeeType(FeeTypeEnum feeType) {
        this.feeType = feeType;
    }

    public OverdraftOverdraftFeeChargeDetail negotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
        return this;
    }

    /**
     * Indicates whether fee and charges are negotiable
     *
     * @return negotiableIndicator
     **/
    @Schema(description = "Indicates whether fee and charges are negotiable")
    public Boolean isNegotiableIndicator() {
        return negotiableIndicator;
    }

    public void setNegotiableIndicator(Boolean negotiableIndicator) {
        this.negotiableIndicator = negotiableIndicator;
    }

    public OverdraftOverdraftFeeChargeDetail overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Indicates if the fee/charge is already covered by an &#x27;Overdraft Control&#x27; fee or not.
     *
     * @return overdraftControlIndicator
     **/
    @Schema(description = "Indicates if the fee/charge is already covered by an 'Overdraft Control' fee or not.")
    public Boolean isOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public OverdraftOverdraftFeeChargeDetail incrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
        return this;
    }

    /**
     * Every additional tranche of an overdraft balance to which an overdraft fee is applied
     *
     * @return incrementalBorrowingAmount
     **/
    @Schema(description = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")
    public String getIncrementalBorrowingAmount() {
        return incrementalBorrowingAmount;
    }

    public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
        this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    }

    public OverdraftOverdraftFeeChargeDetail feeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
        return this;
    }

    /**
     * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
     *
     * @return feeAmount
     **/
    @Schema(description = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")
    public String getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public OverdraftOverdraftFeeChargeDetail feeRate(String feeRate) {
        this.feeRate = feeRate;
        return this;
    }

    /**
     * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRate
     **/
    @Schema(description = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    public String getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(String feeRate) {
        this.feeRate = feeRate;
    }

    public OverdraftOverdraftFeeChargeDetail feeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
        return this;
    }

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     *
     * @return feeRateType
     **/
    @Schema(description = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")
    public FeeRateTypeEnum getFeeRateType() {
        return feeRateType;
    }

    public void setFeeRateType(FeeRateTypeEnum feeRateType) {
        this.feeRateType = feeRateType;
    }

    public OverdraftOverdraftFeeChargeDetail applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * Frequency at which the overdraft charge is applied to the account
     *
     * @return applicationFrequency
     **/
    @Schema(required = true, description = "Frequency at which the overdraft charge is applied to the account")
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is the overdraft fee/charge calculated for the account.
     *
     * @return calculationFrequency
     **/
    @Schema(description = "How often is the overdraft fee/charge calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OverdraftOverdraftFeeChargeDetail addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Free text for capturing any other info related to Overdraft Fees Charge Details
     *
     * @return notes
     **/
    @Schema(description = "Free text for capturing any other info related to Overdraft Fees Charge Details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OverdraftOverdraftFeeChargeDetail overdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
        return this;
    }

    public OverdraftOverdraftFeeChargeDetail addOverdraftFeeChargeCapItem(OverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
        if (this.overdraftFeeChargeCap == null) {
            this.overdraftFeeChargeCap = new ArrayList<OverdraftOverdraftFeeChargeCap>();
        }
        this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.
     *
     * @return overdraftFeeChargeCap
     **/
    @Schema(description = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
    public List<OverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
        return overdraftFeeChargeCap;
    }

    public void setOverdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
        this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    }

    public OverdraftOverdraftFeeChargeDetail otherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    /**
     * Get otherFeeType
     *
     * @return otherFeeType
     **/
    @Schema(description = "")
    public OtherFeeType getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(OtherFeeType otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    public OverdraftOverdraftFeeChargeDetail otherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
        return this;
    }

    /**
     * Get otherFeeRateType
     *
     * @return otherFeeRateType
     **/
    @Schema(description = "")
    public OtherFeeRateType getOtherFeeRateType() {
        return otherFeeRateType;
    }

    public void setOtherFeeRateType(OtherFeeRateType otherFeeRateType) {
        this.otherFeeRateType = otherFeeRateType;
    }

    public OverdraftOverdraftFeeChargeDetail otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     **/
    @Schema(description = "")
    public OtherApplicationFrequency getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OverdraftOverdraftFeeChargeDetail otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     **/
    @Schema(description = "")
    public OtherCalculationFrequency getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdraftOverdraftFeeChargeDetail overdraftOverdraftFeeChargeDetail = (OverdraftOverdraftFeeChargeDetail) o;
        return Objects.equals(this.feeType, overdraftOverdraftFeeChargeDetail.feeType) &&
                Objects.equals(this.negotiableIndicator, overdraftOverdraftFeeChargeDetail.negotiableIndicator) &&
                Objects.equals(this.overdraftControlIndicator, overdraftOverdraftFeeChargeDetail.overdraftControlIndicator) &&
                Objects.equals(this.incrementalBorrowingAmount, overdraftOverdraftFeeChargeDetail.incrementalBorrowingAmount) &&
                Objects.equals(this.feeAmount, overdraftOverdraftFeeChargeDetail.feeAmount) &&
                Objects.equals(this.feeRate, overdraftOverdraftFeeChargeDetail.feeRate) &&
                Objects.equals(this.feeRateType, overdraftOverdraftFeeChargeDetail.feeRateType) &&
                Objects.equals(this.applicationFrequency, overdraftOverdraftFeeChargeDetail.applicationFrequency) &&
                Objects.equals(this.calculationFrequency, overdraftOverdraftFeeChargeDetail.calculationFrequency) &&
                Objects.equals(this.notes, overdraftOverdraftFeeChargeDetail.notes) &&
                Objects.equals(this.overdraftFeeChargeCap, overdraftOverdraftFeeChargeDetail.overdraftFeeChargeCap) &&
                Objects.equals(this.otherFeeType, overdraftOverdraftFeeChargeDetail.otherFeeType) &&
                Objects.equals(this.otherFeeRateType, overdraftOverdraftFeeChargeDetail.otherFeeRateType) &&
                Objects.equals(this.otherApplicationFrequency, overdraftOverdraftFeeChargeDetail.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, overdraftOverdraftFeeChargeDetail.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, negotiableIndicator, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, overdraftFeeChargeCap, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdraftOverdraftFeeChargeDetail {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    negotiableIndicator: ").append(toIndentedString(negotiableIndicator)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
        sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
        sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
        sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
        sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
        sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
        sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
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


    /**
     * Overdraft fee type
     */
    @JsonAdapter(FeeTypeEnum.Adapter.class)
    public enum FeeTypeEnum {
        ARRANGEDOVERDRAFT("ArrangedOverdraft"),
        ANNUALREVIEW("AnnualReview"),
        EMERGENCYBORROWING("EmergencyBorrowing"),
        BORROWINGITEM("BorrowingItem"),
        OVERDRAFTRENEWAL("OverdraftRenewal"),
        OVERDRAFTSETUP("OverdraftSetup"),
        SURCHARGE("Surcharge"),
        TEMPOVERDRAFT("TempOverdraft"),
        UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),
        UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),
        OTHER("Other"),
        UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

        private String value;

        FeeTypeEnum(String value) {
            this.value = value;
        }

        public static FeeTypeEnum fromValue(String text) {
            for (FeeTypeEnum b : FeeTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FeeTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FeeTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
     */
    @JsonAdapter(FeeRateTypeEnum.Adapter.class)
    public enum FeeRateTypeEnum {
        GROSS("Gross"),
        OTHER("Other");

        private String value;

        FeeRateTypeEnum(String value) {
            this.value = value;
        }

        public static FeeRateTypeEnum fromValue(String text) {
            for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<FeeRateTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FeeRateTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FeeRateTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FeeRateTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }


    /**
     * Frequency at which the overdraft charge is applied to the account
     */
    @JsonAdapter(ApplicationFrequencyEnum.Adapter.class)
    public enum ApplicationFrequencyEnum {
        ONCLOSING("OnClosing"),
        ONOPENING("OnOpening"),
        CHARGINGPERIOD("ChargingPeriod"),
        DAILY("Daily"),
        PERITEM("PerItem"),
        MONTHLY("Monthly"),
        ONANNIVERSARY("OnAnniversary"),
        OTHER("Other"),
        PERHUNDREDPOUNDS("PerHundredPounds"),
        PERHOUR("PerHour"),
        PEROCCURRENCE("PerOccurrence"),
        PERSHEET("PerSheet"),
        PERTRANSACTION("PerTransaction"),
        PERTRANSACTIONAMOUNT("PerTransactionAmount"),
        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
        QUARTERLY("Quarterly"),
        SIXMONTHLY("SixMonthly"),
        STATEMENTMONTHLY("StatementMonthly"),
        WEEKLY("Weekly"),
        YEARLY("Yearly");

        private String value;

        ApplicationFrequencyEnum(String value) {
            this.value = value;
        }

        public static ApplicationFrequencyEnum fromValue(String text) {
            for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<ApplicationFrequencyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ApplicationFrequencyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ApplicationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ApplicationFrequencyEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * How often is the overdraft fee/charge calculated for the account.
     */
    @JsonAdapter(CalculationFrequencyEnum.Adapter.class)
    public enum CalculationFrequencyEnum {
        ONCLOSING("OnClosing"),
        ONOPENING("OnOpening"),
        CHARGINGPERIOD("ChargingPeriod"),
        DAILY("Daily"),
        PERITEM("PerItem"),
        MONTHLY("Monthly"),
        ONANNIVERSARY("OnAnniversary"),
        OTHER("Other"),
        PERHUNDREDPOUNDS("PerHundredPounds"),
        PERHOUR("PerHour"),
        PEROCCURRENCE("PerOccurrence"),
        PERSHEET("PerSheet"),
        PERTRANSACTION("PerTransaction"),
        PERTRANSACTIONAMOUNT("PerTransactionAmount"),
        PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
        QUARTERLY("Quarterly"),
        SIXMONTHLY("SixMonthly"),
        STATEMENTMONTHLY("StatementMonthly"),
        WEEKLY("Weekly"),
        YEARLY("Yearly");

        private String value;

        CalculationFrequencyEnum(String value) {
            this.value = value;
        }

        public static CalculationFrequencyEnum fromValue(String text) {
            for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<CalculationFrequencyEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CalculationFrequencyEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CalculationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CalculationFrequencyEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
