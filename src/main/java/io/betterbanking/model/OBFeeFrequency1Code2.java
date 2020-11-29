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
 * How frequently the fee/charge is applied to the account
 */
@JsonAdapter(OBFeeFrequency1Code2.Adapter.class)
public enum OBFeeFrequency1Code2 {
    FEAC("FEAC"),
    FEAO("FEAO"),
    FECP("FECP"),
    FEDA("FEDA"),
    FEHO("FEHO"),
    FEI("FEI"),
    FEMO("FEMO"),
    FEOA("FEOA"),
    FEOT("FEOT"),
    FEPC("FEPC"),
    FEPH("FEPH"),
    FEPO("FEPO"),
    FEPS("FEPS"),
    FEPT("FEPT"),
    FEPTA("FEPTA"),
    FEPTP("FEPTP"),
    FEQU("FEQU"),
    FESM("FESM"),
    FEST("FEST"),
    FEWE("FEWE"),
    FEYE("FEYE");

    private String value;

    OBFeeFrequency1Code2(String value) {
        this.value = value;
    }

    public static OBFeeFrequency1Code2 fromValue(String text) {
        for (OBFeeFrequency1Code2 b : OBFeeFrequency1Code2.values()) {
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

    public static class Adapter extends TypeAdapter<OBFeeFrequency1Code2> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBFeeFrequency1Code2 enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBFeeFrequency1Code2 read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBFeeFrequency1Code2.fromValue(String.valueOf(value));
        }
    }
}
