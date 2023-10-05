/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.4
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// SearchCertificateOrder struct for SearchCertificateOrder
type SearchCertificateOrder struct {
	// Certificate Order reference
	OrderReference NullableString `json:"orderReference,omitempty"`
	// Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or *
	SerialNumber NullableString `json:"serialNumber,omitempty"`
	OrderStatus []CertificateOrderStatus `json:"orderStatus,omitempty"`
	RevocationReason []RevocationReason `json:"revocationReason,omitempty"`
	// Client reference UUID
	ClientReferences []string `json:"clientReferences,omitempty"`
	// Certificate Order not starting after Date
	StartAfter NullableString `json:"startAfter,omitempty"`
	// Certificate Order not starting before Date
	StartBefore NullableString `json:"startBefore,omitempty"`
	// Any certificate attribute OID or value with optional wildcard attributes ? and/or *
	Attribute NullableString `json:"attribute,omitempty"`
}

// NewSearchCertificateOrder instantiates a new SearchCertificateOrder object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSearchCertificateOrder() *SearchCertificateOrder {
	this := SearchCertificateOrder{}
	return &this
}

// NewSearchCertificateOrderWithDefaults instantiates a new SearchCertificateOrder object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSearchCertificateOrderWithDefaults() *SearchCertificateOrder {
	this := SearchCertificateOrder{}
	return &this
}

// GetOrderReference returns the OrderReference field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetOrderReference() string {
	if o == nil || o.OrderReference.Get() == nil {
		var ret string
		return ret
	}
	return *o.OrderReference.Get()
}

// GetOrderReferenceOk returns a tuple with the OrderReference field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetOrderReferenceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.OrderReference.Get(), o.OrderReference.IsSet()
}

// HasOrderReference returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasOrderReference() bool {
	if o != nil && o.OrderReference.IsSet() {
		return true
	}

	return false
}

// SetOrderReference gets a reference to the given NullableString and assigns it to the OrderReference field.
func (o *SearchCertificateOrder) SetOrderReference(v string) {
	o.OrderReference.Set(&v)
}
// SetOrderReferenceNil sets the value for OrderReference to be an explicit nil
func (o *SearchCertificateOrder) SetOrderReferenceNil() {
	o.OrderReference.Set(nil)
}

// UnsetOrderReference ensures that no value is present for OrderReference, not even an explicit nil
func (o *SearchCertificateOrder) UnsetOrderReference() {
	o.OrderReference.Unset()
}

// GetSerialNumber returns the SerialNumber field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetSerialNumber() string {
	if o == nil || o.SerialNumber.Get() == nil {
		var ret string
		return ret
	}
	return *o.SerialNumber.Get()
}

// GetSerialNumberOk returns a tuple with the SerialNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetSerialNumberOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SerialNumber.Get(), o.SerialNumber.IsSet()
}

// HasSerialNumber returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasSerialNumber() bool {
	if o != nil && o.SerialNumber.IsSet() {
		return true
	}

	return false
}

// SetSerialNumber gets a reference to the given NullableString and assigns it to the SerialNumber field.
func (o *SearchCertificateOrder) SetSerialNumber(v string) {
	o.SerialNumber.Set(&v)
}
// SetSerialNumberNil sets the value for SerialNumber to be an explicit nil
func (o *SearchCertificateOrder) SetSerialNumberNil() {
	o.SerialNumber.Set(nil)
}

// UnsetSerialNumber ensures that no value is present for SerialNumber, not even an explicit nil
func (o *SearchCertificateOrder) UnsetSerialNumber() {
	o.SerialNumber.Unset()
}

// GetOrderStatus returns the OrderStatus field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetOrderStatus() []CertificateOrderStatus {
	if o == nil {
		var ret []CertificateOrderStatus
		return ret
	}
	return o.OrderStatus
}

// GetOrderStatusOk returns a tuple with the OrderStatus field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetOrderStatusOk() ([]CertificateOrderStatus, bool) {
	if o == nil || o.OrderStatus == nil {
		return nil, false
	}
	return o.OrderStatus, true
}

// HasOrderStatus returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasOrderStatus() bool {
	if o != nil && o.OrderStatus != nil {
		return true
	}

	return false
}

// SetOrderStatus gets a reference to the given []CertificateOrderStatus and assigns it to the OrderStatus field.
func (o *SearchCertificateOrder) SetOrderStatus(v []CertificateOrderStatus) {
	o.OrderStatus = v
}

// GetRevocationReason returns the RevocationReason field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetRevocationReason() []RevocationReason {
	if o == nil {
		var ret []RevocationReason
		return ret
	}
	return o.RevocationReason
}

// GetRevocationReasonOk returns a tuple with the RevocationReason field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetRevocationReasonOk() ([]RevocationReason, bool) {
	if o == nil || o.RevocationReason == nil {
		return nil, false
	}
	return o.RevocationReason, true
}

// HasRevocationReason returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasRevocationReason() bool {
	if o != nil && o.RevocationReason != nil {
		return true
	}

	return false
}

// SetRevocationReason gets a reference to the given []RevocationReason and assigns it to the RevocationReason field.
func (o *SearchCertificateOrder) SetRevocationReason(v []RevocationReason) {
	o.RevocationReason = v
}

// GetClientReferences returns the ClientReferences field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetClientReferences() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.ClientReferences
}

