# RegistrationDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DocumentName** | **string** | document name | 
**Document** | **string** | Base64 encoded byte array of the document content | 

## Methods

### NewRegistrationDocument

`func NewRegistrationDocument(documentName string, document string, ) *RegistrationDocument`

NewRegistrationDocument instantiates a new RegistrationDocument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRegistrationDocumentWithDefaults

`func NewRegistrationDocumentWithDefaults() *RegistrationDocument`

NewRegistrationDocumentWithDefaults instantiates a new RegistrationDocument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDocumentName

`func (o *RegistrationDocument) GetDocumentName() string`

GetDocumentName returns the DocumentName field if non-nil, zero value otherwise.

### GetDocumentNameOk

`func (o *RegistrationDocument) GetDocumentNameOk() (*string, bool)`

GetDocumentNameOk returns a tuple with the DocumentName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocumentName

`func (o *RegistrationDocument) SetDocumentName(v string)`

SetDocumentName sets DocumentName field to given value.


### GetDocument

`func (o *RegistrationDocument) GetDocument() string`

GetDocument returns the Document field if non-nil, zero value otherwise.

### GetDocumentOk

`func (o *RegistrationDocument) GetDocumentOk() (*string, bool)`

GetDocumentOk returns a tuple with the Document field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDocument

`func (o *RegistrationDocument) SetDocument(v string)`

SetDocument sets Document field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


