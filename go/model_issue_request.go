/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.2.9
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// IssueRequest struct for IssueRequest
type IssueRequest struct {
	// Product reference
	ProductReference string `json:"productReference"`
	// CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary).
	Csr NullableString `json:"csr,omitempty"`
	Overrides *RequestOverrides `json:"overrides,omitempty"`
	AdditionalRecipients []AdditionalRecipient `json:"additionalRecipients,omitempty"`
	RegistrationDocuments []RegistrationDocument `json:"registrationDocuments,omitempty"`
	// User note added to issued certificate order
	Note NullableString `json:"note,omitempty"`
	// Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication. 
	PublishCertificate *bool `json:"publishCertificate,omitempty"`
	// Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled. 
	Synchrone *bool `json:"synchrone,omitempty"`
	// When server backend has T&C enabled, this value is checked. 
	AcceptTandC *bool `json:"acceptTandC,omitempty"`
}

// NewIssueRequest instantiates a new IssueRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIssueRequest(productReference string) *IssueRequest {
	this := IssueRequest{}
	this.ProductReference = productReference
	var synchrone bool = false
	this.Synchrone = &synchrone
	var acceptTandC bool = true
	this.AcceptTandC = &acceptTandC
	return &this
}

// NewIssueRequestWithDefaults instantiates a new IssueRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIssueRequestWithDefaults() *IssueRequest {
	this := IssueRequest{}
	var synchrone bool = false
	this.Synchrone = &synchrone
	var acceptTandC bool = true
	this.AcceptTandC = &acceptTandC
	return &this
}

// GetProductReference returns the ProductReference field value
func (o *IssueRequest) GetProductReference() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProductReference
}

// GetProductReferenceOk returns a tuple with the ProductReference field value
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetProductReferenceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProductReference, true
}

// SetProductReference sets field value
func (o *IssueRequest) SetProductReference(v string) {
	o.ProductReference = v
}

// GetCsr returns the Csr field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IssueRequest) GetCsr() string {
	if o == nil || o.Csr.Get() == nil {
		var ret string
		return ret
	}
	return *o.Csr.Get()
}

// GetCsrOk returns a tuple with the Csr field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IssueRequest) GetCsrOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Csr.Get(), o.Csr.IsSet()
}

// HasCsr returns a boolean if a field has been set.
func (o *IssueRequest) HasCsr() bool {
	if o != nil && o.Csr.IsSet() {
		return true
	}

	return false
}

// SetCsr gets a reference to the given NullableString and assigns it to the Csr field.
func (o *IssueRequest) SetCsr(v string) {
	o.Csr.Set(&v)
}
// SetCsrNil sets the value for Csr to be an explicit nil
func (o *IssueRequest) SetCsrNil() {
	o.Csr.Set(nil)
}

// UnsetCsr ensures that no value is present for Csr, not even an explicit nil
func (o *IssueRequest) UnsetCsr() {
	o.Csr.Unset()
}

// GetOverrides returns the Overrides field value if set, zero value otherwise.
func (o *IssueRequest) GetOverrides() RequestOverrides {
	if o == nil || o.Overrides == nil {
		var ret RequestOverrides
		return ret
	}
	return *o.Overrides
}

// GetOverridesOk returns a tuple with the Overrides field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetOverridesOk() (*RequestOverrides, bool) {
	if o == nil || o.Overrides == nil {
		return nil, false
	}
	return o.Overrides, true
}

// HasOverrides returns a boolean if a field has been set.
func (o *IssueRequest) HasOverrides() bool {
	if o != nil && o.Overrides != nil {
		return true
	}

	return false
}

// SetOverrides gets a reference to the given RequestOverrides and assigns it to the Overrides field.
func (o *IssueRequest) SetOverrides(v RequestOverrides) {
	o.Overrides = &v
}

// GetAdditionalRecipients returns the AdditionalRecipients field value if set, zero value otherwise.
func (o *IssueRequest) GetAdditionalRecipients() []AdditionalRecipient {
	if o == nil || o.AdditionalRecipients == nil {
		var ret []AdditionalRecipient
		return ret
	}
	return o.AdditionalRecipients
}

// GetAdditionalRecipientsOk returns a tuple with the AdditionalRecipients field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetAdditionalRecipientsOk() ([]AdditionalRecipient, bool) {
	if o == nil || o.AdditionalRecipients == nil {
		return nil, false
	}
	return o.AdditionalRecipients, true
}

// HasAdditionalRecipients returns a boolean if a field has been set.
func (o *IssueRequest) HasAdditionalRecipients() bool {
	if o != nil && o.AdditionalRecipients != nil {
		return true
	}

	return false
}

// SetAdditionalRecipients gets a reference to the given []AdditionalRecipient and assigns it to the AdditionalRecipients field.
func (o *IssueRequest) SetAdditionalRecipients(v []AdditionalRecipient) {
	o.AdditionalRecipients = v
}

// GetRegistrationDocuments returns the RegistrationDocuments field value if set, zero value otherwise.
func (o *IssueRequest) GetRegistrationDocuments() []RegistrationDocument {
	if o == nil || o.RegistrationDocuments == nil {
		var ret []RegistrationDocument
		return ret
	}
	return o.RegistrationDocuments
}

// GetRegistrationDocumentsOk returns a tuple with the RegistrationDocuments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetRegistrationDocumentsOk() ([]RegistrationDocument, bool) {
	if o == nil || o.RegistrationDocuments == nil {
		return nil, false
	}
	return o.RegistrationDocuments, true
}

