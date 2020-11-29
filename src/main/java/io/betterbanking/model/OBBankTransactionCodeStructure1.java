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
 * Set of elements used to fully identify the type of underlying transaction resulting in an entry.
 */
@Schema(description = "Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBBankTransactionCodeStructure1 {
    @SerializedName("Code")
    private String code = null;

    @SerializedName("SubCode")
    private String subCode = null;

    public OBBankTransactionCodeStructure1 code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Specifies the family within a domain.
     *
     * @return code
     **/
    @Schema(required = true, description = "Specifies the family within a domain.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public OBBankTransactionCodeStructure1 subCode(String subCode) {
        this.subCode = subCode;
        return this;
    }

    /**
     * Specifies the sub-product family within a specific family.
     *
     * @return subCode
     **/
    @Schema(required = true, description = "Specifies the sub-product family within a specific family.")
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBankTransactionCodeStructure1 obBankTransactionCodeStructure1 = (OBBankTransactionCodeStructure1) o;
        return Objects.equals(this.code, obBankTransactionCodeStructure1.code) &&
                Objects.equals(this.subCode, obBankTransactionCodeStructure1.subCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, subCode);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBankTransactionCodeStructure1 {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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
