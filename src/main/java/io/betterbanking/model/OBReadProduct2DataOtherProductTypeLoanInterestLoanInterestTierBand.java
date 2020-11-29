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
 * Tier Band Details
 */
@Schema(description = "Tier Band Details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand {
    @SerializedName("Identification")
    private String identification = null;

    @SerializedName("TierValueMinimum")
    private String tierValueMinimum = null;

    @SerializedName("TierValueMaximum")
    private String tierValueMaximum = null;

    @SerializedName("TierValueMinTerm")
    private Integer tierValueMinTerm = null;
    @SerializedName("MinTermPeriod")
    private MinTermPeriodEnum minTermPeriod = null;
    @SerializedName("TierValueMaxTerm")
    private Integer tierValueMaxTerm = null;
    @SerializedName("MaxTermPeriod")
    private MaxTermPeriodEnum maxTermPeriod = null;
    @SerializedName("FixedVariableInterestRateType")
    private OBInterestFixedVariableType1Code fixedVariableInterestRateType = null;
    @SerializedName("RepAPR")
    private String repAPR = null;
    @SerializedName("LoanProviderInterestRateType")
    private LoanProviderInterestRateTypeEnum loanProviderInterestRateType = null;
    @SerializedName("LoanProviderInterestRate")
    private String loanProviderInterestRate = null;
    @SerializedName("Notes")
    private List<String> notes = null;
    @SerializedName("OtherLoanProviderInterestRateType")
    private OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType = null;
    @SerializedName("LoanInterestFeesCharges")
    private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges = null;

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a SME Loan.
     *
     * @return identification
     **/
    @Schema(description = "Unique and unambiguous identification of a  Tier Band for a SME Loan.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum loan value for which the loan interest tier applies.
     *
     * @return tierValueMinimum
     **/
    @Schema(required = true, description = "Minimum loan value for which the loan interest tier applies.")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Maximum loan value for which the loan interest tier applies.
     *
     * @return tierValueMaximum
     **/
    @Schema(description = "Maximum loan value for which the loan interest tier applies.")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMinTerm(Integer tierValueMinTerm) {
        this.tierValueMinTerm = tierValueMinTerm;
        return this;
    }

    /**
     * Minimum loan term for which the loan interest tier applies.
     *
     * @return tierValueMinTerm
     **/
    @Schema(required = true, description = "Minimum loan term for which the loan interest tier applies.")
    public Integer getTierValueMinTerm() {
        return tierValueMinTerm;
    }

    public void setTierValueMinTerm(Integer tierValueMinTerm) {
        this.tierValueMinTerm = tierValueMinTerm;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand minTermPeriod(MinTermPeriodEnum minTermPeriod) {
        this.minTermPeriod = minTermPeriod;
        return this;
    }

    /**
     * The unit of period (days, weeks, months etc.) of the Minimum Term
     *
     * @return minTermPeriod
     **/
    @Schema(required = true, description = "The unit of period (days, weeks, months etc.) of the Minimum Term")
    public MinTermPeriodEnum getMinTermPeriod() {
        return minTermPeriod;
    }

    public void setMinTermPeriod(MinTermPeriodEnum minTermPeriod) {
        this.minTermPeriod = minTermPeriod;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand tierValueMaxTerm(Integer tierValueMaxTerm) {
        this.tierValueMaxTerm = tierValueMaxTerm;
        return this;
    }

    /**
     * Maximum loan term for which the loan interest tier applies.
     *
     * @return tierValueMaxTerm
     **/
    @Schema(description = "Maximum loan term for which the loan interest tier applies.")
    public Integer getTierValueMaxTerm() {
        return tierValueMaxTerm;
    }

    public void setTierValueMaxTerm(Integer tierValueMaxTerm) {
        this.tierValueMaxTerm = tierValueMaxTerm;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand maxTermPeriod(MaxTermPeriodEnum maxTermPeriod) {
        this.maxTermPeriod = maxTermPeriod;
        return this;
    }

    /**
     * The unit of period (days, weeks, months etc.) of the Maximum Term
     *
     * @return maxTermPeriod
     **/
    @Schema(description = "The unit of period (days, weeks, months etc.) of the Maximum Term")
    public MaxTermPeriodEnum getMaxTermPeriod() {
        return maxTermPeriod;
    }

    public void setMaxTermPeriod(MaxTermPeriodEnum maxTermPeriod) {
        this.maxTermPeriod = maxTermPeriod;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Get fixedVariableInterestRateType
     *
     * @return fixedVariableInterestRateType
     **/
    @Schema(required = true, description = "")
    public OBInterestFixedVariableType1Code getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand repAPR(String repAPR) {
        this.repAPR = repAPR;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.
     *
     * @return repAPR
     **/
    @Schema(required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees.")
    public String getRepAPR() {
        return repAPR;
    }

    public void setRepAPR(String repAPR) {
        this.repAPR = repAPR;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanProviderInterestRateType(LoanProviderInterestRateTypeEnum loanProviderInterestRateType) {
        this.loanProviderInterestRateType = loanProviderInterestRateType;
        return this;
    }

    /**
     * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
     *
     * @return loanProviderInterestRateType
     **/
    @Schema(description = "Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.")
    public LoanProviderInterestRateTypeEnum getLoanProviderInterestRateType() {
        return loanProviderInterestRateType;
    }

    public void setLoanProviderInterestRateType(LoanProviderInterestRateTypeEnum loanProviderInterestRateType) {
        this.loanProviderInterestRateType = loanProviderInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanProviderInterestRate(String loanProviderInterestRate) {
        this.loanProviderInterestRate = loanProviderInterestRate;
        return this;
    }

    /**
     * Loan provider Interest for the SME Loan product
     *
     * @return loanProviderInterestRate
     **/
    @Schema(description = "Loan provider Interest for the SME Loan product")
    public String getLoanProviderInterestRate() {
        return loanProviderInterestRate;
    }

    public void setLoanProviderInterestRate(String loanProviderInterestRate) {
        this.loanProviderInterestRate = loanProviderInterestRate;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Get notes
     *
     * @return notes
     **/
    @Schema(description = "")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand otherLoanProviderInterestRateType(OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
        this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
        return this;
    }

    /**
     * Get otherLoanProviderInterestRateType
     *
     * @return otherLoanProviderInterestRateType
     **/
    @Schema(description = "")
    public OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType getOtherLoanProviderInterestRateType() {
        return otherLoanProviderInterestRateType;
    }

    public void setOtherLoanProviderInterestRateType(OBReadProduct2DataOtherProductTypeLoanInterestOtherLoanProviderInterestRateType otherLoanProviderInterestRateType) {
        this.otherLoanProviderInterestRateType = otherLoanProviderInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand loanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand addLoanInterestFeesChargesItem(OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges loanInterestFeesChargesItem) {
        if (this.loanInterestFeesCharges == null) {
            this.loanInterestFeesCharges = new ArrayList<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges>();
        }
        this.loanInterestFeesCharges.add(loanInterestFeesChargesItem);
        return this;
    }

    /**
     * Get loanInterestFeesCharges
     *
     * @return loanInterestFeesCharges
     **/
    @Schema(description = "")
    public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> getLoanInterestFeesCharges() {
        return loanInterestFeesCharges;
    }

    public void setLoanInterestFeesCharges(List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestFeesCharges> loanInterestFeesCharges) {
        this.loanInterestFeesCharges = loanInterestFeesCharges;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand = (OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand) o;
        return Objects.equals(this.identification, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.identification) &&
                Objects.equals(this.tierValueMinimum, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.tierValueMaximum) &&
                Objects.equals(this.tierValueMinTerm, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.tierValueMinTerm) &&
                Objects.equals(this.minTermPeriod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.minTermPeriod) &&
                Objects.equals(this.tierValueMaxTerm, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.tierValueMaxTerm) &&
                Objects.equals(this.maxTermPeriod, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.maxTermPeriod) &&
                Objects.equals(this.fixedVariableInterestRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.fixedVariableInterestRateType) &&
                Objects.equals(this.repAPR, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.repAPR) &&
                Objects.equals(this.loanProviderInterestRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.loanProviderInterestRateType) &&
                Objects.equals(this.loanProviderInterestRate, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.loanProviderInterestRate) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.notes) &&
                Objects.equals(this.otherLoanProviderInterestRateType, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.otherLoanProviderInterestRateType) &&
                Objects.equals(this.loanInterestFeesCharges, obReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand.loanInterestFeesCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, tierValueMinTerm, minTermPeriod, tierValueMaxTerm, maxTermPeriod, fixedVariableInterestRateType, repAPR, loanProviderInterestRateType, loanProviderInterestRate, notes, otherLoanProviderInterestRateType, loanInterestFeesCharges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBand {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    tierValueMinTerm: ").append(toIndentedString(tierValueMinTerm)).append("\n");
        sb.append("    minTermPeriod: ").append(toIndentedString(minTermPeriod)).append("\n");
        sb.append("    tierValueMaxTerm: ").append(toIndentedString(tierValueMaxTerm)).append("\n");
        sb.append("    maxTermPeriod: ").append(toIndentedString(maxTermPeriod)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    repAPR: ").append(toIndentedString(repAPR)).append("\n");
        sb.append("    loanProviderInterestRateType: ").append(toIndentedString(loanProviderInterestRateType)).append("\n");
        sb.append("    loanProviderInterestRate: ").append(toIndentedString(loanProviderInterestRate)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherLoanProviderInterestRateType: ").append(toIndentedString(otherLoanProviderInterestRateType)).append("\n");
        sb.append("    loanInterestFeesCharges: ").append(toIndentedString(loanInterestFeesCharges)).append("\n");
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
     * The unit of period (days, weeks, months etc.) of the Minimum Term
     */
    @JsonAdapter(MinTermPeriodEnum.Adapter.class)
    public enum MinTermPeriodEnum {
        PACT("PACT"),
        PDAY("PDAY"),
        PHYR("PHYR"),
        PMTH("PMTH"),
        PQTR("PQTR"),
        PWEK("PWEK"),
        PYER("PYER");

        private String value;

        MinTermPeriodEnum(String value) {
            this.value = value;
        }

        public static MinTermPeriodEnum fromValue(String text) {
            for (MinTermPeriodEnum b : MinTermPeriodEnum.values()) {
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

        public static class Adapter extends TypeAdapter<MinTermPeriodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MinTermPeriodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MinTermPeriodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MinTermPeriodEnum.fromValue(String.valueOf(value));
            }
        }
    }


    /**
     * The unit of period (days, weeks, months etc.) of the Maximum Term
     */
    @JsonAdapter(MaxTermPeriodEnum.Adapter.class)
    public enum MaxTermPeriodEnum {
        PACT("PACT"),
        PDAY("PDAY"),
        PHYR("PHYR"),
        PMTH("PMTH"),
        PQTR("PQTR"),
        PWEK("PWEK"),
        PYER("PYER");

        private String value;

        MaxTermPeriodEnum(String value) {
            this.value = value;
        }

        public static MaxTermPeriodEnum fromValue(String text) {
            for (MaxTermPeriodEnum b : MaxTermPeriodEnum.values()) {
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

        public static class Adapter extends TypeAdapter<MaxTermPeriodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MaxTermPeriodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MaxTermPeriodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MaxTermPeriodEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan.
     */
    @JsonAdapter(LoanProviderInterestRateTypeEnum.Adapter.class)
    public enum LoanProviderInterestRateTypeEnum {
        INBB("INBB"),
        INFR("INFR"),
        INGR("INGR"),
        INLR("INLR"),
        INNE("INNE"),
        INOT("INOT");

        private String value;

        LoanProviderInterestRateTypeEnum(String value) {
            this.value = value;
        }

        public static LoanProviderInterestRateTypeEnum fromValue(String text) {
            for (LoanProviderInterestRateTypeEnum b : LoanProviderInterestRateTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<LoanProviderInterestRateTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final LoanProviderInterestRateTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public LoanProviderInterestRateTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return LoanProviderInterestRateTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
