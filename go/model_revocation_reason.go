/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.207
Contact: opensource@swisssign.com
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
	UNUSED RevocationReason = "unused"
	KEY_COMPROMISE RevocationReason = "keyCompromise"
	C_A_COMPROMISE RevocationReason = "cACompromise"
	AFFILIATION_CHANGED RevocationReason = "affiliationChanged"
	SUPERSEDED RevocationReason = "superseded"
	CESSATION_OF_OPERATION RevocationReason = "cessationOfOperation"
	CERTIFICATE_HOLD RevocationReason = "certificateHold"
	REMOVE_FROM_CRL RevocationReason = "removeFromCRL"
	PRIVILEGE_WITHDRAWN RevocationReason = "privilegeWithdrawn"
	A_A_COMPROMISE RevocationReason = "aACompromise"
)

// All allowed values of RevocationReason enum
var AllowedRevocationReasonEnumValues = []RevocationReason{
	"unused",
	"keyCompromise",
	"cACompromise",
	"affiliationChanged",
	"superseded",
	"cessationOfOperation",
	"certificateHold",
	"removeFromCRL",
	"privilegeWithdrawn",
	"aACompromise",
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

