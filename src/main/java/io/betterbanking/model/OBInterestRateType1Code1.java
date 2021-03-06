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
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Rate type for Fee/Charge (where it is charged in terms of a rate rather than an amount)
 */
@JsonAdapter(OBInterestRateType1Code1.Adapter.class)
public enum OBInterestRateType1Code1 {
    INBB("INBB"),
    INFR("INFR"),
    INGR("INGR"),
    INLR("INLR"),
    INNE("INNE"),
    INOT("INOT");

    private String value;

    OBInterestRateType1Code1(String value) {
        this.value = value;
    }

    public static OBInterestRateType1Code1 fromValue(String text) {
        for (OBInterestRateType1Code1 b : OBInterestRateType1Code1.values()) {
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

    public static class Adapter extends TypeAdapter<OBInterestRateType1Code1> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBInterestRateType1Code1 enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBInterestRateType1Code1 read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBInterestRateType1Code1.fromValue(String.valueOf(value));
        }
    }
}
