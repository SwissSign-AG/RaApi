/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.207
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
import java.time.LocalDate;
import org.openapitools.client.model.KeyType;
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
 * Product
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-05T06:43:22.218632Z[Etc/UTC]")
public class Product {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "productName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "productDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  /**
   * Key generation protocol
   */
  @JsonAdapter(KeyGenerationTypeEnum.Adapter.class)
  public enum KeyGenerationTypeEnum {
    PKCS10("PKCS10"),
    
    PKCS12("PKCS12"),
    
    PKCS12WITHPIN("PKCS12withPIN"),
    
    PKCS10OR12WITHPIN("PKCS10or12withPIN"),
    
    HSM("HSM"),
    
    CNG("CNG");

    private String value;

    KeyGenerationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyGenerationTypeEnum fromValue(String value) {
      for (KeyGenerationTypeEnum b : KeyGenerationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyGenerationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyGenerationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyGenerationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyGenerationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_GENERATION_TYPE = "keyGenerationType";
  @SerializedName(SERIALIZED_NAME_KEY_GENERATION_TYPE)
  private KeyGenerationTypeEnum keyGenerationType;

  public static final String SERIALIZED_NAME_KEY_TYPE = "keyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private KeyType keyType;

  public static final String SERIALIZED_NAME_ISSUANCE_NOTIFICATION = "issuanceNotification";
  @SerializedName(SERIALIZED_NAME_ISSUANCE_NOTIFICATION)
  private Boolean issuanceNotification;

  public static final String SERIALIZED_NAME_REVOCATION_NOTIFICATION = "revocationNotification";
  @SerializedName(SERIALIZED_NAME_REVOCATION_NOTIFICATION)
  private Boolean revocationNotification;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private Boolean authorization;

  public static final String SERIALIZED_NAME_RENEWAL_RULE = "renewalRule";
  @SerializedName(SERIALIZED_NAME_RENEWAL_RULE)
  private Boolean renewalRule;

  public static final String SERIALIZED_NAME_PUBLISH_CERTIFICATE = "publishCertificate";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CERTIFICATE)
  private Boolean publishCertificate;

  public static final String SERIALIZED_NAME_CLIENT_PUBLISH_CERTIFICATE_OVERRIDE = "clientPublishCertificateOverride";
  @SerializedName(SERIALIZED_NAME_CLIENT_PUBLISH_CERTIFICATE_OVERRIDE)
  private Boolean clientPublishCertificateOverride;

  public static final String SERIALIZED_NAME_CLIENT_PUBLISH_CERTIFICATE_OVERRIDE_DEFAULT = "clientPublishCertificateOverrideDefault";
  @SerializedName(SERIALIZED_NAME_CLIENT_PUBLISH_CERTIFICATE_OVERRIDE_DEFAULT)
  private Boolean clientPublishCertificateOverrideDefault;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private LocalDate expirationDate;

  public Product() { 
  }

  
  public Product(
     String uuid, 
     String productName, 
     String productDescription, 
     KeyGenerationTypeEnum keyGenerationType, 
     Boolean issuanceNotification, 
     Boolean revocationNotification, 
     Boolean authorization, 
     Boolean renewalRule, 
     Boolean publishCertificate, 
     Boolean clientPublishCertificateOverride, 
     Boolean clientPublishCertificateOverrideDefault, 
     LocalDate expirationDate
  ) {
    this();
    this.uuid = uuid;
    this.productName = productName;
    this.productDescription = productDescription;
    this.keyGenerationType = keyGenerationType;
    this.issuanceNotification = issuanceNotification;
    this.revocationNotification = revocationNotification;
    this.authorization = authorization;
    this.renewalRule = renewalRule;
    this.publishCertificate = publishCertificate;
    this.clientPublishCertificateOverride = clientPublishCertificateOverride;
    this.clientPublishCertificateOverrideDefault = clientPublishCertificateOverrideDefault;
    this.expirationDate = expirationDate;
  }

   /**
   * Product UUID reference
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "pma-123e4567-e89b-12d3-a456-426614174000", required = true, value = "Product UUID reference")

  public String getUuid() {
    return uuid;
  }




   /**
   * Certificate product name
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SSL Silver", value = "Certificate product name")

  public String getProductName() {
    return productName;
  }




   /**
   * Product additional description
   * @return productDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SSL NCP policy with domain validation", value = "Product additional description")

  public String getProductDescription() {
    return productDescription;
  }




   /**
   * Key generation protocol
   * @return keyGenerationType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PKCS10", required = true, value = "Key generation protocol")

  public KeyGenerationTypeEnum getKeyGenerationType() {
    return keyGenerationType;
  }




  public Product keyType(KeyType keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public KeyType getKeyType() {
    return keyType;
  }


  public void setKeyType(KeyType keyType) {
    this.keyType = keyType;
  }


   /**
   * Indicate if the certificate sends a notification on issuance
   * @return issuanceNotification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate sends a notification on issuance")

  public Boolean getIssuanceNotification() {
    return issuanceNotification;
  }




   /**
   * Indicate if the certificate sends a notification on revocation
   * @return revocationNotification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate sends a notification on revocation")

  public Boolean getRevocationNotification() {
    return revocationNotification;
  }




   /**
   * Indicate if the certificate requires an authorization on issuance/revocation
   * @return authorization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate requires an authorization on issuance/revocation")

  public Boolean getAuthorization() {
    return authorization;
  }




   /**
   * Indicate if the certificate sends a notification for renewal
   * @return renewalRule
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate sends a notification for renewal")

  public Boolean getRenewalRule() {
    return renewalRule;
  }




   /**
   * Indicate if the certificate is published to the public LDAP after issuance
   * @return publishCertificate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate is published to the public LDAP after issuance")

  public Boolean getPublishCertificate() {
    return publishCertificate;
  }




   /**
   * Indicate if the certificate publication can be overridden
   * @return clientPublishCertificateOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate if the certificate publication can be overridden")

  public Boolean getClientPublishCertificateOverride() {
    return clientPublishCertificateOverride;
  }




   /**
   * Indicate the default value if publication override is enabled
   * @return clientPublishCertificateOverrideDefault
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Indicate the default value if publication override is enabled")

  public Boolean getClientPublishCertificateOverrideDefault() {
    return clientPublishCertificateOverrideDefault;
  }




   /**
   * Indicate if the certificate product has an expiration date
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Feb 15 00:00:00 UTC 2022", value = "Indicate if the certificate product has an expiration date")

  public LocalDate getExpirationDate() {
    return expirationDate;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.uuid, product.uuid) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.productDescription, product.productDescription) &&
        Objects.equals(this.keyGenerationType, product.keyGenerationType) &&
        Objects.equals(this.keyType, product.keyType) &&
        Objects.equals(this.issuanceNotification, product.issuanceNotification) &&
        Objects.equals(this.revocationNotification, product.revocationNotification) &&
        Objects.equals(this.authorization, product.authorization) &&
        Objects.equals(this.renewalRule, product.renewalRule) &&
        Objects.equals(this.publishCertificate, product.publishCertificate) &&
        Objects.equals(this.clientPublishCertificateOverride, product.clientPublishCertificateOverride) &&
        Objects.equals(this.clientPublishCertificateOverrideDefault, product.clientPublishCertificateOverrideDefault) &&
        Objects.equals(this.expirationDate, product.expirationDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, productName, productDescription, keyGenerationType, keyType, issuanceNotification, revocationNotification, authorization, renewalRule, publishCertificate, clientPublishCertificateOverride, clientPublishCertificateOverrideDefault, expirationDate);
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
    sb.append("class Product {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    keyGenerationType: ").append(toIndentedString(keyGenerationType)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    issuanceNotification: ").append(toIndentedString(issuanceNotification)).append("\n");
    sb.append("    revocationNotification: ").append(toIndentedString(revocationNotification)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    renewalRule: ").append(toIndentedString(renewalRule)).append("\n");
    sb.append("    publishCertificate: ").append(toIndentedString(publishCertificate)).append("\n");
    sb.append("    clientPublishCertificateOverride: ").append(toIndentedString(clientPublishCertificateOverride)).append("\n");
    sb.append("    clientPublishCertificateOverrideDefault: ").append(toIndentedString(clientPublishCertificateOverrideDefault)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("productName");
    openapiFields.add("productDescription");
    openapiFields.add("keyGenerationType");
    openapiFields.add("keyType");
    openapiFields.add("issuanceNotification");
    openapiFields.add("revocationNotification");
    openapiFields.add("authorization");
    openapiFields.add("renewalRule");
    openapiFields.add("publishCertificate");
    openapiFields.add("clientPublishCertificateOverride");
    openapiFields.add("clientPublishCertificateOverrideDefault");
    openapiFields.add("expirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("keyGenerationType");
    openapiRequiredFields.add("keyType");
    openapiRequiredFields.add("issuanceNotification");
    openapiRequiredFields.add("revocationNotification");
    openapiRequiredFields.add("authorization");
    openapiRequiredFields.add("renewalRule");
    openapiRequiredFields.add("publishCertificate");
    openapiRequiredFields.add("clientPublishCertificateOverride");
    openapiRequiredFields.add("clientPublishCertificateOverrideDefault");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Product
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Product.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Product is not found in the empty JSON string", Product.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Product.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Product` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Product.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("productName") != null && !jsonObj.get("productName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productName").toString()));
      }
      if (jsonObj.get("productDescription") != null && !jsonObj.get("productDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productDescription").toString()));
      }
      if (jsonObj.get("keyGenerationType") != null && !jsonObj.get("keyGenerationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyGenerationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyGenerationType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Product.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Product' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Product> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Product.class));

       return (TypeAdapter<T>) new TypeAdapter<Product>() {
           @Override
           public void write(JsonWriter out, Product value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Product read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Product given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Product
  * @throws IOException if the JSON string is invalid with respect to Product
  */
  public static Product fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Product.class);
  }

 /**
  * Convert an instance of Product to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

