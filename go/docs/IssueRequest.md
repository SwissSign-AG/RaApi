# IssueRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProductReference** | **string** | Product reference | 
**Csr** | Pointer to **NullableString** | CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary). | [optional] 
**Overrides** | Pointer to [**RequestOverrides**](RequestOverrides.md) |  | [optional] 
**AdditionalRecipients** | Pointer to [**[]AdditionalRecipient**](AdditionalRecipient.md) |  | [optional] 
**RegistrationDocuments** | Pointer to [**[]RegistrationDocument**](RegistrationDocument.md) |  | [optional] 
**Note** | Pointer to **NullableString** | User note added to issued certificate order | [optional] 
**PublishCertificate** | Pointer to **bool** | Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication.  | [optional] 
**Synchrone** | Pointer to **bool** | Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled.  | [optional] [default to false]
**AcceptTandC** | Pointer to **bool** | When server backend has T&amp;C enabled, this value is checked.  | [optional] [default to true]
**IncludeCertificateChain** | Pointer to **bool** | Include the certificate chain in the reply (only valid when &#39;synchrone&#39; is true).  | [optional] [default to false]

## Methods

### NewIssueRequest

`func NewIssueRequest(productReference string, ) *IssueRequest`

NewIssueRequest instantiates a new IssueRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIssueRequestWithDefaults

`func NewIssueRequestWithDefaults() *IssueRequest`

NewIssueRequestWithDefaults instantiates a new IssueRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProductReference

`func (o *IssueRequest) GetProductReference() string`

GetProductReference returns the ProductReference field if non-nil, zero value otherwise.

### GetProductReferenceOk

`func (o *IssueRequest) GetProductReferenceOk() (*string, bool)`

GetProductReferenceOk returns a tuple with the ProductReference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProductReference

`func (o *IssueRequest) SetProductReference(v string)`

SetProductReference sets ProductReference field to given value.


### GetCsr

`func (o *IssueRequest) GetCsr() string`

GetCsr returns the Csr field if non-nil, zero value otherwise.

### GetCsrOk

`func (o *IssueRequest) GetCsrOk() (*string, bool)`

GetCsrOk returns a tuple with the Csr field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCsr

`func (o *IssueRequest) SetCsr(v string)`

SetCsr sets Csr field to given value.

### HasCsr

`func (o *IssueRequest) HasCsr() bool`

HasCsr returns a boolean if a field has been set.

### SetCsrNil

`func (o *IssueRequest) SetCsrNil(b bool)`

 SetCsrNil sets the value for Csr to be an explicit nil

### UnsetCsr
`func (o *IssueRequest) UnsetCsr()`

UnsetCsr ensures that no value is present for Csr, not even an explicit nil
### GetOverrides

`func (o *IssueRequest) GetOverrides() RequestOverrides`

GetOverrides returns the Overrides field if non-nil, zero value otherwise.

### GetOverridesOk

`func (o *IssueRequest) GetOverridesOk() (*RequestOverrides, bool)`

GetOverridesOk returns a tuple with the Overrides field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverrides

`func (o *IssueRequest) SetOverrides(v RequestOverrides)`

SetOverrides sets Overrides field to given value.

### HasOverrides

`func (o *IssueRequest) HasOverrides() bool`

HasOverrides returns a boolean if a field has been set.

### GetAdditionalRecipients

`func (o *IssueRequest) GetAdditionalRecipients() []AdditionalRecipient`

GetAdditionalRecipients returns the AdditionalRecipients field if non-nil, zero value otherwise.

### GetAdditionalRecipientsOk

`func (o *IssueRequest) GetAdditionalRecipientsOk() (*[]AdditionalRecipient, bool)`

GetAdditionalRecipientsOk returns a tuple with the AdditionalRecipients field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdditionalRecipients

`func (o *IssueRequest) SetAdditionalRecipients(v []AdditionalRecipient)`

SetAdditionalRecipients sets AdditionalRecipients field to given value.

### HasAdditionalRecipients

`func (o *IssueRequest) HasAdditionalRecipients() bool`

HasAdditionalRecipients returns a boolean if a field has been set.

### GetRegistrationDocuments

`func (o *IssueRequest) GetRegistrationDocuments() []RegistrationDocument`

GetRegistrationDocuments returns the RegistrationDocuments field if non-nil, zero value otherwise.

### GetRegistrationDocumentsOk

`func (o *IssueRequest) GetRegistrationDocumentsOk() (*[]RegistrationDocument, bool)`

GetRegistrationDocumentsOk returns a tuple with the RegistrationDocuments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegistrationDocuments

`func (o *IssueRequest) SetRegistrationDocuments(v []RegistrationDocument)`

SetRegistrationDocuments sets RegistrationDocuments field to given value.

### HasRegistrationDocuments

`func (o *IssueRequest) HasRegistrationDocuments() bool`

HasRegistrationDocuments returns a boolean if a field has been set.

### GetNote

`func (o *IssueRequest) GetNote() string`

GetNote returns the Note field if non-nil, zero value otherwise.

### GetNoteOk

`func (o *IssueRequest) GetNoteOk() (*string, bool)`

GetNoteOk returns a tuple with the Note field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNote

`func (o *IssueRequest) SetNote(v string)`

SetNote sets Note field to given value.

### HasNote

`func (o *IssueRequest) HasNote() bool`

HasNote returns a boolean if a field has been set.

### SetNoteNil

`func (o *IssueRequest) SetNoteNil(b bool)`

 SetNoteNil sets the value for Note to be an explicit nil

### UnsetNote
`func (o *IssueRequest) UnsetNote()`

UnsetNote ensures that no value is present for Note, not even an explicit nil
### GetPublishCertificate

`func (o *IssueRequest) GetPublishCertificate() bool`

GetPublishCertificate returns the PublishCertificate field if non-nil, zero value otherwise.

### GetPublishCertificateOk

`func (o *IssueRequest) GetPublishCertificateOk() (*bool, bool)`

GetPublishCertificateOk returns a tuple with the PublishCertificate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPublishCertificate

`func (o *IssueRequest) SetPublishCertificate(v bool)`

SetPublishCertificate sets PublishCertificate field to given value.

### HasPublishCertificate

`func (o *IssueRequest) HasPublishCertificate() bool`

HasPublishCertificate returns a boolean if a field has been set.

### GetSynchrone

`func (o *IssueRequest) GetSynchrone() bool`

GetSynchrone returns the Synchrone field if non-nil, zero value otherwise.

### GetSynchroneOk

`func (o *IssueRequest) GetSynchroneOk() (*bool, bool)`

GetSynchroneOk returns a tuple with the Synchrone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSynchrone

`func (o *IssueRequest) SetSynchrone(v bool)`

SetSynchrone sets Synchrone field to given value.

### HasSynchrone

`func (o *IssueRequest) HasSynchrone() bool`

HasSynchrone returns a boolean if a field has been set.

### GetAcceptTandC

`func (o *IssueRequest) GetAcceptTandC() bool`

GetAcceptTandC returns the AcceptTandC field if non-nil, zero value otherwise.

### GetAcceptTandCOk

`func (o *IssueRequest) GetAcceptTandCOk() (*bool, bool)`

GetAcceptTandCOk returns a tuple with the AcceptTandC field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptTandC

`func (o *IssueRequest) SetAcceptTandC(v bool)`

SetAcceptTandC sets AcceptTandC field to given value.

### HasAcceptTandC

`func (o *IssueRequest) HasAcceptTandC() bool`

HasAcceptTandC returns a boolean if a field has been set.

### GetIncludeCertificateChain

`func (o *IssueRequest) GetIncludeCertificateChain() bool`

GetIncludeCertificateChain returns the IncludeCertificateChain field if non-nil, zero value otherwise.

### GetIncludeCertificateChainOk

`func (o *IssueRequest) GetIncludeCertificateChainOk() (*bool, bool)`

GetIncludeCertificateChainOk returns a tuple with the IncludeCertificateChain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeCertificateChain

`func (o *IssueRequest) SetIncludeCertificateChain(v bool)`

SetIncludeCertificateChain sets IncludeCertificateChain field to given value.

### HasIncludeCertificateChain

`func (o *IssueRequest) HasIncludeCertificateChain() bool`

HasIncludeCertificateChain returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


