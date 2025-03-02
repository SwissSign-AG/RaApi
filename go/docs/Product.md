# Product

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Product UUID reference | [readonly] 
**ProductName** | Pointer to **string** | Certificate product name | [optional] [readonly] 
**ProductDescription** | Pointer to **string** | Product additional description | [optional] [readonly] 
**KeyGenerationType** | **string** | Key generation protocol | [readonly] 
**KeyType** | [**KeyType**](KeyType.md) |  | 
**IssuanceNotification** | **bool** | Indicate if the certificate sends a notification on issuance | [readonly] 
**RevocationNotification** | **bool** | Indicate if the certificate sends a notification on revocation | [readonly] 
**Authorization** | **bool** | Indicate if the certificate requires an authorization on issuance/revocation | [readonly] 
**RenewalRule** | **bool** | Indicate if the certificate sends a notification for renewal | [readonly] 
**PublishCertificate** | **bool** | Indicate if the certificate is published to the public LDAP after issuance | [readonly] 
**ClientPublishCertificateOverride** | **bool** | Indicate if the certificate publication can be overridden | [readonly] 
**ClientPublishCertificateOverrideDefault** | **bool** | Indicate the default value if publication override is enabled | [readonly] 
**ExpirationDate** | Pointer to **time.Time** | Indicate if the certificate product has an expiration date | [optional] [readonly] 
**AllowAdditionalIssuanceNotificationRecipients** | **bool** | When enabled, additional certificate issuance notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**AllowAdditionalRevocationNotificationRecipients** | **bool** | When enabled, additional certificate revocation notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**AllowAdditionalRenewalNotificationRecipients** | **bool** | When enabled, additional certificate renewal notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**AllowAdditionalAuthorizationNotificationRecipients** | **bool** | When enabled, additional authorization notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**AllowAdditionalAuthorizationAcceptedNotificationRecipients** | **bool** | When enabled, additional authorization notification recipients (for accepted requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**AllowAdditionalAuthorizationRejectedNotificationRecipients** | **bool** | When enabled, additional authorization notification recipients (for rejected requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**IsCABDNSValidationRequired** | **bool** | When enabled, indicates CAB DNS or HTTP domain validation is required. | [readonly] 
**AllowAdditionalCABDNSNotificationRecipients** | **bool** | When enabled, indicates that additional notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**IsCABDNSEmailLinkValidationRequired** | **bool** | When enabled, indicates CAB DNS via constructed email link to domain owner is required. | [readonly] 
**IsEmailBoxValidationRequired** | **bool** | When enabled, indicates that the recipient must validate the email box via a link. | [readonly] 
**RequiresRegistrationDocuments** | **bool** | When enabled, registration documents must provided with the certificate order. Documents are skipped when disabled. | [readonly] 
**RequiresRegistrationDocumentsOnRegister** | **bool** | When enabled, registration documents must provided when submitting the certificate order. When disabled, documents can be added to the certificate order at a later time via the RA UI. | [readonly] 
**AllowRegistrationDocumentsPDF** | **bool** | PDF registration document are allowed. | [readonly] 
**AllowRegistrationDocumentsJPG** | **bool** | JPG/PNG registration images are allowed. | [readonly] 
**IsGenerateRevocationCode** | **bool** | Indicates if a revocation code is issued for the recipient (link to self service revocation). | [readonly] 
**ProductValidity** | Pointer to [**ProductValidity**](ProductValidity.md) |  | [optional] 

## Methods

### NewProduct

`func NewProduct(uuid string, keyGenerationType string, keyType KeyType, issuanceNotification bool, revocationNotification bool, authorization bool, renewalRule bool, publishCertificate bool, clientPublishCertificateOverride bool, clientPublishCertificateOverrideDefault bool, allowAdditionalIssuanceNotificationRecipients bool, allowAdditionalRevocationNotificationRecipients bool, allowAdditionalRenewalNotificationRecipients bool, allowAdditionalAuthorizationNotificationRecipients bool, allowAdditionalAuthorizationAcceptedNotificationRecipients bool, allowAdditionalAuthorizationRejectedNotificationRecipients bool, isCABDNSValidationRequired bool, allowAdditionalCABDNSNotificationRecipients bool, isCABDNSEmailLinkValidationRequired bool, isEmailBoxValidationRequired bool, requiresRegistrationDocuments bool, requiresRegistrationDocumentsOnRegister bool, allowRegistrationDocumentsPDF bool, allowRegistrationDocumentsJPG bool, isGenerateRevocationCode bool, ) *Product`

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

`func (o *Product) GetExpirationDate() time.Time`

GetExpirationDate returns the ExpirationDate field if non-nil, zero value otherwise.

### GetExpirationDateOk

`func (o *Product) GetExpirationDateOk() (*time.Time, bool)`

GetExpirationDateOk returns a tuple with the ExpirationDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExpirationDate

`func (o *Product) SetExpirationDate(v time.Time)`

SetExpirationDate sets ExpirationDate field to given value.

### HasExpirationDate

`func (o *Product) HasExpirationDate() bool`

HasExpirationDate returns a boolean if a field has been set.

### GetAllowAdditionalIssuanceNotificationRecipients

`func (o *Product) GetAllowAdditionalIssuanceNotificationRecipients() bool`

GetAllowAdditionalIssuanceNotificationRecipients returns the AllowAdditionalIssuanceNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalIssuanceNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalIssuanceNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalIssuanceNotificationRecipientsOk returns a tuple with the AllowAdditionalIssuanceNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalIssuanceNotificationRecipients

`func (o *Product) SetAllowAdditionalIssuanceNotificationRecipients(v bool)`

SetAllowAdditionalIssuanceNotificationRecipients sets AllowAdditionalIssuanceNotificationRecipients field to given value.


### GetAllowAdditionalRevocationNotificationRecipients

`func (o *Product) GetAllowAdditionalRevocationNotificationRecipients() bool`

GetAllowAdditionalRevocationNotificationRecipients returns the AllowAdditionalRevocationNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalRevocationNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalRevocationNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalRevocationNotificationRecipientsOk returns a tuple with the AllowAdditionalRevocationNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalRevocationNotificationRecipients

`func (o *Product) SetAllowAdditionalRevocationNotificationRecipients(v bool)`

SetAllowAdditionalRevocationNotificationRecipients sets AllowAdditionalRevocationNotificationRecipients field to given value.


### GetAllowAdditionalRenewalNotificationRecipients

`func (o *Product) GetAllowAdditionalRenewalNotificationRecipients() bool`

GetAllowAdditionalRenewalNotificationRecipients returns the AllowAdditionalRenewalNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalRenewalNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalRenewalNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalRenewalNotificationRecipientsOk returns a tuple with the AllowAdditionalRenewalNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalRenewalNotificationRecipients

`func (o *Product) SetAllowAdditionalRenewalNotificationRecipients(v bool)`

SetAllowAdditionalRenewalNotificationRecipients sets AllowAdditionalRenewalNotificationRecipients field to given value.


### GetAllowAdditionalAuthorizationNotificationRecipients

`func (o *Product) GetAllowAdditionalAuthorizationNotificationRecipients() bool`

GetAllowAdditionalAuthorizationNotificationRecipients returns the AllowAdditionalAuthorizationNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalAuthorizationNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalAuthorizationNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalAuthorizationNotificationRecipientsOk returns a tuple with the AllowAdditionalAuthorizationNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalAuthorizationNotificationRecipients

`func (o *Product) SetAllowAdditionalAuthorizationNotificationRecipients(v bool)`

SetAllowAdditionalAuthorizationNotificationRecipients sets AllowAdditionalAuthorizationNotificationRecipients field to given value.


### GetAllowAdditionalAuthorizationAcceptedNotificationRecipients

`func (o *Product) GetAllowAdditionalAuthorizationAcceptedNotificationRecipients() bool`

GetAllowAdditionalAuthorizationAcceptedNotificationRecipients returns the AllowAdditionalAuthorizationAcceptedNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalAuthorizationAcceptedNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalAuthorizationAcceptedNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalAuthorizationAcceptedNotificationRecipientsOk returns a tuple with the AllowAdditionalAuthorizationAcceptedNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalAuthorizationAcceptedNotificationRecipients

`func (o *Product) SetAllowAdditionalAuthorizationAcceptedNotificationRecipients(v bool)`

SetAllowAdditionalAuthorizationAcceptedNotificationRecipients sets AllowAdditionalAuthorizationAcceptedNotificationRecipients field to given value.


### GetAllowAdditionalAuthorizationRejectedNotificationRecipients

`func (o *Product) GetAllowAdditionalAuthorizationRejectedNotificationRecipients() bool`

GetAllowAdditionalAuthorizationRejectedNotificationRecipients returns the AllowAdditionalAuthorizationRejectedNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalAuthorizationRejectedNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalAuthorizationRejectedNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalAuthorizationRejectedNotificationRecipientsOk returns a tuple with the AllowAdditionalAuthorizationRejectedNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalAuthorizationRejectedNotificationRecipients

`func (o *Product) SetAllowAdditionalAuthorizationRejectedNotificationRecipients(v bool)`

SetAllowAdditionalAuthorizationRejectedNotificationRecipients sets AllowAdditionalAuthorizationRejectedNotificationRecipients field to given value.


### GetIsCABDNSValidationRequired

`func (o *Product) GetIsCABDNSValidationRequired() bool`

GetIsCABDNSValidationRequired returns the IsCABDNSValidationRequired field if non-nil, zero value otherwise.

### GetIsCABDNSValidationRequiredOk

`func (o *Product) GetIsCABDNSValidationRequiredOk() (*bool, bool)`

GetIsCABDNSValidationRequiredOk returns a tuple with the IsCABDNSValidationRequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCABDNSValidationRequired

`func (o *Product) SetIsCABDNSValidationRequired(v bool)`

SetIsCABDNSValidationRequired sets IsCABDNSValidationRequired field to given value.


### GetAllowAdditionalCABDNSNotificationRecipients

`func (o *Product) GetAllowAdditionalCABDNSNotificationRecipients() bool`

GetAllowAdditionalCABDNSNotificationRecipients returns the AllowAdditionalCABDNSNotificationRecipients field if non-nil, zero value otherwise.

### GetAllowAdditionalCABDNSNotificationRecipientsOk

`func (o *Product) GetAllowAdditionalCABDNSNotificationRecipientsOk() (*bool, bool)`

GetAllowAdditionalCABDNSNotificationRecipientsOk returns a tuple with the AllowAdditionalCABDNSNotificationRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowAdditionalCABDNSNotificationRecipients

`func (o *Product) SetAllowAdditionalCABDNSNotificationRecipients(v bool)`

SetAllowAdditionalCABDNSNotificationRecipients sets AllowAdditionalCABDNSNotificationRecipients field to given value.


### GetIsCABDNSEmailLinkValidationRequired

`func (o *Product) GetIsCABDNSEmailLinkValidationRequired() bool`

GetIsCABDNSEmailLinkValidationRequired returns the IsCABDNSEmailLinkValidationRequired field if non-nil, zero value otherwise.

### GetIsCABDNSEmailLinkValidationRequiredOk

`func (o *Product) GetIsCABDNSEmailLinkValidationRequiredOk() (*bool, bool)`

GetIsCABDNSEmailLinkValidationRequiredOk returns a tuple with the IsCABDNSEmailLinkValidationRequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCABDNSEmailLinkValidationRequired

`func (o *Product) SetIsCABDNSEmailLinkValidationRequired(v bool)`

SetIsCABDNSEmailLinkValidationRequired sets IsCABDNSEmailLinkValidationRequired field to given value.


### GetIsEmailBoxValidationRequired

`func (o *Product) GetIsEmailBoxValidationRequired() bool`

GetIsEmailBoxValidationRequired returns the IsEmailBoxValidationRequired field if non-nil, zero value otherwise.

### GetIsEmailBoxValidationRequiredOk

`func (o *Product) GetIsEmailBoxValidationRequiredOk() (*bool, bool)`

GetIsEmailBoxValidationRequiredOk returns a tuple with the IsEmailBoxValidationRequired field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsEmailBoxValidationRequired

`func (o *Product) SetIsEmailBoxValidationRequired(v bool)`

SetIsEmailBoxValidationRequired sets IsEmailBoxValidationRequired field to given value.


### GetRequiresRegistrationDocuments

`func (o *Product) GetRequiresRegistrationDocuments() bool`

GetRequiresRegistrationDocuments returns the RequiresRegistrationDocuments field if non-nil, zero value otherwise.

### GetRequiresRegistrationDocumentsOk

`func (o *Product) GetRequiresRegistrationDocumentsOk() (*bool, bool)`

GetRequiresRegistrationDocumentsOk returns a tuple with the RequiresRegistrationDocuments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiresRegistrationDocuments

`func (o *Product) SetRequiresRegistrationDocuments(v bool)`

SetRequiresRegistrationDocuments sets RequiresRegistrationDocuments field to given value.


### GetRequiresRegistrationDocumentsOnRegister

`func (o *Product) GetRequiresRegistrationDocumentsOnRegister() bool`

GetRequiresRegistrationDocumentsOnRegister returns the RequiresRegistrationDocumentsOnRegister field if non-nil, zero value otherwise.

### GetRequiresRegistrationDocumentsOnRegisterOk

`func (o *Product) GetRequiresRegistrationDocumentsOnRegisterOk() (*bool, bool)`

GetRequiresRegistrationDocumentsOnRegisterOk returns a tuple with the RequiresRegistrationDocumentsOnRegister field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequiresRegistrationDocumentsOnRegister

`func (o *Product) SetRequiresRegistrationDocumentsOnRegister(v bool)`

SetRequiresRegistrationDocumentsOnRegister sets RequiresRegistrationDocumentsOnRegister field to given value.


### GetAllowRegistrationDocumentsPDF

`func (o *Product) GetAllowRegistrationDocumentsPDF() bool`

GetAllowRegistrationDocumentsPDF returns the AllowRegistrationDocumentsPDF field if non-nil, zero value otherwise.

### GetAllowRegistrationDocumentsPDFOk

`func (o *Product) GetAllowRegistrationDocumentsPDFOk() (*bool, bool)`

GetAllowRegistrationDocumentsPDFOk returns a tuple with the AllowRegistrationDocumentsPDF field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowRegistrationDocumentsPDF

`func (o *Product) SetAllowRegistrationDocumentsPDF(v bool)`

SetAllowRegistrationDocumentsPDF sets AllowRegistrationDocumentsPDF field to given value.


### GetAllowRegistrationDocumentsJPG

`func (o *Product) GetAllowRegistrationDocumentsJPG() bool`

GetAllowRegistrationDocumentsJPG returns the AllowRegistrationDocumentsJPG field if non-nil, zero value otherwise.

### GetAllowRegistrationDocumentsJPGOk

`func (o *Product) GetAllowRegistrationDocumentsJPGOk() (*bool, bool)`

GetAllowRegistrationDocumentsJPGOk returns a tuple with the AllowRegistrationDocumentsJPG field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowRegistrationDocumentsJPG

`func (o *Product) SetAllowRegistrationDocumentsJPG(v bool)`

SetAllowRegistrationDocumentsJPG sets AllowRegistrationDocumentsJPG field to given value.


### GetIsGenerateRevocationCode

`func (o *Product) GetIsGenerateRevocationCode() bool`

GetIsGenerateRevocationCode returns the IsGenerateRevocationCode field if non-nil, zero value otherwise.

### GetIsGenerateRevocationCodeOk

`func (o *Product) GetIsGenerateRevocationCodeOk() (*bool, bool)`

GetIsGenerateRevocationCodeOk returns a tuple with the IsGenerateRevocationCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGenerateRevocationCode

`func (o *Product) SetIsGenerateRevocationCode(v bool)`

SetIsGenerateRevocationCode sets IsGenerateRevocationCode field to given value.


### GetProductValidity

`func (o *Product) GetProductValidity() ProductValidity`

GetProductValidity returns the ProductValidity field if non-nil, zero value otherwise.

### GetProductValidityOk

`func (o *Product) GetProductValidityOk() (*ProductValidity, bool)`

GetProductValidityOk returns a tuple with the ProductValidity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductValidity

`func (o *Product) SetProductValidity(v ProductValidity)`

SetProductValidity sets ProductValidity field to given value.

### HasProductValidity

`func (o *Product) HasProductValidity() bool`

HasProductValidity returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


