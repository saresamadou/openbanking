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
public class CreditInterest1TierBand {
    @SerializedName("Identification")
    private String identification = null;

    @SerializedName("TierValueMinimum")
    private String tierValueMinimum = null;

    @SerializedName("TierValueMaximum")
    private String tierValueMaximum = null;
    @SerializedName("CalculationFrequency")
    private CalculationFrequencyEnum calculationFrequency = null;
    @SerializedName("ApplicationFrequency")
    private ApplicationFrequencyEnum applicationFrequency = null;
    @SerializedName("DepositInterestAppliedCoverage")
    private DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage = null;
    @SerializedName("FixedVariableInterestRateType")
    private FixedVariableInterestRateTypeEnum fixedVariableInterestRateType = null;
    @SerializedName("AER")
    private String AER = null;
    @SerializedName("BankInterestRateType")
    private BankInterestRateTypeEnum bankInterestRateType = null;
    @SerializedName("BankInterestRate")
    private String bankInterestRate = null;
    @SerializedName("Notes")
    private List<String> notes = null;
    @SerializedName("OtherBankInterestType")
    private OtherBankInterestType otherBankInterestType = null;
    @SerializedName("OtherApplicationFrequency")
    private OtherApplicationFrequency otherApplicationFrequency = null;
    @SerializedName("OtherCalculationFrequency")
    private OtherCalculationFrequency otherCalculationFrequency = null;

    public CreditInterest1TierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for a PCA.
     *
     * @return identification
     **/
    @Schema(description = "Unique and unambiguous identification of a  Tier Band for a PCA.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public CreditInterest1TierBand tierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
        return this;
    }

    /**
     * Minimum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMinimum
     **/
    @Schema(required = true, description = "Minimum deposit value for which the credit interest tier applies.")
    public String getTierValueMinimum() {
        return tierValueMinimum;
    }

    public void setTierValueMinimum(String tierValueMinimum) {
        this.tierValueMinimum = tierValueMinimum;
    }

