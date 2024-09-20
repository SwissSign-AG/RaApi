/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.5.13
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
)

// RequestExtensions struct for RequestExtensions
type RequestExtensions struct {
	// Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy 
	MicrosoftSecurityIdentifier NullableString `json:"microsoftSecurityIdentifier,omitempty"`
	// Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy 
	MicrosoftPolicyTemplateOID NullableString `json:"microsoftPolicyTemplateOID,omitempty"`
	RequestDNS *RequestDNS `json:"requestDNS,omitempty"`
	RequestRFC822 *RequestRFC822 `json:"requestRFC822,omitempty"`
	RequestUPN *RequestUPN `json:"requestUPN,omitempty"`
	RequestIP *RequestIP `json:"requestIP,omitempty"`
}

// NewRequestExtensions instantiates a new RequestExtensions object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestExtensions() *RequestExtensions {
	this := RequestExtensions{}
	return &this
}

// NewRequestExtensionsWithDefaults instantiates a new RequestExtensions object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestExtensionsWithDefaults() *RequestExtensions {
	this := RequestExtensions{}
	return &this
}

// GetMicrosoftSecurityIdentifier returns the MicrosoftSecurityIdentifier field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RequestExtensions) GetMicrosoftSecurityIdentifier() string {
	if o == nil || o.MicrosoftSecurityIdentifier.Get() == nil {
		var ret string
		return ret
	}
	return *o.MicrosoftSecurityIdentifier.Get()
}

// GetMicrosoftSecurityIdentifierOk returns a tuple with the MicrosoftSecurityIdentifier field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RequestExtensions) GetMicrosoftSecurityIdentifierOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.MicrosoftSecurityIdentifier.Get(), o.MicrosoftSecurityIdentifier.IsSet()
}

// HasMicrosoftSecurityIdentifier returns a boolean if a field has been set.
func (o *RequestExtensions) HasMicrosoftSecurityIdentifier() bool {
	if o != nil && o.MicrosoftSecurityIdentifier.IsSet() {
		return true
	}

	return false
}

// SetMicrosoftSecurityIdentifier gets a reference to the given NullableString and assigns it to the MicrosoftSecurityIdentifier field.
func (o *RequestExtensions) SetMicrosoftSecurityIdentifier(v string) {
	o.MicrosoftSecurityIdentifier.Set(&v)
}
// SetMicrosoftSecurityIdentifierNil sets the value for MicrosoftSecurityIdentifier to be an explicit nil
func (o *RequestExtensions) SetMicrosoftSecurityIdentifierNil() {
	o.MicrosoftSecurityIdentifier.Set(nil)
}

// UnsetMicrosoftSecurityIdentifier ensures that no value is present for MicrosoftSecurityIdentifier, not even an explicit nil
func (o *RequestExtensions) UnsetMicrosoftSecurityIdentifier() {
	o.MicrosoftSecurityIdentifier.Unset()
}

// GetMicrosoftPolicyTemplateOID returns the MicrosoftPolicyTemplateOID field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *RequestExtensions) GetMicrosoftPolicyTemplateOID() string {
	if o == nil || o.MicrosoftPolicyTemplateOID.Get() == nil {
		var ret string
		return ret
	}
	return *o.MicrosoftPolicyTemplateOID.Get()
}

// GetMicrosoftPolicyTemplateOIDOk returns a tuple with the MicrosoftPolicyTemplateOID field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *RequestExtensions) GetMicrosoftPolicyTemplateOIDOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.MicrosoftPolicyTemplateOID.Get(), o.MicrosoftPolicyTemplateOID.IsSet()
}

// HasMicrosoftPolicyTemplateOID returns a boolean if a field has been set.
func (o *RequestExtensions) HasMicrosoftPolicyTemplateOID() bool {
	if o != nil && o.MicrosoftPolicyTemplateOID.IsSet() {
		return true
	}

	return false
}

// SetMicrosoftPolicyTemplateOID gets a reference to the given NullableString and assigns it to the MicrosoftPolicyTemplateOID field.
func (o *RequestExtensions) SetMicrosoftPolicyTemplateOID(v string) {
	o.MicrosoftPolicyTemplateOID.Set(&v)
}
// SetMicrosoftPolicyTemplateOIDNil sets the value for MicrosoftPolicyTemplateOID to be an explicit nil
func (o *RequestExtensions) SetMicrosoftPolicyTemplateOIDNil() {
	o.MicrosoftPolicyTemplateOID.Set(nil)
}

// UnsetMicrosoftPolicyTemplateOID ensures that no value is present for MicrosoftPolicyTemplateOID, not even an explicit nil
func (o *RequestExtensions) UnsetMicrosoftPolicyTemplateOID() {
	o.MicrosoftPolicyTemplateOID.Unset()
}

// GetRequestDNS returns the RequestDNS field value if set, zero value otherwise.
func (o *RequestExtensions) GetRequestDNS() RequestDNS {
	if o == nil || o.RequestDNS == nil {
		var ret RequestDNS
		return ret
	}
	return *o.RequestDNS
}

