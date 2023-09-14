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
 * AdditionalRecipient
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdditionalRecipient {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template. 
   */
  @JsonAdapter(RecipientTypeEnum.Adapter.class)
  public enum RecipientTypeEnum {
    DNS_OWNER_CHECK_EMAIL_LINK("DNS_OWNER_CHECK_EMAIL_LINK"),
    
    DNS_CAB("DNS_CAB"),
    
    ISSUANCE("ISSUANCE"),
    
    REVOCATION("REVOCATION"),
    
    RENEWAL("RENEWAL"),
    
    RECOVERY("RECOVERY"),
    
    AUTHORIZATION("AUTHORIZATION"),
    
    AUTHORIZATION_ACCEPTED("AUTHORIZATION_ACCEPTED"),
    
    AUTHORIZATION_REJECTED("AUTHORIZATION_REJECTED");

    private String value;

    RecipientTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecipientTypeEnum fromValue(String value) {
      for (RecipientTypeEnum b : RecipientTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RecipientTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecipientTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecipientTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RecipientTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RECIPIENT_TYPE = "recipientType";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TYPE)
  private RecipientTypeEnum recipientType;

  /**
   * Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages. 
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    NEUTRAL("NEUTRAL"),
    
    EN("EN"),
    
    FR("FR"),
    
    DE("DE");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LanguageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public AdditionalRecipient() { 
  }

  public AdditionalRecipient email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * RFC822 email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "shared.mailbox@sample.org", required = true, value = "RFC822 email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AdditionalRecipient recipientType(RecipientTypeEnum recipientType) {
    
    this.recipientType = recipientType;
    return this;
  }

   /**
   * Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template. 
   * @return recipientType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DNS_OWNER_CHECK_EMAIL_LINK", required = true, value = "Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. ")

  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }


  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }


  public AdditionalRecipient language(LanguageEnum language) {
    
    this.language = language;
    return this;
  }

   /**
   * Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages. 
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NEUTRAL", required = true, value = "Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages. ")

  public LanguageEnum getLanguage() {
    return language;
  }


  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalRecipient additionalRecipient = (AdditionalRecipient) o;
    return Objects.equals(this.email, additionalRecipient.email) &&
        Objects.equals(this.recipientType, additionalRecipient.recipientType) &&
        Objects.equals(this.language, additionalRecipient.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, recipientType, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalRecipient {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("recipientType");
    openapiFields.add("language");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("recipientType");
    openapiRequiredFields.add("language");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdditionalRecipient
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdditionalRecipient.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalRecipient is not found in the empty JSON string", AdditionalRecipient.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdditionalRecipient.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalRecipient` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdditionalRecipient.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("recipientType") != null && !jsonObj.get("recipientType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientType").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalRecipient.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalRecipient' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalRecipient> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalRecipient.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalRecipient>() {
           @Override
           public void write(JsonWriter out, AdditionalRecipient value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalRecipient read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdditionalRecipient given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdditionalRecipient
  * @throws IOException if the JSON string is invalid with respect to AdditionalRecipient
  */
  public static AdditionalRecipient fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalRecipient.class);
  }

 /**
  * Convert an instance of AdditionalRecipient to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

