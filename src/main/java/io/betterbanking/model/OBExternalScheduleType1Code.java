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
 * Specifies the scheduled payment date type requested
 */
@JsonAdapter(OBExternalScheduleType1Code.Adapter.class)
public enum OBExternalScheduleType1Code {
    ARRIVAL("Arrival"),
    EXECUTION("Execution");

    private String value;

    OBExternalScheduleType1Code(String value) {
        this.value = value;
    }

    public static OBExternalScheduleType1Code fromValue(String text) {
        for (OBExternalScheduleType1Code b : OBExternalScheduleType1Code.values()) {
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

    public static class Adapter extends TypeAdapter<OBExternalScheduleType1Code> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBExternalScheduleType1Code enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBExternalScheduleType1Code read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBExternalScheduleType1Code.fromValue(String.valueOf(value));
        }
    }
}
