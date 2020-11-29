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
import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@Schema(description = "Other Fee/charge type which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OtherFeeType1 {
    @SerializedName("Code")
    private String code = null;
    @SerializedName("FeeCategory")
    private FeeCategoryEnum feeCategory = null;
    @SerializedName("Name")
    private String name = null;
    @SerializedName("Description")
    private String description = null;

    public OtherFeeType1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The four letter Mnemonic used within an XML file to identify a code
     *
     * @return code
     **/
    @Schema(description = "The four letter Mnemonic used within an XML file to identify a code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OtherFeeType1 feeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Categorisation of fees and charges into standard categories.
     *
     * @return feeCategory
     **/
    @Schema(required = true, description = "Categorisation of fees and charges into standard categories.")
    public FeeCategoryEnum getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(FeeCategoryEnum feeCategory) {
        this.feeCategory = feeCategory;
    }

    public OtherFeeType1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Long name associated with the code
     *
     * @return name
     **/
    @Schema(required = true, description = "Long name associated with the code")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OtherFeeType1 description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description to describe the purpose of the code
     *
     * @return description
     **/
    @Schema(required = true, description = "Description to describe the purpose of the code")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OtherFeeType1 otherFeeType1 = (OtherFeeType1) o;
        return Objects.equals(this.code, otherFeeType1.code) &&
                Objects.equals(this.feeCategory, otherFeeType1.feeCategory) &&
                Objects.equals(this.name, otherFeeType1.name) &&
                Objects.equals(this.description, otherFeeType1.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, feeCategory, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OtherFeeType1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
     * Categorisation of fees and charges into standard categories.
     */
    @JsonAdapter(FeeCategoryEnum.Adapter.class)
    public enum FeeCategoryEnum {
        OTHER("Other"),
        SERVICING("Servicing");

        private String value;

        FeeCategoryEnum(String value) {
            this.value = value;
        }

        public static FeeCategoryEnum fromValue(String text) {
            for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
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

        public static class Adapter extends TypeAdapter<FeeCategoryEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final FeeCategoryEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public FeeCategoryEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return FeeCategoryEnum.fromValue(String.valueOf(value));
            }
        }
    }

}
