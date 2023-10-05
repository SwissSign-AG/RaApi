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
	"time"
)

// CertificateOrder struct for CertificateOrder
type CertificateOrder struct {
	// Certificate Order reference
	Uuid string `json:"uuid"`
	// Certificate Order creation date time
	CreatedOn time.Time `json:"createdOn"`
	Status CertificateOrderStatus `json:"status"`
	// Client reference UUID
	ClientReference string `json:"clientReference"`
	// Product reference UUID
	ProductReference string `json:"productReference"`
	Certificate *Certificate `json:"certificate,omitempty"`
	AdditionalRecipients []AdditionalRecipient `json:"additionalRecipients,omitempty"`
	// email of the person who created the order
	IssuedBy *string `json:"issuedBy,omitempty"`
}

// NewCertificateOrder instantiates a new CertificateOrder object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCertificateOrder(uuid string, createdOn time.Time, status CertificateOrderStatus, clientReference string, productReference string) *CertificateOrder {
	this := CertificateOrder{}
	this.Uuid = uuid
	this.CreatedOn = createdOn
	this.Status = status
	this.ClientReference = clientReference
	this.ProductReference = productReference
	return &this
}

// NewCertificateOrderWithDefaults instantiates a new CertificateOrder object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCertificateOrderWithDefaults() *CertificateOrder {
	this := CertificateOrder{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *CertificateOrder) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *CertificateOrder) SetUuid(v string) {
	o.Uuid = v
}

// GetCreatedOn returns the CreatedOn field value
func (o *CertificateOrder) GetCreatedOn() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedOn
}

// GetCreatedOnOk returns a tuple with the CreatedOn field value
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetCreatedOnOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedOn, true
}

// SetCreatedOn sets field value
func (o *CertificateOrder) SetCreatedOn(v time.Time) {
	o.CreatedOn = v
}

// GetStatus returns the Status field value
func (o *CertificateOrder) GetStatus() CertificateOrderStatus {
	if o == nil {
		var ret CertificateOrderStatus
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetStatusOk() (*CertificateOrderStatus, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *CertificateOrder) SetStatus(v CertificateOrderStatus) {
	o.Status = v
}

// GetClientReference returns the ClientReference field value
func (o *CertificateOrder) GetClientReference() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ClientReference
}

// GetClientReferenceOk returns a tuple with the ClientReference field value
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetClientReferenceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ClientReference, true
}

// SetClientReference sets field value
func (o *CertificateOrder) SetClientReference(v string) {
	o.ClientReference = v
}

// GetProductReference returns the ProductReference field value
func (o *CertificateOrder) GetProductReference() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProductReference
}

// GetProductReferenceOk returns a tuple with the ProductReference field value
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetProductReferenceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProductReference, true
}

// SetProductReference sets field value
func (o *CertificateOrder) SetProductReference(v string) {
	o.ProductReference = v
}

// GetCertificate returns the Certificate field value if set, zero value otherwise.
func (o *CertificateOrder) GetCertificate() Certificate {
	if o == nil || o.Certificate == nil {
		var ret Certificate
		return ret
	}
	return *o.Certificate
}

// GetCertificateOk returns a tuple with the Certificate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetCertificateOk() (*Certificate, bool) {
	if o == nil || o.Certificate == nil {
		return nil, false
	}
	return o.Certificate, true
}

// HasCertificate returns a boolean if a field has been set.
func (o *CertificateOrder) HasCertificate() bool {
	if o != nil && o.Certificate != nil {
		return true
	}

	return false
}

// SetCertificate gets a reference to the given Certificate and assigns it to the Certificate field.
func (o *CertificateOrder) SetCertificate(v Certificate) {
	o.Certificate = &v
}

// GetAdditionalRecipients returns the AdditionalRecipients field value if set, zero value otherwise.
func (o *CertificateOrder) GetAdditionalRecipients() []AdditionalRecipient {
	if o == nil || o.AdditionalRecipients == nil {
		var ret []AdditionalRecipient
		return ret
	}
	return o.AdditionalRecipients
}

// GetAdditionalRecipientsOk returns a tuple with the AdditionalRecipients field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetAdditionalRecipientsOk() ([]AdditionalRecipient, bool) {
	if o == nil || o.AdditionalRecipients == nil {
		return nil, false
	}
	return o.AdditionalRecipients, true
}

// HasAdditionalRecipients returns a boolean if a field has been set.
func (o *CertificateOrder) HasAdditionalRecipients() bool {
	if o != nil && o.AdditionalRecipients != nil {
		return true
	}

	return false
}

// SetAdditionalRecipients gets a reference to the given []AdditionalRecipient and assigns it to the AdditionalRecipients field.
func (o *CertificateOrder) SetAdditionalRecipients(v []AdditionalRecipient) {
	o.AdditionalRecipients = v
}

// GetIssuedBy returns the IssuedBy field value if set, zero value otherwise.
func (o *CertificateOrder) GetIssuedBy() string {
	if o == nil || o.IssuedBy == nil {
		var ret string
		return ret
	}
	return *o.IssuedBy
}

// GetIssuedByOk returns a tuple with the IssuedBy field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CertificateOrder) GetIssuedByOk() (*string, bool) {
	if o == nil || o.IssuedBy == nil {
		return nil, false
	}
	return o.IssuedBy, true
}

// HasIssuedBy returns a boolean if a field has been set.
func (o *CertificateOrder) HasIssuedBy() bool {
	if o != nil && o.IssuedBy != nil {
		return true
	}

	return false
}

// SetIssuedBy gets a reference to the given string and assigns it to the IssuedBy field.
func (o *CertificateOrder) SetIssuedBy(v string) {
	o.IssuedBy = &v
}

func (o CertificateOrder) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["uuid"] = o.Uuid
	}
	if true {
		toSerialize["createdOn"] = o.CreatedOn
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["clientReference"] = o.ClientReference
	}
	if true {
		toSerialize["productReference"] = o.ProductReference
	}
	if o.Certificate != nil {
		toSerialize["certificate"] = o.Certificate
	}
	if o.AdditionalRecipients != nil {
		toSerialize["additionalRecipients"] = o.AdditionalRecipients
	}
	if o.IssuedBy != nil {
		toSerialize["issuedBy"] = o.IssuedBy
	}
	return json.Marshal(toSerialize)
}

type NullableCertificateOrder struct {
	value *CertificateOrder
	isSet bool
}

func (v NullableCertificateOrder) Get() *CertificateOrder {
	return v.value
}

func (v *NullableCertificateOrder) Set(val *CertificateOrder) {
	v.value = val
	v.isSet = true
}

func (v NullableCertificateOrder) IsSet() bool {
	return v.isSet
}

func (v *NullableCertificateOrder) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCertificateOrder(val *CertificateOrder) *NullableCertificateOrder {
	return &NullableCertificateOrder{value: val, isSet: true}
}

func (v NullableCertificateOrder) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCertificateOrder) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


