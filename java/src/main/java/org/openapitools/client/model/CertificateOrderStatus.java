/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.3.5
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
 * Status of the certificate Order
 */
@JsonAdapter(CertificateOrderStatus.Adapter.class)
public enum CertificateOrderStatus {
  
  NEW("NEW"),
  
  KEY_VALIDATION("KEY_VALIDATION"),
  
  PRE_VALIDATION("PRE_VALIDATION"),
  
  GENERATE_TBS("GENERATE_TBS"),
  
  PENDING_AUTH("PENDING_AUTH"),
  
  PRE_ISSUE("PRE_ISSUE"),
  
  ISSUE("ISSUE"),
  
  POST_VALIDATION("POST_VALIDATION"),
  
  FINALIZE_ISSUANCE("FINALIZE_ISSUANCE"),
  
  ISSUED("ISSUED"),
  
  REVOKED("REVOKED"),
  
  FAILED("FAILED"),
  
  REJECTED("REJECTED"),
  
  PENDING_CSR_RENEWAL("PENDING_CSR_RENEWAL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CertificateOrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CertificateOrderStatus fromValue(String value) {
    for (CertificateOrderStatus b : CertificateOrderStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CertificateOrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CertificateOrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CertificateOrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CertificateOrderStatus.fromValue(value);
    }
  }
}

