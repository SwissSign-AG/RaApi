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

// checks if the Client type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Client{}

// Client struct for Client
type Client struct {
	// Client UUID reference
	Uuid string `json:"uuid" validate:"regexp=cli-[0-9a-f-]{36}"`
	// Client name
	Name string `json:"name"`
	// Client description
	Description *string `json:"description,omitempty"`
	// List of available certificate products
	Products []Product `json:"products,omitempty"`
}

type _Client Client

// NewClient instantiates a new Client object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClient(uuid string, name string) *Client {
	this := Client{}
	this.Uuid = uuid
	this.Name = name
	return &this
}

// NewClientWithDefaults instantiates a new Client object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClientWithDefaults() *Client {
	this := Client{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *Client) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *Client) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *Client) SetUuid(v string) {
	o.Uuid = v
}

// GetName returns the Name field value
func (o *Client) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *Client) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *Client) SetName(v string) {
	o.Name = v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *Client) GetDescription() string {
	if o == nil || IsNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Client) GetDescriptionOk() (*string, bool) {
	if o == nil || IsNil(o.Description) {
		return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *Client) HasDescription() bool {
	if o != nil && !IsNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *Client) SetDescription(v string) {
	o.Description = &v
}

// GetProducts returns the Products field value if set, zero value otherwise.
func (o *Client) GetProducts() []Product {
	if o == nil || IsNil(o.Products) {
		var ret []Product
		return ret
	}
	return o.Products
}

// GetProductsOk returns a tuple with the Products field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Client) GetProductsOk() ([]Product, bool) {
	if o == nil || IsNil(o.Products) {
		return nil, false
	}
	return o.Products, true
}

// HasProducts returns a boolean if a field has been set.
func (o *Client) HasProducts() bool {
	if o != nil && !IsNil(o.Products) {
		return true
	}

	return false
}

// SetProducts gets a reference to the given []Product and assigns it to the Products field.
func (o *Client) SetProducts(v []Product) {
	o.Products = v
}

func (o Client) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Client) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["uuid"] = o.Uuid
	toSerialize["name"] = o.Name
	if !IsNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !IsNil(o.Products) {
		toSerialize["products"] = o.Products
	}
	return toSerialize, nil
}

func (o *Client) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"uuid",
		"name",
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

	varClient := _Client{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varClient)

	if err != nil {
		return err
	}

	*o = Client(varClient)

	return err
}

type NullableClient struct {
	value *Client
	isSet bool
}

func (v NullableClient) Get() *Client {
	return v.value
}

func (v *NullableClient) Set(val *Client) {
	v.value = val
	v.isSet = true
}

func (v NullableClient) IsSet() bool {
	return v.isSet
}

func (v *NullableClient) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClient(val *Client) *NullableClient {
	return &NullableClient{value: val, isSet: true}
}

func (v NullableClient) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClient) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


