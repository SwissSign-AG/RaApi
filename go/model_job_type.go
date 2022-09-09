/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.209
Contact: opensource@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// JobType Certificate Order Task Type
type JobType string

// List of JobType
const (
	SUBMIT_CERTIFICATE_ORDER_JOB JobType = "SubmitCertificateOrderJob"
	CERTIFICATE_RENEWAL_VALIDATION_JOB JobType = "CertificateRenewalValidationJob"
	KEY_VALIDATION_JOB JobType = "KeyValidationJob"
	PRE_VALIDATION_PARENT_JOB JobType = "PreValidationParentJob"
	GENERATE_TBS_JOB JobType = "GenerateTBSJob"
	POLICY_VALIDATION_JOB JobType = "PolicyValidationJob"
	CAA_CHECK_VALIDATION_JOB JobType = "CAACheckValidationJob"
	DOMAIN_OWNER_CHECK_VALIDATION_JOB JobType = "DomainOwnerCheckValidationJob"
	END_USER_EMAIL_VALIDATION_JOB JobType = "EndUserEmailValidationJob"
	PRE_LINTING_CERTIFICATE_JOB JobType = "PreLintingCertificateJob"
	PRE_ISSUE_CERTIFICATE_PARENT_JOB JobType = "PreIssueCertificateParentJob"
	CT_LOG_PRECERT_PUBLICATION_JOB JobType = "CTLogPrecertPublicationJob"
	ISSUE_CERTIFICATE_JOB JobType = "IssueCertificateJob"
	POST_ISSUE_CERTIFICATE_PARENT_JOB JobType = "PostIssueCertificateParentJob"
	FINALIZE_ISSUE_CERTIFICATE_PARENT_JOB JobType = "FinalizeIssueCertificateParentJob"
	POST_LINTING_CERTIFICATE_JOB JobType = "PostLintingCertificateJob"
	POST_PUBLISH_CERTIFICATE_JOB JobType = "PostPublishCertificateJob"
	CT_LOG_PUBLICATION_JOB JobType = "CTLogPublicationJob"
	CERTIFICATE_ORDER_AUTHORIZATION_JOB JobType = "CertificateOrderAuthorizationJob"
	NOTIFY_ISSUED_CERTIFICATE_JOB JobType = "NotifyIssuedCertificateJob"
	NOTIFY_RENEWAL_CERTIFICATE_JOB JobType = "NotifyRenewalCertificateJob"
	UPDATE_RENEWAL_CERTIFICATE_JOB JobType = "UpdateRenewalCertificateJob"
	REVOKE_RENEWED_CERTIFICATE_JOB JobType = "RevokeRenewedCertificateJob"
	NOTIFY_RENEWAL_P12_CERTIFICATE_JOB JobType = "NotifyRenewalP12CertificateJob"
	NOTIFY_RENEWAL_HSM_CERTIFICATE_JOB JobType = "NotifyRenewalHsmCertificateJob"
	SET_P12_PIN_JOB JobType = "SetP12PinJob"
)

// All allowed values of JobType enum
var AllowedJobTypeEnumValues = []JobType{
	"SubmitCertificateOrderJob",
	"CertificateRenewalValidationJob",
	"KeyValidationJob",
	"PreValidationParentJob",
	"GenerateTBSJob",
	"PolicyValidationJob",
	"CAACheckValidationJob",
	"DomainOwnerCheckValidationJob",
	"EndUserEmailValidationJob",
	"PreLintingCertificateJob",
	"PreIssueCertificateParentJob",
	"CTLogPrecertPublicationJob",
	"IssueCertificateJob",
	"PostIssueCertificateParentJob",
	"FinalizeIssueCertificateParentJob",
	"PostLintingCertificateJob",
	"PostPublishCertificateJob",
	"CTLogPublicationJob",
	"CertificateOrderAuthorizationJob",
	"NotifyIssuedCertificateJob",
	"NotifyRenewalCertificateJob",
	"UpdateRenewalCertificateJob",
	"RevokeRenewedCertificateJob",
	"NotifyRenewalP12CertificateJob",
	"NotifyRenewalHsmCertificateJob",
	"SetP12PinJob",
}

func (v *JobType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := JobType(value)
	for _, existing := range AllowedJobTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid JobType", value)
}

// NewJobTypeFromValue returns a pointer to a valid JobType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewJobTypeFromValue(v string) (*JobType, error) {
	ev := JobType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for JobType: valid values are %v", v, AllowedJobTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v JobType) IsValid() bool {
	for _, existing := range AllowedJobTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to JobType value
func (v JobType) Ptr() *JobType {
	return &v
}

type NullableJobType struct {
	value *JobType
	isSet bool
}

func (v NullableJobType) Get() *JobType {
	return v.value
}

func (v *NullableJobType) Set(val *JobType) {
	v.value = val
	v.isSet = true
}

func (v NullableJobType) IsSet() bool {
	return v.isSet
}

func (v *NullableJobType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJobType(val *JobType) *NullableJobType {
	return &NullableJobType{value: val, isSet: true}
}

func (v NullableJobType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJobType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