// GetRequestDNSOk returns a tuple with the RequestDNS field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestExtensions) GetRequestDNSOk() (*RequestDNS, bool) {
	if o == nil || o.RequestDNS == nil {
		return nil, false
	}
	return o.RequestDNS, true
}

// HasRequestDNS returns a boolean if a field has been set.
func (o *RequestExtensions) HasRequestDNS() bool {
	if o != nil && o.RequestDNS != nil {
		return true
	}

	return false
}

// SetRequestDNS gets a reference to the given RequestDNS and assigns it to the RequestDNS field.
func (o *RequestExtensions) SetRequestDNS(v RequestDNS) {
	o.RequestDNS = &v
}

// GetRequestRFC822 returns the RequestRFC822 field value if set, zero value otherwise.
func (o *RequestExtensions) GetRequestRFC822() RequestRFC822 {
	if o == nil || o.RequestRFC822 == nil {
		var ret RequestRFC822
		return ret
	}
	return *o.RequestRFC822
}

// GetRequestRFC822Ok returns a tuple with the RequestRFC822 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestExtensions) GetRequestRFC822Ok() (*RequestRFC822, bool) {
	if o == nil || o.RequestRFC822 == nil {
		return nil, false
	}
	return o.RequestRFC822, true
}

// HasRequestRFC822 returns a boolean if a field has been set.
func (o *RequestExtensions) HasRequestRFC822() bool {
	if o != nil && o.RequestRFC822 != nil {
		return true
	}

	return false
}

// SetRequestRFC822 gets a reference to the given RequestRFC822 and assigns it to the RequestRFC822 field.
func (o *RequestExtensions) SetRequestRFC822(v RequestRFC822) {
	o.RequestRFC822 = &v
}

// GetRequestUPN returns the RequestUPN field value if set, zero value otherwise.
func (o *RequestExtensions) GetRequestUPN() RequestUPN {
	if o == nil || o.RequestUPN == nil {
		var ret RequestUPN
		return ret
	}
	return *o.RequestUPN
}

// GetRequestUPNOk returns a tuple with the RequestUPN field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestExtensions) GetRequestUPNOk() (*RequestUPN, bool) {
	if o == nil || o.RequestUPN == nil {
		return nil, false
	}
	return o.RequestUPN, true
}

// HasRequestUPN returns a boolean if a field has been set.
func (o *RequestExtensions) HasRequestUPN() bool {
	if o != nil && o.RequestUPN != nil {
		return true
	}

	return false
}

// SetRequestUPN gets a reference to the given RequestUPN and assigns it to the RequestUPN field.
func (o *RequestExtensions) SetRequestUPN(v RequestUPN) {
	o.RequestUPN = &v
}

// GetRequestIP returns the RequestIP field value if set, zero value otherwise.
func (o *RequestExtensions) GetRequestIP() RequestIP {
	if o == nil || o.RequestIP == nil {
		var ret RequestIP
		return ret
	}
	return *o.RequestIP
}

// GetRequestIPOk returns a tuple with the RequestIP field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestExtensions) GetRequestIPOk() (*RequestIP, bool) {
	if o == nil || o.RequestIP == nil {
		return nil, false
	}
	return o.RequestIP, true
}

// HasRequestIP returns a boolean if a field has been set.
func (o *RequestExtensions) HasRequestIP() bool {
	if o != nil && o.RequestIP != nil {
		return true
	}

	return false
}

// SetRequestIP gets a reference to the given RequestIP and assigns it to the RequestIP field.
func (o *RequestExtensions) SetRequestIP(v RequestIP) {
	o.RequestIP = &v
}

func (o RequestExtensions) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.MicrosoftSecurityIdentifier.IsSet() {
		toSerialize["microsoftSecurityIdentifier"] = o.MicrosoftSecurityIdentifier.Get()
	}
	if o.MicrosoftPolicyTemplateOID.IsSet() {
		toSerialize["microsoftPolicyTemplateOID"] = o.MicrosoftPolicyTemplateOID.Get()
	}
	if o.RequestDNS != nil {
		toSerialize["requestDNS"] = o.RequestDNS
	}
	if o.RequestRFC822 != nil {
		toSerialize["requestRFC822"] = o.RequestRFC822
	}
	if o.RequestUPN != nil {
		toSerialize["requestUPN"] = o.RequestUPN
	}
	if o.RequestIP != nil {
		toSerialize["requestIP"] = o.RequestIP
	}
	return json.Marshal(toSerialize)
}

type NullableRequestExtensions struct {
	value *RequestExtensions
	isSet bool
}

func (v NullableRequestExtensions) Get() *RequestExtensions {
	return v.value
}

func (v *NullableRequestExtensions) Set(val *RequestExtensions) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestExtensions) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestExtensions) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestExtensions(val *RequestExtensions) *NullableRequestExtensions {
	return &NullableRequestExtensions{value: val, isSet: true}
}

func (v NullableRequestExtensions) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestExtensions) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


