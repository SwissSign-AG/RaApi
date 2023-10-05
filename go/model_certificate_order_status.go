/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.4
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// CertificateOrderStatus Status of the certificate Order
type CertificateOrderStatus string

// List of CertificateOrderStatus
const (
	NEW CertificateOrderStatus = "NEW"
	KEY_VALIDATION CertificateOrderStatus = "KEY_VALIDATION"
	PRE_VALIDATION CertificateOrderStatus = "PRE_VALIDATION"
	GENERATE_TBS CertificateOrderStatus = "GENERATE_TBS"
	PENDING_AUTH CertificateOrderStatus = "PENDING_AUTH"
	PRE_ISSUE CertificateOrderStatus = "PRE_ISSUE"
	ISSUE CertificateOrderStatus = "ISSUE"
	POST_VALIDATION CertificateOrderStatus = "POST_VALIDATION"
	FINALIZE_ISSUANCE CertificateOrderStatus = "FINALIZE_ISSUANCE"
	ISSUED CertificateOrderStatus = "ISSUED"
	REVOKED CertificateOrderStatus = "REVOKED"
	FAILED CertificateOrderStatus = "FAILED"
	REJECTED CertificateOrderStatus = "REJECTED"
	PENDING_CSR_RENEWAL CertificateOrderStatus = "PENDING_CSR_RENEWAL"
	UNKNOWN CertificateOrderStatus = "UNKNOWN"
)

// All allowed values of CertificateOrderStatus enum
var AllowedCertificateOrderStatusEnumValues = []CertificateOrderStatus{
	"NEW",
	"KEY_VALIDATION",
	"PRE_VALIDATION",
	"GENERATE_TBS",
	"PENDING_AUTH",
	"PRE_ISSUE",
	"ISSUE",
	"POST_VALIDATION",
	"FINALIZE_ISSUANCE",
	"ISSUED",
	"REVOKED",
	"FAILED",
	"REJECTED",
	"PENDING_CSR_RENEWAL",
	"UNKNOWN",
}

func (v *CertificateOrderStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := CertificateOrderStatus(value)
	for _, existing := range AllowedCertificateOrderStatusEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid CertificateOrderStatus", value)
}

// NewCertificateOrderStatusFromValue returns a pointer to a valid CertificateOrderStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewCertificateOrderStatusFromValue(v string) (*CertificateOrderStatus, error) {
	ev := CertificateOrderStatus(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for CertificateOrderStatus: valid values are %v", v, AllowedCertificateOrderStatusEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v CertificateOrderStatus) IsValid() bool {
	for _, existing := range AllowedCertificateOrderStatusEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to CertificateOrderStatus value
func (v CertificateOrderStatus) Ptr() *CertificateOrderStatus {
	return &v
}

type NullableCertificateOrderStatus struct {
	value *CertificateOrderStatus
	isSet bool
}

func (v NullableCertificateOrderStatus) Get() *CertificateOrderStatus {
	return v.value
}

func (v *NullableCertificateOrderStatus) Set(val *CertificateOrderStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableCertificateOrderStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableCertificateOrderStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCertificateOrderStatus(val *CertificateOrderStatus) *NullableCertificateOrderStatus {
	return &NullableCertificateOrderStatus{value: val, isSet: true}
}

func (v NullableCertificateOrderStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCertificateOrderStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

