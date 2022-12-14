/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.224
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
  
  NEW("new"),
  
  KEY_VALIDATION("key_validation"),
  
  PRE_VALIDATION("pre_validation"),
  
  GENERATE_TBS("generate_tbs"),
  
  PENDING_AUTH("pending_auth"),
  
  PRE_ISSUE("pre_issue"),
  
  ISSUE("issue"),
  
  POST_VALIDATION("post_validation"),
  
  FINALIZE_ISSUANCE("finalize_issuance"),
  
  ISSUED("issued"),
  
  REVOKED("revoked"),
  
  FAILED("failed"),
  
  REJECTED("rejected"),
  
  PENDING_CSR_RENEWAL("pending_csr_renewal"),
  
  UNKNOWN("unknown");

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

