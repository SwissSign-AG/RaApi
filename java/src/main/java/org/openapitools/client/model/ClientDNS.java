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
import java.time.OffsetDateTime;
import org.openapitools.client.model.ClientDomainValidationStatus;
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
 * ClientDNS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClientDNS {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private String domain;

  public static final String SERIALIZED_NAME_DOMAIN_UNICODE = "domainUnicode";
  @SerializedName(SERIALIZED_NAME_DOMAIN_UNICODE)
  private String domainUnicode;

  public static final String SERIALIZED_NAME_VALIDATED = "validated";
  @SerializedName(SERIALIZED_NAME_VALIDATED)
  private Boolean validated;

  public static final String SERIALIZED_NAME_TRUSTED_DOMAIN = "trustedDomain";
  @SerializedName(SERIALIZED_NAME_TRUSTED_DOMAIN)
  private Boolean trustedDomain;

  public static final String SERIALIZED_NAME_TIME_VALIDATED = "timeValidated";
  @SerializedName(SERIALIZED_NAME_TIME_VALIDATED)
  private OffsetDateTime timeValidated;

  public static final String SERIALIZED_NAME_VALIDATION_METHOD = "validationMethod";
  @SerializedName(SERIALIZED_NAME_VALIDATION_METHOD)
  private String validationMethod;

  public static final String SERIALIZED_NAME_RANDOM_VALUE = "randomValue";
  @SerializedName(SERIALIZED_NAME_RANDOM_VALUE)
  private String randomValue;

  public static final String SERIALIZED_NAME_RANDOM_VALUE_TIME_CREATED = "randomValueTimeCreated";
  @SerializedName(SERIALIZED_NAME_RANDOM_VALUE_TIME_CREATED)
  private OffsetDateTime randomValueTimeCreated;

  public static final String SERIALIZED_NAME_RANDOM_VALUE_TIME_EXPIRE = "randomValueTimeExpire";
  @SerializedName(SERIALIZED_NAME_RANDOM_VALUE_TIME_EXPIRE)
  private OffsetDateTime randomValueTimeExpire;

  public static final String SERIALIZED_NAME_VALIDATION_RESULT = "validationResult";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULT)
  private String validationResult;

  public static final String SERIALIZED_NAME_TIME_EXPIRED = "timeExpired";
  @SerializedName(SERIALIZED_NAME_TIME_EXPIRED)
  private OffsetDateTime timeExpired;

  public static final String SERIALIZED_NAME_EXPIRED = "expired";
  @SerializedName(SERIALIZED_NAME_EXPIRED)
  private Boolean expired;

  public static final String SERIALIZED_NAME_RANDOM_VALUE_TIME_EXPIRED = "randomValueTimeExpired";
  @SerializedName(SERIALIZED_NAME_RANDOM_VALUE_TIME_EXPIRED)
  private Boolean randomValueTimeExpired;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ClientDomainValidationStatus status;

  public ClientDNS() { 
  }

  
  public ClientDNS(
     String uuid, 
     String domainUnicode, 
     Boolean validated, 
     OffsetDateTime timeValidated, 
     String validationMethod, 
     String randomValue, 
     OffsetDateTime randomValueTimeCreated, 
     OffsetDateTime randomValueTimeExpire, 
     String validationResult, 
     OffsetDateTime timeExpired, 
     Boolean expired, 
     Boolean randomValueTimeExpired
  ) {
    this();
    this.uuid = uuid;
    this.domainUnicode = domainUnicode;
    this.validated = validated;
    this.timeValidated = timeValidated;
    this.validationMethod = validationMethod;
    this.randomValue = randomValue;
    this.randomValueTimeCreated = randomValueTimeCreated;
    this.randomValueTimeExpire = randomValueTimeExpire;
    this.validationResult = validationResult;
    this.timeExpired = timeExpired;
    this.expired = expired;
    this.randomValueTimeExpired = randomValueTimeExpired;
  }

   /**
   * Pre validated client domain reference
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "cld-10877aec-412f-4b96-a5d4-f5f95da8634e", required = true, value = "Pre validated client domain reference")

  public String getUuid() {
    return uuid;
  }




  public ClientDNS domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Client domain in punycode
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "xn--dj-kia8a.vu.com", required = true, value = "Client domain in punycode")

  public String getDomain() {
    return domain;
  }


  public void setDomain(String domain) {
    this.domain = domain;
  }


   /**
   * Client domain in unicode
   * @return domainUnicode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "déjà.vu.com", required = true, value = "Client domain in unicode")

  public String getDomainUnicode() {
    return domainUnicode;
  }




   /**
   * Indicates if the domain is validated
   * @return validated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the domain is validated")

  public Boolean getValidated() {
    return validated;
  }




  public ClientDNS trustedDomain(Boolean trustedDomain) {
    
    this.trustedDomain = trustedDomain;
    return this;
  }

   /**
   * Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs.
   * @return trustedDomain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs.")

  public Boolean getTrustedDomain() {
    return trustedDomain;
  }


  public void setTrustedDomain(Boolean trustedDomain) {
    this.trustedDomain = trustedDomain;
  }


   /**
   * Indicates when the domain got validated
   * @return timeValidated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-12T23:20:50.520Z", value = "Indicates when the domain got validated")

  public OffsetDateTime getTimeValidated() {
    return timeValidated;
  }




   /**
   * DNS validation type
   * @return validationMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "cabdns", required = true, value = "DNS validation type")

  public String getValidationMethod() {
    return validationMethod;
  }




   /**
   * The random value to add to the DNS TXT record for the domain
   * @return randomValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "", value = "The random value to add to the DNS TXT record for the domain")

  public String getRandomValue() {
    return randomValue;
  }




   /**
   * Indicates when the random value was created
   * @return randomValueTimeCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-12T23:20:50.520Z", value = "Indicates when the random value was created")

  public OffsetDateTime getRandomValueTimeCreated() {
    return randomValueTimeCreated;
  }




   /**
   * Indicates when the random value expires
   * @return randomValueTimeExpire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-12T23:20:50.520Z", value = "Indicates when the random value expires")

  public OffsetDateTime getRandomValueTimeExpire() {
    return randomValueTimeExpire;
  }




   /**
   * Indicates the validation result
   * @return validationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Validated XYZ ...", value = "Indicates the validation result")

  public String getValidationResult() {
    return validationResult;
  }




   /**
   * Indicates when the random value was created
   * @return timeExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-12T23:20:50.520Z", value = "Indicates when the random value was created")

  public OffsetDateTime getTimeExpired() {
    return timeExpired;
  }




   /**
   * Indicates if the pre validation of the domain has expired
   * @return expired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates if the pre validation of the domain has expired")

  public Boolean getExpired() {
    return expired;
  }




   /**
   * Indicates if the random value is expired
   * @return randomValueTimeExpired
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicates if the random value is expired")

  public Boolean getRandomValueTimeExpired() {
    return randomValueTimeExpired;
  }




  public ClientDNS status(ClientDomainValidationStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClientDomainValidationStatus getStatus() {
    return status;
  }


  public void setStatus(ClientDomainValidationStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientDNS clientDNS = (ClientDNS) o;
    return Objects.equals(this.uuid, clientDNS.uuid) &&
        Objects.equals(this.domain, clientDNS.domain) &&
        Objects.equals(this.domainUnicode, clientDNS.domainUnicode) &&
        Objects.equals(this.validated, clientDNS.validated) &&
        Objects.equals(this.trustedDomain, clientDNS.trustedDomain) &&
        Objects.equals(this.timeValidated, clientDNS.timeValidated) &&
        Objects.equals(this.validationMethod, clientDNS.validationMethod) &&
        Objects.equals(this.randomValue, clientDNS.randomValue) &&
        Objects.equals(this.randomValueTimeCreated, clientDNS.randomValueTimeCreated) &&
        Objects.equals(this.randomValueTimeExpire, clientDNS.randomValueTimeExpire) &&
        Objects.equals(this.validationResult, clientDNS.validationResult) &&
        Objects.equals(this.timeExpired, clientDNS.timeExpired) &&
        Objects.equals(this.expired, clientDNS.expired) &&
        Objects.equals(this.randomValueTimeExpired, clientDNS.randomValueTimeExpired) &&
        Objects.equals(this.status, clientDNS.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, domain, domainUnicode, validated, trustedDomain, timeValidated, validationMethod, randomValue, randomValueTimeCreated, randomValueTimeExpire, validationResult, timeExpired, expired, randomValueTimeExpired, status);
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
    sb.append("class ClientDNS {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    domainUnicode: ").append(toIndentedString(domainUnicode)).append("\n");
    sb.append("    validated: ").append(toIndentedString(validated)).append("\n");
    sb.append("    trustedDomain: ").append(toIndentedString(trustedDomain)).append("\n");
    sb.append("    timeValidated: ").append(toIndentedString(timeValidated)).append("\n");
    sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
    sb.append("    randomValue: ").append(toIndentedString(randomValue)).append("\n");
    sb.append("    randomValueTimeCreated: ").append(toIndentedString(randomValueTimeCreated)).append("\n");
    sb.append("    randomValueTimeExpire: ").append(toIndentedString(randomValueTimeExpire)).append("\n");
    sb.append("    validationResult: ").append(toIndentedString(validationResult)).append("\n");
    sb.append("    timeExpired: ").append(toIndentedString(timeExpired)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    randomValueTimeExpired: ").append(toIndentedString(randomValueTimeExpired)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("domain");
    openapiFields.add("domainUnicode");
    openapiFields.add("validated");
    openapiFields.add("trustedDomain");
    openapiFields.add("timeValidated");
    openapiFields.add("validationMethod");
    openapiFields.add("randomValue");
    openapiFields.add("randomValueTimeCreated");
    openapiFields.add("randomValueTimeExpire");
    openapiFields.add("validationResult");
    openapiFields.add("timeExpired");
    openapiFields.add("expired");
    openapiFields.add("randomValueTimeExpired");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("domainUnicode");
    openapiRequiredFields.add("validated");
    openapiRequiredFields.add("trustedDomain");
    openapiRequiredFields.add("validationMethod");
    openapiRequiredFields.add("expired");
    openapiRequiredFields.add("randomValueTimeExpired");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientDNS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ClientDNS.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientDNS is not found in the empty JSON string", ClientDNS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClientDNS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientDNS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientDNS.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("domain") != null && !jsonObj.get("domain").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domain` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domain").toString()));
      }
      if (jsonObj.get("domainUnicode") != null && !jsonObj.get("domainUnicode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domainUnicode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domainUnicode").toString()));
      }
      if (jsonObj.get("validationMethod") != null && !jsonObj.get("validationMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationMethod").toString()));
      }
      if (jsonObj.get("randomValue") != null && !jsonObj.get("randomValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `randomValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("randomValue").toString()));
      }
      if (jsonObj.get("validationResult") != null && !jsonObj.get("validationResult").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validationResult` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validationResult").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientDNS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientDNS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientDNS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientDNS.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientDNS>() {
           @Override
           public void write(JsonWriter out, ClientDNS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientDNS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientDNS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientDNS
  * @throws IOException if the JSON string is invalid with respect to ClientDNS
  */
  public static ClientDNS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientDNS.class);
  }

 /**
  * Convert an instance of ClientDNS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

