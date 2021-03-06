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
public class OBReadProduct2DataOtherProductTypeCreditInterestTierBand {
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
    private OBInterestFixedVariableType1Code fixedVariableInterestRateType = null;
    @SerializedName("AER")
    private String AER = null;
    @SerializedName("BankInterestRateType")
    private BankInterestRateTypeEnum bankInterestRateType = null;
    @SerializedName("BankInterestRate")
    private String bankInterestRate = null;
    @SerializedName("Notes")
    private List<String> notes = null;
    @SerializedName("OtherBankInterestType")
    private OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType = null;
    @SerializedName("OtherApplicationFrequency")
    private OBOtherCodeType11 otherApplicationFrequency = null;
    @SerializedName("OtherCalculationFrequency")
    private OBOtherCodeType12 otherCalculationFrequency = null;

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Unique and unambiguous identification of a  Tier Band for the Product.
     *
     * @return identification
     **/
    @Schema(description = "Unique and unambiguous identification of a  Tier Band for the Product.")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMinimum(String tierValueMinimum) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand tierValueMaximum(String tierValueMaximum) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
        return this;
    }

    /**
     * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#x27;s account.
     *
     * @return applicationFrequency
     **/
    @Schema(required = true, description = "How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer's account.")
    public ApplicationFrequencyEnum getApplicationFrequency() {
        return applicationFrequency;
    }

    public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
        this.applicationFrequency = applicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand depositInterestAppliedCoverage(DepositInterestAppliedCoverageEnum depositInterestAppliedCoverage) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand fixedVariableInterestRateType(OBInterestFixedVariableType1Code fixedVariableInterestRateType) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand AER(String AER) {
        this.AER = AER;
        return this;
    }

    /**
     * The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A
     *
     * @return AER
     **/
    @Schema(required = true, description = "The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A")
    public String getAER() {
        return AER;
    }

    public void setAER(String AER) {
        this.AER = AER;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
        return this;
    }

    /**
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder&#x27;s account.
     *
     * @return bankInterestRateType
     **/
    @Schema(description = "Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder's account.")
    public BankInterestRateTypeEnum getBankInterestRateType() {
        return bankInterestRateType;
    }

    public void setBankInterestRateType(BankInterestRateTypeEnum bankInterestRateType) {
        this.bankInterestRateType = bankInterestRateType;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand bankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
        return this;
    }

    /**
     * Bank Interest for the product
     *
     * @return bankInterestRate
     **/
    @Schema(description = "Bank Interest for the product")
    public String getBankInterestRate() {
        return bankInterestRate;
    }

    public void setBankInterestRate(String bankInterestRate) {
        this.bankInterestRate = bankInterestRate;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
        return this;
    }

    /**
     * Get otherBankInterestType
     *
     * @return otherBankInterestType
     **/
    @Schema(description = "")
    public OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType getOtherBankInterestType() {
        return otherBankInterestType;
    }

    public void setOtherBankInterestType(OBReadProduct2DataOtherProductTypeCreditInterestOtherBankInterestType otherBankInterestType) {
        this.otherBankInterestType = otherBankInterestType;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
        return this;
    }

    /**
     * Get otherApplicationFrequency
     *
     * @return otherApplicationFrequency
     **/
    @Schema(description = "")
    public OBOtherCodeType11 getOtherApplicationFrequency() {
        return otherApplicationFrequency;
    }

    public void setOtherApplicationFrequency(OBOtherCodeType11 otherApplicationFrequency) {
        this.otherApplicationFrequency = otherApplicationFrequency;
    }

    public OBReadProduct2DataOtherProductTypeCreditInterestTierBand otherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
        this.otherCalculationFrequency = otherCalculationFrequency;
        return this;
    }

    /**
     * Get otherCalculationFrequency
     *
     * @return otherCalculationFrequency
     **/
    @Schema(description = "")
    public OBOtherCodeType12 getOtherCalculationFrequency() {
        return otherCalculationFrequency;
    }

    public void setOtherCalculationFrequency(OBOtherCodeType12 otherCalculationFrequency) {
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
        OBReadProduct2DataOtherProductTypeCreditInterestTierBand obReadProduct2DataOtherProductTypeCreditInterestTierBand = (OBReadProduct2DataOtherProductTypeCreditInterestTierBand) o;
        return Objects.equals(this.identification, obReadProduct2DataOtherProductTypeCreditInterestTierBand.identification) &&
                Objects.equals(this.tierValueMinimum, obReadProduct2DataOtherProductTypeCreditInterestTierBand.tierValueMinimum) &&
                Objects.equals(this.tierValueMaximum, obReadProduct2DataOtherProductTypeCreditInterestTierBand.tierValueMaximum) &&
                Objects.equals(this.calculationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.calculationFrequency) &&
                Objects.equals(this.applicationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.applicationFrequency) &&
                Objects.equals(this.depositInterestAppliedCoverage, obReadProduct2DataOtherProductTypeCreditInterestTierBand.depositInterestAppliedCoverage) &&
                Objects.equals(this.fixedVariableInterestRateType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.fixedVariableInterestRateType) &&
                Objects.equals(this.AER, obReadProduct2DataOtherProductTypeCreditInterestTierBand.AER) &&
                Objects.equals(this.bankInterestRateType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.bankInterestRateType) &&
                Objects.equals(this.bankInterestRate, obReadProduct2DataOtherProductTypeCreditInterestTierBand.bankInterestRate) &&
                Objects.equals(this.notes, obReadProduct2DataOtherProductTypeCreditInterestTierBand.notes) &&
                Objects.equals(this.otherBankInterestType, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherBankInterestType) &&
                Objects.equals(this.otherApplicationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherApplicationFrequency) &&
                Objects.equals(this.otherCalculationFrequency, obReadProduct2DataOtherProductTypeCreditInterestTierBand.otherCalculationFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identification, tierValueMinimum, tierValueMaximum, calculationFrequency, applicationFrequency, depositInterestAppliedCoverage, fixedVariableInterestRateType, AER, bankInterestRateType, bankInterestRate, notes, otherBankInterestType, otherApplicationFrequency, otherCalculationFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeCreditInterestTierBand {\n");

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
        FQAT("FQAT"),
        FQDY("FQDY"),
        FQHY("FQHY"),
        FQMY("FQMY"),
        FQOT("FQOT"),
        FQQY("FQQY"),
        FQSD("FQSD"),
        FQWY("FQWY"),
        FQYY("FQYY");

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
     * How often is interest applied to the Product for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#x27;s account.
     */
    @JsonAdapter(ApplicationFrequencyEnum.Adapter.class)
    public enum ApplicationFrequencyEnum {
        FQAT("FQAT"),
        FQDY("FQDY"),
        FQHY("FQHY"),
        FQMY("FQMY"),
        FQOT("FQOT"),
        FQQY("FQQY"),
        FQSD("FQSD"),
        FQWY("FQWY"),
        FQYY("FQYY");

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
        INBA("INBA"),
        INTI("INTI"),
        INWH("INWH");

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
     * Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the account holder&#x27;s account.
     */
    @JsonAdapter(BankInterestRateTypeEnum.Adapter.class)
    public enum BankInterestRateTypeEnum {
        INBB("INBB"),
        INFR("INFR"),
        INGR("INGR"),
        INLR("INLR"),
        INNE("INNE"),
        INOT("INOT");

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
