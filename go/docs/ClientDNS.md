# ClientDNS

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Pre validated client domain reference | [readonly] 
**Domain** | **string** | Client domain in punycode | 
**DomainUnicode** | **string** | Client domain in unicode | [readonly] 
**Validated** | **bool** | Indicates if the domain is validated | [readonly] 
**TrustedDomain** | **bool** | Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs. | 
**TimeValidated** | Pointer to **NullableTime** | Indicates when the domain got validated | [optional] [readonly] 
**ValidationMethod** | **string** | DNS validation type | [readonly] 
**RandomValue** | Pointer to **NullableString** | The random value to add to the DNS TXT record for the domain | [optional] [readonly] 
**RandomValueTimeCreated** | Pointer to **time.Time** | Indicates when the random value was created | [optional] [readonly] 
**RandomValueTimeExpire** | Pointer to **time.Time** | Indicates when the random value expires | [optional] [readonly] 
**ValidationResult** | Pointer to **NullableString** | Indicates the validation result | [optional] [readonly] 
**TimeExpired** | Pointer to **NullableTime** | Indicates when the random value was created | [optional] [readonly] 
**Expired** | **bool** | Indicates if the pre validation of the domain has expired | [readonly] 
**RandomValueTimeExpired** | **bool** | Indicates if the random value is expired | [readonly] 
**Status** | Pointer to [**ClientDomainValidationStatus**](ClientDomainValidationStatus.md) |  | [optional] 

## Methods

### NewClientDNS

`func NewClientDNS(uuid string, domain string, domainUnicode string, validated bool, trustedDomain bool, validationMethod string, expired bool, randomValueTimeExpired bool, ) *ClientDNS`

NewClientDNS instantiates a new ClientDNS object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClientDNSWithDefaults

`func NewClientDNSWithDefaults() *ClientDNS`

NewClientDNSWithDefaults instantiates a new ClientDNS object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUuid

