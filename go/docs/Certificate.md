# Certificate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Subject** | **string** | Certificate Subject Distinguished Name | [readonly] 
**Issuer** | **string** | Certificate Issuer Distinguished Name | [readonly] 
**Serial** | **string** | Certificate serial number (Big Integer HEX encoded) | [readonly] 
**StartValidity** | **time.Time** | Certificate start validity in UTC | [readonly] 
**EndValidity** | **time.Time** | Certificate start validity in UTC | [readonly] 
**Certificate** | **string** | base64 encoded DER certificate | [readonly] 
**RevocationStatus** | Pointer to [**RevocationStatus**](RevocationStatus.md) |  | [optional] 

## Methods

### NewCertificate

`func NewCertificate(subject string, issuer string, serial string, startValidity time.Time, endValidity time.Time, certificate string, ) *Certificate`

NewCertificate instantiates a new Certificate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCertificateWithDefaults

`func NewCertificateWithDefaults() *Certificate`

NewCertificateWithDefaults instantiates a new Certificate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubject

`func (o *Certificate) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *Certificate) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *Certificate) SetSubject(v string)`

SetSubject sets Subject field to given value.


### GetIssuer

`func (o *Certificate) GetIssuer() string`

GetIssuer returns the Issuer field if non-nil, zero value otherwise.

### GetIssuerOk

`func (o *Certificate) GetIssuerOk() (*string, bool)`

GetIssuerOk returns a tuple with the Issuer field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuer

`func (o *Certificate) SetIssuer(v string)`

SetIssuer sets Issuer field to given value.


### GetSerial

`func (o *Certificate) GetSerial() string`

GetSerial returns the Serial field if non-nil, zero value otherwise.

### GetSerialOk

`func (o *Certificate) GetSerialOk() (*string, bool)`

GetSerialOk returns a tuple with the Serial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSerial

`func (o *Certificate) SetSerial(v string)`

SetSerial sets Serial field to given value.


### GetStartValidity

`func (o *Certificate) GetStartValidity() time.Time`

GetStartValidity returns the StartValidity field if non-nil, zero value otherwise.

### GetStartValidityOk

`func (o *Certificate) GetStartValidityOk() (*time.Time, bool)`

GetStartValidityOk returns a tuple with the StartValidity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartValidity

`func (o *Certificate) SetStartValidity(v time.Time)`

SetStartValidity sets StartValidity field to given value.


### GetEndValidity

`func (o *Certificate) GetEndValidity() time.Time`

GetEndValidity returns the EndValidity field if non-nil, zero value otherwise.

### GetEndValidityOk

`func (o *Certificate) GetEndValidityOk() (*time.Time, bool)`

GetEndValidityOk returns a tuple with the EndValidity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndValidity

`func (o *Certificate) SetEndValidity(v time.Time)`

SetEndValidity sets EndValidity field to given value.


### GetCertificate

`func (o *Certificate) GetCertificate() string`

GetCertificate returns the Certificate field if non-nil, zero value otherwise.

### GetCertificateOk

`func (o *Certificate) GetCertificateOk() (*string, bool)`

GetCertificateOk returns a tuple with the Certificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificate

`func (o *Certificate) SetCertificate(v string)`

SetCertificate sets Certificate field to given value.


### GetRevocationStatus

`func (o *Certificate) GetRevocationStatus() RevocationStatus`

GetRevocationStatus returns the RevocationStatus field if non-nil, zero value otherwise.

### GetRevocationStatusOk

`func (o *Certificate) GetRevocationStatusOk() (*RevocationStatus, bool)`

GetRevocationStatusOk returns a tuple with the RevocationStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationStatus

`func (o *Certificate) SetRevocationStatus(v RevocationStatus)`

SetRevocationStatus sets RevocationStatus field to given value.

### HasRevocationStatus

`func (o *Certificate) HasRevocationStatus() bool`

HasRevocationStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


