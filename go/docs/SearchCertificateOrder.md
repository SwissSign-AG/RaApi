# SearchCertificateOrder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderReference** | Pointer to **NullableString** | Certificate Order reference | [optional] 
**SerialNumber** | Pointer to **NullableString** | Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or * | [optional] 
**OrderStatus** | Pointer to [**[]CertificateOrderStatus**](CertificateOrderStatus.md) |  | [optional] 
**RevocationReason** | Pointer to [**[]RevocationReason**](RevocationReason.md) |  | [optional] 
**ClientReferences** | Pointer to **[]string** | Client reference UUID | [optional] 
**StartAfter** | Pointer to **NullableString** | Certificate Order not starting after Date | [optional] 
**StartBefore** | Pointer to **NullableString** | Certificate Order not starting before Date | [optional] 
**Attribute** | Pointer to **NullableString** | Any certificate attribute OID or value with optional wildcard attributes ? and/or * | [optional] 
**IncludeCertificateChain** | Pointer to **NullableBool** | Include the certificate chain in the certificate order when available | [optional] 
**Tags** | Pointer to **[]string** | Customer label/tags | [optional] 

## Methods

### NewSearchCertificateOrder

`func NewSearchCertificateOrder() *SearchCertificateOrder`

NewSearchCertificateOrder instantiates a new SearchCertificateOrder object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchCertificateOrderWithDefaults

`func NewSearchCertificateOrderWithDefaults() *SearchCertificateOrder`

NewSearchCertificateOrderWithDefaults instantiates a new SearchCertificateOrder object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOrderReference

`func (o *SearchCertificateOrder) GetOrderReference() string`

GetOrderReference returns the OrderReference field if non-nil, zero value otherwise.

### GetOrderReferenceOk

`func (o *SearchCertificateOrder) GetOrderReferenceOk() (*string, bool)`

GetOrderReferenceOk returns a tuple with the OrderReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderReference

`func (o *SearchCertificateOrder) SetOrderReference(v string)`

SetOrderReference sets OrderReference field to given value.

### HasOrderReference

`func (o *SearchCertificateOrder) HasOrderReference() bool`

HasOrderReference returns a boolean if a field has been set.

### SetOrderReferenceNil

`func (o *SearchCertificateOrder) SetOrderReferenceNil(b bool)`

 SetOrderReferenceNil sets the value for OrderReference to be an explicit nil

### UnsetOrderReference
`func (o *SearchCertificateOrder) UnsetOrderReference()`

UnsetOrderReference ensures that no value is present for OrderReference, not even an explicit nil
### GetSerialNumber

`func (o *SearchCertificateOrder) GetSerialNumber() string`

GetSerialNumber returns the SerialNumber field if non-nil, zero value otherwise.

### GetSerialNumberOk

`func (o *SearchCertificateOrder) GetSerialNumberOk() (*string, bool)`

GetSerialNumberOk returns a tuple with the SerialNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSerialNumber

`func (o *SearchCertificateOrder) SetSerialNumber(v string)`

SetSerialNumber sets SerialNumber field to given value.

### HasSerialNumber

`func (o *SearchCertificateOrder) HasSerialNumber() bool`

HasSerialNumber returns a boolean if a field has been set.

### SetSerialNumberNil

`func (o *SearchCertificateOrder) SetSerialNumberNil(b bool)`

 SetSerialNumberNil sets the value for SerialNumber to be an explicit nil

### UnsetSerialNumber
`func (o *SearchCertificateOrder) UnsetSerialNumber()`

UnsetSerialNumber ensures that no value is present for SerialNumber, not even an explicit nil
### GetOrderStatus

`func (o *SearchCertificateOrder) GetOrderStatus() []CertificateOrderStatus`

GetOrderStatus returns the OrderStatus field if non-nil, zero value otherwise.

### GetOrderStatusOk

`func (o *SearchCertificateOrder) GetOrderStatusOk() (*[]CertificateOrderStatus, bool)`

GetOrderStatusOk returns a tuple with the OrderStatus field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrderStatus

`func (o *SearchCertificateOrder) SetOrderStatus(v []CertificateOrderStatus)`

SetOrderStatus sets OrderStatus field to given value.

### HasOrderStatus

`func (o *SearchCertificateOrder) HasOrderStatus() bool`

HasOrderStatus returns a boolean if a field has been set.

### SetOrderStatusNil

`func (o *SearchCertificateOrder) SetOrderStatusNil(b bool)`

 SetOrderStatusNil sets the value for OrderStatus to be an explicit nil

### UnsetOrderStatus
`func (o *SearchCertificateOrder) UnsetOrderStatus()`

UnsetOrderStatus ensures that no value is present for OrderStatus, not even an explicit nil
### GetRevocationReason

`func (o *SearchCertificateOrder) GetRevocationReason() []RevocationReason`

GetRevocationReason returns the RevocationReason field if non-nil, zero value otherwise.

### GetRevocationReasonOk

`func (o *SearchCertificateOrder) GetRevocationReasonOk() (*[]RevocationReason, bool)`

GetRevocationReasonOk returns a tuple with the RevocationReason field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationReason

`func (o *SearchCertificateOrder) SetRevocationReason(v []RevocationReason)`

SetRevocationReason sets RevocationReason field to given value.

### HasRevocationReason

`func (o *SearchCertificateOrder) HasRevocationReason() bool`

HasRevocationReason returns a boolean if a field has been set.

### SetRevocationReasonNil

`func (o *SearchCertificateOrder) SetRevocationReasonNil(b bool)`

 SetRevocationReasonNil sets the value for RevocationReason to be an explicit nil

