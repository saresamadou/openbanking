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
 * Status of a transaction entry on the books of the account servicer.
 */
@JsonAdapter(OBEntryStatus1Code.Adapter.class)
public enum OBEntryStatus1Code {
    BOOKED("Booked"),
    PENDING("Pending");

    private String value;

    OBEntryStatus1Code(String value) {
        this.value = value;
    }

    public static OBEntryStatus1Code fromValue(String text) {
        for (OBEntryStatus1Code b : OBEntryStatus1Code.values()) {
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

    public static class Adapter extends TypeAdapter<OBEntryStatus1Code> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBEntryStatus1Code enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBEntryStatus1Code read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBEntryStatus1Code.fromValue(String.valueOf(value));
        }
    }
}
