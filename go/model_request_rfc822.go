/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.5
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// RequestRFC822 struct for RequestRFC822
type RequestRFC822 struct {
	Values []string `json:"values"`
}

// NewRequestRFC822 instantiates a new RequestRFC822 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestRFC822(values []string) *RequestRFC822 {
	this := RequestRFC822{}
	this.Values = values
	return &this
}

// NewRequestRFC822WithDefaults instantiates a new RequestRFC822 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestRFC822WithDefaults() *RequestRFC822 {
	this := RequestRFC822{}
	return &this
}

// GetValues returns the Values field value
func (o *RequestRFC822) GetValues() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Values
}

// GetValuesOk returns a tuple with the Values field value
// and a boolean to check if the value has been set.
func (o *RequestRFC822) GetValuesOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Values, true
}

// SetValues sets field value
func (o *RequestRFC822) SetValues(v []string) {
	o.Values = v
}

func (o RequestRFC822) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["values"] = o.Values
	}
	return json.Marshal(toSerialize)
}

type NullableRequestRFC822 struct {
	value *RequestRFC822
	isSet bool
}

func (v NullableRequestRFC822) Get() *RequestRFC822 {
	return v.value
}

func (v *NullableRequestRFC822) Set(val *RequestRFC822) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestRFC822) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestRFC822) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestRFC822(val *RequestRFC822) *NullableRequestRFC822 {
	return &NullableRequestRFC822{value: val, isSet: true}
}

func (v NullableRequestRFC822) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestRFC822) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


