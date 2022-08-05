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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Status of the certificate Order Task
 */
@JsonAdapter(JobStatus.Adapter.class)
public enum JobStatus {
  
  WAITING("waiting"),
  
  PENDING("pending"),
  
  PROCESSING("processing"),
  
  SUCCESS("success"),
  
  FAILED("failed"),
  
  SCHEDULE_REQUEST("schedule_request"),
  
  SCHEDULE_RESPONSE("schedule_response"),
  
  RETRY("retry"),
  
  CONNECTION_OR_CHANNEL_CLOSED("connection_or_channel_closed"),
  
  UNKNOWN("unknown");

  private String value;

  JobStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JobStatus fromValue(String value) {
    for (JobStatus b : JobStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<JobStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final JobStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JobStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JobStatus.fromValue(value);
    }
  }
}

