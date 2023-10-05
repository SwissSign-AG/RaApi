/*
 * SwissSign RA REST API
 * See https://github.com/SwissSign-AG/RaApi/README.md
 *
 * The version of the OpenAPI document: 2.3.4
 * Contact: ssc@swisssign.com
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
 * Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE_AUTHORIZATION: send notification for certificate issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE_AUTHORIZATION_ACCEPTED: send notification for accepted certificate issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE_AUTHORIZATION_REJECTED: send notification for rejected certificate issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template. 
 */
@JsonAdapter(AdditionalRecipientType.Adapter.class)
public enum AdditionalRecipientType {
  
  DNS_OWNER_CHECK_EMAIL_LINK("DNS_OWNER_CHECK_EMAIL_LINK"),
  
  DNS_CAB("DNS_CAB"),
  
  ISSUANCE("ISSUANCE"),
  
  REVOCATION("REVOCATION"),
  
  RENEWAL("RENEWAL"),
  
  RECOVERY("RECOVERY"),
  
  ISSUANCE_AUTHORIZATION("ISSUANCE_AUTHORIZATION"),
  
  ISSUANCE_AUTHORIZATION_ACCEPTED("ISSUANCE_AUTHORIZATION_ACCEPTED"),
  
  ISSUANCE_AUTHORIZATION_REJECTED("ISSUANCE_AUTHORIZATION_REJECTED");

  private String value;

  AdditionalRecipientType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdditionalRecipientType fromValue(String value) {
    for (AdditionalRecipientType b : AdditionalRecipientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AdditionalRecipientType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdditionalRecipientType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdditionalRecipientType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdditionalRecipientType.fromValue(value);
    }
  }
}

