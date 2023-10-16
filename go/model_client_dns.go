/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.3.6
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"time"
)

// ClientDNS struct for ClientDNS
type ClientDNS struct {
	// Pre validated client domain reference
	Uuid string `json:"uuid"`
	// Client domain in punycode
	Domain string `json:"domain"`
	// Client domain in unicode
	DomainUnicode string `json:"domainUnicode"`
	// Indicates if the domain is validated
	Validated bool `json:"validated"`
	// Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs.
	TrustedDomain bool `json:"trustedDomain"`
	// Indicates when the domain got validated
	TimeValidated NullableTime `json:"timeValidated,omitempty"`
	// DNS validation type
	ValidationMethod string `json:"validationMethod"`
	// The random value to add to the DNS TXT record for the domain
	RandomValue NullableString `json:"randomValue,omitempty"`
	// Indicates when the random value was created
	RandomValueTimeCreated *time.Time `json:"randomValueTimeCreated,omitempty"`
	// Indicates when the random value expires
	RandomValueTimeExpire *time.Time `json:"randomValueTimeExpire,omitempty"`
	// Indicates the validation result
	ValidationResult NullableString `json:"validationResult,omitempty"`
	// Indicates when the random value was created
	TimeExpired NullableTime `json:"timeExpired,omitempty"`
	// Indicates if the pre validation of the domain has expired
	Expired bool `json:"expired"`
	// Indicates if the random value is expired
	RandomValueTimeExpired bool `json:"randomValueTimeExpired"`
	Status *ClientDomainValidationStatus `json:"status,omitempty"`
}

// NewClientDNS instantiates a new ClientDNS object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClientDNS(uuid string, domain string, domainUnicode string, validated bool, trustedDomain bool, validationMethod string, expired bool, randomValueTimeExpired bool) *ClientDNS {
	this := ClientDNS{}
	this.Uuid = uuid
	this.Domain = domain
	this.DomainUnicode = domainUnicode
	this.Validated = validated
	this.TrustedDomain = trustedDomain
	this.ValidationMethod = validationMethod
	this.Expired = expired
	this.RandomValueTimeExpired = randomValueTimeExpired
	return &this
}

// NewClientDNSWithDefaults instantiates a new ClientDNS object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClientDNSWithDefaults() *ClientDNS {
	this := ClientDNS{}
	return &this
}

// GetUuid returns the Uuid field value
func (o *ClientDNS) GetUuid() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Uuid
}

// GetUuidOk returns a tuple with the Uuid field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetUuidOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Uuid, true
}

// SetUuid sets field value
func (o *ClientDNS) SetUuid(v string) {
	o.Uuid = v
}

// GetDomain returns the Domain field value
func (o *ClientDNS) GetDomain() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Domain
}

// GetDomainOk returns a tuple with the Domain field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetDomainOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Domain, true
}

// SetDomain sets field value
func (o *ClientDNS) SetDomain(v string) {
	o.Domain = v
}

// GetDomainUnicode returns the DomainUnicode field value
func (o *ClientDNS) GetDomainUnicode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.DomainUnicode
}

// GetDomainUnicodeOk returns a tuple with the DomainUnicode field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetDomainUnicodeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.DomainUnicode, true
}

// SetDomainUnicode sets field value
func (o *ClientDNS) SetDomainUnicode(v string) {
	o.DomainUnicode = v
}

// GetValidated returns the Validated field value
func (o *ClientDNS) GetValidated() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Validated
}

// GetValidatedOk returns a tuple with the Validated field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetValidatedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Validated, true
}

// SetValidated sets field value
func (o *ClientDNS) SetValidated(v bool) {
	o.Validated = v
}

// GetTrustedDomain returns the TrustedDomain field value
func (o *ClientDNS) GetTrustedDomain() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.TrustedDomain
}

// GetTrustedDomainOk returns a tuple with the TrustedDomain field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetTrustedDomainOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TrustedDomain, true
}

// SetTrustedDomain sets field value
func (o *ClientDNS) SetTrustedDomain(v bool) {
	o.TrustedDomain = v
}

// GetTimeValidated returns the TimeValidated field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ClientDNS) GetTimeValidated() time.Time {
	if o == nil || o.TimeValidated.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.TimeValidated.Get()
}

// GetTimeValidatedOk returns a tuple with the TimeValidated field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ClientDNS) GetTimeValidatedOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.TimeValidated.Get(), o.TimeValidated.IsSet()
}

// HasTimeValidated returns a boolean if a field has been set.
func (o *ClientDNS) HasTimeValidated() bool {
	if o != nil && o.TimeValidated.IsSet() {
		return true
	}

	return false
}

// SetTimeValidated gets a reference to the given NullableTime and assigns it to the TimeValidated field.
func (o *ClientDNS) SetTimeValidated(v time.Time) {
	o.TimeValidated.Set(&v)
}
// SetTimeValidatedNil sets the value for TimeValidated to be an explicit nil
func (o *ClientDNS) SetTimeValidatedNil() {
	o.TimeValidated.Set(nil)
}

