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
 * Range or amounts or rates for which the fee/charge applies
 */
@Schema(description = "Range or amounts or rates for which the fee/charge applies")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadProduct2DataOtherProductTypeFeeApplicableRange {
    @SerializedName("MinimumAmount")
    private String minimumAmount = null;

    @SerializedName("MaximumAmount")
    private String maximumAmount = null;

    @SerializedName("MinimumRate")
    private String minimumRate = null;

    @SerializedName("MaximumRate")
    private String maximumRate = null;

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }

    /**
     * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
     *
     * @return minimumAmount
     **/
    @Schema(description = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
    public String getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
        return this;
    }

    /**
     * Maximum Amount on which fee is applicable (where it is expressed as an amount)
     *
     * @return maximumAmount
     **/
    @Schema(description = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
    public String getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
        return this;
    }

    /**
     * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
     *
     * @return minimumRate
     **/
    @Schema(description = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
    public String getMinimumRate() {
        return minimumRate;
    }

    public void setMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
    }

    public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
        return this;
    }

    /**
     * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
     *
     * @return maximumRate
     **/
    @Schema(description = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
    public String getMaximumRate() {
        return maximumRate;
    }

    public void setMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeFeeApplicableRange obReadProduct2DataOtherProductTypeFeeApplicableRange = (OBReadProduct2DataOtherProductTypeFeeApplicableRange) o;
        return Objects.equals(this.minimumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumAmount) &&
                Objects.equals(this.maximumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumAmount) &&
                Objects.equals(this.minimumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumRate) &&
                Objects.equals(this.maximumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeFeeApplicableRange {\n");

        sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
        sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
        sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
        sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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
