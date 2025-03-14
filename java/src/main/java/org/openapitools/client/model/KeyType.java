/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 3.4.4
 * Contact: ssc@swisssign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Key generation type
 */
@JsonAdapter(KeyType.Adapter.class)
public enum KeyType {
  
  RSA_2048("RSA_2048"),
  
  RSA_3072("RSA_3072"),
  
  RSA_4096("RSA_4096"),
  
  RSA_8192("RSA_8192"),
  
  EC_SECP224K1("EC_secp224k1"),
  
  EC_SECP224R1("EC_secp224r1"),
  
  EC_SECP256K1("EC_secp256k1"),
  
  EC_SECP256R1("EC_secp256r1"),
  
  EC_SECP384R1("EC_secp384r1"),
  
  EC_SECP521R1("EC_secp521r1"),
  
  EC_X962_P239V1("EC_x962_p239v1"),
  
  EC_X962_P239V2("EC_x962_p239v2"),
  
  EC_X962_P239V3("EC_x962_p239v3"),
  
  EC_BRAINPOOL224R1("EC_brainpool224r1"),
  
  EC_BRAINPOOL256R1("EC_brainpool256r1"),
  
  EC_BRAINPOOL320R1("EC_brainpool320r1"),
  
  EC_BRAINPOOL384R1("EC_brainpool384r1"),
  
  EC_BRAINPOOL512R1("EC_brainpool512r1"),
  
  EC_FRP256V1("EC_frp256v1");

  private String value;

  KeyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeyType fromValue(String value) {
    for (KeyType b : KeyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeyType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    KeyType.fromValue(value);
  }
}