// UnsetTimeValidated ensures that no value is present for TimeValidated, not even an explicit nil
func (o *ClientDNS) UnsetTimeValidated() {
	o.TimeValidated.Unset()
}

// GetValidationMethod returns the ValidationMethod field value
func (o *ClientDNS) GetValidationMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ValidationMethod
}

// GetValidationMethodOk returns a tuple with the ValidationMethod field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetValidationMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ValidationMethod, true
}

// SetValidationMethod sets field value
func (o *ClientDNS) SetValidationMethod(v string) {
	o.ValidationMethod = v
}

// GetRandomValue returns the RandomValue field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ClientDNS) GetRandomValue() string {
	if o == nil || o.RandomValue.Get() == nil {
		var ret string
		return ret
	}
	return *o.RandomValue.Get()
}

// GetRandomValueOk returns a tuple with the RandomValue field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ClientDNS) GetRandomValueOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.RandomValue.Get(), o.RandomValue.IsSet()
}

// HasRandomValue returns a boolean if a field has been set.
func (o *ClientDNS) HasRandomValue() bool {
	if o != nil && o.RandomValue.IsSet() {
		return true
	}

	return false
}

// SetRandomValue gets a reference to the given NullableString and assigns it to the RandomValue field.
func (o *ClientDNS) SetRandomValue(v string) {
	o.RandomValue.Set(&v)
}
// SetRandomValueNil sets the value for RandomValue to be an explicit nil
func (o *ClientDNS) SetRandomValueNil() {
	o.RandomValue.Set(nil)
}

// UnsetRandomValue ensures that no value is present for RandomValue, not even an explicit nil
func (o *ClientDNS) UnsetRandomValue() {
	o.RandomValue.Unset()
}

// GetRandomValueTimeCreated returns the RandomValueTimeCreated field value if set, zero value otherwise.
func (o *ClientDNS) GetRandomValueTimeCreated() time.Time {
	if o == nil || o.RandomValueTimeCreated == nil {
		var ret time.Time
		return ret
	}
	return *o.RandomValueTimeCreated
}

// GetRandomValueTimeCreatedOk returns a tuple with the RandomValueTimeCreated field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetRandomValueTimeCreatedOk() (*time.Time, bool) {
	if o == nil || o.RandomValueTimeCreated == nil {
		return nil, false
	}
	return o.RandomValueTimeCreated, true
}

// HasRandomValueTimeCreated returns a boolean if a field has been set.
func (o *ClientDNS) HasRandomValueTimeCreated() bool {
	if o != nil && o.RandomValueTimeCreated != nil {
		return true
	}

	return false
}

// SetRandomValueTimeCreated gets a reference to the given time.Time and assigns it to the RandomValueTimeCreated field.
func (o *ClientDNS) SetRandomValueTimeCreated(v time.Time) {
	o.RandomValueTimeCreated = &v
}

// GetRandomValueTimeExpire returns the RandomValueTimeExpire field value if set, zero value otherwise.
func (o *ClientDNS) GetRandomValueTimeExpire() time.Time {
	if o == nil || o.RandomValueTimeExpire == nil {
		var ret time.Time
		return ret
	}
	return *o.RandomValueTimeExpire
}

// GetRandomValueTimeExpireOk returns a tuple with the RandomValueTimeExpire field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetRandomValueTimeExpireOk() (*time.Time, bool) {
	if o == nil || o.RandomValueTimeExpire == nil {
		return nil, false
	}
	return o.RandomValueTimeExpire, true
}

// HasRandomValueTimeExpire returns a boolean if a field has been set.
func (o *ClientDNS) HasRandomValueTimeExpire() bool {
	if o != nil && o.RandomValueTimeExpire != nil {
		return true
	}

	return false
}

// SetRandomValueTimeExpire gets a reference to the given time.Time and assigns it to the RandomValueTimeExpire field.
func (o *ClientDNS) SetRandomValueTimeExpire(v time.Time) {
	o.RandomValueTimeExpire = &v
}

// GetValidationResult returns the ValidationResult field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ClientDNS) GetValidationResult() string {
	if o == nil || o.ValidationResult.Get() == nil {
		var ret string
		return ret
	}
	return *o.ValidationResult.Get()
}

// GetValidationResultOk returns a tuple with the ValidationResult field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ClientDNS) GetValidationResultOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.ValidationResult.Get(), o.ValidationResult.IsSet()
}

// HasValidationResult returns a boolean if a field has been set.
func (o *ClientDNS) HasValidationResult() bool {
	if o != nil && o.ValidationResult.IsSet() {
		return true
	}

	return false
}

// SetValidationResult gets a reference to the given NullableString and assigns it to the ValidationResult field.
func (o *ClientDNS) SetValidationResult(v string) {
	o.ValidationResult.Set(&v)
}
// SetValidationResultNil sets the value for ValidationResult to be an explicit nil
func (o *ClientDNS) SetValidationResultNil() {
	o.ValidationResult.Set(nil)
}

