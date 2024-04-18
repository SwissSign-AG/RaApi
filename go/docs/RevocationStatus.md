# RevocationStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RevokedOn** | **time.Time** | Revocation date in UTC | [readonly] 
**Reason** | [**RevocationReason**](RevocationReason.md) |  | 
**RevokedBy** | **string** | email of the person who revoked the certificate | [readonly] 
**RevocationRequestor** | Pointer to [**ModelString**](string,.md) | First- and last name of revocation requestor | [optional] 

## Methods

### NewRevocationStatus

`func NewRevocationStatus(revokedOn time.Time, reason RevocationReason, revokedBy string, ) *RevocationStatus`

NewRevocationStatus instantiates a new RevocationStatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRevocationStatusWithDefaults

`func NewRevocationStatusWithDefaults() *RevocationStatus`

NewRevocationStatusWithDefaults instantiates a new RevocationStatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRevokedOn

`func (o *RevocationStatus) GetRevokedOn() time.Time`

GetRevokedOn returns the RevokedOn field if non-nil, zero value otherwise.

### GetRevokedOnOk

`func (o *RevocationStatus) GetRevokedOnOk() (*time.Time, bool)`

GetRevokedOnOk returns a tuple with the RevokedOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevokedOn

`func (o *RevocationStatus) SetRevokedOn(v time.Time)`

SetRevokedOn sets RevokedOn field to given value.


### GetReason

`func (o *RevocationStatus) GetReason() RevocationReason`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *RevocationStatus) GetReasonOk() (*RevocationReason, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *RevocationStatus) SetReason(v RevocationReason)`

SetReason sets Reason field to given value.


### GetRevokedBy

`func (o *RevocationStatus) GetRevokedBy() string`

GetRevokedBy returns the RevokedBy field if non-nil, zero value otherwise.

### GetRevokedByOk

`func (o *RevocationStatus) GetRevokedByOk() (*string, bool)`

GetRevokedByOk returns a tuple with the RevokedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevokedBy

`func (o *RevocationStatus) SetRevokedBy(v string)`

SetRevokedBy sets RevokedBy field to given value.


### GetRevocationRequestor

`func (o *RevocationStatus) GetRevocationRequestor() ModelString`

GetRevocationRequestor returns the RevocationRequestor field if non-nil, zero value otherwise.

### GetRevocationRequestorOk

`func (o *RevocationStatus) GetRevocationRequestorOk() (*ModelString, bool)`

GetRevocationRequestorOk returns a tuple with the RevocationRequestor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationRequestor

`func (o *RevocationStatus) SetRevocationRequestor(v ModelString)`

SetRevocationRequestor sets RevocationRequestor field to given value.

### HasRevocationRequestor

`func (o *RevocationStatus) HasRevocationRequestor() bool`

HasRevocationRequestor returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


