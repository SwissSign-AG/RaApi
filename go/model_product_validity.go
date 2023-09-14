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

// ProductValidity struct for ProductValidity
type ProductValidity struct {
	// Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds. 
	ValidityType string `json:"validityType"`
	// The default certificate validity
	Validity NullableInt32 `json:"validity,omitempty"`
	// Optional certificate validity values
	ValidityOptions []int32 `json:"validityOptions,omitempty"`
}

// NewProductValidity instantiates a new ProductValidity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProductValidity(validityType string) *ProductValidity {
	this := ProductValidity{}
	this.ValidityType = validityType
	return &this
}

// NewProductValidityWithDefaults instantiates a new ProductValidity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProductValidityWithDefaults() *ProductValidity {
	this := ProductValidity{}
	return &this
}

// GetValidityType returns the ValidityType field value
func (o *ProductValidity) GetValidityType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ValidityType
}

// GetValidityTypeOk returns a tuple with the ValidityType field value
// and a boolean to check if the value has been set.
func (o *ProductValidity) GetValidityTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ValidityType, true
}

// SetValidityType sets field value
func (o *ProductValidity) SetValidityType(v string) {
	o.ValidityType = v
}

// GetValidity returns the Validity field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ProductValidity) GetValidity() int32 {
	if o == nil || o.Validity.Get() == nil {
		var ret int32
		return ret
	}
	return *o.Validity.Get()
}

// GetValidityOk returns a tuple with the Validity field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ProductValidity) GetValidityOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Validity.Get(), o.Validity.IsSet()
}

// HasValidity returns a boolean if a field has been set.
func (o *ProductValidity) HasValidity() bool {
	if o != nil && o.Validity.IsSet() {
		return true
	}

	return false
}

// SetValidity gets a reference to the given NullableInt32 and assigns it to the Validity field.
func (o *ProductValidity) SetValidity(v int32) {
	o.Validity.Set(&v)
}
// SetValidityNil sets the value for Validity to be an explicit nil
func (o *ProductValidity) SetValidityNil() {
	o.Validity.Set(nil)
}

// UnsetValidity ensures that no value is present for Validity, not even an explicit nil
func (o *ProductValidity) UnsetValidity() {
	o.Validity.Unset()
}

// GetValidityOptions returns the ValidityOptions field value if set, zero value otherwise.
func (o *ProductValidity) GetValidityOptions() []int32 {
	if o == nil || o.ValidityOptions == nil {
		var ret []int32
		return ret
	}
	return o.ValidityOptions
}

// GetValidityOptionsOk returns a tuple with the ValidityOptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProductValidity) GetValidityOptionsOk() ([]int32, bool) {
	if o == nil || o.ValidityOptions == nil {
		return nil, false
	}
	return o.ValidityOptions, true
}

// HasValidityOptions returns a boolean if a field has been set.
func (o *ProductValidity) HasValidityOptions() bool {
	if o != nil && o.ValidityOptions != nil {
		return true
	}

	return false
}

// SetValidityOptions gets a reference to the given []int32 and assigns it to the ValidityOptions field.
func (o *ProductValidity) SetValidityOptions(v []int32) {
	o.ValidityOptions = v
}

func (o ProductValidity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["validityType"] = o.ValidityType
	}
	if o.Validity.IsSet() {
		toSerialize["validity"] = o.Validity.Get()
	}
	if o.ValidityOptions != nil {
		toSerialize["validityOptions"] = o.ValidityOptions
	}
	return json.Marshal(toSerialize)
}

type NullableProductValidity struct {
	value *ProductValidity
	isSet bool
}

func (v NullableProductValidity) Get() *ProductValidity {
	return v.value
}

func (v *NullableProductValidity) Set(val *ProductValidity) {
	v.value = val
	v.isSet = true
}

func (v NullableProductValidity) IsSet() bool {
	return v.isSet
}

func (v *NullableProductValidity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProductValidity(val *ProductValidity) *NullableProductValidity {
	return &NullableProductValidity{value: val, isSet: true}
}

func (v NullableProductValidity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProductValidity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


