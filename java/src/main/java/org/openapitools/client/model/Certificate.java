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
import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.client.model.CertificateRevocationStatus;

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
 * Certificate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-09T13:17:52.329053Z[Etc/UTC]")
public class Certificate {
  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_SERIAL = "serial";
  @SerializedName(SERIALIZED_NAME_SERIAL)
  private String serial;

  public static final String SERIALIZED_NAME_START_VALIDITY = "startValidity";
  @SerializedName(SERIALIZED_NAME_START_VALIDITY)
  private OffsetDateTime startValidity;

  public static final String SERIALIZED_NAME_END_VALIDITY = "endValidity";
  @SerializedName(SERIALIZED_NAME_END_VALIDITY)
  private OffsetDateTime endValidity;

  public static final String SERIALIZED_NAME_CERTIFICATE = "certificate";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE)
  private File certificate;

  public static final String SERIALIZED_NAME_REVOCATION_STATUS = "revocationStatus";
  @SerializedName(SERIALIZED_NAME_REVOCATION_STATUS)
  private CertificateRevocationStatus revocationStatus;

  public Certificate() { 
  }

  
  public Certificate(
     String subject, 
     String issuer, 
     String serial, 
     OffsetDateTime startValidity, 
     OffsetDateTime endValidity, 
     File certificate
  ) {
    this();
    this.subject = subject;
    this.issuer = issuer;
    this.serial = serial;
    this.startValidity = startValidity;
    this.endValidity = endValidity;
    this.certificate = certificate;
  }

   /**
   * Certificate Subject Distinguished Name
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Some Name", required = true, value = "Certificate Subject Distinguished Name")

  public String getSubject() {
    return subject;
  }




   /**
   * Certificate Issuer Distinguished Name
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DC=COM,DC=Domain,OU=Some Organizational Unit,CN=Issuer Name", required = true, value = "Certificate Issuer Distinguished Name")

  public String getIssuer() {
    return issuer;
  }




   /**
   * Certificate serial number (Big Integer HEX encoded)
   * @return serial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3893409CB666E1F092B7B6F28E1EAF4582AA7F21", required = true, value = "Certificate serial number (Big Integer HEX encoded)")

  public String getSerial() {
    return serial;
  }




   /**
   * Certificate start validity in UTC
   * @return startValidity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-01-12T23:20:50.520Z", required = true, value = "Certificate start validity in UTC")

  public OffsetDateTime getStartValidity() {
    return startValidity;
  }




   /**
   * Certificate start validity in UTC
   * @return endValidity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-01-12T23:20:50.520Z", required = true, value = "Certificate start validity in UTC")

  public OffsetDateTime getEndValidity() {
    return endValidity;
  }




   /**
   * base64 encoded DER certificate
   * @return certificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "base64 encoded DER certificate")

  public File getCertificate() {
    return certificate;
  }




  public Certificate revocationStatus(CertificateRevocationStatus revocationStatus) {
    
    this.revocationStatus = revocationStatus;
    return this;
  }

   /**
   * Get revocationStatus
   * @return revocationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CertificateRevocationStatus getRevocationStatus() {
    return revocationStatus;
  }


  public void setRevocationStatus(CertificateRevocationStatus revocationStatus) {
    this.revocationStatus = revocationStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate certificate = (Certificate) o;
    return Objects.equals(this.subject, certificate.subject) &&
        Objects.equals(this.issuer, certificate.issuer) &&
        Objects.equals(this.serial, certificate.serial) &&
        Objects.equals(this.startValidity, certificate.startValidity) &&
        Objects.equals(this.endValidity, certificate.endValidity) &&
        Objects.equals(this.certificate, certificate.certificate) &&
        Objects.equals(this.revocationStatus, certificate.revocationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, issuer, serial, startValidity, endValidity, certificate, revocationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Certificate {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    startValidity: ").append(toIndentedString(startValidity)).append("\n");
    sb.append("    endValidity: ").append(toIndentedString(endValidity)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    revocationStatus: ").append(toIndentedString(revocationStatus)).append("\n");
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
    openapiFields.add("subject");
    openapiFields.add("issuer");
    openapiFields.add("serial");
    openapiFields.add("startValidity");
    openapiFields.add("endValidity");
    openapiFields.add("certificate");
    openapiFields.add("revocationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subject");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("serial");
    openapiRequiredFields.add("startValidity");
    openapiRequiredFields.add("endValidity");
    openapiRequiredFields.add("certificate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Certificate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Certificate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Certificate is not found in the empty JSON string", Certificate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Certificate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Certificate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Certificate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if (jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if (jsonObj.get("serial") != null && !jsonObj.get("serial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial").toString()));
      }
      // validate the optional field `revocationStatus`
      if (jsonObj.getAsJsonObject("revocationStatus") != null) {
        CertificateRevocationStatus.validateJsonObject(jsonObj.getAsJsonObject("revocationStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Certificate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Certificate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Certificate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Certificate.class));

       return (TypeAdapter<T>) new TypeAdapter<Certificate>() {
           @Override
           public void write(JsonWriter out, Certificate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Certificate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Certificate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Certificate
  * @throws IOException if the JSON string is invalid with respect to Certificate
  */
  public static Certificate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Certificate.class);
  }

 /**
  * Convert an instance of Certificate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

