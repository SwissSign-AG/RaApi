/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.3.6
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
import org.openapitools.client.model.RequestDNS;
import org.openapitools.client.model.RequestRFC822;
import org.openapitools.client.model.RequestUPN;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * RequestExtensions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestExtensions {
  public static final String SERIALIZED_NAME_MICROSOFT_SECURITY_IDENTIFIER = "microsoftSecurityIdentifier";
  @SerializedName(SERIALIZED_NAME_MICROSOFT_SECURITY_IDENTIFIER)
  private String microsoftSecurityIdentifier;

  public static final String SERIALIZED_NAME_MICROSOFT_POLICY_TEMPLATE_O_I_D = "microsoftPolicyTemplateOID";
  @SerializedName(SERIALIZED_NAME_MICROSOFT_POLICY_TEMPLATE_O_I_D)
  private String microsoftPolicyTemplateOID;

  public static final String SERIALIZED_NAME_REQUEST_D_N_S = "requestDNS";
  @SerializedName(SERIALIZED_NAME_REQUEST_D_N_S)
  private RequestDNS requestDNS;

  public static final String SERIALIZED_NAME_REQUEST_R_F_C822 = "requestRFC822";
  @SerializedName(SERIALIZED_NAME_REQUEST_R_F_C822)
  private RequestRFC822 requestRFC822;

  public static final String SERIALIZED_NAME_REQUEST_U_P_N = "requestUPN";
  @SerializedName(SERIALIZED_NAME_REQUEST_U_P_N)
  private RequestUPN requestUPN;

  public RequestExtensions() { 
  }

  public RequestExtensions microsoftSecurityIdentifier(String microsoftSecurityIdentifier) {
    
    this.microsoftSecurityIdentifier = microsoftSecurityIdentifier;
    return this;
  }

   /**
   * Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy 
   * @return microsoftSecurityIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S-1-5-32", value = "Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy ")

  public String getMicrosoftSecurityIdentifier() {
    return microsoftSecurityIdentifier;
  }


  public void setMicrosoftSecurityIdentifier(String microsoftSecurityIdentifier) {
    this.microsoftSecurityIdentifier = microsoftSecurityIdentifier;
  }


  public RequestExtensions microsoftPolicyTemplateOID(String microsoftPolicyTemplateOID) {
    
    this.microsoftPolicyTemplateOID = microsoftPolicyTemplateOID;
    return this;
  }

   /**
   * Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy 
   * @return microsoftPolicyTemplateOID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.16.756.3.2.1.0", value = "Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy ")

  public String getMicrosoftPolicyTemplateOID() {
    return microsoftPolicyTemplateOID;
  }


  public void setMicrosoftPolicyTemplateOID(String microsoftPolicyTemplateOID) {
    this.microsoftPolicyTemplateOID = microsoftPolicyTemplateOID;
  }


  public RequestExtensions requestDNS(RequestDNS requestDNS) {
    
    this.requestDNS = requestDNS;
    return this;
  }

   /**
   * Get requestDNS
   * @return requestDNS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestDNS getRequestDNS() {
    return requestDNS;
  }


  public void setRequestDNS(RequestDNS requestDNS) {
    this.requestDNS = requestDNS;
  }


  public RequestExtensions requestRFC822(RequestRFC822 requestRFC822) {
    
    this.requestRFC822 = requestRFC822;
    return this;
  }

   /**
   * Get requestRFC822
   * @return requestRFC822
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestRFC822 getRequestRFC822() {
    return requestRFC822;
  }


  public void setRequestRFC822(RequestRFC822 requestRFC822) {
    this.requestRFC822 = requestRFC822;
  }


  public RequestExtensions requestUPN(RequestUPN requestUPN) {
    
    this.requestUPN = requestUPN;
    return this;
  }

   /**
   * Get requestUPN
   * @return requestUPN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestUPN getRequestUPN() {
    return requestUPN;
  }


  public void setRequestUPN(RequestUPN requestUPN) {
    this.requestUPN = requestUPN;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestExtensions requestExtensions = (RequestExtensions) o;
    return Objects.equals(this.microsoftSecurityIdentifier, requestExtensions.microsoftSecurityIdentifier) &&
        Objects.equals(this.microsoftPolicyTemplateOID, requestExtensions.microsoftPolicyTemplateOID) &&
        Objects.equals(this.requestDNS, requestExtensions.requestDNS) &&
        Objects.equals(this.requestRFC822, requestExtensions.requestRFC822) &&
        Objects.equals(this.requestUPN, requestExtensions.requestUPN);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(microsoftSecurityIdentifier, microsoftPolicyTemplateOID, requestDNS, requestRFC822, requestUPN);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestExtensions {\n");
    sb.append("    microsoftSecurityIdentifier: ").append(toIndentedString(microsoftSecurityIdentifier)).append("\n");
    sb.append("    microsoftPolicyTemplateOID: ").append(toIndentedString(microsoftPolicyTemplateOID)).append("\n");
    sb.append("    requestDNS: ").append(toIndentedString(requestDNS)).append("\n");
    sb.append("    requestRFC822: ").append(toIndentedString(requestRFC822)).append("\n");
    sb.append("    requestUPN: ").append(toIndentedString(requestUPN)).append("\n");
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
    openapiFields.add("microsoftSecurityIdentifier");
    openapiFields.add("microsoftPolicyTemplateOID");
    openapiFields.add("requestDNS");
    openapiFields.add("requestRFC822");
    openapiFields.add("requestUPN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestExtensions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RequestExtensions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestExtensions is not found in the empty JSON string", RequestExtensions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestExtensions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestExtensions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("microsoftSecurityIdentifier") != null && !jsonObj.get("microsoftSecurityIdentifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `microsoftSecurityIdentifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("microsoftSecurityIdentifier").toString()));
      }
      if (jsonObj.get("microsoftPolicyTemplateOID") != null && !jsonObj.get("microsoftPolicyTemplateOID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `microsoftPolicyTemplateOID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("microsoftPolicyTemplateOID").toString()));
      }
      // validate the optional field `requestDNS`
      if (jsonObj.getAsJsonObject("requestDNS") != null) {
        RequestDNS.validateJsonObject(jsonObj.getAsJsonObject("requestDNS"));
      }
      // validate the optional field `requestRFC822`
      if (jsonObj.getAsJsonObject("requestRFC822") != null) {
        RequestRFC822.validateJsonObject(jsonObj.getAsJsonObject("requestRFC822"));
      }
      // validate the optional field `requestUPN`
      if (jsonObj.getAsJsonObject("requestUPN") != null) {
        RequestUPN.validateJsonObject(jsonObj.getAsJsonObject("requestUPN"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestExtensions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestExtensions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestExtensions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestExtensions.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestExtensions>() {
           @Override
           public void write(JsonWriter out, RequestExtensions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestExtensions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestExtensions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestExtensions
  * @throws IOException if the JSON string is invalid with respect to RequestExtensions
  */
  public static RequestExtensions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestExtensions.class);
  }

 /**
  * Convert an instance of RequestExtensions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

