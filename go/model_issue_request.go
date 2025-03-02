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

// checks if the IssueRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &IssueRequest{}

// IssueRequest struct for IssueRequest
type IssueRequest struct {
	// Product reference
	ProductReference string `json:"productReference" validate:"regexp=pma-[0-9a-f-]{36}"`
	// CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary).
	Csr *string `json:"csr,omitempty"`
	Overrides *RequestOverrides `json:"overrides,omitempty"`
	AdditionalRecipients []AdditionalRecipient `json:"additionalRecipients,omitempty"`
	RegistrationDocuments []RegistrationDocument `json:"registrationDocuments,omitempty"`
	Tags []string `json:"tags,omitempty"`
	// User note added to issued certificate order
	Note *string `json:"note,omitempty"`
	// Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication. 
	PublishCertificate *bool `json:"publishCertificate,omitempty"`
	// Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchronous issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled. 
	Synchrone *bool `json:"synchrone,omitempty"`
	// When server backend has T&C enabled, this value is checked. 
	AcceptTandC *bool `json:"acceptTandC,omitempty"`
	// Include the certificate chain in the reply (only valid when 'synchronous' is true). 
	IncludeCertificateChain *bool `json:"includeCertificateChain,omitempty"`
}

type _IssueRequest IssueRequest

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
	var includeCertificateChain bool = false
	this.IncludeCertificateChain = &includeCertificateChain
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
	var includeCertificateChain bool = false
	this.IncludeCertificateChain = &includeCertificateChain
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

// GetCsr returns the Csr field value if set, zero value otherwise.
func (o *IssueRequest) GetCsr() string {
	if o == nil || IsNil(o.Csr) {
		var ret string
		return ret
	}
	return *o.Csr
}

// GetCsrOk returns a tuple with the Csr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetCsrOk() (*string, bool) {
	if o == nil || IsNil(o.Csr) {
		return nil, false
	}
	return o.Csr, true
}

// HasCsr returns a boolean if a field has been set.
func (o *IssueRequest) HasCsr() bool {
	if o != nil && !IsNil(o.Csr) {
		return true
	}

	return false
}

// SetCsr gets a reference to the given string and assigns it to the Csr field.
func (o *IssueRequest) SetCsr(v string) {
	o.Csr = &v
}

// GetOverrides returns the Overrides field value if set, zero value otherwise.
func (o *IssueRequest) GetOverrides() RequestOverrides {
	if o == nil || IsNil(o.Overrides) {
		var ret RequestOverrides
		return ret
	}
	return *o.Overrides
}

// GetOverridesOk returns a tuple with the Overrides field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetOverridesOk() (*RequestOverrides, bool) {
	if o == nil || IsNil(o.Overrides) {
		return nil, false
	}
	return o.Overrides, true
}

// HasOverrides returns a boolean if a field has been set.
func (o *IssueRequest) HasOverrides() bool {
	if o != nil && !IsNil(o.Overrides) {
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
	if o == nil || IsNil(o.AdditionalRecipients) {
		var ret []AdditionalRecipient
		return ret
	}
	return o.AdditionalRecipients
}

// GetAdditionalRecipientsOk returns a tuple with the AdditionalRecipients field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetAdditionalRecipientsOk() ([]AdditionalRecipient, bool) {
	if o == nil || IsNil(o.AdditionalRecipients) {
		return nil, false
	}
	return o.AdditionalRecipients, true
}

// HasAdditionalRecipients returns a boolean if a field has been set.
func (o *IssueRequest) HasAdditionalRecipients() bool {
	if o != nil && !IsNil(o.AdditionalRecipients) {
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
	if o == nil || IsNil(o.RegistrationDocuments) {
		var ret []RegistrationDocument
		return ret
	}
	return o.RegistrationDocuments
}

// GetRegistrationDocumentsOk returns a tuple with the RegistrationDocuments field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetRegistrationDocumentsOk() ([]RegistrationDocument, bool) {
	if o == nil || IsNil(o.RegistrationDocuments) {
		return nil, false
	}
	return o.RegistrationDocuments, true
}

// HasRegistrationDocuments returns a boolean if a field has been set.
func (o *IssueRequest) HasRegistrationDocuments() bool {
	if o != nil && !IsNil(o.RegistrationDocuments) {
		return true
	}

	return false
}

// SetRegistrationDocuments gets a reference to the given []RegistrationDocument and assigns it to the RegistrationDocuments field.
func (o *IssueRequest) SetRegistrationDocuments(v []RegistrationDocument) {
	o.RegistrationDocuments = v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *IssueRequest) GetTags() []string {
	if o == nil || IsNil(o.Tags) {
		var ret []string
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *IssueRequest) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []string and assigns it to the Tags field.
func (o *IssueRequest) SetTags(v []string) {
	o.Tags = v
}

// GetNote returns the Note field value if set, zero value otherwise.
func (o *IssueRequest) GetNote() string {
	if o == nil || IsNil(o.Note) {
		var ret string
		return ret
	}
	return *o.Note
}

// GetNoteOk returns a tuple with the Note field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetNoteOk() (*string, bool) {
	if o == nil || IsNil(o.Note) {
		return nil, false
	}
	return o.Note, true
}

