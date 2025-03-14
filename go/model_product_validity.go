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

// checks if the ProductValidity type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ProductValidity{}

// ProductValidity struct for ProductValidity
type ProductValidity struct {
	// Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds. 
	ValidityType string `json:"validityType"`
	// The default certificate validity
	Validity *int32 `json:"validity,omitempty"`
	// Optional certificate validity values
	ValidityOptions []int32 `json:"validityOptions,omitempty"`
}

type _ProductValidity ProductValidity

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

// GetValidity returns the Validity field value if set, zero value otherwise.
func (o *ProductValidity) GetValidity() int32 {
	if o == nil || IsNil(o.Validity) {
		var ret int32
		return ret
	}
	return *o.Validity
}

// GetValidityOk returns a tuple with the Validity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProductValidity) GetValidityOk() (*int32, bool) {
	if o == nil || IsNil(o.Validity) {
		return nil, false
	}
	return o.Validity, true
}

// HasValidity returns a boolean if a field has been set.
func (o *ProductValidity) HasValidity() bool {
	if o != nil && !IsNil(o.Validity) {
		return true
	}

	return false
}

// SetValidity gets a reference to the given int32 and assigns it to the Validity field.
func (o *ProductValidity) SetValidity(v int32) {
	o.Validity = &v
}

// GetValidityOptions returns the ValidityOptions field value if set, zero value otherwise.
func (o *ProductValidity) GetValidityOptions() []int32 {
	if o == nil || IsNil(o.ValidityOptions) {
		var ret []int32
		return ret
	}
	return o.ValidityOptions
}

// GetValidityOptionsOk returns a tuple with the ValidityOptions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ProductValidity) GetValidityOptionsOk() ([]int32, bool) {
	if o == nil || IsNil(o.ValidityOptions) {
		return nil, false
	}
	return o.ValidityOptions, true
}

// HasValidityOptions returns a boolean if a field has been set.
func (o *ProductValidity) HasValidityOptions() bool {
	if o != nil && !IsNil(o.ValidityOptions) {
		return true
	}

	return false
}

// SetValidityOptions gets a reference to the given []int32 and assigns it to the ValidityOptions field.
func (o *ProductValidity) SetValidityOptions(v []int32) {
	o.ValidityOptions = v
}

func (o ProductValidity) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ProductValidity) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["validityType"] = o.ValidityType
	if !IsNil(o.Validity) {
		toSerialize["validity"] = o.Validity
	}
	if !IsNil(o.ValidityOptions) {
		toSerialize["validityOptions"] = o.ValidityOptions
	}
	return toSerialize, nil
}

func (o *ProductValidity) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"validityType",
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

	varProductValidity := _ProductValidity{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varProductValidity)

	if err != nil {
		return err
	}

	*o = ProductValidity(varProductValidity)

	return err
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