// UnsetValidationResult ensures that no value is present for ValidationResult, not even an explicit nil
func (o *ClientDNS) UnsetValidationResult() {
	o.ValidationResult.Unset()
}

// GetTimeExpired returns the TimeExpired field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ClientDNS) GetTimeExpired() time.Time {
	if o == nil || o.TimeExpired.Get() == nil {
		var ret time.Time
		return ret
	}
	return *o.TimeExpired.Get()
}

// GetTimeExpiredOk returns a tuple with the TimeExpired field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ClientDNS) GetTimeExpiredOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return o.TimeExpired.Get(), o.TimeExpired.IsSet()
}

// HasTimeExpired returns a boolean if a field has been set.
func (o *ClientDNS) HasTimeExpired() bool {
	if o != nil && o.TimeExpired.IsSet() {
		return true
	}

	return false
}

// SetTimeExpired gets a reference to the given NullableTime and assigns it to the TimeExpired field.
func (o *ClientDNS) SetTimeExpired(v time.Time) {
	o.TimeExpired.Set(&v)
}
// SetTimeExpiredNil sets the value for TimeExpired to be an explicit nil
func (o *ClientDNS) SetTimeExpiredNil() {
	o.TimeExpired.Set(nil)
}

// UnsetTimeExpired ensures that no value is present for TimeExpired, not even an explicit nil
func (o *ClientDNS) UnsetTimeExpired() {
	o.TimeExpired.Unset()
}

// GetExpired returns the Expired field value
func (o *ClientDNS) GetExpired() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Expired
}

// GetExpiredOk returns a tuple with the Expired field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetExpiredOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Expired, true
}

// SetExpired sets field value
func (o *ClientDNS) SetExpired(v bool) {
	o.Expired = v
}

// GetRandomValueTimeExpired returns the RandomValueTimeExpired field value
func (o *ClientDNS) GetRandomValueTimeExpired() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.RandomValueTimeExpired
}

// GetRandomValueTimeExpiredOk returns a tuple with the RandomValueTimeExpired field value
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetRandomValueTimeExpiredOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RandomValueTimeExpired, true
}

// SetRandomValueTimeExpired sets field value
func (o *ClientDNS) SetRandomValueTimeExpired(v bool) {
	o.RandomValueTimeExpired = v
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *ClientDNS) GetStatus() ClientDomainValidationStatus {
	if o == nil || o.Status == nil {
		var ret ClientDomainValidationStatus
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ClientDNS) GetStatusOk() (*ClientDomainValidationStatus, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *ClientDNS) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given ClientDomainValidationStatus and assigns it to the Status field.
func (o *ClientDNS) SetStatus(v ClientDomainValidationStatus) {
	o.Status = &v
}

func (o ClientDNS) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["uuid"] = o.Uuid
	}
	if true {
		toSerialize["domain"] = o.Domain
	}
	if true {
		toSerialize["domainUnicode"] = o.DomainUnicode
	}
	if true {
		toSerialize["validated"] = o.Validated
	}
	if true {
		toSerialize["trustedDomain"] = o.TrustedDomain
	}
	if o.TimeValidated.IsSet() {
		toSerialize["timeValidated"] = o.TimeValidated.Get()
	}
	if true {
		toSerialize["validationMethod"] = o.ValidationMethod
	}
	if o.RandomValue.IsSet() {
		toSerialize["randomValue"] = o.RandomValue.Get()
	}
	if o.RandomValueTimeCreated != nil {
		toSerialize["randomValueTimeCreated"] = o.RandomValueTimeCreated
	}
	if o.RandomValueTimeExpire != nil {
		toSerialize["randomValueTimeExpire"] = o.RandomValueTimeExpire
	}
	if o.ValidationResult.IsSet() {
		toSerialize["validationResult"] = o.ValidationResult.Get()
	}
	if o.TimeExpired.IsSet() {
		toSerialize["timeExpired"] = o.TimeExpired.Get()
	}
	if true {
		toSerialize["expired"] = o.Expired
	}
	if true {
		toSerialize["randomValueTimeExpired"] = o.RandomValueTimeExpired
	}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}
	return json.Marshal(toSerialize)
}

type NullableClientDNS struct {
	value *ClientDNS
	isSet bool
}

func (v NullableClientDNS) Get() *ClientDNS {
	return v.value
}

func (v *NullableClientDNS) Set(val *ClientDNS) {
	v.value = val
	v.isSet = true
}

func (v NullableClientDNS) IsSet() bool {
	return v.isSet
}

func (v *NullableClientDNS) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClientDNS(val *ClientDNS) *NullableClientDNS {
	return &NullableClientDNS{value: val, isSet: true}
}

func (v NullableClientDNS) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClientDNS) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


