# CertificateOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Certificate Order reference | 
**CreatedOn** | **time.Time** | Certificate Order creation date time | 
**Status** | [**CertificateOrderStatus**](CertificateOrderStatus.md) |  | 
**ClientReference** | **string** | Client reference UUID | [readonly] 
**ProductReference** | **string** | Product reference UUID | [readonly] 
**Certificate** | Pointer to [**Certificate**](Certificate.md) |  | [optional] 
**IssuedBy** | Pointer to **string** | email of the person who created the order | [optional] [readonly] 

## Methods

### NewCertificateOrder

`func NewCertificateOrder(uuid string, createdOn time.Time, status CertificateOrderStatus, clientReference string, productReference string, ) *CertificateOrder`

NewCertificateOrder instantiates a new CertificateOrder object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCertificateOrderWithDefaults

`func NewCertificateOrderWithDefaults() *CertificateOrder`

NewCertificateOrderWithDefaults instantiates a new CertificateOrder object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUuid

`func (o *CertificateOrder) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CertificateOrder) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CertificateOrder) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetCreatedOn

`func (o *CertificateOrder) GetCreatedOn() time.Time`

GetCreatedOn returns the CreatedOn field if non-nil, zero value otherwise.

### GetCreatedOnOk

`func (o *CertificateOrder) GetCreatedOnOk() (*time.Time, bool)`

GetCreatedOnOk returns a tuple with the CreatedOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedOn

`func (o *CertificateOrder) SetCreatedOn(v time.Time)`

SetCreatedOn sets CreatedOn field to given value.


### GetStatus

`func (o *CertificateOrder) GetStatus() CertificateOrderStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CertificateOrder) GetStatusOk() (*CertificateOrderStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CertificateOrder) SetStatus(v CertificateOrderStatus)`

SetStatus sets Status field to given value.


### GetClientReference

`func (o *CertificateOrder) GetClientReference() string`

GetClientReference returns the ClientReference field if non-nil, zero value otherwise.

### GetClientReferenceOk

`func (o *CertificateOrder) GetClientReferenceOk() (*string, bool)`

GetClientReferenceOk returns a tuple with the ClientReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientReference

`func (o *CertificateOrder) SetClientReference(v string)`

SetClientReference sets ClientReference field to given value.


### GetProductReference

`func (o *CertificateOrder) GetProductReference() string`

GetProductReference returns the ProductReference field if non-nil, zero value otherwise.

### GetProductReferenceOk

`func (o *CertificateOrder) GetProductReferenceOk() (*string, bool)`

GetProductReferenceOk returns a tuple with the ProductReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductReference

`func (o *CertificateOrder) SetProductReference(v string)`

SetProductReference sets ProductReference field to given value.


### GetCertificate

`func (o *CertificateOrder) GetCertificate() Certificate`

GetCertificate returns the Certificate field if non-nil, zero value otherwise.

### GetCertificateOk

`func (o *CertificateOrder) GetCertificateOk() (*Certificate, bool)`

GetCertificateOk returns a tuple with the Certificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCertificate

`func (o *CertificateOrder) SetCertificate(v Certificate)`

SetCertificate sets Certificate field to given value.

### HasCertificate

`func (o *CertificateOrder) HasCertificate() bool`

HasCertificate returns a boolean if a field has been set.

### GetIssuedBy

`func (o *CertificateOrder) GetIssuedBy() string`

GetIssuedBy returns the IssuedBy field if non-nil, zero value otherwise.

### GetIssuedByOk

`func (o *CertificateOrder) GetIssuedByOk() (*string, bool)`

GetIssuedByOk returns a tuple with the IssuedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuedBy

`func (o *CertificateOrder) SetIssuedBy(v string)`

SetIssuedBy sets IssuedBy field to given value.

### HasIssuedBy

`func (o *CertificateOrder) HasIssuedBy() bool`

HasIssuedBy returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


