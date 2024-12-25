/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.5.17
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// RevocationReason Revocation reason
type RevocationReason string

// List of RevocationReason
const (
	UNUSED RevocationReason = "UNUSED"
	KEY_COMPROMISE RevocationReason = "KEY_COMPROMISE"
	C_A_COMPROMISE RevocationReason = "C_A_COMPROMISE"
	AFFILIATION_CHANGED RevocationReason = "AFFILIATION_CHANGED"
	SUPERSEDED RevocationReason = "SUPERSEDED"
	CESSATION_OF_OPERATION RevocationReason = "CESSATION_OF_OPERATION"
	CERTIFICATE_HOLD RevocationReason = "CERTIFICATE_HOLD"
	REMOVE_FROM_CRL RevocationReason = "REMOVE_FROM_CRL"
	PRIVILEGE_WITHDRAWN RevocationReason = "PRIVILEGE_WITHDRAWN"
	A_A_COMPROMISE RevocationReason = "A_A_COMPROMISE"
)

// All allowed values of RevocationReason enum
var AllowedRevocationReasonEnumValues = []RevocationReason{
	"UNUSED",
	"KEY_COMPROMISE",
	"C_A_COMPROMISE",
	"AFFILIATION_CHANGED",
	"SUPERSEDED",
	"CESSATION_OF_OPERATION",
	"CERTIFICATE_HOLD",
	"REMOVE_FROM_CRL",
	"PRIVILEGE_WITHDRAWN",
	"A_A_COMPROMISE",
}

func (v *RevocationReason) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := RevocationReason(value)
	for _, existing := range AllowedRevocationReasonEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid RevocationReason", value)
}

// NewRevocationReasonFromValue returns a pointer to a valid RevocationReason
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewRevocationReasonFromValue(v string) (*RevocationReason, error) {
	ev := RevocationReason(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for RevocationReason: valid values are %v", v, AllowedRevocationReasonEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v RevocationReason) IsValid() bool {
	for _, existing := range AllowedRevocationReasonEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to RevocationReason value
func (v RevocationReason) Ptr() *RevocationReason {
	return &v
}

type NullableRevocationReason struct {
	value *RevocationReason
	isSet bool
}

func (v NullableRevocationReason) Get() *RevocationReason {
	return v.value
}

func (v *NullableRevocationReason) Set(val *RevocationReason) {
	v.value = val
	v.isSet = true
}

func (v NullableRevocationReason) IsSet() bool {
	return v.isSet
}

func (v *NullableRevocationReason) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRevocationReason(val *RevocationReason) *NullableRevocationReason {
	return &NullableRevocationReason{value: val, isSet: true}
}

func (v NullableRevocationReason) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRevocationReason) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