// HasRegistrationDocuments returns a boolean if a field has been set.
func (o *IssueRequest) HasRegistrationDocuments() bool {
	if o != nil && o.RegistrationDocuments != nil {
		return true
	}

	return false
}

// SetRegistrationDocuments gets a reference to the given []RegistrationDocument and assigns it to the RegistrationDocuments field.
func (o *IssueRequest) SetRegistrationDocuments(v []RegistrationDocument) {
	o.RegistrationDocuments = v
}

// GetNote returns the Note field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *IssueRequest) GetNote() string {
	if o == nil || o.Note.Get() == nil {
		var ret string
		return ret
	}
	return *o.Note.Get()
}

// GetNoteOk returns a tuple with the Note field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *IssueRequest) GetNoteOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Note.Get(), o.Note.IsSet()
}

// HasNote returns a boolean if a field has been set.
func (o *IssueRequest) HasNote() bool {
	if o != nil && o.Note.IsSet() {
		return true
	}

	return false
}

// SetNote gets a reference to the given NullableString and assigns it to the Note field.
func (o *IssueRequest) SetNote(v string) {
	o.Note.Set(&v)
}
// SetNoteNil sets the value for Note to be an explicit nil
func (o *IssueRequest) SetNoteNil() {
	o.Note.Set(nil)
}

// UnsetNote ensures that no value is present for Note, not even an explicit nil
func (o *IssueRequest) UnsetNote() {
	o.Note.Unset()
}

// GetPublishCertificate returns the PublishCertificate field value if set, zero value otherwise.
func (o *IssueRequest) GetPublishCertificate() bool {
	if o == nil || o.PublishCertificate == nil {
		var ret bool
		return ret
	}
	return *o.PublishCertificate
}

// GetPublishCertificateOk returns a tuple with the PublishCertificate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetPublishCertificateOk() (*bool, bool) {
	if o == nil || o.PublishCertificate == nil {
		return nil, false
	}
	return o.PublishCertificate, true
}

// HasPublishCertificate returns a boolean if a field has been set.
func (o *IssueRequest) HasPublishCertificate() bool {
	if o != nil && o.PublishCertificate != nil {
		return true
	}

	return false
}

// SetPublishCertificate gets a reference to the given bool and assigns it to the PublishCertificate field.
func (o *IssueRequest) SetPublishCertificate(v bool) {
	o.PublishCertificate = &v
}

// GetSynchrone returns the Synchrone field value if set, zero value otherwise.
func (o *IssueRequest) GetSynchrone() bool {
	if o == nil || o.Synchrone == nil {
		var ret bool
		return ret
	}
	return *o.Synchrone
}

// GetSynchroneOk returns a tuple with the Synchrone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetSynchroneOk() (*bool, bool) {
	if o == nil || o.Synchrone == nil {
		return nil, false
	}
	return o.Synchrone, true
}

// HasSynchrone returns a boolean if a field has been set.
func (o *IssueRequest) HasSynchrone() bool {
	if o != nil && o.Synchrone != nil {
		return true
	}

	return false
}

// SetSynchrone gets a reference to the given bool and assigns it to the Synchrone field.
func (o *IssueRequest) SetSynchrone(v bool) {
	o.Synchrone = &v
}

// GetAcceptTandC returns the AcceptTandC field value if set, zero value otherwise.
func (o *IssueRequest) GetAcceptTandC() bool {
	if o == nil || o.AcceptTandC == nil {
		var ret bool
		return ret
	}
	return *o.AcceptTandC
}

// GetAcceptTandCOk returns a tuple with the AcceptTandC field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetAcceptTandCOk() (*bool, bool) {
	if o == nil || o.AcceptTandC == nil {
		return nil, false
	}
	return o.AcceptTandC, true
}

// HasAcceptTandC returns a boolean if a field has been set.
func (o *IssueRequest) HasAcceptTandC() bool {
	if o != nil && o.AcceptTandC != nil {
		return true
	}

	return false
}

// SetAcceptTandC gets a reference to the given bool and assigns it to the AcceptTandC field.
func (o *IssueRequest) SetAcceptTandC(v bool) {
	o.AcceptTandC = &v
}

func (o IssueRequest) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["productReference"] = o.ProductReference
	}
	if o.Csr.IsSet() {
		toSerialize["csr"] = o.Csr.Get()
	}
	if o.Overrides != nil {
		toSerialize["overrides"] = o.Overrides
	}
	if o.AdditionalRecipients != nil {
		toSerialize["additionalRecipients"] = o.AdditionalRecipients
	}
	if o.RegistrationDocuments != nil {
		toSerialize["registrationDocuments"] = o.RegistrationDocuments
	}
	if o.Note.IsSet() {
		toSerialize["note"] = o.Note.Get()
	}
	if o.PublishCertificate != nil {
		toSerialize["publishCertificate"] = o.PublishCertificate
	}
	if o.Synchrone != nil {
		toSerialize["synchrone"] = o.Synchrone
	}
	if o.AcceptTandC != nil {
		toSerialize["acceptTandC"] = o.AcceptTandC
	}
	return json.Marshal(toSerialize)
}

type NullableIssueRequest struct {
	value *IssueRequest
	isSet bool
}

func (v NullableIssueRequest) Get() *IssueRequest {
	return v.value
}

func (v *NullableIssueRequest) Set(val *IssueRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableIssueRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableIssueRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIssueRequest(val *IssueRequest) *NullableIssueRequest {
	return &NullableIssueRequest{value: val, isSet: true}
}

func (v NullableIssueRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIssueRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


