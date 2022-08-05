/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: opensource@swisssign.com
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
 * Type of DNS owner check method
 */
@JsonAdapter(DNSOwnerCheck.Adapter.class)
public enum DNSOwnerCheck {
  
  CABDNS("CABDNS"),
  
  CABHTTP("CABHTTP"),
  
  CONSTRUCTEDEMAIL("CONSTRUCTEDEMAIL"),
  
  EMAILCONFIRMATION("EMAILCONFIRMATION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  DNSOwnerCheck(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DNSOwnerCheck fromValue(String value) {
    for (DNSOwnerCheck b : DNSOwnerCheck.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DNSOwnerCheck> {
    @Override
    public void write(final JsonWriter jsonWriter, final DNSOwnerCheck enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DNSOwnerCheck read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DNSOwnerCheck.fromValue(value);
    }
  }
}

