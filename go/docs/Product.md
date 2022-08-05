# Product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Product UUID reference | [readonly] 
**ProductName** | Pointer to **string** | Certificate product name | [optional] [readonly] 
**ProductDescription** | Pointer to **NullableString** | Product additional description | [optional] [readonly] 
**KeyGenerationType** | **string** | Key generation protocol | [readonly] 
**KeyType** | [**KeyType**](KeyType.md) |  | 
**IssuanceNotification** | **bool** | Indicate if the certificate sends a notification on issuance | [readonly] 
**RevocationNotification** | **bool** | Indicate if the certificate sends a notification on revocation | [readonly] 
**Authorization** | **bool** | Indicate if the certificate requires an authorization on issuance/revocation | [readonly] 
**RenewalRule** | **bool** | Indicate if the certificate sends a notification for renewal | [readonly] 
**PublishCertificate** | **bool** | Indicate if the certificate is published to the public LDAP after issuance | [readonly] 
**ClientPublishCertificateOverride** | **bool** | Indicate if the certificate publication can be overridden | [readonly] 
**ClientPublishCertificateOverrideDefault** | **bool** | Indicate the default value if publication override is enabled | [readonly] 
**ExpirationDate** | Pointer to **NullableString** | Indicate if the certificate product has an expiration date | [optional] [readonly] 

## Methods

### NewProduct

`func NewProduct(uuid string, keyGenerationType string, keyType KeyType, issuanceNotification bool, revocationNotification bool, authorization bool, renewalRule bool, publishCertificate bool, clientPublishCertificateOverride bool, clientPublishCertificateOverrideDefault bool, ) *Product`

NewProduct instantiates a new Product object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductWithDefaults

`func NewProductWithDefaults() *Product`

NewProductWithDefaults instantiates a new Product object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUuid

`func (o *Product) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *Product) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *Product) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetProductName

`func (o *Product) GetProductName() string`

GetProductName returns the ProductName field if non-nil, zero value otherwise.

### GetProductNameOk

`func (o *Product) GetProductNameOk() (*string, bool)`

GetProductNameOk returns a tuple with the ProductName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductName

`func (o *Product) SetProductName(v string)`

SetProductName sets ProductName field to given value.

### HasProductName

`func (o *Product) HasProductName() bool`

HasProductName returns a boolean if a field has been set.

### GetProductDescription

`func (o *Product) GetProductDescription() string`

GetProductDescription returns the ProductDescription field if non-nil, zero value otherwise.

### GetProductDescriptionOk

`func (o *Product) GetProductDescriptionOk() (*string, bool)`

GetProductDescriptionOk returns a tuple with the ProductDescription field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductDescription

`func (o *Product) SetProductDescription(v string)`

SetProductDescription sets ProductDescription field to given value.

### HasProductDescription

`func (o *Product) HasProductDescription() bool`

HasProductDescription returns a boolean if a field has been set.

### SetProductDescriptionNil

`func (o *Product) SetProductDescriptionNil(b bool)`

 SetProductDescriptionNil sets the value for ProductDescription to be an explicit nil

### UnsetProductDescription
`func (o *Product) UnsetProductDescription()`

UnsetProductDescription ensures that no value is present for ProductDescription, not even an explicit nil
### GetKeyGenerationType

`func (o *Product) GetKeyGenerationType() string`

GetKeyGenerationType returns the KeyGenerationType field if non-nil, zero value otherwise.

### GetKeyGenerationTypeOk

`func (o *Product) GetKeyGenerationTypeOk() (*string, bool)`

GetKeyGenerationTypeOk returns a tuple with the KeyGenerationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyGenerationType

`func (o *Product) SetKeyGenerationType(v string)`

SetKeyGenerationType sets KeyGenerationType field to given value.


### GetKeyType

`func (o *Product) GetKeyType() KeyType`

GetKeyType returns the KeyType field if non-nil, zero value otherwise.

### GetKeyTypeOk

`func (o *Product) GetKeyTypeOk() (*KeyType, bool)`

GetKeyTypeOk returns a tuple with the KeyType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyType

`func (o *Product) SetKeyType(v KeyType)`

SetKeyType sets KeyType field to given value.


### GetIssuanceNotification

`func (o *Product) GetIssuanceNotification() bool`

GetIssuanceNotification returns the IssuanceNotification field if non-nil, zero value otherwise.

### GetIssuanceNotificationOk

`func (o *Product) GetIssuanceNotificationOk() (*bool, bool)`

GetIssuanceNotificationOk returns a tuple with the IssuanceNotification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIssuanceNotification

`func (o *Product) SetIssuanceNotification(v bool)`

SetIssuanceNotification sets IssuanceNotification field to given value.


### GetRevocationNotification

`func (o *Product) GetRevocationNotification() bool`

GetRevocationNotification returns the RevocationNotification field if non-nil, zero value otherwise.

### GetRevocationNotificationOk

`func (o *Product) GetRevocationNotificationOk() (*bool, bool)`

GetRevocationNotificationOk returns a tuple with the RevocationNotification field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRevocationNotification

`func (o *Product) SetRevocationNotification(v bool)`

SetRevocationNotification sets RevocationNotification field to given value.


### GetAuthorization

`func (o *Product) GetAuthorization() bool`

GetAuthorization returns the Authorization field if non-nil, zero value otherwise.

### GetAuthorizationOk

`func (o *Product) GetAuthorizationOk() (*bool, bool)`

GetAuthorizationOk returns a tuple with the Authorization field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthorization

`func (o *Product) SetAuthorization(v bool)`

SetAuthorization sets Authorization field to given value.


### GetRenewalRule

`func (o *Product) GetRenewalRule() bool`

GetRenewalRule returns the RenewalRule field if non-nil, zero value otherwise.

### GetRenewalRuleOk

`func (o *Product) GetRenewalRuleOk() (*bool, bool)`

GetRenewalRuleOk returns a tuple with the RenewalRule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRenewalRule

`func (o *Product) SetRenewalRule(v bool)`

SetRenewalRule sets RenewalRule field to given value.


### GetPublishCertificate

`func (o *Product) GetPublishCertificate() bool`

GetPublishCertificate returns the PublishCertificate field if non-nil, zero value otherwise.

### GetPublishCertificateOk

`func (o *Product) GetPublishCertificateOk() (*bool, bool)`

GetPublishCertificateOk returns a tuple with the PublishCertificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishCertificate

`func (o *Product) SetPublishCertificate(v bool)`

SetPublishCertificate sets PublishCertificate field to given value.


### GetClientPublishCertificateOverride

`func (o *Product) GetClientPublishCertificateOverride() bool`

GetClientPublishCertificateOverride returns the ClientPublishCertificateOverride field if non-nil, zero value otherwise.

### GetClientPublishCertificateOverrideOk

`func (o *Product) GetClientPublishCertificateOverrideOk() (*bool, bool)`

GetClientPublishCertificateOverrideOk returns a tuple with the ClientPublishCertificateOverride field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientPublishCertificateOverride

`func (o *Product) SetClientPublishCertificateOverride(v bool)`

SetClientPublishCertificateOverride sets ClientPublishCertificateOverride field to given value.


### GetClientPublishCertificateOverrideDefault

`func (o *Product) GetClientPublishCertificateOverrideDefault() bool`

GetClientPublishCertificateOverrideDefault returns the ClientPublishCertificateOverrideDefault field if non-nil, zero value otherwise.

### GetClientPublishCertificateOverrideDefaultOk

`func (o *Product) GetClientPublishCertificateOverrideDefaultOk() (*bool, bool)`

GetClientPublishCertificateOverrideDefaultOk returns a tuple with the ClientPublishCertificateOverrideDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClientPublishCertificateOverrideDefault

`func (o *Product) SetClientPublishCertificateOverrideDefault(v bool)`

SetClientPublishCertificateOverrideDefault sets ClientPublishCertificateOverrideDefault field to given value.


### GetExpirationDate

`func (o *Product) GetExpirationDate() string`

GetExpirationDate returns the ExpirationDate field if non-nil, zero value otherwise.

### GetExpirationDateOk

`func (o *Product) GetExpirationDateOk() (*string, bool)`

GetExpirationDateOk returns a tuple with the ExpirationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpirationDate

`func (o *Product) SetExpirationDate(v string)`

SetExpirationDate sets ExpirationDate field to given value.

### HasExpirationDate

`func (o *Product) HasExpirationDate() bool`

HasExpirationDate returns a boolean if a field has been set.

### SetExpirationDateNil

`func (o *Product) SetExpirationDateNil(b bool)`

 SetExpirationDateNil sets the value for ExpirationDate to be an explicit nil

### UnsetExpirationDate
`func (o *Product) UnsetExpirationDate()`

UnsetExpirationDate ensures that no value is present for ExpirationDate, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