    public CreditInterest1TierBand tierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
        return this;
    }

    /**
     * Maximum deposit value for which the credit interest tier applies.
     *
     * @return tierValueMaximum
     **/
    @Schema(description = "Maximum deposit value for which the credit interest tier applies.")
    public String getTierValueMaximum() {
        return tierValueMaximum;
    }

    public void setTierValueMaximum(String tierValueMaximum) {
        this.tierValueMaximum = tierValueMaximum;
    }

    public CreditInterest1TierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
        return this;
    }

    /**
     * How often is credit interest calculated for the account.
     *
     * @return calculationFrequency
     **/
    @Schema(description = "How often is credit interest calculated for the account.")
    public CalculationFrequencyEnum getCalculationFrequency() {
        return calculationFrequency;
    }

    public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
        this.calculationFrequency = calculationFrequency;
    }

    public CreditInterest1TierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#x27;s PCA.
     *
     * @return applicationFrequency
     **/
    @Schema(required = true, description = "How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's PCA.")
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public CreditInterest1TierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
        return this;
    }

    /**
     * Amount on which Interest applied.
     *
     * @return depositInterestAppliedCoverage
     **/
    @Schema(description = "Amount on which Interest applied.")
    public DepositInterestAppliedCoverageEnum getDepositInterestAppliedCoverage() {
        return depositInterestAppliedCoverage;
    }

    public void setDepositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
        this.depositInterestAppliedCoverage = depositInterestAppliedCoverage;
    }

    public CreditInterest1TierBand fixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
        return this;
    }

    /**
     * Type of interest rate, Fixed or Variable
     *
     * @return fixedVariableInterestRateType
     **/
    @Schema(required = true, description = "Type of interest rate, Fixed or Variable")
    public FixedVariableInterestRateTypeEnum getFixedVariableInterestRateType() {
        return fixedVariableInterestRateType;
    }

    public void setFixedVariableInterestRateType(FixedVariableInterestRateTypeEnum fixedVariableInterestRateType) {
        this.fixedVariableInterestRateType = fixedVariableInterestRateType;
    }

    public CreditInterest1TierBand AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     *
     * @return AER
     **/
    @Schema(required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public CreditInterest1TierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
        return this;
    }

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
     *
     * @return bankInterestRateType
     **/
    @Schema(description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.")
    public BankInterestRateTypeEnum getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public CreditInterest1TierBand bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the PCA product
     *
     * @return bankInterestRate
     **/
    @Schema(description = "Bank Interest for the PCA product")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public CreditInterest1TierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public CreditInterest1TierBand addNotesItem(String notesItem) {
        if (this.notes == null) {
            this.notes = new ArrayList<String>();
        }
        this.notes.add(notesItem);
        return this;
    }

    /**
     * Optional additional notes to supplement the Tier Band details
     *
     * @return notes
     **/
    @Schema(description = "Optional additional notes to supplement the Tier Band details")
    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public CreditInterest1TierBand otherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
        return this;
    }

    /**
     * Get otherBankInterestType
     *
     * @return otherBankInterestType
     **/
    @Schema(description = "")
    public OtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public CreditInterest1TierBand otherApplicationFrequency(OtherApplicationFrequency otherApplicationFrequency) {
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

    public CreditInterest1TierBand otherCalculationFrequency(OtherCalculationFrequency otherCalculationFrequency) {
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
        CreditInterest1TierBand creditInterest1TierBand = (CreditInterest1TierBand) o;
        return Objects.equals(this.identification, creditInterest1TierBand.identification) &&
                Objects.equals(this.tierValueMinimum, creditInterest1TierBand.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, creditInterest1TierBand.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, creditInterest1TierBand.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, creditInterest1TierBand.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, creditInterest1TierBand.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, creditInterest1TierBand.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, creditInterest1TierBand.AER) &&
                Objects.equals(this.bankInterestRateType, creditInterest1TierBand.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, creditInterest1TierBand.bankInterestRate) &&
                Objects.equals(this.notes, creditInterest1TierBand.notes) &&
                Objects.equals(this.otherBankInterestType, creditInterest1TierBand.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, creditInterest1TierBand.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, creditInterest1TierBand.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditInterest1TierBand {\n");

        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    tierValueMinimum: ").append(toIndentedString(tierValueMinimum)).append("\n");
        sb.append("    tierValueMaximum: ").append(toIndentedString(tierValueMaximum)).append("\n");
        sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
        sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
        sb.append("    depositInterestAppliedCoverage: ").append(toIndentedString(depositInterestAppliedCoverage)).append("\n");
        sb.append("    fixedVariableInterestRateType: ").append(toIndentedString(fixedVariableInterestRateType)).append("\n");
        sb.append("    AER: ").append(toIndentedString(AER)).append("\n");
        sb.append("    bankInterestRateType: ").append(toIndentedString(bankInterestRateType)).append("\n");
        sb.append("    bankInterestRate: ").append(toIndentedString(bankInterestRate)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    otherBankInterestType: ").append(toIndentedString(otherBankInterestType)).append("\n");
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
     * How often is credit interest calculated for the account.
     */
    @JsonAdapter(CalculationFrequencyEnum.Adapter.class)
    public enum CalculationFrequencyEnum {
        PERACADEMICTERM("PerAcademicTerm"),
        DAILY("Daily"),
        HALFYEARLY("HalfYearly"),
        MONTHLY("Monthly"),
        OTHER("Other"),
        QUARTERLY("Quarterly"),
        PERSTATEMENTDATE("PerStatementDate"),
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


    /**
     * How often is interest applied to the PCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#x27;s PCA.
     */
    @JsonAdapter(ApplicationFrequencyEnum.Adapter.class)
    public enum ApplicationFrequencyEnum {
        PERACADEMICTERM("PerAcademicTerm"),
        DAILY("Daily"),
        HALFYEARLY("HalfYearly"),
        MONTHLY("Monthly"),
        OTHER("Other"),
        QUARTERLY("Quarterly"),
        PERSTATEMENTDATE("PerStatementDate"),
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
     * Amount on which Interest applied.
     */
    @JsonAdapter(DepositInterestAppliedCoverageEnum.Adapter.class)
    public enum DepositInterestAppliedCoverageEnum {
        TIERED("Tiered"),
        WHOLE("Whole");

        private String value;

        DepositInterestAppliedCoverageEnum(String value) {
            this.value = value;
        }

        public static DepositInterestAppliedCoverageEnum fromValue(String text) {
            for (DepositInterestAppliedCoverageEnum b : DepositInterestAppliedCoverageEnum.values()) {
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

        public static class Adapter extends TypeAdapter<DepositInterestAppliedCoverageEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final DepositInterestAppliedCoverageEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public DepositInterestAppliedCoverageEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return DepositInterestAppliedCoverageEnum.fromValue(String.valueOf(value));
            }
        }
    }


    /**
     * Type of interest rate, Fixed or Variable
     */
    @JsonAdapter(FixedVariableInterestRateTypeEnum.Adapter.class)
    public enum FixedVariableInterestRateTypeEnum {
        FIXED("Fixed"),
        VARIABLE("Variable");

        private String value;

        FixedVariableInterestRateTypeEnum(String value) {
            this.value = value;
        }

        public static FixedVariableInterestRateTypeEnum fromValue(String text) {
            for (FixedVariableInterestRateTypeEnum b : FixedVariableInterestRateTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<FixedVariableInterestRateTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FixedVariableInterestRateTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FixedVariableInterestRateTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FixedVariableInterestRateTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the PCA.
     */
    @JsonAdapter(BankInterestRateTypeEnum.Adapter.class)
    public enum BankInterestRateTypeEnum {
        LINKEDBASERATE("LinkedBaseRate"),
        GROSS("Gross"),
        NET("Net"),
        OTHER("Other");

        private String value;

        BankInterestRateTypeEnum(String value) {
            this.value = value;
        }

        public static BankInterestRateTypeEnum fromValue(String text) {
            for (BankInterestRateTypeEnum b : BankInterestRateTypeEnum.values()) {
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

        public static class Adapter extends TypeAdapter<BankInterestRateTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final BankInterestRateTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public BankInterestRateTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return BankInterestRateTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
