/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.0.214
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
import java.time.OffsetDateTime;
import org.openapitools.client.model.JobStatus;
import org.openapitools.client.model.JobType;
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
 * CertificateOrderTask
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CertificateOrderTask {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_TIME_SCHEDULED = "timeScheduled";
  @SerializedName(SERIALIZED_NAME_TIME_SCHEDULED)
  private OffsetDateTime timeScheduled;

  public static final String SERIALIZED_NAME_TIME_STARTED = "timeStarted";
  @SerializedName(SERIALIZED_NAME_TIME_STARTED)
  private OffsetDateTime timeStarted;

  public static final String SERIALIZED_NAME_TIME_FINISHED = "timeFinished";
  @SerializedName(SERIALIZED_NAME_TIME_FINISHED)
  private OffsetDateTime timeFinished;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private JobStatus status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private JobType type;

  public static final String SERIALIZED_NAME_NUMBER_OF_EXECUTIONS = "numberOfExecutions";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_EXECUTIONS)
  private Integer numberOfExecutions;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public CertificateOrderTask() { 
  }

  
  public CertificateOrderTask(
     String uuid, 
     OffsetDateTime createdOn, 
     OffsetDateTime timeScheduled, 
     OffsetDateTime timeStarted, 
     OffsetDateTime timeFinished, 
     Integer numberOfExecutions, 
     String response, 
     String error
  ) {
    this();
    this.uuid = uuid;
    this.createdOn = createdOn;
    this.timeScheduled = timeScheduled;
    this.timeStarted = timeStarted;
    this.timeFinished = timeFinished;
    this.numberOfExecutions = numberOfExecutions;
    this.response = response;
    this.error = error;
  }

   /**
   * Certificate Order Task reference
   * @return uuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "job-f0725b50-c533-4802-a844-de57bfb7a80e", required = true, value = "Certificate Order Task reference")

  public String getUuid() {
    return uuid;
  }




   /**
   * Certificate Order creation date time
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", value = "Certificate Order creation date time")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }




   /**
   * Scheduled date time
   * @return timeScheduled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", required = true, value = "Scheduled date time")

  public OffsetDateTime getTimeScheduled() {
    return timeScheduled;
  }




   /**
   * Started date time
   * @return timeStarted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", value = "Started date time")

  public OffsetDateTime getTimeStarted() {
    return timeStarted;
  }




   /**
   * Finished date time
   * @return timeFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-02-12T05:10:50.520Z", value = "Finished date time")

  public OffsetDateTime getTimeFinished() {
    return timeFinished;
  }




  public CertificateOrderTask status(JobStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobStatus getStatus() {
    return status;
  }


  public void setStatus(JobStatus status) {
    this.status = status;
  }


  public CertificateOrderTask type(JobType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JobType getType() {
    return type;
  }


  public void setType(JobType type) {
    this.type = type;
  }


   /**
   * Number of executions
   * @return numberOfExecutions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Number of executions")

  public Integer getNumberOfExecutions() {
    return numberOfExecutions;
  }




   /**
   * Response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Processed successfully", value = "Response")

  public String getResponse() {
    return response;
  }




   /**
   * Error message
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Error processing xyz ...", value = "Error message")

  public String getError() {
    return error;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateOrderTask certificateOrderTask = (CertificateOrderTask) o;
    return Objects.equals(this.uuid, certificateOrderTask.uuid) &&
        Objects.equals(this.createdOn, certificateOrderTask.createdOn) &&
        Objects.equals(this.timeScheduled, certificateOrderTask.timeScheduled) &&
        Objects.equals(this.timeStarted, certificateOrderTask.timeStarted) &&
        Objects.equals(this.timeFinished, certificateOrderTask.timeFinished) &&
        Objects.equals(this.status, certificateOrderTask.status) &&
        Objects.equals(this.type, certificateOrderTask.type) &&
        Objects.equals(this.numberOfExecutions, certificateOrderTask.numberOfExecutions) &&
        Objects.equals(this.response, certificateOrderTask.response) &&
        Objects.equals(this.error, certificateOrderTask.error);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, createdOn, timeScheduled, timeStarted, timeFinished, status, type, numberOfExecutions, response, error);
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
    sb.append("class CertificateOrderTask {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    timeScheduled: ").append(toIndentedString(timeScheduled)).append("\n");
    sb.append("    timeStarted: ").append(toIndentedString(timeStarted)).append("\n");
    sb.append("    timeFinished: ").append(toIndentedString(timeFinished)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    numberOfExecutions: ").append(toIndentedString(numberOfExecutions)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("timeScheduled");
    openapiFields.add("timeStarted");
    openapiFields.add("timeFinished");
    openapiFields.add("status");
    openapiFields.add("type");
    openapiFields.add("numberOfExecutions");
    openapiFields.add("response");
    openapiFields.add("error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("uuid");
    openapiRequiredFields.add("timeScheduled");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("numberOfExecutions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CertificateOrderTask
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CertificateOrderTask.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CertificateOrderTask is not found in the empty JSON string", CertificateOrderTask.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CertificateOrderTask.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CertificateOrderTask` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CertificateOrderTask.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if (jsonObj.get("response") != null && !jsonObj.get("response").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response").toString()));
      }
      if (jsonObj.get("error") != null && !jsonObj.get("error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CertificateOrderTask.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CertificateOrderTask' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CertificateOrderTask> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CertificateOrderTask.class));

       return (TypeAdapter<T>) new TypeAdapter<CertificateOrderTask>() {
           @Override
           public void write(JsonWriter out, CertificateOrderTask value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CertificateOrderTask read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CertificateOrderTask given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CertificateOrderTask
  * @throws IOException if the JSON string is invalid with respect to CertificateOrderTask
  */
  public static CertificateOrderTask fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CertificateOrderTask.class);
  }

 /**
  * Convert an instance of CertificateOrderTask to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

