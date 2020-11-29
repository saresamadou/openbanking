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
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */
@Schema(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class Overdraft1OverdraftFeeChargeCap {
    @SerializedName("FeeType")
    private List<FeeTypeEnum> feeType = new ArrayList<FeeTypeEnum>();
    @SerializedName("OverdraftControlIndicator")
    private Boolean overdraftControlIndicator = null;
    @SerializedName("MinMaxType")
    private MinMaxTypeEnum minMaxType = null;
    @SerializedName("FeeCapOccurrence")
    private Float feeCapOccurrence = null;
    @SerializedName("FeeCapAmount")
    private String feeCapAmount = null;
    @SerializedName("CappingPeriod")
    private CappingPeriodEnum cappingPeriod = null;
    @SerializedName("Notes")
    private List<String> notes = null;
    @SerializedName("OtherFeeType")
    private List<OverdraftOtherFeeType> otherFeeType = null;

    public Overdraft1OverdraftFeeChargeCap feeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addFeeTypeItem(FeeTypeEnum feeTypeItem) {
        this.feeType.add(feeTypeItem);
        return this;
    }

    /**
     * Fee/charge type which is being capped
     *
     * @return feeType
     **/
    @Schema(required = true, description = "Fee/charge type which is being capped")
    public List<FeeTypeEnum> getFeeType() {
        return feeType;
    }

    public void setFeeType(List<FeeTypeEnum> feeType) {
        this.feeType = feeType;
    }

    public Overdraft1OverdraftFeeChargeCap overdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
        return this;
    }

    /**
     * Specifies for the overdraft control feature/benefit
     *
     * @return overdraftControlIndicator
     **/
    @Schema(description = "Specifies for the overdraft control feature/benefit")
    public Boolean isOverdraftControlIndicator() {
        return overdraftControlIndicator;
    }

    public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
        this.overdraftControlIndicator = overdraftControlIndicator;
    }

    public Overdraft1OverdraftFeeChargeCap minMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
        return this;
    }

    /**
     * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
     *
     * @return minMaxType
     **/
    @Schema(required = true, description = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")
    public MinMaxTypeEnum getMinMaxType() {
        return minMaxType;
    }

    public void setMinMaxType(MinMaxTypeEnum minMaxType) {
        this.minMaxType = minMaxType;
    }

    public Overdraft1OverdraftFeeChargeCap feeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
        return this;
    }

    /**
     * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
     *
     * @return feeCapOccurrence
     **/
    @Schema(description = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")
    public Float getFeeCapOccurrence() {
        return feeCapOccurrence;
    }

    public void setFeeCapOccurrence(Float feeCapOccurrence) {
        this.feeCapOccurrence = feeCapOccurrence;
    }

    public Overdraft1OverdraftFeeChargeCap feeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
        return this;
    }

    /**
     * Cap amount charged for a fee/charge
     *
     * @return feeCapAmount
     **/
    @Schema(description = "Cap amount charged for a fee/charge")
    public String getFeeCapAmount() {
        return feeCapAmount;
    }

    public void setFeeCapAmount(String feeCapAmount) {
        this.feeCapAmount = feeCapAmount;
    }

    public Overdraft1OverdraftFeeChargeCap cappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
        return this;
    }

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     *
     * @return cappingPeriod
     **/
    @Schema(description = "Period e.g. day, week, month etc. for which the fee/charge is capped")
    public CappingPeriodEnum getCappingPeriod() {
        return cappingPeriod;
    }

    public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
        this.cappingPeriod = cappingPeriod;
    }

    public Overdraft1OverdraftFeeChargeCap notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Notes related to Overdraft fee charge cap
     *
     * @return notes
     **/
    @Schema(description = "Notes related to Overdraft fee charge cap")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public Overdraft1OverdraftFeeChargeCap otherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
        return this;
    }

    public Overdraft1OverdraftFeeChargeCap addOtherFeeTypeItem(OverdraftOtherFeeType otherFeeTypeItem) {
        if (this.otherFeeType == null) {
            this.otherFeeType = new ArrayList<OverdraftOtherFeeType>();
        }
        this.otherFeeType.add(otherFeeTypeItem);
        return this;
    }

    /**
     * Other fee type code which is not available in the standard code set
     *
     * @return otherFeeType
     **/
    @Schema(description = "Other fee type code which is not available in the standard code set")
    public List<OverdraftOtherFeeType> getOtherFeeType() {
        return otherFeeType;
    }

    public void setOtherFeeType(List<OverdraftOtherFeeType> otherFeeType) {
        this.otherFeeType = otherFeeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Overdraft1OverdraftFeeChargeCap overdraft1OverdraftFeeChargeCap = (Overdraft1OverdraftFeeChargeCap) o;
        return Objects.equals(this.feeType, overdraft1OverdraftFeeChargeCap.feeType) &&
                Objects.equals(this.overdraftControlIndicator, overdraft1OverdraftFeeChargeCap.overdraftControlIndicator) &&
                Objects.equals(this.minMaxType, overdraft1OverdraftFeeChargeCap.minMaxType) &&
                Objects.equals(this.feeCapOccurrence, overdraft1OverdraftFeeChargeCap.feeCapOccurrence) &&
                Objects.equals(this.feeCapAmount, overdraft1OverdraftFeeChargeCap.feeCapAmount) &&
                Objects.equals(this.cappingPeriod, overdraft1OverdraftFeeChargeCap.cappingPeriod) &&
                Objects.equals(this.notes, overdraft1OverdraftFeeChargeCap.notes) &&
                Objects.equals(this.otherFeeType, overdraft1OverdraftFeeChargeCap.otherFeeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeType, overdraftControlIndicator, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Overdraft1OverdraftFeeChargeCap {\n");

        sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
        sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
        sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
        sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
        sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
        sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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
        EMERGENCYBORROWING("EmergencyBorrowing"),
        BORROWINGITEM("BorrowingItem"),
        OVERDRAFTRENEWAL("OverdraftRenewal"),
        ANNUALREVIEW("AnnualReview"),
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
     * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
     */
    @JsonAdapter(MinMaxTypeEnum.Adapter.class)
    public enum MinMaxTypeEnum {
        MINIMUM("Minimum"),
        MAXIMUM("Maximum");

        private String value;

        MinMaxTypeEnum(String value) {
            this.value = value;
        }

        public static MinMaxTypeEnum fromValue(String text) {
            for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<MinMaxTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MinMaxTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MinMaxTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MinMaxTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Period e.g. day, week, month etc. for which the fee/charge is capped
     */
    @JsonAdapter(CappingPeriodEnum.Adapter.class)
    public enum CappingPeriodEnum {
        ACADEMICTERM("AcademicTerm"),
        DAY("Day"),
        HALF_YEAR("Half Year"),
        MONTH("Month"),
        QUARTER("Quarter"),
        WEEK("Week"),
        YEAR("Year");

        private String value;

        CappingPeriodEnum(String value) {
            this.value = value;
        }

        public static CappingPeriodEnum fromValue(String text) {
            for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
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

        public static class Adapter extends TypeAdapter<CappingPeriodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CappingPeriodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CappingPeriodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CappingPeriodEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