// GetClientReferencesOk returns a tuple with the ClientReferences field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetClientReferencesOk() ([]string, bool) {
	if o == nil || o.ClientReferences == nil {
		return nil, false
	}
	return o.ClientReferences, true
}

// HasClientReferences returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasClientReferences() bool {
	if o != nil && o.ClientReferences != nil {
		return true
	}

	return false
}

// SetClientReferences gets a reference to the given []string and assigns it to the ClientReferences field.
func (o *SearchCertificateOrder) SetClientReferences(v []string) {
	o.ClientReferences = v
}

// GetStartAfter returns the StartAfter field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetStartAfter() string {
	if o == nil || o.StartAfter.Get() == nil {
		var ret string
		return ret
	}
	return *o.StartAfter.Get()
}

// GetStartAfterOk returns a tuple with the StartAfter field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetStartAfterOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.StartAfter.Get(), o.StartAfter.IsSet()
}

// HasStartAfter returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasStartAfter() bool {
	if o != nil && o.StartAfter.IsSet() {
		return true
	}

	return false
}

// SetStartAfter gets a reference to the given NullableString and assigns it to the StartAfter field.
func (o *SearchCertificateOrder) SetStartAfter(v string) {
	o.StartAfter.Set(&v)
}
// SetStartAfterNil sets the value for StartAfter to be an explicit nil
func (o *SearchCertificateOrder) SetStartAfterNil() {
	o.StartAfter.Set(nil)
}

// UnsetStartAfter ensures that no value is present for StartAfter, not even an explicit nil
func (o *SearchCertificateOrder) UnsetStartAfter() {
	o.StartAfter.Unset()
}

// GetStartBefore returns the StartBefore field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetStartBefore() string {
	if o == nil || o.StartBefore.Get() == nil {
		var ret string
		return ret
	}
	return *o.StartBefore.Get()
}

// GetStartBeforeOk returns a tuple with the StartBefore field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetStartBeforeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.StartBefore.Get(), o.StartBefore.IsSet()
}

// HasStartBefore returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasStartBefore() bool {
	if o != nil && o.StartBefore.IsSet() {
		return true
	}

	return false
}

// SetStartBefore gets a reference to the given NullableString and assigns it to the StartBefore field.
func (o *SearchCertificateOrder) SetStartBefore(v string) {
	o.StartBefore.Set(&v)
}
// SetStartBeforeNil sets the value for StartBefore to be an explicit nil
func (o *SearchCertificateOrder) SetStartBeforeNil() {
	o.StartBefore.Set(nil)
}

// UnsetStartBefore ensures that no value is present for StartBefore, not even an explicit nil
func (o *SearchCertificateOrder) UnsetStartBefore() {
	o.StartBefore.Unset()
}

// GetAttribute returns the Attribute field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *SearchCertificateOrder) GetAttribute() string {
	if o == nil || o.Attribute.Get() == nil {
		var ret string
		return ret
	}
	return *o.Attribute.Get()
}

// GetAttributeOk returns a tuple with the Attribute field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *SearchCertificateOrder) GetAttributeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Attribute.Get(), o.Attribute.IsSet()
}

// HasAttribute returns a boolean if a field has been set.
func (o *SearchCertificateOrder) HasAttribute() bool {
	if o != nil && o.Attribute.IsSet() {
		return true
	}

	return false
}

// SetAttribute gets a reference to the given NullableString and assigns it to the Attribute field.
func (o *SearchCertificateOrder) SetAttribute(v string) {
	o.Attribute.Set(&v)
}
// SetAttributeNil sets the value for Attribute to be an explicit nil
func (o *SearchCertificateOrder) SetAttributeNil() {
	o.Attribute.Set(nil)
}

// UnsetAttribute ensures that no value is present for Attribute, not even an explicit nil
func (o *SearchCertificateOrder) UnsetAttribute() {
	o.Attribute.Unset()
}

func (o SearchCertificateOrder) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.OrderReference.IsSet() {
		toSerialize["orderReference"] = o.OrderReference.Get()
	}
	if o.SerialNumber.IsSet() {
		toSerialize["serialNumber"] = o.SerialNumber.Get()
	}
	if o.OrderStatus != nil {
		toSerialize["orderStatus"] = o.OrderStatus
	}
	if o.RevocationReason != nil {
		toSerialize["revocationReason"] = o.RevocationReason
	}
	if o.ClientReferences != nil {
		toSerialize["clientReferences"] = o.ClientReferences
	}
	if o.StartAfter.IsSet() {
		toSerialize["startAfter"] = o.StartAfter.Get()
	}
	if o.StartBefore.IsSet() {
		toSerialize["startBefore"] = o.StartBefore.Get()
	}
	if o.Attribute.IsSet() {
		toSerialize["attribute"] = o.Attribute.Get()
	}
	return json.Marshal(toSerialize)
}

type NullableSearchCertificateOrder struct {
	value *SearchCertificateOrder
	isSet bool
}

func (v NullableSearchCertificateOrder) Get() *SearchCertificateOrder {
	return v.value
}

func (v *NullableSearchCertificateOrder) Set(val *SearchCertificateOrder) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchCertificateOrder) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchCertificateOrder) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchCertificateOrder(val *SearchCertificateOrder) *NullableSearchCertificateOrder {
	return &NullableSearchCertificateOrder{value: val, isSet: true}
}

func (v NullableSearchCertificateOrder) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchCertificateOrder) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


