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
)

// checks if the RequestOverrides type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RequestOverrides{}

// RequestOverrides struct for RequestOverrides
type RequestOverrides struct {
	// Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c, country (Country)   - o, organization (Organization)   - ou, organizationalUnit (Organizational Unit)   - t, title (Title)    - cn, commonName (Common Name)   - sn, surName (Surname)   - gn, givenName (Given name)   - i, initials (Initials)   - street, streetAddress (Street Address)   - serialnumber (Serial number)   - l, locality (Locality)   - st, state (State)   - e, email, emailAddress (Email)   - dc, domainController (Domain Controller)   - uid (UID)   - generationQualifier, generation (Generation Qualifier)   - description (Description)   - role (Role)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - orgId, organizationIdentifier (Organization Identifier)   - uniqueIdentifier (Unique Identifier)   - name (Name)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - unstructuredaddress (Unstructed Address)   - unstructuredname (Unstructed Name)   - dn (DN Qualifier)   - nameatbirth (Name at Birth)   - countryofcitizenship (Country of Citizenship)   - countryofresidence (Country of Residence)   - gender (Gender)   - placeofbirth (Place of Birth)   - dateofbirth (Date of Birth)   - businesscategory (Business Category)   - telephonenumber (Telephone Number)   - scionisdasnumber (SCION ISD AS Number)   - tpmmanufacturer (TPM Manufacturer)   - tpmmodel (TPM Model)   - tpmversion (TPM Version) 
	SubjectDN *string `json:"subjectDN,omitempty"`
	// Optional certificate validity set if enabled on the Product 
	Validity *int32 `json:"validity,omitempty"`
	RequestExtensions *RequestExtensions `json:"requestExtensions,omitempty"`
}

// NewRequestOverrides instantiates a new RequestOverrides object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRequestOverrides() *RequestOverrides {
	this := RequestOverrides{}
	return &this
}

// NewRequestOverridesWithDefaults instantiates a new RequestOverrides object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRequestOverridesWithDefaults() *RequestOverrides {
	this := RequestOverrides{}
	return &this
}

// GetSubjectDN returns the SubjectDN field value if set, zero value otherwise.
func (o *RequestOverrides) GetSubjectDN() string {
	if o == nil || IsNil(o.SubjectDN) {
		var ret string
		return ret
	}
	return *o.SubjectDN
}

// GetSubjectDNOk returns a tuple with the SubjectDN field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestOverrides) GetSubjectDNOk() (*string, bool) {
	if o == nil || IsNil(o.SubjectDN) {
		return nil, false
	}
	return o.SubjectDN, true
}

// HasSubjectDN returns a boolean if a field has been set.
func (o *RequestOverrides) HasSubjectDN() bool {
	if o != nil && !IsNil(o.SubjectDN) {
		return true
	}

	return false
}

// SetSubjectDN gets a reference to the given string and assigns it to the SubjectDN field.
func (o *RequestOverrides) SetSubjectDN(v string) {
	o.SubjectDN = &v
}

// GetValidity returns the Validity field value if set, zero value otherwise.
func (o *RequestOverrides) GetValidity() int32 {
	if o == nil || IsNil(o.Validity) {
		var ret int32
		return ret
	}
	return *o.Validity
}

// GetValidityOk returns a tuple with the Validity field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestOverrides) GetValidityOk() (*int32, bool) {
	if o == nil || IsNil(o.Validity) {
		return nil, false
	}
	return o.Validity, true
}

// HasValidity returns a boolean if a field has been set.
func (o *RequestOverrides) HasValidity() bool {
	if o != nil && !IsNil(o.Validity) {
		return true
	}

	return false
}

// SetValidity gets a reference to the given int32 and assigns it to the Validity field.
func (o *RequestOverrides) SetValidity(v int32) {
	o.Validity = &v
}

// GetRequestExtensions returns the RequestExtensions field value if set, zero value otherwise.
func (o *RequestOverrides) GetRequestExtensions() RequestExtensions {
	if o == nil || IsNil(o.RequestExtensions) {
		var ret RequestExtensions
		return ret
	}
	return *o.RequestExtensions
}

// GetRequestExtensionsOk returns a tuple with the RequestExtensions field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RequestOverrides) GetRequestExtensionsOk() (*RequestExtensions, bool) {
	if o == nil || IsNil(o.RequestExtensions) {
		return nil, false
	}
	return o.RequestExtensions, true
}

// HasRequestExtensions returns a boolean if a field has been set.
func (o *RequestOverrides) HasRequestExtensions() bool {
	if o != nil && !IsNil(o.RequestExtensions) {
		return true
	}

	return false
}

// SetRequestExtensions gets a reference to the given RequestExtensions and assigns it to the RequestExtensions field.
func (o *RequestOverrides) SetRequestExtensions(v RequestExtensions) {
	o.RequestExtensions = &v
}

func (o RequestOverrides) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RequestOverrides) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.SubjectDN) {
		toSerialize["subjectDN"] = o.SubjectDN
	}
	if !IsNil(o.Validity) {
		toSerialize["validity"] = o.Validity
	}
	if !IsNil(o.RequestExtensions) {
		toSerialize["requestExtensions"] = o.RequestExtensions
	}
	return toSerialize, nil
}

type NullableRequestOverrides struct {
	value *RequestOverrides
	isSet bool
}

func (v NullableRequestOverrides) Get() *RequestOverrides {
	return v.value
}

func (v *NullableRequestOverrides) Set(val *RequestOverrides) {
	v.value = val
	v.isSet = true
}

func (v NullableRequestOverrides) IsSet() bool {
	return v.isSet
}

func (v *NullableRequestOverrides) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRequestOverrides(val *RequestOverrides) *NullableRequestOverrides {
	return &NullableRequestOverrides{value: val, isSet: true}
}

func (v NullableRequestOverrides) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRequestOverrides) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


