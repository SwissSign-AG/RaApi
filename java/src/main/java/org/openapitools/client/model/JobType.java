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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Certificate Order Task Type
 */
@JsonAdapter(JobType.Adapter.class)
public enum JobType {
  
  SUBMITCERTIFICATEORDERJOB("SubmitCertificateOrderJob"),
  
  CERTIFICATERENEWALVALIDATIONJOB("CertificateRenewalValidationJob"),
  
  KEYVALIDATIONJOB("KeyValidationJob"),
  
  PREVALIDATIONPARENTJOB("PreValidationParentJob"),
  
  GENERATETBSJOB("GenerateTBSJob"),
  
  POLICYVALIDATIONJOB("PolicyValidationJob"),
  
  CAACHECKVALIDATIONJOB("CAACheckValidationJob"),
  
  DOMAINOWNERCHECKVALIDATIONJOB("DomainOwnerCheckValidationJob"),
  
  ENDUSEREMAILVALIDATIONJOB("EndUserEmailValidationJob"),
  
  PRELINTINGCERTIFICATEJOB("PreLintingCertificateJob"),
  
  PREISSUECERTIFICATEPARENTJOB("PreIssueCertificateParentJob"),
  
  CTLOGPRECERTPUBLICATIONJOB("CTLogPrecertPublicationJob"),
  
  ISSUECERTIFICATEJOB("IssueCertificateJob"),
  
  POSTISSUECERTIFICATEPARENTJOB("PostIssueCertificateParentJob"),
  
  FINALIZEISSUECERTIFICATEPARENTJOB("FinalizeIssueCertificateParentJob"),
  
  POSTLINTINGCERTIFICATEJOB("PostLintingCertificateJob"),
  
  POSTPUBLISHCERTIFICATEJOB("PostPublishCertificateJob"),
  
  CTLOGPUBLICATIONJOB("CTLogPublicationJob"),
  
  CERTIFICATEORDERAUTHORIZATIONJOB("CertificateOrderAuthorizationJob"),
  
  NOTIFYISSUEDCERTIFICATEJOB("NotifyIssuedCertificateJob"),
  
  NOTIFYRENEWALCERTIFICATEJOB("NotifyRenewalCertificateJob"),
  
  UPDATERENEWALCERTIFICATEJOB("UpdateRenewalCertificateJob"),
  
  REVOKERENEWEDCERTIFICATEJOB("RevokeRenewedCertificateJob"),
  
  NOTIFYRENEWALP12CERTIFICATEJOB("NotifyRenewalP12CertificateJob"),
  
  NOTIFYRENEWALHSMCERTIFICATEJOB("NotifyRenewalHsmCertificateJob"),
  
  SETP12PINJOB("SetP12PinJob");

  private String value;

  JobType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static JobType fromValue(String value) {
    for (JobType b : JobType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<JobType> {
    @Override
    public void write(final JsonWriter jsonWriter, final JobType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public JobType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return JobType.fromValue(value);
    }
  }
}

