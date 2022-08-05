/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.0
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
	ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB JobType = "ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB"
	ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB JobType = "ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB"
	ISSUE_KEY_VALIDATION_JOB JobType = "ISSUE_KEY_VALIDATION_JOB"
	ISSUE_PRE_VALIDATION_JOB JobType = "ISSUE_PRE_VALIDATION_JOB"
	ISSUE_GENERATE_TBS_JOB JobType = "ISSUE_GENERATE_TBS_JOB"
	ISSUE_POLICY_VALIDATION_JOB JobType = "ISSUE_POLICY_VALIDATION_JOB"
	ISSUE_CAA_CHECK_VALIDATION_JOB JobType = "ISSUE_CAA_CHECK_VALIDATION_JOB"
	ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB JobType = "ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB"
	ISSUE_END_USER_EMAIL_VALIDATION_JOB JobType = "ISSUE_END_USER_EMAIL_VALIDATION_JOB"
	ISSUE_PRE_LINTING_JOB JobType = "ISSUE_PRE_LINTING_JOB"
	ISSUE_PRE_ISSUE_CERTIFICATE_JOB JobType = "ISSUE_PRE_ISSUE_CERTIFICATE_JOB"
	ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB JobType = "ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB"
	ISSUE_ISSUE_CERTIFICATE_JOB JobType = "ISSUE_ISSUE_CERTIFICATE_JOB"
	ISSUE_POST_ISSUE_CERTIFICATE_JOB JobType = "ISSUE_POST_ISSUE_CERTIFICATE_JOB"
	ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB JobType = "ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB"
	ISSUE_POST_LINTING_CERTIFICATE_JOB JobType = "ISSUE_POST_LINTING_CERTIFICATE_JOB"
	PUBLISH_POST_CERTIFICATE_JOB JobType = "PUBLISH_POST_CERTIFICATE_JOB"
	ISSUE_CT_LOG_PUBLICATION_JOB JobType = "ISSUE_CT_LOG_PUBLICATION_JOB"
	ISSUE_AUTHORIZATION_JOB JobType = "ISSUE_AUTHORIZATION_JOB"
	ISSUE_NOTIFY_ISSUED_JOB JobType = "ISSUE_NOTIFY_ISSUED_JOB"
	ISSUE_NOTIFY_RENEWAL_JOB JobType = "ISSUE_NOTIFY_RENEWAL_JOB"
	ISSUE_UPDATE_RENEWAL_JOB JobType = "ISSUE_UPDATE_RENEWAL_JOB"
	ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB JobType = "ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB"
	ISSUE_NOTIFY_P12_RETRIEVAL_JOB JobType = "ISSUE_NOTIFY_P12_RETRIEVAL_JOB"
	ISSUE_NOTIFY_HSM_RETRIEVAL_JOB JobType = "ISSUE_NOTIFY_HSM_RETRIEVAL_JOB"
	ISSUE_SET_P12_PIN_JOB JobType = "ISSUE_SET_P12_PIN_JOB"
)

// All allowed values of JobType enum
var AllowedJobTypeEnumValues = []JobType{
	"ISSUE_SUBMIT_CERTIFICATE_ORDER_JOB",
	"ISSUE_CERTIFICATE_RENEWAL_VALIDATION_JOB",
	"ISSUE_KEY_VALIDATION_JOB",
	"ISSUE_PRE_VALIDATION_JOB",
	"ISSUE_GENERATE_TBS_JOB",
	"ISSUE_POLICY_VALIDATION_JOB",
	"ISSUE_CAA_CHECK_VALIDATION_JOB",
	"ISSUE_DOMAIN_OWNER_CHECK_VALIDATION_JOB",
	"ISSUE_END_USER_EMAIL_VALIDATION_JOB",
	"ISSUE_PRE_LINTING_JOB",
	"ISSUE_PRE_ISSUE_CERTIFICATE_JOB",
	"ISSUE_CT_LOG_PRE_CERT_PUBLICATION_JOB",
	"ISSUE_ISSUE_CERTIFICATE_JOB",
	"ISSUE_POST_ISSUE_CERTIFICATE_JOB",
	"ISSUE_FINALIZE_ISSUE_CERTIFICATE_JOB",
	"ISSUE_POST_LINTING_CERTIFICATE_JOB",
	"PUBLISH_POST_CERTIFICATE_JOB",
	"ISSUE_CT_LOG_PUBLICATION_JOB",
	"ISSUE_AUTHORIZATION_JOB",
	"ISSUE_NOTIFY_ISSUED_JOB",
	"ISSUE_NOTIFY_RENEWAL_JOB",
	"ISSUE_UPDATE_RENEWAL_JOB",
	"ISSUE_REVOKE_RENEWED_CERTIFICATE_JOB",
	"ISSUE_NOTIFY_P12_RETRIEVAL_JOB",
	"ISSUE_NOTIFY_HSM_RETRIEVAL_JOB",
	"ISSUE_SET_P12_PIN_JOB",
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