// HasNote returns a boolean if a field has been set.
func (o *IssueRequest) HasNote() bool {
	if o != nil && !IsNil(o.Note) {
		return true
	}

	return false
}

// SetNote gets a reference to the given string and assigns it to the Note field.
func (o *IssueRequest) SetNote(v string) {
	o.Note = &v
}

// GetPublishCertificate returns the PublishCertificate field value if set, zero value otherwise.
func (o *IssueRequest) GetPublishCertificate() bool {
	if o == nil || IsNil(o.PublishCertificate) {
		var ret bool
		return ret
	}
	return *o.PublishCertificate
}

// GetPublishCertificateOk returns a tuple with the PublishCertificate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetPublishCertificateOk() (*bool, bool) {
	if o == nil || IsNil(o.PublishCertificate) {
		return nil, false
	}
	return o.PublishCertificate, true
}

// HasPublishCertificate returns a boolean if a field has been set.
func (o *IssueRequest) HasPublishCertificate() bool {
	if o != nil && !IsNil(o.PublishCertificate) {
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
	if o == nil || IsNil(o.Synchrone) {
		var ret bool
		return ret
	}
	return *o.Synchrone
}

// GetSynchroneOk returns a tuple with the Synchrone field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetSynchroneOk() (*bool, bool) {
	if o == nil || IsNil(o.Synchrone) {
		return nil, false
	}
	return o.Synchrone, true
}

// HasSynchrone returns a boolean if a field has been set.
func (o *IssueRequest) HasSynchrone() bool {
	if o != nil && !IsNil(o.Synchrone) {
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
	if o == nil || IsNil(o.AcceptTandC) {
		var ret bool
		return ret
	}
	return *o.AcceptTandC
}

// GetAcceptTandCOk returns a tuple with the AcceptTandC field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetAcceptTandCOk() (*bool, bool) {
	if o == nil || IsNil(o.AcceptTandC) {
		return nil, false
	}
	return o.AcceptTandC, true
}

// HasAcceptTandC returns a boolean if a field has been set.
func (o *IssueRequest) HasAcceptTandC() bool {
	if o != nil && !IsNil(o.AcceptTandC) {
		return true
	}

	return false
}

// SetAcceptTandC gets a reference to the given bool and assigns it to the AcceptTandC field.
func (o *IssueRequest) SetAcceptTandC(v bool) {
	o.AcceptTandC = &v
}

// GetIncludeCertificateChain returns the IncludeCertificateChain field value if set, zero value otherwise.
func (o *IssueRequest) GetIncludeCertificateChain() bool {
	if o == nil || IsNil(o.IncludeCertificateChain) {
		var ret bool
		return ret
	}
	return *o.IncludeCertificateChain
}

// GetIncludeCertificateChainOk returns a tuple with the IncludeCertificateChain field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IssueRequest) GetIncludeCertificateChainOk() (*bool, bool) {
	if o == nil || IsNil(o.IncludeCertificateChain) {
		return nil, false
	}
	return o.IncludeCertificateChain, true
}

// HasIncludeCertificateChain returns a boolean if a field has been set.
func (o *IssueRequest) HasIncludeCertificateChain() bool {
	if o != nil && !IsNil(o.IncludeCertificateChain) {
		return true
	}

	return false
}

// SetIncludeCertificateChain gets a reference to the given bool and assigns it to the IncludeCertificateChain field.
func (o *IssueRequest) SetIncludeCertificateChain(v bool) {
	o.IncludeCertificateChain = &v
}

func (o IssueRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IssueRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["productReference"] = o.ProductReference
	if !IsNil(o.Csr) {
		toSerialize["csr"] = o.Csr
	}
	if !IsNil(o.Overrides) {
		toSerialize["overrides"] = o.Overrides
	}
	if !IsNil(o.AdditionalRecipients) {
		toSerialize["additionalRecipients"] = o.AdditionalRecipients
	}
	if !IsNil(o.RegistrationDocuments) {
		toSerialize["registrationDocuments"] = o.RegistrationDocuments
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !IsNil(o.Note) {
		toSerialize["note"] = o.Note
	}
	if !IsNil(o.PublishCertificate) {
		toSerialize["publishCertificate"] = o.PublishCertificate
	}
	if !IsNil(o.Synchrone) {
		toSerialize["synchrone"] = o.Synchrone
	}
	if !IsNil(o.AcceptTandC) {
		toSerialize["acceptTandC"] = o.AcceptTandC
	}
	if !IsNil(o.IncludeCertificateChain) {
		toSerialize["includeCertificateChain"] = o.IncludeCertificateChain
	}
	return toSerialize, nil
}

func (o *IssueRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"productReference",
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

	varIssueRequest := _IssueRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varIssueRequest)

	if err != nil {
		return err
	}

	*o = IssueRequest(varIssueRequest)

	return err
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


