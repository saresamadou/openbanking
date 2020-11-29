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
 * Other amount type which is not in the standard code list
 */
@Schema(description = "Other amount type which is not in the standard code list")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType {
    @SerializedName("Code")
    private String code = null;

    @SerializedName("Name")
    private String name = null;

    @SerializedName("Description")
    private String description = null;

    public OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType code(String code) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType name(String name) {
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

    public OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType description(String description) {
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
        OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType obReadProduct2DataOtherProductTypeRepaymentOtherAmountType = (OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType) o;
        return Objects.equals(this.code, obReadProduct2DataOtherProductTypeRepaymentOtherAmountType.code) &&
                Objects.equals(this.name, obReadProduct2DataOtherProductTypeRepaymentOtherAmountType.name) &&
                Objects.equals(this.description, obReadProduct2DataOtherProductTypeRepaymentOtherAmountType.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeRepaymentOtherAmountType {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
