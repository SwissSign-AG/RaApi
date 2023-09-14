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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RevocationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RevocationRequest {
  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  /**
   * Revocation reason
   */
  @JsonAdapter(RevocationReasonEnum.Adapter.class)
  public enum RevocationReasonEnum {
    UNUSED("UNUSED"),
    
    KEY_COMPROMISE("KEY_COMPROMISE"),
    
    AFFILIATION_CHANGED("AFFILIATION_CHANGED"),
    
    SUPERSEDED("SUPERSEDED"),
    
    CESSATION_OF_OPERATION("CESSATION_OF_OPERATION");

    private String value;

    RevocationReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RevocationReasonEnum fromValue(String value) {
      for (RevocationReasonEnum b : RevocationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RevocationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RevocationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RevocationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RevocationReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REVOCATION_REASON = "revocationReason";
  @SerializedName(SERIALIZED_NAME_REVOCATION_REASON)
  private RevocationReasonEnum revocationReason;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public RevocationRequest() { 
  }

  public RevocationRequest serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Certificate serial number (Big Integer HEX encoded)
   * @return serialNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3893409CB666E1F092B7B6F28E1EAF4582AA7F21", required = true, value = "Certificate serial number (Big Integer HEX encoded)")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public RevocationRequest revocationReason(RevocationReasonEnum revocationReason) {
    
    this.revocationReason = revocationReason;
    return this;
  }

   /**
   * Revocation reason
   * @return revocationReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CESSATION_OF_OPERATION", required = true, value = "Revocation reason")

  public RevocationReasonEnum getRevocationReason() {
    return revocationReason;
  }


  public void setRevocationReason(RevocationReasonEnum revocationReason) {
    this.revocationReason = revocationReason;
  }


  public RevocationRequest issuerName(String issuerName) {
    
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Certificate issuer distinguished name
   * @return issuerName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DC=COM,DC=Some Domain,OU=Some Organizational Unit,CN=Some SubCA", required = true, value = "Certificate issuer distinguished name")

  public String getIssuerName() {
    return issuerName;
  }


  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevocationRequest revocationRequest = (RevocationRequest) o;
    return Objects.equals(this.serialNumber, revocationRequest.serialNumber) &&
        Objects.equals(this.revocationReason, revocationRequest.revocationReason) &&
        Objects.equals(this.issuerName, revocationRequest.issuerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, revocationReason, issuerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevocationRequest {\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    revocationReason: ").append(toIndentedString(revocationReason)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("serialNumber");
    openapiFields.add("revocationReason");
    openapiFields.add("issuerName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("serialNumber");
    openapiRequiredFields.add("revocationReason");
    openapiRequiredFields.add("issuerName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevocationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RevocationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevocationRequest is not found in the empty JSON string", RevocationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevocationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevocationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RevocationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      if (jsonObj.get("revocationReason") != null && !jsonObj.get("revocationReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revocationReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revocationReason").toString()));
      }
      if (jsonObj.get("issuerName") != null && !jsonObj.get("issuerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevocationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevocationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevocationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevocationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RevocationRequest>() {
           @Override
           public void write(JsonWriter out, RevocationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevocationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevocationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevocationRequest
  * @throws IOException if the JSON string is invalid with respect to RevocationRequest
  */
  public static RevocationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevocationRequest.class);
  }

 /**
  * Convert an instance of RevocationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

