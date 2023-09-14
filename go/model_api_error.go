/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.1
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// APIError struct for APIError
type APIError struct {
	// end user error UUID reference
	Uuid string `json:"uuid"`
	// Error code
	ErrorCode string `json:"errorCode"`
	ErrorMessages []string `json:"errorMessages"`
}

// NewAPIError instantiates a new APIError object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAPIError(uuid string, errorCode string, errorMessages []string) *APIError {
	this := APIError{}
	this.Uuid = uuid
	this.ErrorCode = errorCode
	this.ErrorMessages = errorMessages
	return &this
}

// NewAPIErrorWithDefaults instantiates a new APIError object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAPIErrorWithDefaults() *APIError {
	this := APIError{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *APIError) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *APIError) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *APIError) SetUuid(v string) {
	o.Uuid = v
}

// GetErrorCode returns the ErrorCode field value
func (o *APIError) GetErrorCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ErrorCode
}

// GetErrorCodeOk returns a tuple with the ErrorCode field value
// and a boolean to check if the value has been set.
func (o *APIError) GetErrorCodeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ErrorCode, true
}

// SetErrorCode sets field value
func (o *APIError) SetErrorCode(v string) {
	o.ErrorCode = v
}

// GetErrorMessages returns the ErrorMessages field value
func (o *APIError) GetErrorMessages() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.ErrorMessages
}

// GetErrorMessagesOk returns a tuple with the ErrorMessages field value
// and a boolean to check if the value has been set.
func (o *APIError) GetErrorMessagesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ErrorMessages, true
}

// SetErrorMessages sets field value
func (o *APIError) SetErrorMessages(v []string) {
	o.ErrorMessages = v
}

func (o APIError) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["uuid"] = o.Uuid
	}
	if true {
		toSerialize["errorCode"] = o.ErrorCode
	}
	if true {
		toSerialize["errorMessages"] = o.ErrorMessages
	}
	return json.Marshal(toSerialize)
}

type NullableAPIError struct {
	value *APIError
	isSet bool
}

func (v NullableAPIError) Get() *APIError {
	return v.value
}

func (v *NullableAPIError) Set(val *APIError) {
	v.value = val
	v.isSet = true
}

func (v NullableAPIError) IsSet() bool {
	return v.isSet
}

func (v *NullableAPIError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAPIError(val *APIError) *NullableAPIError {
	return &NullableAPIError{value: val, isSet: true}
}

func (v NullableAPIError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAPIError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


