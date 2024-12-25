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

// AdditionalRecipient struct for AdditionalRecipient
type AdditionalRecipient struct {
	// RFC822 email
	Email string `json:"email"`
	// Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for 'Additional recipient' on notification template. 
	RecipientType string `json:"recipientType"`
	// Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages. 
	Language string `json:"language"`
}

// NewAdditionalRecipient instantiates a new AdditionalRecipient object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAdditionalRecipient(email string, recipientType string, language string) *AdditionalRecipient {
	this := AdditionalRecipient{}
	this.Email = email
	this.RecipientType = recipientType
	this.Language = language
	return &this
}

// NewAdditionalRecipientWithDefaults instantiates a new AdditionalRecipient object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAdditionalRecipientWithDefaults() *AdditionalRecipient {
	this := AdditionalRecipient{}
	return &this
}

// GetEmail returns the Email field value
func (o *AdditionalRecipient) GetEmail() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Email
}

// GetEmailOk returns a tuple with the Email field value
// and a boolean to check if the value has been set.
func (o *AdditionalRecipient) GetEmailOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Email, true
}

// SetEmail sets field value
func (o *AdditionalRecipient) SetEmail(v string) {
	o.Email = v
}

// GetRecipientType returns the RecipientType field value
func (o *AdditionalRecipient) GetRecipientType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RecipientType
}

// GetRecipientTypeOk returns a tuple with the RecipientType field value
// and a boolean to check if the value has been set.
func (o *AdditionalRecipient) GetRecipientTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RecipientType, true
}

// SetRecipientType sets field value
func (o *AdditionalRecipient) SetRecipientType(v string) {
	o.RecipientType = v
}

// GetLanguage returns the Language field value
func (o *AdditionalRecipient) GetLanguage() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Language
}

// GetLanguageOk returns a tuple with the Language field value
// and a boolean to check if the value has been set.
func (o *AdditionalRecipient) GetLanguageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Language, true
}

// SetLanguage sets field value
func (o *AdditionalRecipient) SetLanguage(v string) {
	o.Language = v
}

func (o AdditionalRecipient) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["email"] = o.Email
	}
	if true {
		toSerialize["recipientType"] = o.RecipientType
	}
	if true {
		toSerialize["language"] = o.Language
	}
	return json.Marshal(toSerialize)
}

type NullableAdditionalRecipient struct {
	value *AdditionalRecipient
	isSet bool
}

func (v NullableAdditionalRecipient) Get() *AdditionalRecipient {
	return v.value
}

func (v *NullableAdditionalRecipient) Set(val *AdditionalRecipient) {
	v.value = val
	v.isSet = true
}

func (v NullableAdditionalRecipient) IsSet() bool {
	return v.isSet
}

func (v *NullableAdditionalRecipient) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAdditionalRecipient(val *AdditionalRecipient) *NullableAdditionalRecipient {
	return &NullableAdditionalRecipient{value: val, isSet: true}
}

func (v NullableAdditionalRecipient) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAdditionalRecipient) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


