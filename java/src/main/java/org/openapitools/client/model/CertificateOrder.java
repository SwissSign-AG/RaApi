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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.CertificateOrderCertificate;
import org.openapitools.client.model.CertificateOrderStatus;

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
 * CertificateOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-12T08:33:00.483625Z[Etc/UTC]")
public class CertificateOrder {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CertificateOrderStatus status;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  private String clientReference;

  public static final String SERIALIZED_NAME_PRODUCT_REFERENCE = "productReference";
  @SerializedName(SERIALIZED_NAME_PRODUCT_REFERENCE)
  private String productReference;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private CertificateOrderCertificate certificate;

  public static final String SERIALIZED_NAME_ISSUED_BY = "issuedBy";
  @SerializedName(SERIALIZED_NAME_ISSUED_BY)
  private String issuedBy;

  public CertificateOrder() { 
  }

  
  public CertificateOrder(
     String clientReference, 
     String productReference, 
     String issuedBy
  ) {
    this();
    this.clientReference = clientReference;
    this.productReference = productReference;
    this.issuedBy = issuedBy;
  }

  public CertificateOrder uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * Certificate Order reference
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ord-f0725b50-c533-4802-a844-de57bfb7a80e", required = true, value = "Certificate Order reference")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public CertificateOrder createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Certificate Order creation date time
   * @return createdOn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", required = true, value = "Certificate Order creation date time")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public CertificateOrder status(CertificateOrderStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CertificateOrderStatus getStatus() {
    return status;
  }


  public void setStatus(CertificateOrderStatus status) {
    this.status = status;
  }


   /**
   * Client reference UUID
   * @return clientReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "cli-123e4567-e89b-12d3-a456-426614174000", required = true, value = "Client reference UUID")

  public String getClientReference() {
    return clientReference;
  }




   /**
   * Product reference UUID
   * @return productReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pma-123e4567-e89b-12d3-a456-426614174000", required = true, value = "Product reference UUID")

  public String getProductReference() {
    return productReference;
  }




  public CertificateOrder certificate(CertificateOrderCertificate certificate) {
    
    this.certificate = certificate;
    return this;
  }

   /**
   * Get certificate
   * @return certificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateOrderCertificate getCertificate() {
    return certificate;
  }


  public void setCertificate(CertificateOrderCertificate certificate) {
    this.certificate = certificate;
  }


   /**
   * email of the person who created the order
   * @return issuedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some@email.org", value = "email of the person who created the order")

  public String getIssuedBy() {
    return issuedBy;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateOrder certificateOrder = (CertificateOrder) o;
    return Objects.equals(this.uuid, certificateOrder.uuid) &&
        Objects.equals(this.createdOn, certificateOrder.createdOn) &&
        Objects.equals(this.status, certificateOrder.status) &&
        Objects.equals(this.clientReference, certificateOrder.clientReference) &&
        Objects.equals(this.productReference, certificateOrder.productReference) &&
        Objects.equals(this.certificate, certificateOrder.certificate) &&
        Objects.equals(this.issuedBy, certificateOrder.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, createdOn, status, clientReference, productReference, certificate, issuedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateOrder {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    productReference: ").append(toIndentedString(productReference)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
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
    openapiFields.add("createdOn");
    openapiFields.add("status");
    openapiFields.add("clientReference");
    openapiFields.add("productReference");
    openapiFields.add("certificate");
    openapiFields.add("issuedBy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("createdOn");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("clientReference");
    openapiRequiredFields.add("productReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateOrder
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificateOrder.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateOrder is not found in the empty JSON string", CertificateOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateOrder` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertificateOrder.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("clientReference") != null && !jsonObj.get("clientReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientReference").toString()));
      }
      if (jsonObj.get("productReference") != null && !jsonObj.get("productReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productReference").toString()));
      }
      // validate the optional field `certificate`
      if (jsonObj.getAsJsonObject("certificate") != null) {
        CertificateOrderCertificate.validateJsonObject(jsonObj.getAsJsonObject("certificate"));
      }
      if (jsonObj.get("issuedBy") != null && !jsonObj.get("issuedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuedBy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateOrder.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateOrder' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateOrder> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateOrder.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateOrder>() {
           @Override
           public void write(JsonWriter out, CertificateOrder value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateOrder read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateOrder given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateOrder
  * @throws IOException if the JSON string is invalid with respect to CertificateOrder
  */
  public static CertificateOrder fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateOrder.class);
  }

 /**
  * Convert an instance of CertificateOrder to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

