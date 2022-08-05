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
)

// RevocationRequest struct for RevocationRequest
type RevocationRequest struct {
	// Certificate serial number (Big Integer HEX encoded)
	SerialNumber string `json:"serialNumber"`
	// Revocation reason
	RevocationReason string `json:"revocationReason"`
	// Certificate issuer distinguished name
	IssuerName string `json:"issuerName"`
}

// NewRevocationRequest instantiates a new RevocationRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRevocationRequest(serialNumber string, revocationReason string, issuerName string) *RevocationRequest {
	this := RevocationRequest{}
	this.SerialNumber = serialNumber
	this.RevocationReason = revocationReason
	this.IssuerName = issuerName
	return &this
}

// NewRevocationRequestWithDefaults instantiates a new RevocationRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRevocationRequestWithDefaults() *RevocationRequest {
	this := RevocationRequest{}
	return &this
}

// GetSerialNumber returns the SerialNumber field value
func (o *RevocationRequest) GetSerialNumber() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SerialNumber
}

// GetSerialNumberOk returns a tuple with the SerialNumber field value
// and a boolean to check if the value has been set.
func (o *RevocationRequest) GetSerialNumberOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SerialNumber, true
}

// SetSerialNumber sets field value
func (o *RevocationRequest) SetSerialNumber(v string) {
	o.SerialNumber = v
}

// GetRevocationReason returns the RevocationReason field value
func (o *RevocationRequest) GetRevocationReason() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RevocationReason
}

// GetRevocationReasonOk returns a tuple with the RevocationReason field value
// and a boolean to check if the value has been set.
func (o *RevocationRequest) GetRevocationReasonOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RevocationReason, true
}

// SetRevocationReason sets field value
func (o *RevocationRequest) SetRevocationReason(v string) {
	o.RevocationReason = v
}

// GetIssuerName returns the IssuerName field value
func (o *RevocationRequest) GetIssuerName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.IssuerName
}

// GetIssuerNameOk returns a tuple with the IssuerName field value
// and a boolean to check if the value has been set.
func (o *RevocationRequest) GetIssuerNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.IssuerName, true
}

// SetIssuerName sets field value
func (o *RevocationRequest) SetIssuerName(v string) {
	o.IssuerName = v
}

func (o RevocationRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["serialNumber"] = o.SerialNumber
	}
	if true {
		toSerialize["revocationReason"] = o.RevocationReason
	}
	if true {
		toSerialize["issuerName"] = o.IssuerName
	}
	return json.Marshal(toSerialize)
}

type NullableRevocationRequest struct {
	value *RevocationRequest
	isSet bool
}

func (v NullableRevocationRequest) Get() *RevocationRequest {
	return v.value
}

func (v *NullableRevocationRequest) Set(val *RevocationRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableRevocationRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableRevocationRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRevocationRequest(val *RevocationRequest) *NullableRevocationRequest {
	return &NullableRevocationRequest{value: val, isSet: true}
}

func (v NullableRevocationRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRevocationRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


