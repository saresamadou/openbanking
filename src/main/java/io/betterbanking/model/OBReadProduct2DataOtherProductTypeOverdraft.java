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
 * Borrowing details
 */
@Schema(description = "Borrowing details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-11-29T19:03:17.493Z[GMT]")
public class OBReadProduct2DataOtherProductTypeOverdraft {
    @SerializedName("Notes")
    private List<String> notes = null;

    @SerializedName("OverdraftTierBandSet")
    private List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet = new ArrayList<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet>();

    public OBReadProduct2DataOtherProductTypeOverdraft notes(List<String> notes) {
        this.notes = notes;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraft addNotesItem(String notesItem) {
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

    public OBReadProduct2DataOtherProductTypeOverdraft overdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
        return this;
    }

    public OBReadProduct2DataOtherProductTypeOverdraft addOverdraftTierBandSetItem(OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet overdraftTierBandSetItem) {
        this.overdraftTierBandSet.add(overdraftTierBandSetItem);
        return this;
    }

    /**
     * Get overdraftTierBandSet
     *
     * @return overdraftTierBandSet
     **/
    @Schema(required = true, description = "")
    public List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> getOverdraftTierBandSet() {
        return overdraftTierBandSet;
    }

    public void setOverdraftTierBandSet(List<OBReadProduct2DataOtherProductTypeOverdraftOverdraftTierBandSet> overdraftTierBandSet) {
        this.overdraftTierBandSet = overdraftTierBandSet;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBReadProduct2DataOtherProductTypeOverdraft obReadProduct2DataOtherProductTypeOverdraft = (OBReadProduct2DataOtherProductTypeOverdraft) o;
        return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeOverdraft.notes) &&
                Objects.equals(this.overdraftTierBandSet, obReadProduct2DataOtherProductTypeOverdraft.overdraftTierBandSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes, overdraftTierBandSet);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBReadProduct2DataOtherProductTypeOverdraft {\n");

        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    overdraftTierBandSet: ").append(toIndentedString(overdraftTierBandSet)).append("\n");
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