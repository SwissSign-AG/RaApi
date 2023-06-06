# RequestOverrides

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SubjectDN** | Pointer to **NullableString** | Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c (Country)   - dc (Domain Controller)   - l (Locality)   - state (State)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - streetAddress (Street Address)   - o (Organization)   - organizationIdentifier (Organization Identifier)   - ou (Organizational Unit)   - uid (UID)   - uniqueIdentifier (Unique Identifier)   - serialnumber (Serial number)   - email (Email)   - title (Title)   - cn (Common Name)   - sn (Surname)   - gn (Given name)   - name (Name)   - initials (Initials)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - generationQualifier (Generation Qualifier)  | [optional] 
**Validity** | Pointer to **NullableInt32** | Optional certificate validity set if enabled on the Product  | [optional] 
**RequestExtensions** | Pointer to [**RequestExtensions**](RequestExtensions.md) |  | [optional] 

## Methods

### NewRequestOverrides

`func NewRequestOverrides() *RequestOverrides`

NewRequestOverrides instantiates a new RequestOverrides object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRequestOverridesWithDefaults

`func NewRequestOverridesWithDefaults() *RequestOverrides`

NewRequestOverridesWithDefaults instantiates a new RequestOverrides object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSubjectDN

`func (o *RequestOverrides) GetSubjectDN() string`

GetSubjectDN returns the SubjectDN field if non-nil, zero value otherwise.

### GetSubjectDNOk

`func (o *RequestOverrides) GetSubjectDNOk() (*string, bool)`

GetSubjectDNOk returns a tuple with the SubjectDN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubjectDN

`func (o *RequestOverrides) SetSubjectDN(v string)`

SetSubjectDN sets SubjectDN field to given value.

### HasSubjectDN

`func (o *RequestOverrides) HasSubjectDN() bool`

HasSubjectDN returns a boolean if a field has been set.

### SetSubjectDNNil

`func (o *RequestOverrides) SetSubjectDNNil(b bool)`

 SetSubjectDNNil sets the value for SubjectDN to be an explicit nil

### UnsetSubjectDN
`func (o *RequestOverrides) UnsetSubjectDN()`

UnsetSubjectDN ensures that no value is present for SubjectDN, not even an explicit nil
### GetValidity

`func (o *RequestOverrides) GetValidity() int32`

GetValidity returns the Validity field if non-nil, zero value otherwise.

### GetValidityOk

`func (o *RequestOverrides) GetValidityOk() (*int32, bool)`

GetValidityOk returns a tuple with the Validity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidity

`func (o *RequestOverrides) SetValidity(v int32)`

SetValidity sets Validity field to given value.

### HasValidity

`func (o *RequestOverrides) HasValidity() bool`

HasValidity returns a boolean if a field has been set.

### SetValidityNil

`func (o *RequestOverrides) SetValidityNil(b bool)`

 SetValidityNil sets the value for Validity to be an explicit nil

### UnsetValidity
`func (o *RequestOverrides) UnsetValidity()`

UnsetValidity ensures that no value is present for Validity, not even an explicit nil
### GetRequestExtensions

`func (o *RequestOverrides) GetRequestExtensions() RequestExtensions`

GetRequestExtensions returns the RequestExtensions field if non-nil, zero value otherwise.

### GetRequestExtensionsOk

`func (o *RequestOverrides) GetRequestExtensionsOk() (*RequestExtensions, bool)`

GetRequestExtensionsOk returns a tuple with the RequestExtensions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestExtensions

`func (o *RequestOverrides) SetRequestExtensions(v RequestExtensions)`

SetRequestExtensions sets RequestExtensions field to given value.

### HasRequestExtensions

`func (o *RequestOverrides) HasRequestExtensions() bool`

HasRequestExtensions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


