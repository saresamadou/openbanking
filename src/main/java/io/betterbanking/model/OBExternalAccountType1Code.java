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
 * Specifies the type of account (personal or business).
 */
@JsonAdapter(OBExternalAccountType1Code.Adapter.class)
public enum OBExternalAccountType1Code {
    BUSINESS("Business"),
    PERSONAL("Personal");

    private String value;

    OBExternalAccountType1Code(String value) {
        this.value = value;
    }

    public static OBExternalAccountType1Code fromValue(String text) {
        for (OBExternalAccountType1Code b : OBExternalAccountType1Code.values()) {
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

    public static class Adapter extends TypeAdapter<OBExternalAccountType1Code> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBExternalAccountType1Code enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBExternalAccountType1Code read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBExternalAccountType1Code.fromValue(String.valueOf(value));
        }
    }
}
