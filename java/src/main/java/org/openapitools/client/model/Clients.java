/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.5.10
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
import org.openapitools.client.model.Client;

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
 * Clients
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Clients {
  public static final String SERIALIZED_NAME_DRAW = "draw";
  @SerializedName(SERIALIZED_NAME_DRAW)
  private Integer draw;

  public static final String SERIALIZED_NAME_RECORDS_FILTERED = "recordsFiltered";
  @SerializedName(SERIALIZED_NAME_RECORDS_FILTERED)
  private Integer recordsFiltered;

  public static final String SERIALIZED_NAME_RECORDS_TOTAL = "recordsTotal";
  @SerializedName(SERIALIZED_NAME_RECORDS_TOTAL)
  private Integer recordsTotal;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Client> data = new ArrayList<>();

  public Clients() { 
  }

  
  public Clients(
     Integer draw, 
     Integer recordsFiltered, 
     Integer recordsTotal
  ) {
    this();
    this.draw = draw;
    this.recordsFiltered = recordsFiltered;
    this.recordsTotal = recordsTotal;
  }

   /**
   * Get draw
   * @return draw
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDraw() {
    return draw;
  }




   /**
   * Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data).
   * @return recordsFiltered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data).")

  public Integer getRecordsFiltered() {
    return recordsFiltered;
  }




   /**
   * Total records, before filtering (i.e. the total number of records in the database)
   * @return recordsTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total records, before filtering (i.e. the total number of records in the database)")

  public Integer getRecordsTotal() {
    return recordsTotal;
  }




  public Clients data(List<Client> data) {
    
    this.data = data;
    return this;
  }

  public Clients addDataItem(Client dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Client> getData() {
    return data;
  }


  public void setData(List<Client> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clients clients = (Clients) o;
    return Objects.equals(this.draw, clients.draw) &&
        Objects.equals(this.recordsFiltered, clients.recordsFiltered) &&
        Objects.equals(this.recordsTotal, clients.recordsTotal) &&
        Objects.equals(this.data, clients.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(draw, recordsFiltered, recordsTotal, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clients {\n");
    sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
    sb.append("    recordsFiltered: ").append(toIndentedString(recordsFiltered)).append("\n");
    sb.append("    recordsTotal: ").append(toIndentedString(recordsTotal)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("draw");
    openapiFields.add("recordsFiltered");
    openapiFields.add("recordsTotal");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("draw");
    openapiRequiredFields.add("recordsFiltered");
    openapiRequiredFields.add("recordsTotal");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Clients
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Clients.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Clients is not found in the empty JSON string", Clients.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Clients.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Clients` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Clients.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
      if (jsonArraydata != null) {
        // ensure the json data is an array
        if (!jsonObj.get("data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
        }

        // validate the optional field `data` (array)
        for (int i = 0; i < jsonArraydata.size(); i++) {
          Client.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Clients.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Clients' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Clients> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Clients.class));

       return (TypeAdapter<T>) new TypeAdapter<Clients>() {
           @Override
           public void write(JsonWriter out, Clients value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Clients read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Clients given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Clients
  * @throws IOException if the JSON string is invalid with respect to Clients
  */
  public static Clients fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Clients.class);
  }

 /**
  * Convert an instance of Clients to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

