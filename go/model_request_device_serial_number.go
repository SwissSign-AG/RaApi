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
	"bytes"
	"fmt"
)

// checks if the RequestDeviceSerialNumber type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RequestDeviceSerialNumber{}

// RequestDeviceSerialNumber struct for RequestDeviceSerialNumber
type RequestDeviceSerialNumber struct {
	// Device Serial Number extension as defined in OID 1.3.6.1.4.1.43121.1.4.2.0.2 (UTF8String)
	Value string `json:"value"`
}

type _RequestDeviceSerialNumber RequestDeviceSerialNumber

// NewRequestDeviceSerialNumber instantiates a new RequestDeviceSerialNumber object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestDeviceSerialNumber(value string) *RequestDeviceSerialNumber {
	this := RequestDeviceSerialNumber{}
	this.Value = value
	return &this
}

// NewRequestDeviceSerialNumberWithDefaults instantiates a new RequestDeviceSerialNumber object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestDeviceSerialNumberWithDefaults() *RequestDeviceSerialNumber {
	this := RequestDeviceSerialNumber{}
	return &this
}

// GetValue returns the Value field value
func (o *RequestDeviceSerialNumber) GetValue() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Value
}

// GetValueOk returns a tuple with the Value field value
// and a boolean to check if the value has been set.
func (o *RequestDeviceSerialNumber) GetValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Value, true
}

// SetValue sets field value
func (o *RequestDeviceSerialNumber) SetValue(v string) {
	o.Value = v
}

func (o RequestDeviceSerialNumber) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RequestDeviceSerialNumber) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["value"] = o.Value
	return toSerialize, nil
}

func (o *RequestDeviceSerialNumber) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"value",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varRequestDeviceSerialNumber := _RequestDeviceSerialNumber{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varRequestDeviceSerialNumber)

	if err != nil {
		return err
	}

	*o = RequestDeviceSerialNumber(varRequestDeviceSerialNumber)

	return err
}

type NullableRequestDeviceSerialNumber struct {
	value *RequestDeviceSerialNumber
	isSet bool
}

func (v NullableRequestDeviceSerialNumber) Get() *RequestDeviceSerialNumber {
	return v.value
}

func (v *NullableRequestDeviceSerialNumber) Set(val *RequestDeviceSerialNumber) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestDeviceSerialNumber) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestDeviceSerialNumber) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestDeviceSerialNumber(val *RequestDeviceSerialNumber) *NullableRequestDeviceSerialNumber {
	return &NullableRequestDeviceSerialNumber{value: val, isSet: true}
}

func (v NullableRequestDeviceSerialNumber) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestDeviceSerialNumber) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


