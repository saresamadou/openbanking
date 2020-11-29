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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBReadBeneficiary5Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadBeneficiary5Data {
    @SerializedName("Beneficiary")
    private List<OBBeneficiary5> beneficiary = null;

    public OBReadBeneficiary5Data beneficiary(List<OBBeneficiary5> beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    public OBReadBeneficiary5Data addBeneficiaryItem(OBBeneficiary5 beneficiaryItem) {
        if (this.beneficiary == null) {
            this.beneficiary = new ArrayList<OBBeneficiary5>();
        }
        this.beneficiary.add(beneficiaryItem);
        return this;
    }

    /**
     * Get beneficiary
     *
     * @return beneficiary
     **/
    @Schema(description = "")
    public List<OBBeneficiary5> getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(List<OBBeneficiary5> beneficiary) {
        this.beneficiary = beneficiary;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadBeneficiary5Data obReadBeneficiary5Data = (OBReadBeneficiary5Data) o;
        return Objects.equals(this.beneficiary, obReadBeneficiary5Data.beneficiary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beneficiary);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadBeneficiary5Data {\n");

        sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
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
