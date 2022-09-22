/*
SwissSign RA REST API

See https://github.com/SwissSign-AG/RaApi/README.md

API version: 2.0.214
Contact: ssc@swisssign.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package swisssign_ra_api.v2

import (
	"encoding/json"
	"fmt"
)

// KeyType Key generation type
type KeyType string

// List of KeyType
const (
	RSA_2048 KeyType = "rsa_2048"
	RSA_3072 KeyType = "rsa_3072"
	RSA_4096 KeyType = "rsa_4096"
	RSA_8192 KeyType = "rsa_8192"
	EC_SECP224K1 KeyType = "ec_secp224k1"
	EC_SECP224R1 KeyType = "ec_secp224r1"
	EC_SECP256K1 KeyType = "ec_secp256k1"
	EC_SECP256R1 KeyType = "ec_secp256r1"
	EC_SECP384R1 KeyType = "ec_secp384r1"
	EC_SECP521R1 KeyType = "ec_secp521r1"
	EC_X962P239V1 KeyType = "ec_x962p239v1"
	EC_X962P239V2 KeyType = "ec_x962p239v2"
	EC_X962P239V3 KeyType = "ec_x962p239v3"
	EC_BRAINPOOL224R1 KeyType = "ec_brainpool224r1"
	EC_BRAINPOOL256R1 KeyType = "ec_brainpool256r1"
	EC_BRAINPOOL320R1 KeyType = "ec_brainpool320r1"
	EC_BRAINPOOL384R1 KeyType = "ec_brainpool384r1"
	EC_BRAINPOOL512R1 KeyType = "ec_brainpool512r1"
	EC_FRP256V1 KeyType = "ec_frp256v1"
)

// All allowed values of KeyType enum
var AllowedKeyTypeEnumValues = []KeyType{
	"rsa_2048",
	"rsa_3072",
	"rsa_4096",
	"rsa_8192",
	"ec_secp224k1",
	"ec_secp224r1",
	"ec_secp256k1",
	"ec_secp256r1",
	"ec_secp384r1",
	"ec_secp521r1",
	"ec_x962p239v1",
	"ec_x962p239v2",
	"ec_x962p239v3",
	"ec_brainpool224r1",
	"ec_brainpool256r1",
	"ec_brainpool320r1",
	"ec_brainpool384r1",
	"ec_brainpool512r1",
	"ec_frp256v1",
}

func (v *KeyType) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := KeyType(value)
	for _, existing := range AllowedKeyTypeEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid KeyType", value)
}

// NewKeyTypeFromValue returns a pointer to a valid KeyType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewKeyTypeFromValue(v string) (*KeyType, error) {
	ev := KeyType(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for KeyType: valid values are %v", v, AllowedKeyTypeEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v KeyType) IsValid() bool {
	for _, existing := range AllowedKeyTypeEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to KeyType value
func (v KeyType) Ptr() *KeyType {
	return &v
}

type NullableKeyType struct {
	value *KeyType
	isSet bool
}

func (v NullableKeyType) Get() *KeyType {
	return v.value
}

func (v *NullableKeyType) Set(val *KeyType) {
	v.value = val
	v.isSet = true
}

func (v NullableKeyType) IsSet() bool {
	return v.isSet
}

func (v *NullableKeyType) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableKeyType(val *KeyType) *NullableKeyType {
	return &NullableKeyType{value: val, isSet: true}
}

func (v NullableKeyType) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableKeyType) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

