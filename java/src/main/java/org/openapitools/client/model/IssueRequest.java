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
import org.openapitools.client.model.AdditionalRecipient;
import org.openapitools.client.model.RegistrationDocument;
import org.openapitools.client.model.RequestOverrides;
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
 * IssueRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IssueRequest {
  public static final String SERIALIZED_NAME_PRODUCT_REFERENCE = "productReference";
  @SerializedName(SERIALIZED_NAME_PRODUCT_REFERENCE)
  private String productReference;

  public static final String SERIALIZED_NAME_CSR = "csr";
  @SerializedName(SERIALIZED_NAME_CSR)
  private String csr;

  public static final String SERIALIZED_NAME_OVERRIDES = "overrides";
  @SerializedName(SERIALIZED_NAME_OVERRIDES)
  private RequestOverrides overrides;

  public static final String SERIALIZED_NAME_ADDITIONAL_RECIPIENTS = "additionalRecipients";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_RECIPIENTS)
  private List<AdditionalRecipient> additionalRecipients = null;

  public static final String SERIALIZED_NAME_REGISTRATION_DOCUMENTS = "registrationDocuments";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_DOCUMENTS)
  private List<RegistrationDocument> registrationDocuments = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_PUBLISH_CERTIFICATE = "publishCertificate";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CERTIFICATE)
  private Boolean publishCertificate;

  public static final String SERIALIZED_NAME_SYNCHRONE = "synchrone";
  @SerializedName(SERIALIZED_NAME_SYNCHRONE)
  private Boolean synchrone = false;

  public static final String SERIALIZED_NAME_ACCEPT_TAND_C = "acceptTandC";
  @SerializedName(SERIALIZED_NAME_ACCEPT_TAND_C)
  private Boolean acceptTandC = true;

  public static final String SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN = "includeCertificateChain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CERTIFICATE_CHAIN)
  private Boolean includeCertificateChain = false;

  public IssueRequest() { 
  }

  public IssueRequest productReference(String productReference) {
    
    this.productReference = productReference;
    return this;
  }

   /**
   * Product reference
   * @return productReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pma-10877aec-412f-4b96-a5d4-f5f95da8634e", required = true, value = "Product reference")

  public String getProductReference() {
    return productReference;
  }


  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


  public IssueRequest csr(String csr) {
    
    this.csr = csr;
    return this;
  }

   /**
   * CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary).
   * @return csr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "----BEGIN CERTIFICATE REQUEST----- MIICijCCAXICAQAwGTEXMBUGA1UEAwwOd3d3LnNhbXBsZS5vcmcwggEiMA0GCSqG SIb3DQEBAQUAA4IBDwAwggEKAoIBAQCY6+oWhcAadQJ3kuNHZIbujX6yt11MN7RN YIf1+tCFK/zHlbrekiochGQXHasbbTcAqVPM+atvvPl5BMQO6BW8/RzpKC05WAQL wM580Qnq7WcOUX+h+tU6v0W/mRF0KyEt2eI7W+J1ec27AYS2SMeDVyVN/dY7Ca8o x+glgw6MRjh4EQyk9E6v0BU5DaHqvUEhFArloW/t3XCps2Oxd15gqjm0tuEzaXul 6VOM4e7CjQuapG1D4mD6TZwEl9A26eVROiRbsgWMCjSYOrCDxsel873kDJoYv+8E YxbAxFlzg7RVBI0Th3vUAgawaPjMz7q2xOOYv+L64fI4s0WQFbbrAgMBAAGgLDAq BgkqhkiG9w0BCQ4xHTAbMBkGA1UdEQQSMBCCDnd3dy5zYW1wbGUub3JnMA0GCSqG SIb3DQEBCwUAA4IBAQAzegZ0PvLM22mie5eolWC9VHH00s3eazvYYpvzecsfDr9k o8omcsfZVE679R7WmAmicPLC8NYMTPGQHStu3MKyxAzw/GHvi2C1BSBx3lx0WDno Jh02r5J/qurxGTZihSr9GnUAU1I3Ht5Lboz/ITEslNMOzZFFIm7e2knfqchhyQRS ilT3LgHWAc490z/lWg63IbC4DVfl5SRtupKjFixyJKU7rHnkBb9fwBGn/mcQPcvq g9W5jRRvcCfmufSdtuzkuvVTR7AcqzrlAFhmwMv1Yll2eMv2qD40jjb0sF45bcu0 CRg0mu4um+/DZaWV6IUOiTPj6wewH+909Ov8f2G+ ----END CERTIFICATE REQUEST----- ", value = "CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary).")

  public String getCsr() {
    return csr;
  }


  public void setCsr(String csr) {
    this.csr = csr;
  }


  public IssueRequest overrides(RequestOverrides overrides) {
    
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestOverrides getOverrides() {
    return overrides;
  }


  public void setOverrides(RequestOverrides overrides) {
    this.overrides = overrides;
  }


  public IssueRequest additionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AdditionalRecipient> getAdditionalRecipients() {
    return additionalRecipients;
  }


  public void setAdditionalRecipients(List<AdditionalRecipient> additionalRecipients) {
    this.additionalRecipients = additionalRecipients;
  }


  public IssueRequest registrationDocuments(List<RegistrationDocument> registrationDocuments) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RegistrationDocument> getRegistrationDocuments() {
    return registrationDocuments;
  }


  public void setRegistrationDocuments(List<RegistrationDocument> registrationDocuments) {
    this.registrationDocuments = registrationDocuments;
  }


  public IssueRequest tags(List<String> tags) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public IssueRequest note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * User note added to issued certificate order
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user free text", value = "User note added to issued certificate order")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public IssueRequest publishCertificate(Boolean publishCertificate) {
    
    this.publishCertificate = publishCertificate;
    return this;
  }

   /**
   * Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication. 
   * @return publishCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication. ")

  public Boolean getPublishCertificate() {
    return publishCertificate;
  }


  public void setPublishCertificate(Boolean publishCertificate) {
    this.publishCertificate = publishCertificate;
  }


  public IssueRequest synchrone(Boolean synchrone) {
    
    this.synchrone = synchrone;
    return this;
  }

   /**
   * Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled. 
   * @return synchrone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled. ")

  public Boolean getSynchrone() {
    return synchrone;
  }


  public void setSynchrone(Boolean synchrone) {
    this.synchrone = synchrone;
  }


  public IssueRequest acceptTandC(Boolean acceptTandC) {
    
    this.acceptTandC = acceptTandC;
    return this;
  }

   /**
   * When server backend has T&amp;C enabled, this value is checked. 
   * @return acceptTandC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "When server backend has T&C enabled, this value is checked. ")

  public Boolean getAcceptTandC() {
    return acceptTandC;
  }


  public void setAcceptTandC(Boolean acceptTandC) {
    this.acceptTandC = acceptTandC;
  }


  public IssueRequest includeCertificateChain(Boolean includeCertificateChain) {
    
    this.includeCertificateChain = includeCertificateChain;
    return this;
  }

   /**
   * Include the certificate chain in the reply (only valid when &#39;synchrone&#39; is true). 
   * @return includeCertificateChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Include the certificate chain in the reply (only valid when 'synchrone' is true). ")

  public Boolean getIncludeCertificateChain() {
    return includeCertificateChain;
  }


  public void setIncludeCertificateChain(Boolean includeCertificateChain) {
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productReference, csr, overrides, additionalRecipients, registrationDocuments, tags, note, publishCertificate, synchrone, acceptTandC, includeCertificateChain);
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueRequest is not found in the empty JSON string", IssueRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("productReference") != null && !jsonObj.get("productReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productReference").toString()));
      }
      if (jsonObj.get("csr") != null && !jsonObj.get("csr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csr").toString()));
      }
      // validate the optional field `overrides`
      if (jsonObj.getAsJsonObject("overrides") != null) {
        RequestOverrides.validateJsonObject(jsonObj.getAsJsonObject("overrides"));
      }
      JsonArray jsonArrayadditionalRecipients = jsonObj.getAsJsonArray("additionalRecipients");
      if (jsonArrayadditionalRecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("additionalRecipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `additionalRecipients` to be an array in the JSON string but got `%s`", jsonObj.get("additionalRecipients").toString()));
        }

        // validate the optional field `additionalRecipients` (array)
        for (int i = 0; i < jsonArrayadditionalRecipients.size(); i++) {
          AdditionalRecipient.validateJsonObject(jsonArrayadditionalRecipients.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayregistrationDocuments = jsonObj.getAsJsonArray("registrationDocuments");
      if (jsonArrayregistrationDocuments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("registrationDocuments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `registrationDocuments` to be an array in the JSON string but got `%s`", jsonObj.get("registrationDocuments").toString()));
        }

        // validate the optional field `registrationDocuments` (array)
        for (int i = 0; i < jsonArrayregistrationDocuments.size(); i++) {
          RegistrationDocument.validateJsonObject(jsonArrayregistrationDocuments.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("note") != null && !jsonObj.get("note").isJsonPrimitive()) {
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
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
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