### UnsetRevocationReason
`func (o *SearchCertificateOrder) UnsetRevocationReason()`

UnsetRevocationReason ensures that no value is present for RevocationReason, not even an explicit nil
### GetClientReferences

`func (o *SearchCertificateOrder) GetClientReferences() []string`

GetClientReferences returns the ClientReferences field if non-nil, zero value otherwise.

### GetClientReferencesOk

`func (o *SearchCertificateOrder) GetClientReferencesOk() (*[]string, bool)`

GetClientReferencesOk returns a tuple with the ClientReferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientReferences

`func (o *SearchCertificateOrder) SetClientReferences(v []string)`

SetClientReferences sets ClientReferences field to given value.

### HasClientReferences

`func (o *SearchCertificateOrder) HasClientReferences() bool`

HasClientReferences returns a boolean if a field has been set.

### SetClientReferencesNil

`func (o *SearchCertificateOrder) SetClientReferencesNil(b bool)`

 SetClientReferencesNil sets the value for ClientReferences to be an explicit nil

### UnsetClientReferences
`func (o *SearchCertificateOrder) UnsetClientReferences()`

UnsetClientReferences ensures that no value is present for ClientReferences, not even an explicit nil
### GetStartAfter

`func (o *SearchCertificateOrder) GetStartAfter() string`

GetStartAfter returns the StartAfter field if non-nil, zero value otherwise.

### GetStartAfterOk

`func (o *SearchCertificateOrder) GetStartAfterOk() (*string, bool)`

GetStartAfterOk returns a tuple with the StartAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartAfter

`func (o *SearchCertificateOrder) SetStartAfter(v string)`

SetStartAfter sets StartAfter field to given value.

### HasStartAfter

`func (o *SearchCertificateOrder) HasStartAfter() bool`

HasStartAfter returns a boolean if a field has been set.

### SetStartAfterNil

`func (o *SearchCertificateOrder) SetStartAfterNil(b bool)`

 SetStartAfterNil sets the value for StartAfter to be an explicit nil

### UnsetStartAfter
`func (o *SearchCertificateOrder) UnsetStartAfter()`

UnsetStartAfter ensures that no value is present for StartAfter, not even an explicit nil
### GetStartBefore

`func (o *SearchCertificateOrder) GetStartBefore() string`

GetStartBefore returns the StartBefore field if non-nil, zero value otherwise.

### GetStartBeforeOk

`func (o *SearchCertificateOrder) GetStartBeforeOk() (*string, bool)`

GetStartBeforeOk returns a tuple with the StartBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartBefore

`func (o *SearchCertificateOrder) SetStartBefore(v string)`

SetStartBefore sets StartBefore field to given value.

### HasStartBefore

`func (o *SearchCertificateOrder) HasStartBefore() bool`

HasStartBefore returns a boolean if a field has been set.

### SetStartBeforeNil

`func (o *SearchCertificateOrder) SetStartBeforeNil(b bool)`

 SetStartBeforeNil sets the value for StartBefore to be an explicit nil

### UnsetStartBefore
`func (o *SearchCertificateOrder) UnsetStartBefore()`

UnsetStartBefore ensures that no value is present for StartBefore, not even an explicit nil
### GetAttribute

`func (o *SearchCertificateOrder) GetAttribute() string`

GetAttribute returns the Attribute field if non-nil, zero value otherwise.

### GetAttributeOk

`func (o *SearchCertificateOrder) GetAttributeOk() (*string, bool)`

GetAttributeOk returns a tuple with the Attribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttribute

`func (o *SearchCertificateOrder) SetAttribute(v string)`

SetAttribute sets Attribute field to given value.

### HasAttribute

`func (o *SearchCertificateOrder) HasAttribute() bool`

HasAttribute returns a boolean if a field has been set.

### SetAttributeNil

`func (o *SearchCertificateOrder) SetAttributeNil(b bool)`

 SetAttributeNil sets the value for Attribute to be an explicit nil

### UnsetAttribute
`func (o *SearchCertificateOrder) UnsetAttribute()`

UnsetAttribute ensures that no value is present for Attribute, not even an explicit nil
### GetIncludeCertificateChain

`func (o *SearchCertificateOrder) GetIncludeCertificateChain() bool`

GetIncludeCertificateChain returns the IncludeCertificateChain field if non-nil, zero value otherwise.

### GetIncludeCertificateChainOk

`func (o *SearchCertificateOrder) GetIncludeCertificateChainOk() (*bool, bool)`

GetIncludeCertificateChainOk returns a tuple with the IncludeCertificateChain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeCertificateChain

`func (o *SearchCertificateOrder) SetIncludeCertificateChain(v bool)`

SetIncludeCertificateChain sets IncludeCertificateChain field to given value.

### HasIncludeCertificateChain

`func (o *SearchCertificateOrder) HasIncludeCertificateChain() bool`

HasIncludeCertificateChain returns a boolean if a field has been set.

### SetIncludeCertificateChainNil

`func (o *SearchCertificateOrder) SetIncludeCertificateChainNil(b bool)`

 SetIncludeCertificateChainNil sets the value for IncludeCertificateChain to be an explicit nil

### UnsetIncludeCertificateChain
`func (o *SearchCertificateOrder) UnsetIncludeCertificateChain()`

UnsetIncludeCertificateChain ensures that no value is present for IncludeCertificateChain, not even an explicit nil
### GetTags

`func (o *SearchCertificateOrder) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *SearchCertificateOrder) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *SearchCertificateOrder) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *SearchCertificateOrder) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *SearchCertificateOrder) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *SearchCertificateOrder) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


