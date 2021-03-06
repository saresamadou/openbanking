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
 * Indicates whether the balance is a credit or a debit balance.  Usage: A zero balance is considered to be a credit balance.
 */
@JsonAdapter(OBCreditDebitCode2.Adapter.class)
public enum OBCreditDebitCode2 {
    CREDIT("Credit"),
    DEBIT("Debit");

    private String value;

    OBCreditDebitCode2(String value) {
        this.value = value;
    }

    public static OBCreditDebitCode2 fromValue(String text) {
        for (OBCreditDebitCode2 b : OBCreditDebitCode2.values()) {
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

    public static class Adapter extends TypeAdapter<OBCreditDebitCode2> {
        @Override
        public void write(final JsonWriter jsonWriter, final OBCreditDebitCode2 enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public OBCreditDebitCode2 read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return OBCreditDebitCode2.fromValue(String.valueOf(value));
        }
    }
}