`func (o *ClientDNS) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *ClientDNS) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *ClientDNS) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetDomain

`func (o *ClientDNS) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *ClientDNS) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *ClientDNS) SetDomain(v string)`

SetDomain sets Domain field to given value.


### GetDomainUnicode

`func (o *ClientDNS) GetDomainUnicode() string`

GetDomainUnicode returns the DomainUnicode field if non-nil, zero value otherwise.

### GetDomainUnicodeOk

`func (o *ClientDNS) GetDomainUnicodeOk() (*string, bool)`

GetDomainUnicodeOk returns a tuple with the DomainUnicode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomainUnicode

`func (o *ClientDNS) SetDomainUnicode(v string)`

SetDomainUnicode sets DomainUnicode field to given value.


### GetValidated

`func (o *ClientDNS) GetValidated() bool`

GetValidated returns the Validated field if non-nil, zero value otherwise.

### GetValidatedOk

`func (o *ClientDNS) GetValidatedOk() (*bool, bool)`

GetValidatedOk returns a tuple with the Validated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidated

`func (o *ClientDNS) SetValidated(v bool)`

SetValidated sets Validated field to given value.


### GetTrustedDomain

`func (o *ClientDNS) GetTrustedDomain() bool`

GetTrustedDomain returns the TrustedDomain field if non-nil, zero value otherwise.

### GetTrustedDomainOk

`func (o *ClientDNS) GetTrustedDomainOk() (*bool, bool)`

GetTrustedDomainOk returns a tuple with the TrustedDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrustedDomain

`func (o *ClientDNS) SetTrustedDomain(v bool)`

SetTrustedDomain sets TrustedDomain field to given value.


### GetTimeValidated

`func (o *ClientDNS) GetTimeValidated() time.Time`

GetTimeValidated returns the TimeValidated field if non-nil, zero value otherwise.

### GetTimeValidatedOk

`func (o *ClientDNS) GetTimeValidatedOk() (*time.Time, bool)`

GetTimeValidatedOk returns a tuple with the TimeValidated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeValidated

`func (o *ClientDNS) SetTimeValidated(v time.Time)`

SetTimeValidated sets TimeValidated field to given value.

### HasTimeValidated

`func (o *ClientDNS) HasTimeValidated() bool`

HasTimeValidated returns a boolean if a field has been set.

### SetTimeValidatedNil

`func (o *ClientDNS) SetTimeValidatedNil(b bool)`

 SetTimeValidatedNil sets the value for TimeValidated to be an explicit nil

### UnsetTimeValidated
`func (o *ClientDNS) UnsetTimeValidated()`

UnsetTimeValidated ensures that no value is present for TimeValidated, not even an explicit nil
### GetValidationMethod

`func (o *ClientDNS) GetValidationMethod() string`

GetValidationMethod returns the ValidationMethod field if non-nil, zero value otherwise.

### GetValidationMethodOk

`func (o *ClientDNS) GetValidationMethodOk() (*string, bool)`

GetValidationMethodOk returns a tuple with the ValidationMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationMethod

`func (o *ClientDNS) SetValidationMethod(v string)`

SetValidationMethod sets ValidationMethod field to given value.


### GetRandomValue

`func (o *ClientDNS) GetRandomValue() string`

GetRandomValue returns the RandomValue field if non-nil, zero value otherwise.

### GetRandomValueOk

`func (o *ClientDNS) GetRandomValueOk() (*string, bool)`

GetRandomValueOk returns a tuple with the RandomValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomValue

`func (o *ClientDNS) SetRandomValue(v string)`

SetRandomValue sets RandomValue field to given value.

### HasRandomValue

`func (o *ClientDNS) HasRandomValue() bool`

HasRandomValue returns a boolean if a field has been set.

### SetRandomValueNil

`func (o *ClientDNS) SetRandomValueNil(b bool)`

 SetRandomValueNil sets the value for RandomValue to be an explicit nil

### UnsetRandomValue
`func (o *ClientDNS) UnsetRandomValue()`

UnsetRandomValue ensures that no value is present for RandomValue, not even an explicit nil
### GetRandomValueTimeCreated

`func (o *ClientDNS) GetRandomValueTimeCreated() time.Time`

GetRandomValueTimeCreated returns the RandomValueTimeCreated field if non-nil, zero value otherwise.

### GetRandomValueTimeCreatedOk

`func (o *ClientDNS) GetRandomValueTimeCreatedOk() (*time.Time, bool)`

GetRandomValueTimeCreatedOk returns a tuple with the RandomValueTimeCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomValueTimeCreated

`func (o *ClientDNS) SetRandomValueTimeCreated(v time.Time)`

SetRandomValueTimeCreated sets RandomValueTimeCreated field to given value.

### HasRandomValueTimeCreated

`func (o *ClientDNS) HasRandomValueTimeCreated() bool`

HasRandomValueTimeCreated returns a boolean if a field has been set.

### GetRandomValueTimeExpire

`func (o *ClientDNS) GetRandomValueTimeExpire() time.Time`

GetRandomValueTimeExpire returns the RandomValueTimeExpire field if non-nil, zero value otherwise.

### GetRandomValueTimeExpireOk

`func (o *ClientDNS) GetRandomValueTimeExpireOk() (*time.Time, bool)`

GetRandomValueTimeExpireOk returns a tuple with the RandomValueTimeExpire field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomValueTimeExpire

`func (o *ClientDNS) SetRandomValueTimeExpire(v time.Time)`

SetRandomValueTimeExpire sets RandomValueTimeExpire field to given value.

### HasRandomValueTimeExpire

`func (o *ClientDNS) HasRandomValueTimeExpire() bool`

HasRandomValueTimeExpire returns a boolean if a field has been set.

### GetValidationResult

`func (o *ClientDNS) GetValidationResult() string`

GetValidationResult returns the ValidationResult field if non-nil, zero value otherwise.

### GetValidationResultOk

`func (o *ClientDNS) GetValidationResultOk() (*string, bool)`

GetValidationResultOk returns a tuple with the ValidationResult field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidationResult

`func (o *ClientDNS) SetValidationResult(v string)`

SetValidationResult sets ValidationResult field to given value.

### HasValidationResult

`func (o *ClientDNS) HasValidationResult() bool`

HasValidationResult returns a boolean if a field has been set.

### SetValidationResultNil

`func (o *ClientDNS) SetValidationResultNil(b bool)`

 SetValidationResultNil sets the value for ValidationResult to be an explicit nil

### UnsetValidationResult
`func (o *ClientDNS) UnsetValidationResult()`

UnsetValidationResult ensures that no value is present for ValidationResult, not even an explicit nil
### GetTimeExpired

`func (o *ClientDNS) GetTimeExpired() time.Time`

GetTimeExpired returns the TimeExpired field if non-nil, zero value otherwise.

### GetTimeExpiredOk

`func (o *ClientDNS) GetTimeExpiredOk() (*time.Time, bool)`

GetTimeExpiredOk returns a tuple with the TimeExpired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeExpired

`func (o *ClientDNS) SetTimeExpired(v time.Time)`

SetTimeExpired sets TimeExpired field to given value.

### HasTimeExpired

`func (o *ClientDNS) HasTimeExpired() bool`

HasTimeExpired returns a boolean if a field has been set.

### SetTimeExpiredNil

`func (o *ClientDNS) SetTimeExpiredNil(b bool)`

 SetTimeExpiredNil sets the value for TimeExpired to be an explicit nil

### UnsetTimeExpired
`func (o *ClientDNS) UnsetTimeExpired()`

UnsetTimeExpired ensures that no value is present for TimeExpired, not even an explicit nil
### GetExpired

`func (o *ClientDNS) GetExpired() bool`

GetExpired returns the Expired field if non-nil, zero value otherwise.

### GetExpiredOk

`func (o *ClientDNS) GetExpiredOk() (*bool, bool)`

GetExpiredOk returns a tuple with the Expired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpired

`func (o *ClientDNS) SetExpired(v bool)`

SetExpired sets Expired field to given value.


### GetRandomValueTimeExpired

`func (o *ClientDNS) GetRandomValueTimeExpired() bool`

GetRandomValueTimeExpired returns the RandomValueTimeExpired field if non-nil, zero value otherwise.

### GetRandomValueTimeExpiredOk

`func (o *ClientDNS) GetRandomValueTimeExpiredOk() (*bool, bool)`

GetRandomValueTimeExpiredOk returns a tuple with the RandomValueTimeExpired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRandomValueTimeExpired

`func (o *ClientDNS) SetRandomValueTimeExpired(v bool)`

SetRandomValueTimeExpired sets RandomValueTimeExpired field to given value.


### GetStatus

`func (o *ClientDNS) GetStatus() ClientDomainValidationStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ClientDNS) GetStatusOk() (*ClientDomainValidationStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ClientDNS) SetStatus(v ClientDomainValidationStatus)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ClientDNS) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


