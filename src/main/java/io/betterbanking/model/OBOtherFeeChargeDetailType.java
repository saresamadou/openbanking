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

import java.util.Objects;

/**
 * Other Fee/charge type which is not available in the standard code set
 */
@Schema(description = "Other Fee/charge type which is not available in the standard code set")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBOtherFeeChargeDetailType {
    @SerializedName("Code")
    private String code = null;

    @SerializedName("FeeCategory")
    private OBFeeCategory1Code feeCategory = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("Description")
    private String description = null;

    public OBOtherFeeChargeDetailType code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     **/
    @Schema(description = "")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBOtherFeeChargeDetailType feeCategory(OBFeeCategory1Code feeCategory) {
        this.feeCategory = feeCategory;
        return this;
    }

    /**
     * Get feeCategory
     *
     * @return feeCategory
     **/
    @Schema(required = true, description = "")
    public OBFeeCategory1Code getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(OBFeeCategory1Code feeCategory) {
        this.feeCategory = feeCategory;
    }

    public OBOtherFeeChargeDetailType name(String name) {
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

    public OBOtherFeeChargeDetailType description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(required = true, description = "")
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
        OBOtherFeeChargeDetailType obOtherFeeChargeDetailType = (OBOtherFeeChargeDetailType) o;
        return Objects.equals(this.code, obOtherFeeChargeDetailType.code) &&
                Objects.equals(this.feeCategory, obOtherFeeChargeDetailType.feeCategory) &&
                Objects.equals(this.name, obOtherFeeChargeDetailType.name) &&
                Objects.equals(this.description, obOtherFeeChargeDetailType.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, feeCategory, name, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBOtherFeeChargeDetailType {\n");

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

}
