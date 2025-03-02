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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.AdditionalRecipient;
import org.openapitools.client.model.RegistrationDocument;
import org.openapitools.client.model.RequestOverrides;

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
 * IssueRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class IssueRequest {
  public static final String SERIALIZED_NAME_PRODUCT_REFERENCE = "productReference";
  @SerializedName(SERIALIZED_NAME_PRODUCT_REFERENCE)
  @javax.annotation.Nonnull
  private String productReference;

  public static final String SERIALIZED_NAME_CSR = "csr";
  @SerializedName(SERIALIZED_NAME_CSR)
  @javax.annotation.Nullable
  private String csr;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  @javax.annotation.Nullable
  private RequestOverrides overrides;

  public static final String SERIALIZED_NAME_ADDITIONAL_RECIPIENTS = "additionalRecipients";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_RECIPIENTS)
  @javax.annotation.Nullable
  private List<AdditionalRecipient> additionalRecipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_REGISTRATION_DOCUMENTS = "registrationDocuments";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DOCUMENTS)
  @javax.annotation.Nullable
  private List<RegistrationDocument> registrationDocuments = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  @javax.annotation.Nullable
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  @javax.annotation.Nullable
  private String note;

  public static final String SERIALIZED_NAME_PUBLISH_CERTIFICATE = "publishCertificate";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CERTIFICATE)
  @javax.annotation.Nullable
  private Boolean publishCertificate;

  public static final String SERIALIZED_NAME_SYNCHRONE = "synchrone";
  @SerializedName(SERIALIZED_NAME_SYNCHRONE)
  @javax.annotation.Nullable
  private Boolean synchrone = false;

  public static final String SERIALIZED_NAME_ACCEPT_TAND_C = "acceptTandC";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TAND_C)
  @javax.annotation.Nullable
  private Boolean acceptTandC = true;

  public static final String SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN = "includeCertificateChain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN)
  @javax.annotation.Nullable
  private Boolean includeCertificateChain = false;

  public IssueRequest() {
  }

  public IssueRequest productReference(@javax.annotation.Nonnull String productReference) {
    this.productReference = productReference;
    return this;
  }

  /**
   * Product reference
   * @return productReference
   */
  @javax.annotation.Nonnull
  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(@javax.annotation.Nonnull String productReference) {
    this.productReference = productReference;
  }


  public IssueRequest csr(@javax.annotation.Nullable String csr) {
    this.csr = csr;
    return this;
  }

  /**
   * CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary).
   * @return csr
   */
  @javax.annotation.Nullable
  public String getCsr() {
    return csr;
  }

  public void setCsr(@javax.annotation.Nullable String csr) {
    this.csr = csr;
  }


  public IssueRequest overrides(@javax.annotation.Nullable RequestOverrides overrides) {
    this.overrides = overrides;
    return this;
  }

  /**
   * Get overrides
   * @return overrides
   */
  @javax.annotation.Nullable
  public RequestOverrides getOverrides() {
    return overrides;
  }

  public void setOverrides(@javax.annotation.Nullable RequestOverrides overrides) {
    this.overrides = overrides;
  }


  public IssueRequest additionalRecipients(@javax.annotation.Nullable List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
    return this;
  }

  public IssueRequest addAdditionalRecipientsItem(AdditionalRecipient additionalRecipientsItem) {
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


  public IssueRequest registrationDocuments(@javax.annotation.Nullable List<RegistrationDocument> registrationDocuments) {
    this.registrationDocuments = registrationDocuments;
    return this;
  }

  public IssueRequest addRegistrationDocumentsItem(RegistrationDocument registrationDocumentsItem) {
    if (this.registrationDocuments == null) {
      this.registrationDocuments = new ArrayList<>();
    }
    this.registrationDocuments.add(registrationDocumentsItem);
    return this;
  }

  /**
   * Get registrationDocuments
   * @return registrationDocuments
   */
  @javax.annotation.Nullable
  public List<RegistrationDocument> getRegistrationDocuments() {
    return registrationDocuments;
  }

  public void setRegistrationDocuments(@javax.annotation.Nullable List<RegistrationDocument> registrationDocuments) {
    this.registrationDocuments = registrationDocuments;
  }


  public IssueRequest tags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
    return this;
  }

  public IssueRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(@javax.annotation.Nullable List<String> tags) {
    this.tags = tags;
  }


  public IssueRequest note(@javax.annotation.Nullable String note) {
    this.note = note;
    return this;
  }

  /**
   * User note added to issued certificate order
   * @return note
   */
  @javax.annotation.Nullable
  public String getNote() {
    return note;
  }

  public void setNote(@javax.annotation.Nullable String note) {
    this.note = note;
  }


  public IssueRequest publishCertificate(@javax.annotation.Nullable Boolean publishCertificate) {
    this.publishCertificate = publishCertificate;
    return this;
  }

  /**
   * Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication. 
   * @return publishCertificate
   */
  @javax.annotation.Nullable
  public Boolean getPublishCertificate() {
    return publishCertificate;
  }

  public void setPublishCertificate(@javax.annotation.Nullable Boolean publishCertificate) {
    this.publishCertificate = publishCertificate;
  }


  public IssueRequest synchrone(@javax.annotation.Nullable Boolean synchrone) {
    this.synchrone = synchrone;
    return this;
  }

  /**
   * Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchronous issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled. 
   * @return synchrone
   */
  @javax.annotation.Nullable
  public Boolean getSynchrone() {
    return synchrone;
  }

  public void setSynchrone(@javax.annotation.Nullable Boolean synchrone) {
    this.synchrone = synchrone;
  }


  public IssueRequest acceptTandC(@javax.annotation.Nullable Boolean acceptTandC) {
    this.acceptTandC = acceptTandC;
    return this;
  }

  /**
   * When server backend has T&amp;C enabled, this value is checked. 
   * @return acceptTandC
   */
  @javax.annotation.Nullable
  public Boolean getAcceptTandC() {
    return acceptTandC;
  }

  public void setAcceptTandC(@javax.annotation.Nullable Boolean acceptTandC) {
    this.acceptTandC = acceptTandC;
  }


  public IssueRequest includeCertificateChain(@javax.annotation.Nullable Boolean includeCertificateChain) {
    this.includeCertificateChain = includeCertificateChain;
    return this;
  }

  /**
   * Include the certificate chain in the reply (only valid when &#39;synchronous&#39; is true). 
   * @return includeCertificateChain
   */
  @javax.annotation.Nullable
  public Boolean getIncludeCertificateChain() {
    return includeCertificateChain;
  }

  public void setIncludeCertificateChain(@javax.annotation.Nullable Boolean includeCertificateChain) {
    this.includeCertificateChain = includeCertificateChain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueRequest issueRequest = (IssueRequest) o;
    return Objects.equals(this.productReference, issueRequest.productReference) &&
        Objects.equals(this.csr, issueRequest.csr) &&
        Objects.equals(this.overrides, issueRequest.overrides) &&
        Objects.equals(this.additionalRecipients, issueRequest.additionalRecipients) &&
        Objects.equals(this.registrationDocuments, issueRequest.registrationDocuments) &&
        Objects.equals(this.tags, issueRequest.tags) &&
        Objects.equals(this.note, issueRequest.note) &&
        Objects.equals(this.publishCertificate, issueRequest.publishCertificate) &&
        Objects.equals(this.synchrone, issueRequest.synchrone) &&
        Objects.equals(this.acceptTandC, issueRequest.acceptTandC) &&
        Objects.equals(this.includeCertificateChain, issueRequest.includeCertificateChain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productReference, csr, overrides, additionalRecipients, registrationDocuments, tags, note, publishCertificate, synchrone, acceptTandC, includeCertificateChain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueRequest {\n");
    sb.append("    productReference: ").append(toIndentedString(productReference)).append("\n");
    sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    additionalRecipients: ").append(toIndentedString(additionalRecipients)).append("\n");
    sb.append("    registrationDocuments: ").append(toIndentedString(registrationDocuments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    publishCertificate: ").append(toIndentedString(publishCertificate)).append("\n");
    sb.append("    synchrone: ").append(toIndentedString(synchrone)).append("\n");
    sb.append("    acceptTandC: ").append(toIndentedString(acceptTandC)).append("\n");
    sb.append("    includeCertificateChain: ").append(toIndentedString(includeCertificateChain)).append("\n");
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
    openapiFields.add("productReference");
    openapiFields.add("csr");
    openapiFields.add("overrides");
    openapiFields.add("additionalRecipients");
    openapiFields.add("registrationDocuments");
    openapiFields.add("tags");
    openapiFields.add("note");
    openapiFields.add("publishCertificate");
    openapiFields.add("synchrone");
    openapiFields.add("acceptTandC");
    openapiFields.add("includeCertificateChain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("productReference");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IssueRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IssueRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueRequest is not found in the empty JSON string", IssueRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IssueRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("productReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productReference").toString()));
      }
      if ((jsonObj.get("csr") != null && !jsonObj.get("csr").isJsonNull()) && !jsonObj.get("csr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csr").toString()));
      }
      // validate the optional field `overrides`
      if (jsonObj.get("overrides") != null && !jsonObj.get("overrides").isJsonNull()) {
        RequestOverrides.validateJsonElement(jsonObj.get("overrides"));
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
      if (jsonObj.get("registrationDocuments") != null && !jsonObj.get("registrationDocuments").isJsonNull()) {
        JsonArray jsonArrayregistrationDocuments = jsonObj.getAsJsonArray("registrationDocuments");
        if (jsonArrayregistrationDocuments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("registrationDocuments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `registrationDocuments` to be an array in the JSON string but got `%s`", jsonObj.get("registrationDocuments").toString()));
          }

          // validate the optional field `registrationDocuments` (array)
          for (int i = 0; i < jsonArrayregistrationDocuments.size(); i++) {
            RegistrationDocument.validateJsonElement(jsonArrayregistrationDocuments.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("note") != null && !jsonObj.get("note").isJsonNull()) && !jsonObj.get("note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueRequest>() {
           @Override
           public void write(JsonWriter out, IssueRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IssueRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssueRequest
   * @throws IOException if the JSON string is invalid with respect to IssueRequest
   */
  public static IssueRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueRequest.class);
  }

  /**
   * Convert an instance of IssueRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

