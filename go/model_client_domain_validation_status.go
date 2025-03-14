/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 3.4.4
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// ClientDomainValidationStatus Status of the domain pre validation
type ClientDomainValidationStatus string

// List of ClientDomainValidationStatus
const (
	PENDING ClientDomainValidationStatus = "PENDING"
	EXPIRED ClientDomainValidationStatus = "EXPIRED"
	VALID ClientDomainValidationStatus = "VALID"
	NOT_VALIDATED ClientDomainValidationStatus = "NOT_VALIDATED"
)

// All allowed values of ClientDomainValidationStatus enum
var AllowedClientDomainValidationStatusEnumValues = []ClientDomainValidationStatus{
	"PENDING",
	"EXPIRED",
	"VALID",
	"NOT_VALIDATED",
}

func (v *ClientDomainValidationStatus) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := ClientDomainValidationStatus(value)
	for _, existing := range AllowedClientDomainValidationStatusEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid ClientDomainValidationStatus", value)
}

// NewClientDomainValidationStatusFromValue returns a pointer to a valid ClientDomainValidationStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewClientDomainValidationStatusFromValue(v string) (*ClientDomainValidationStatus, error) {
	ev := ClientDomainValidationStatus(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for ClientDomainValidationStatus: valid values are %v", v, AllowedClientDomainValidationStatusEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v ClientDomainValidationStatus) IsValid() bool {
	for _, existing := range AllowedClientDomainValidationStatusEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to ClientDomainValidationStatus value
func (v ClientDomainValidationStatus) Ptr() *ClientDomainValidationStatus {
	return &v
}

type NullableClientDomainValidationStatus struct {
	value *ClientDomainValidationStatus
	isSet bool
}

func (v NullableClientDomainValidationStatus) Get() *ClientDomainValidationStatus {
	return v.value
}

func (v *NullableClientDomainValidationStatus) Set(val *ClientDomainValidationStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableClientDomainValidationStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableClientDomainValidationStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClientDomainValidationStatus(val *ClientDomainValidationStatus) *NullableClientDomainValidationStatus {
	return &NullableClientDomainValidationStatus{value: val, isSet: true}
}

func (v NullableClientDomainValidationStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClientDomainValidationStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

