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
 * DNS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DNS {
  public static final String SERIALIZED_NAME_DNS = "dns";
  @SerializedName(SERIALIZED_NAME_DNS)
  private String dns;

  public static final String SERIALIZED_NAME_INCLUDE_BASE_DOMAIN_FOR_WILDCARD = "includeBaseDomainForWildcard";
  @SerializedName(SERIALIZED_NAME_INCLUDE_BASE_DOMAIN_FOR_WILDCARD)
  private Boolean includeBaseDomainForWildcard;

  public static final String SERIALIZED_NAME_INCLUDE_W_W_W_DOMAIN = "includeWWWDomain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_W_W_W_DOMAIN)
  private Boolean includeWWWDomain;

  public DNS() { 
  }

  public DNS dns(String dns) {
    
    this.dns = dns;
    return this;
  }

   /**
   * requested domain name (gets converted to punycode if required)
   * @return dns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "support.sample.org", required = true, value = "requested domain name (gets converted to punycode if required)")

  public String getDns() {
    return dns;
  }


  public void setDns(String dns) {
    this.dns = dns;
  }


  public DNS includeBaseDomainForWildcard(Boolean includeBaseDomainForWildcard) {
    
    this.includeBaseDomainForWildcard = includeBaseDomainForWildcard;
    return this;
  }

   /**
   * Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option. 
   * @return includeBaseDomainForWildcard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option. ")

  public Boolean getIncludeBaseDomainForWildcard() {
    return includeBaseDomainForWildcard;
  }


  public void setIncludeBaseDomainForWildcard(Boolean includeBaseDomainForWildcard) {
    this.includeBaseDomainForWildcard = includeBaseDomainForWildcard;
  }


  public DNS includeWWWDomain(Boolean includeWWWDomain) {
    
    this.includeWWWDomain = includeWWWDomain;
    return this;
  }

   /**
   * Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS. 
   * @return includeWWWDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS. ")

  public Boolean getIncludeWWWDomain() {
    return includeWWWDomain;
  }


  public void setIncludeWWWDomain(Boolean includeWWWDomain) {
    this.includeWWWDomain = includeWWWDomain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNS DNS = (DNS) o;
    return Objects.equals(this.dns, DNS.dns) &&
        Objects.equals(this.includeBaseDomainForWildcard, DNS.includeBaseDomainForWildcard) &&
        Objects.equals(this.includeWWWDomain, DNS.includeWWWDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dns, includeBaseDomainForWildcard, includeWWWDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNS {\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    includeBaseDomainForWildcard: ").append(toIndentedString(includeBaseDomainForWildcard)).append("\n");
    sb.append("    includeWWWDomain: ").append(toIndentedString(includeWWWDomain)).append("\n");
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
    openapiFields.add("dns");
    openapiFields.add("includeBaseDomainForWildcard");
    openapiFields.add("includeWWWDomain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DNS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DNS.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DNS is not found in the empty JSON string", DNS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DNS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DNS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DNS.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("dns") != null && !jsonObj.get("dns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dns").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DNS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DNS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DNS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DNS.class));

       return (TypeAdapter<T>) new TypeAdapter<DNS>() {
           @Override
           public void write(JsonWriter out, DNS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DNS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DNS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DNS
  * @throws IOException if the JSON string is invalid with respect to DNS
  */
  public static DNS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DNS.class);
  }

 /**
  * Convert an instance of DNS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

