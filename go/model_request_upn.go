/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.0
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// RequestUPN struct for RequestUPN
type RequestUPN struct {
	Values []string `json:"values"`
}

// NewRequestUPN instantiates a new RequestUPN object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestUPN(values []string) *RequestUPN {
	this := RequestUPN{}
	this.Values = values
	return &this
}

// NewRequestUPNWithDefaults instantiates a new RequestUPN object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestUPNWithDefaults() *RequestUPN {
	this := RequestUPN{}
	return &this
}

// GetValues returns the Values field value
func (o *RequestUPN) GetValues() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Values
}

// GetValuesOk returns a tuple with the Values field value
// and a boolean to check if the value has been set.
func (o *RequestUPN) GetValuesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Values, true
}

// SetValues sets field value
func (o *RequestUPN) SetValues(v []string) {
	o.Values = v
}

func (o RequestUPN) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["values"] = o.Values
	}
	return json.Marshal(toSerialize)
}

type NullableRequestUPN struct {
	value *RequestUPN
	isSet bool
}

func (v NullableRequestUPN) Get() *RequestUPN {
	return v.value
}

func (v *NullableRequestUPN) Set(val *RequestUPN) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestUPN) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestUPN) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestUPN(val *RequestUPN) *NullableRequestUPN {
	return &NullableRequestUPN{value: val, isSet: true}
}

func (v NullableRequestUPN) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestUPN) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


