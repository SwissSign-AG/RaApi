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

// RegistrationDocument struct for RegistrationDocument
type RegistrationDocument struct {
	// document name
	DocumentName string `json:"documentName"`
	// Base64 encoded byte array of the document content
	Document string `json:"document"`
}

// NewRegistrationDocument instantiates a new RegistrationDocument object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRegistrationDocument(documentName string, document string) *RegistrationDocument {
	this := RegistrationDocument{}
	this.DocumentName = documentName
	this.Document = document
	return &this
}

// NewRegistrationDocumentWithDefaults instantiates a new RegistrationDocument object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRegistrationDocumentWithDefaults() *RegistrationDocument {
	this := RegistrationDocument{}
	return &this
}

// GetDocumentName returns the DocumentName field value
func (o *RegistrationDocument) GetDocumentName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.DocumentName
}

// GetDocumentNameOk returns a tuple with the DocumentName field value
// and a boolean to check if the value has been set.
func (o *RegistrationDocument) GetDocumentNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DocumentName, true
}

// SetDocumentName sets field value
func (o *RegistrationDocument) SetDocumentName(v string) {
	o.DocumentName = v
}

// GetDocument returns the Document field value
func (o *RegistrationDocument) GetDocument() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Document
}

// GetDocumentOk returns a tuple with the Document field value
// and a boolean to check if the value has been set.
func (o *RegistrationDocument) GetDocumentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Document, true
}

// SetDocument sets field value
func (o *RegistrationDocument) SetDocument(v string) {
	o.Document = v
}

func (o RegistrationDocument) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["documentName"] = o.DocumentName
	}
	if true {
		toSerialize["document"] = o.Document
	}
	return json.Marshal(toSerialize)
}

type NullableRegistrationDocument struct {
	value *RegistrationDocument
	isSet bool
}

func (v NullableRegistrationDocument) Get() *RegistrationDocument {
	return v.value
}

func (v *NullableRegistrationDocument) Set(val *RegistrationDocument) {
	v.value = val
	v.isSet = true
}

func (v NullableRegistrationDocument) IsSet() bool {
	return v.isSet
}

func (v *NullableRegistrationDocument) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRegistrationDocument(val *RegistrationDocument) *NullableRegistrationDocument {
	return &NullableRegistrationDocument{value: val, isSet: true}
}

func (v NullableRegistrationDocument) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRegistrationDocument) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


