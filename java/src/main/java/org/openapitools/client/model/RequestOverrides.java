/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.2.9
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
import org.openapitools.client.model.RequestExtensions;
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
 * RequestOverrides
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestOverrides {
  public static final String SERIALIZED_NAME_SUBJECT_D_N = "subjectDN";
  @SerializedName(SERIALIZED_NAME_SUBJECT_D_N)
  private String subjectDN;

  public static final String SERIALIZED_NAME_VALIDITY = "validity";
  @SerializedName(SERIALIZED_NAME_VALIDITY)
  private Integer validity;

  public static final String SERIALIZED_NAME_REQUEST_EXTENSIONS = "requestExtensions";
  @SerializedName(SERIALIZED_NAME_REQUEST_EXTENSIONS)
  private RequestExtensions requestExtensions;

  public RequestOverrides() { 
  }

  public RequestOverrides subjectDN(String subjectDN) {
    
    this.subjectDN = subjectDN;
    return this;
  }

   /**
   * Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c, country (Country)   - o, organization (Organization)   - ou, organizationalUnit (Organizational Unit)   - t, title (Title)    - cn, commonName (Common Name)   - sn, surName (Surname)   - gn, givenName (Given name)   - i, initials (Initials)   - street, streetAddress (Street Address)   - serialnumber (Serial number)   - l, locality (Locality)   - st, state (State)   - e, email, emailAddress (Email)   - dc, domainController (Domain Controller)   - uid (UID)   - generationQualifier, generation (Generation Qualifier)   - description (Description)   - role (Role)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - orgId, organizationIdentifier (Organization Identifier)   - uniqueIdentifier (Unique Identifier)   - name (Name)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - unstructuredaddress (Unstructed Address)   - unstructuredname (Unstructed Name)   - dn (DN Qualifier)   - nameatbirth (Name at Birth)   - countryofcitizenship (Country of Citizenship)   - countryofresidence (Country of Residence)   - gender (Gender)   - placeofbirth (Place of Birth)   - dateofbirth (Date of Birth)   - businesscategory (Business Category)   - telephonenumber (Telephone Number)   - scionisdasnumber (SCION ISD AS Number)   - tpmmanufacturer (TPM Manufacturer)   - tpmmodel (TPM Model)   - tpmversion (TPM Version) 
   * @return subjectDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c=US,l=Denver,o=Acme Ltd,cn=Sample", value = "Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c, country (Country)   - o, organization (Organization)   - ou, organizationalUnit (Organizational Unit)   - t, title (Title)    - cn, commonName (Common Name)   - sn, surName (Surname)   - gn, givenName (Given name)   - i, initials (Initials)   - street, streetAddress (Street Address)   - serialnumber (Serial number)   - l, locality (Locality)   - st, state (State)   - e, email, emailAddress (Email)   - dc, domainController (Domain Controller)   - uid (UID)   - generationQualifier, generation (Generation Qualifier)   - description (Description)   - role (Role)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - orgId, organizationIdentifier (Organization Identifier)   - uniqueIdentifier (Unique Identifier)   - name (Name)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - unstructuredaddress (Unstructed Address)   - unstructuredname (Unstructed Name)   - dn (DN Qualifier)   - nameatbirth (Name at Birth)   - countryofcitizenship (Country of Citizenship)   - countryofresidence (Country of Residence)   - gender (Gender)   - placeofbirth (Place of Birth)   - dateofbirth (Date of Birth)   - businesscategory (Business Category)   - telephonenumber (Telephone Number)   - scionisdasnumber (SCION ISD AS Number)   - tpmmanufacturer (TPM Manufacturer)   - tpmmodel (TPM Model)   - tpmversion (TPM Version) ")

  public String getSubjectDN() {
    return subjectDN;
  }


  public void setSubjectDN(String subjectDN) {
    this.subjectDN = subjectDN;
  }


  public RequestOverrides validity(Integer validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Optional certificate validity set if enabled on the Product 
   * minimum: 1
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Optional certificate validity set if enabled on the Product ")

  public Integer getValidity() {
    return validity;
  }


  public void setValidity(Integer validity) {
    this.validity = validity;
  }


  public RequestOverrides requestExtensions(RequestExtensions requestExtensions) {
    
    this.requestExtensions = requestExtensions;
    return this;
  }

   /**
   * Get requestExtensions
   * @return requestExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RequestExtensions getRequestExtensions() {
    return requestExtensions;
  }


  public void setRequestExtensions(RequestExtensions requestExtensions) {
    this.requestExtensions = requestExtensions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestOverrides requestOverrides = (RequestOverrides) o;
    return Objects.equals(this.subjectDN, requestOverrides.subjectDN) &&
        Objects.equals(this.validity, requestOverrides.validity) &&
        Objects.equals(this.requestExtensions, requestOverrides.requestExtensions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectDN, validity, requestExtensions);
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
    sb.append("class RequestOverrides {\n");
    sb.append("    subjectDN: ").append(toIndentedString(subjectDN)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    requestExtensions: ").append(toIndentedString(requestExtensions)).append("\n");
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
    openapiFields.add("subjectDN");
    openapiFields.add("validity");
    openapiFields.add("requestExtensions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestOverrides
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RequestOverrides.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestOverrides is not found in the empty JSON string", RequestOverrides.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestOverrides.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestOverrides` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("subjectDN") != null && !jsonObj.get("subjectDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subjectDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subjectDN").toString()));
      }
      // validate the optional field `requestExtensions`
      if (jsonObj.getAsJsonObject("requestExtensions") != null) {
        RequestExtensions.validateJsonObject(jsonObj.getAsJsonObject("requestExtensions"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestOverrides.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestOverrides' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestOverrides> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestOverrides.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestOverrides>() {
           @Override
           public void write(JsonWriter out, RequestOverrides value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestOverrides read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestOverrides given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestOverrides
  * @throws IOException if the JSON string is invalid with respect to RequestOverrides
  */
  public static RequestOverrides fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestOverrides.class);
  }

 /**
  * Convert an instance of RequestOverrides to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

