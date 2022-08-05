# CertificateRevocationStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RevokedOn** | **time.Time** | Revocation date in UTC | [readonly] 
**Reason** | [**RevocationReason**](RevocationReason.md) |  | 
**RevokedBy** | **string** | email of the person who revoked the certificate | [readonly] 

## Methods

### NewCertificateRevocationStatus

`func NewCertificateRevocationStatus(revokedOn time.Time, reason RevocationReason, revokedBy string, ) *CertificateRevocationStatus`

NewCertificateRevocationStatus instantiates a new CertificateRevocationStatus object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCertificateRevocationStatusWithDefaults

`func NewCertificateRevocationStatusWithDefaults() *CertificateRevocationStatus`

NewCertificateRevocationStatusWithDefaults instantiates a new CertificateRevocationStatus object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRevokedOn

`func (o *CertificateRevocationStatus) GetRevokedOn() time.Time`

GetRevokedOn returns the RevokedOn field if non-nil, zero value otherwise.

### GetRevokedOnOk

`func (o *CertificateRevocationStatus) GetRevokedOnOk() (*time.Time, bool)`

GetRevokedOnOk returns a tuple with the RevokedOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevokedOn

`func (o *CertificateRevocationStatus) SetRevokedOn(v time.Time)`

SetRevokedOn sets RevokedOn field to given value.


### GetReason

`func (o *CertificateRevocationStatus) GetReason() RevocationReason`

GetReason returns the Reason field if non-nil, zero value otherwise.

### GetReasonOk

`func (o *CertificateRevocationStatus) GetReasonOk() (*RevocationReason, bool)`

GetReasonOk returns a tuple with the Reason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReason

`func (o *CertificateRevocationStatus) SetReason(v RevocationReason)`

SetReason sets Reason field to given value.


### GetRevokedBy

`func (o *CertificateRevocationStatus) GetRevokedBy() string`

GetRevokedBy returns the RevokedBy field if non-nil, zero value otherwise.

### GetRevokedByOk

`func (o *CertificateRevocationStatus) GetRevokedByOk() (*string, bool)`

GetRevokedByOk returns a tuple with the RevokedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevokedBy

`func (o *CertificateRevocationStatus) SetRevokedBy(v string)`

SetRevokedBy sets RevokedBy field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


