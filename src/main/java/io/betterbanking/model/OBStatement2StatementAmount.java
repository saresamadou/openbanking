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
 * Set of elements used to provide details of a generic amount for the statement resource.
 */
@Schema(description = "Set of elements used to provide details of a generic amount for the statement resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBStatement2StatementAmount {
    @SerializedName("CreditDebitIndicator")
    private OBCreditDebitCode0 creditDebitIndicator = null;

    @SerializedName("Type")
    private String type = null;

    @SerializedName("Amount")
    private OBActiveOrHistoricCurrencyAndAmount8 amount = null;

    public OBStatement2StatementAmount creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
        return this;
    }

    /**
     * Get creditDebitIndicator
     *
     * @return creditDebitIndicator
     **/
    @Schema(required = true, description = "")
    public OBCreditDebitCode0 getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    public OBStatement2StatementAmount type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(required = true, description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OBStatement2StatementAmount amount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @Schema(required = true, description = "")
    public OBActiveOrHistoricCurrencyAndAmount8 getAmount() {
        return amount;
    }

    public void setAmount(OBActiveOrHistoricCurrencyAndAmount8 amount) {
        this.amount = amount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStatement2StatementAmount obStatement2StatementAmount = (OBStatement2StatementAmount) o;
        return Objects.equals(this.creditDebitIndicator, obStatement2StatementAmount.creditDebitIndicator) &&
                Objects.equals(this.type, obStatement2StatementAmount.type) &&
                Objects.equals(this.amount, obStatement2StatementAmount.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditDebitIndicator, type, amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStatement2StatementAmount {\n");

        sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
