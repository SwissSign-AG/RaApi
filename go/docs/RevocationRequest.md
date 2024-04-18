# RevocationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SerialNumber** | **string** | Certificate serial number (Big Integer HEX encoded) | 
**RevocationReason** | **string** | Revocation reason | 
**IssuerName** | **string** | Certificate issuer distinguished name | 
**RevocationRequestor** | Pointer to [**ModelString**](string,.md) | First- and last name of revocation requestor. Revocation requestor must be used when API account is of type SERVICE_ACCOUNT | [optional] 

## Methods

### NewRevocationRequest

`func NewRevocationRequest(serialNumber string, revocationReason string, issuerName string, ) *RevocationRequest`

NewRevocationRequest instantiates a new RevocationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRevocationRequestWithDefaults

`func NewRevocationRequestWithDefaults() *RevocationRequest`

NewRevocationRequestWithDefaults instantiates a new RevocationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSerialNumber

`func (o *RevocationRequest) GetSerialNumber() string`

GetSerialNumber returns the SerialNumber field if non-nil, zero value otherwise.

### GetSerialNumberOk

`func (o *RevocationRequest) GetSerialNumberOk() (*string, bool)`

GetSerialNumberOk returns a tuple with the SerialNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSerialNumber

`func (o *RevocationRequest) SetSerialNumber(v string)`

SetSerialNumber sets SerialNumber field to given value.


### GetRevocationReason

`func (o *RevocationRequest) GetRevocationReason() string`

GetRevocationReason returns the RevocationReason field if non-nil, zero value otherwise.

### GetRevocationReasonOk

`func (o *RevocationRequest) GetRevocationReasonOk() (*string, bool)`

GetRevocationReasonOk returns a tuple with the RevocationReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationReason

`func (o *RevocationRequest) SetRevocationReason(v string)`

SetRevocationReason sets RevocationReason field to given value.


### GetIssuerName

`func (o *RevocationRequest) GetIssuerName() string`

GetIssuerName returns the IssuerName field if non-nil, zero value otherwise.

### GetIssuerNameOk

`func (o *RevocationRequest) GetIssuerNameOk() (*string, bool)`

GetIssuerNameOk returns a tuple with the IssuerName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuerName

`func (o *RevocationRequest) SetIssuerName(v string)`

SetIssuerName sets IssuerName field to given value.


### GetRevocationRequestor

`func (o *RevocationRequest) GetRevocationRequestor() ModelString`

GetRevocationRequestor returns the RevocationRequestor field if non-nil, zero value otherwise.

### GetRevocationRequestorOk

`func (o *RevocationRequest) GetRevocationRequestorOk() (*ModelString, bool)`

GetRevocationRequestorOk returns a tuple with the RevocationRequestor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationRequestor

`func (o *RevocationRequest) SetRevocationRequestor(v ModelString)`

SetRevocationRequestor sets RevocationRequestor field to given value.

### HasRevocationRequestor

`func (o *RevocationRequest) HasRevocationRequestor() bool`

HasRevocationRequestor returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


