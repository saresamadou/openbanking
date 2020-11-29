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
 * Indicates whether the amount is a credit or a debit.  Usage: A zero amount is considered to be a credit amount.
 */
@JsonAdapter(OBCreditDebitCode0.Adapter.class)
public enum OBCreditDebitCode0 {
    CREDIT("Credit"),
    DEBIT("Debit");

    private String value;

    OBCreditDebitCode0(String value) {
        this.value = value;
    }

    public static OBCreditDebitCode0 fromValue(String text) {
        for (OBCreditDebitCode0 b : OBCreditDebitCode0.values()) {
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

    public static class Adapter extends TypeAdapter<OBCreditDebitCode0> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBCreditDebitCode0 enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBCreditDebitCode0 read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBCreditDebitCode0.fromValue(String.valueOf(value));
        }
    }
}
