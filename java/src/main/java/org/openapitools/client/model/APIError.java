/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.5.17
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
 * APIError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIError {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private UUID uuid;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGES = "errorMessages";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGES)
  private List<String> errorMessages = new ArrayList<>();

  public APIError() { 
  }

  
  public APIError(
     UUID uuid, 
     String errorCode
  ) {
    this();
    this.uuid = uuid;
    this.errorCode = errorCode;
  }

   /**
   * end user error UUID reference
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", required = true, value = "end user error UUID reference")

  public UUID getUuid() {
    return uuid;
  }




   /**
   * Error code
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "<000.000.0000>", required = true, value = "Error code")

  public String getErrorCode() {
    return errorCode;
  }




  public APIError errorMessages(List<String> errorMessages) {
    
    this.errorMessages = errorMessages;
    return this;
  }

  public APIError addErrorMessagesItem(String errorMessagesItem) {
    this.errorMessages.add(errorMessagesItem);
    return this;
  }

   /**
   * Get errorMessages
   * @return errorMessages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getErrorMessages() {
    return errorMessages;
  }


  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIError apIError = (APIError) o;
    return Objects.equals(this.uuid, apIError.uuid) &&
        Objects.equals(this.errorCode, apIError.errorCode) &&
        Objects.equals(this.errorMessages, apIError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, errorCode, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIError {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("errorCode");
    openapiFields.add("errorMessages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("errorCode");
    openapiRequiredFields.add("errorMessages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIError
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (APIError.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIError is not found in the empty JSON string", APIError.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIError.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIError` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : APIError.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("errorMessages") != null && !jsonObj.get("errorMessages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessages` to be an array in the JSON string but got `%s`", jsonObj.get("errorMessages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIError.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIError' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIError> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIError.class));

       return (TypeAdapter<T>) new TypeAdapter<APIError>() {
           @Override
           public void write(JsonWriter out, APIError value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIError read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIError given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIError
  * @throws IOException if the JSON string is invalid with respect to APIError
  */
  public static APIError fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIError.class);
  }

 /**
  * Convert an instance of APIError to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

