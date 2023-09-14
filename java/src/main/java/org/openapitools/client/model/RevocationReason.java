/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.3.1
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Revocation reason
 */
@JsonAdapter(RevocationReason.Adapter.class)
public enum RevocationReason {
  
  UNUSED("UNUSED"),
  
  KEY_COMPROMISE("KEY_COMPROMISE"),
  
  C_A_COMPROMISE("C_A_COMPROMISE"),
  
  AFFILIATION_CHANGED("AFFILIATION_CHANGED"),
  
  SUPERSEDED("SUPERSEDED"),
  
  CESSATION_OF_OPERATION("CESSATION_OF_OPERATION"),
  
  CERTIFICATE_HOLD("CERTIFICATE_HOLD"),
  
  REMOVE_FROM_CRL("REMOVE_FROM_CRL"),
  
  PRIVILEGE_WITHDRAWN("PRIVILEGE_WITHDRAWN"),
  
  A_A_COMPROMISE("A_A_COMPROMISE");

  private String value;

  RevocationReason(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RevocationReason fromValue(String value) {
    for (RevocationReason b : RevocationReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<RevocationReason> {
    @Override
    public void write(final JsonWriter jsonWriter, final RevocationReason enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RevocationReason read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RevocationReason.fromValue(value);
    }
  }
}

