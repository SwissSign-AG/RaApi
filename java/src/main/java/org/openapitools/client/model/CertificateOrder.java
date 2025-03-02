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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AdditionalRecipient;
import org.openapitools.client.model.Certificate;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CertificateOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class CertificateOrder {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  @javax.annotation.Nonnull
  private String uuid;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  @javax.annotation.Nonnull
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nonnull
  private CertificateOrderStatus status;

  public static final String SERIALIZED_NAME_CLIENT_REFERENCE = "clientReference";
  @SerializedName(SERIALIZED_NAME_CLIENT_REFERENCE)
  @javax.annotation.Nonnull
  private String clientReference;

  public static final String SERIALIZED_NAME_PRODUCT_REFERENCE = "productReference";
  @SerializedName(SERIALIZED_NAME_PRODUCT_REFERENCE)
  @javax.annotation.Nonnull
  private String productReference;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  @javax.annotation.Nullable
  private Certificate certificate;

  public static final String SERIALIZED_NAME_CERTIFICATE_CHAIN = "certificateChain";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CHAIN)
  @javax.annotation.Nullable
  private List<String> certificateChain = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_RECIPIENTS = "additionalRecipients";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_RECIPIENTS)
  @javax.annotation.Nullable
  private List<AdditionalRecipient> additionalRecipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_ISSUED_BY = "issuedBy";
  @SerializedName(SERIALIZED_NAME_ISSUED_BY)
  @javax.annotation.Nullable
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

  public CertificateOrder uuid(@javax.annotation.Nonnull String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Certificate Order reference
   * @return uuid
   */
  @javax.annotation.Nonnull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(@javax.annotation.Nonnull String uuid) {
    this.uuid = uuid;
  }


  public CertificateOrder createdOn(@javax.annotation.Nonnull OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * Certificate Order creation date time
   * @return createdOn
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(@javax.annotation.Nonnull OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public CertificateOrder status(@javax.annotation.Nonnull CertificateOrderStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public CertificateOrderStatus getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nonnull CertificateOrderStatus status) {
    this.status = status;
  }


  /**
   * Client reference UUID
   * @return clientReference
   */
  @javax.annotation.Nonnull
  public String getClientReference() {
    return clientReference;
  }



  /**
   * Product reference UUID
   * @return productReference
   */
  @javax.annotation.Nonnull
  public String getProductReference() {
    return productReference;
  }



  public CertificateOrder certificate(@javax.annotation.Nullable Certificate certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
   */
  @javax.annotation.Nullable
  public Certificate getCertificate() {
    return certificate;
  }

  public void setCertificate(@javax.annotation.Nullable Certificate certificate) {
    this.certificate = certificate;
  }


  public CertificateOrder certificateChain(@javax.annotation.Nullable List<String> certificateChain) {
    this.certificateChain = certificateChain;
    return this;
  }

  public CertificateOrder addCertificateChainItem(String certificateChainItem) {
    if (this.certificateChain == null) {
      this.certificateChain = new ArrayList<>();
    }
    this.certificateChain.add(certificateChainItem);
    return this;
  }

  /**
   * Certificate chain
   * @return certificateChain
   */
  @javax.annotation.Nullable
  public List<String> getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(@javax.annotation.Nullable List<String> certificateChain) {
    this.certificateChain = certificateChain;
  }


  public CertificateOrder tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CertificateOrder addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * User defined tags/labels
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public CertificateOrder additionalRecipients(@javax.annotation.Nullable List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
    return this;
  }

  public CertificateOrder addAdditionalRecipientsItem(AdditionalRecipient additionalRecipientsItem) {
    if (this.additionalRecipients == null) {
      this.additionalRecipients = new ArrayList<>();
    }
    this.additionalRecipients.add(additionalRecipientsItem);
    return this;
  }

  /**
   * Get additionalRecipients
   * @return additionalRecipients
   */
  @javax.annotation.Nullable
  public List<AdditionalRecipient> getAdditionalRecipients() {
    return additionalRecipients;
  }

  public void setAdditionalRecipients(@javax.annotation.Nullable List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
  }


  /**
   * email of the person who created the order
   * @return issuedBy
   */
  @javax.annotation.Nullable
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
        Objects.equals(this.certificateChain, certificateOrder.certificateChain) &&
        Objects.equals(this.tags, certificateOrder.tags) &&
        Objects.equals(this.additionalRecipients, certificateOrder.additionalRecipients) &&
        Objects.equals(this.issuedBy, certificateOrder.issuedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, createdOn, status, clientReference, productReference, certificate, certificateChain, tags, additionalRecipients, issuedBy);
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
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    additionalRecipients: ").append(toIndentedString(additionalRecipients)).append("\n");
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
    openapiFields.add("certificateChain");
    openapiFields.add("tags");
    openapiFields.add("additionalRecipients");
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
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CertificateOrder
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CertificateOrder.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateOrder is not found in the empty JSON string", CertificateOrder.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CertificateOrder.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateOrder` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertificateOrder.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the required field `status`
      CertificateOrderStatus.validateJsonElement(jsonObj.get("status"));
      if (!jsonObj.get("clientReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientReference").toString()));
      }
      if (!jsonObj.get("productReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productReference").toString()));
      }
      // validate the optional field `certificate`
      if (jsonObj.get("certificate") != null && !jsonObj.get("certificate").isJsonNull()) {
        Certificate.validateJsonElement(jsonObj.get("certificate"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("certificateChain") != null && !jsonObj.get("certificateChain").isJsonNull() && !jsonObj.get("certificateChain").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateChain` to be an array in the JSON string but got `%s`", jsonObj.get("certificateChain").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("additionalRecipients") != null && !jsonObj.get("additionalRecipients").isJsonNull()) {
        JsonArray jsonArrayadditionalRecipients = jsonObj.getAsJsonArray("additionalRecipients");
        if (jsonArrayadditionalRecipients != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalRecipients").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalRecipients` to be an array in the JSON string but got `%s`", jsonObj.get("additionalRecipients").toString()));
          }

          // validate the optional field `additionalRecipients` (array)
          for (int i = 0; i < jsonArrayadditionalRecipients.size(); i++) {
            AdditionalRecipient.validateJsonElement(jsonArrayadditionalRecipients.get(i));
          };
        }
      }
      if ((jsonObj.get("issuedBy") != null && !jsonObj.get("issuedBy").isJsonNull()) && !jsonObj.get("issuedBy").isJsonPrimitive()) {
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
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
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

