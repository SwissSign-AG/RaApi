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

// checks if the DNS type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &DNS{}

// DNS struct for DNS
type DNS struct {
	// requested domain name (gets converted to punycode if required)
	Dns string `json:"dns"`
	// Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option. 
	IncludeBaseDomainForWildcard *bool `json:"includeBaseDomainForWildcard,omitempty"`
	// Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS. 
	IncludeWWWDomain *bool `json:"includeWWWDomain,omitempty"`
}

type _DNS DNS

// NewDNS instantiates a new DNS object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDNS(dns string) *DNS {
	this := DNS{}
	this.Dns = dns
	return &this
}

// NewDNSWithDefaults instantiates a new DNS object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDNSWithDefaults() *DNS {
	this := DNS{}
	return &this
}

// GetDns returns the Dns field value
func (o *DNS) GetDns() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Dns
}

// GetDnsOk returns a tuple with the Dns field value
// and a boolean to check if the value has been set.
func (o *DNS) GetDnsOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Dns, true
}

// SetDns sets field value
func (o *DNS) SetDns(v string) {
	o.Dns = v
}

// GetIncludeBaseDomainForWildcard returns the IncludeBaseDomainForWildcard field value if set, zero value otherwise.
func (o *DNS) GetIncludeBaseDomainForWildcard() bool {
	if o == nil || IsNil(o.IncludeBaseDomainForWildcard) {
		var ret bool
		return ret
	}
	return *o.IncludeBaseDomainForWildcard
}

// GetIncludeBaseDomainForWildcardOk returns a tuple with the IncludeBaseDomainForWildcard field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DNS) GetIncludeBaseDomainForWildcardOk() (*bool, bool) {
	if o == nil || IsNil(o.IncludeBaseDomainForWildcard) {
		return nil, false
	}
	return o.IncludeBaseDomainForWildcard, true
}

// HasIncludeBaseDomainForWildcard returns a boolean if a field has been set.
func (o *DNS) HasIncludeBaseDomainForWildcard() bool {
	if o != nil && !IsNil(o.IncludeBaseDomainForWildcard) {
		return true
	}

	return false
}

// SetIncludeBaseDomainForWildcard gets a reference to the given bool and assigns it to the IncludeBaseDomainForWildcard field.
func (o *DNS) SetIncludeBaseDomainForWildcard(v bool) {
	o.IncludeBaseDomainForWildcard = &v
}

// GetIncludeWWWDomain returns the IncludeWWWDomain field value if set, zero value otherwise.
func (o *DNS) GetIncludeWWWDomain() bool {
	if o == nil || IsNil(o.IncludeWWWDomain) {
		var ret bool
		return ret
	}
	return *o.IncludeWWWDomain
}

// GetIncludeWWWDomainOk returns a tuple with the IncludeWWWDomain field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DNS) GetIncludeWWWDomainOk() (*bool, bool) {
	if o == nil || IsNil(o.IncludeWWWDomain) {
		return nil, false
	}
	return o.IncludeWWWDomain, true
}

// HasIncludeWWWDomain returns a boolean if a field has been set.
func (o *DNS) HasIncludeWWWDomain() bool {
	if o != nil && !IsNil(o.IncludeWWWDomain) {
		return true
	}

	return false
}

// SetIncludeWWWDomain gets a reference to the given bool and assigns it to the IncludeWWWDomain field.
func (o *DNS) SetIncludeWWWDomain(v bool) {
	o.IncludeWWWDomain = &v
}

func (o DNS) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DNS) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["dns"] = o.Dns
	if !IsNil(o.IncludeBaseDomainForWildcard) {
		toSerialize["includeBaseDomainForWildcard"] = o.IncludeBaseDomainForWildcard
	}
	if !IsNil(o.IncludeWWWDomain) {
		toSerialize["includeWWWDomain"] = o.IncludeWWWDomain
	}
	return toSerialize, nil
}

func (o *DNS) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"dns",
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

	varDNS := _DNS{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varDNS)

	if err != nil {
		return err
	}

	*o = DNS(varDNS)

	return err
}

type NullableDNS struct {
	value *DNS
	isSet bool
}

func (v NullableDNS) Get() *DNS {
	return v.value
}

func (v *NullableDNS) Set(val *DNS) {
	v.value = val
	v.isSet = true
}

func (v NullableDNS) IsSet() bool {
	return v.isSet
}

func (v *NullableDNS) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDNS(val *DNS) *NullableDNS {
	return &NullableDNS{value: val, isSet: true}
}

func (v NullableDNS) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDNS) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


