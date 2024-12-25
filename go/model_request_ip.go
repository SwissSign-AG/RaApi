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
)

// RequestIP struct for RequestIP
type RequestIP struct {
	Values []string `json:"values"`
}

// NewRequestIP instantiates a new RequestIP object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestIP(values []string) *RequestIP {
	this := RequestIP{}
	this.Values = values
	return &this
}

// NewRequestIPWithDefaults instantiates a new RequestIP object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestIPWithDefaults() *RequestIP {
	this := RequestIP{}
	return &this
}

// GetValues returns the Values field value
func (o *RequestIP) GetValues() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Values
}

// GetValuesOk returns a tuple with the Values field value
// and a boolean to check if the value has been set.
func (o *RequestIP) GetValuesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Values, true
}

// SetValues sets field value
func (o *RequestIP) SetValues(v []string) {
	o.Values = v
}

func (o RequestIP) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["values"] = o.Values
	}
	return json.Marshal(toSerialize)
}

type NullableRequestIP struct {
	value *RequestIP
	isSet bool
}

func (v NullableRequestIP) Get() *RequestIP {
	return v.value
}

func (v *NullableRequestIP) Set(val *RequestIP) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestIP) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestIP) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestIP(val *RequestIP) *NullableRequestIP {
	return &NullableRequestIP{value: val, isSet: true}
}

func (v NullableRequestIP) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestIP) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

