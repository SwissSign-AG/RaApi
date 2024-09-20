# RequestExtensions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MicrosoftSecurityIdentifier** | Pointer to **NullableString** | Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy  | [optional] 
**MicrosoftPolicyTemplateOID** | Pointer to **NullableString** | Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy  | [optional] 
**RequestDNS** | Pointer to [**RequestDNS**](RequestDNS.md) |  | [optional] 
**RequestRFC822** | Pointer to [**RequestRFC822**](RequestRFC822.md) |  | [optional] 
**RequestUPN** | Pointer to [**RequestUPN**](RequestUPN.md) |  | [optional] 
**RequestIP** | Pointer to [**RequestIP**](RequestIP.md) |  | [optional] 

## Methods

### NewRequestExtensions

`func NewRequestExtensions() *RequestExtensions`

NewRequestExtensions instantiates a new RequestExtensions object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRequestExtensionsWithDefaults

`func NewRequestExtensionsWithDefaults() *RequestExtensions`

NewRequestExtensionsWithDefaults instantiates a new RequestExtensions object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMicrosoftSecurityIdentifier

`func (o *RequestExtensions) GetMicrosoftSecurityIdentifier() string`

GetMicrosoftSecurityIdentifier returns the MicrosoftSecurityIdentifier field if non-nil, zero value otherwise.

### GetMicrosoftSecurityIdentifierOk

`func (o *RequestExtensions) GetMicrosoftSecurityIdentifierOk() (*string, bool)`

GetMicrosoftSecurityIdentifierOk returns a tuple with the MicrosoftSecurityIdentifier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMicrosoftSecurityIdentifier

`func (o *RequestExtensions) SetMicrosoftSecurityIdentifier(v string)`

SetMicrosoftSecurityIdentifier sets MicrosoftSecurityIdentifier field to given value.

### HasMicrosoftSecurityIdentifier

`func (o *RequestExtensions) HasMicrosoftSecurityIdentifier() bool`

HasMicrosoftSecurityIdentifier returns a boolean if a field has been set.

### SetMicrosoftSecurityIdentifierNil

`func (o *RequestExtensions) SetMicrosoftSecurityIdentifierNil(b bool)`

 SetMicrosoftSecurityIdentifierNil sets the value for MicrosoftSecurityIdentifier to be an explicit nil

### UnsetMicrosoftSecurityIdentifier
`func (o *RequestExtensions) UnsetMicrosoftSecurityIdentifier()`

UnsetMicrosoftSecurityIdentifier ensures that no value is present for MicrosoftSecurityIdentifier, not even an explicit nil
### GetMicrosoftPolicyTemplateOID

`func (o *RequestExtensions) GetMicrosoftPolicyTemplateOID() string`

GetMicrosoftPolicyTemplateOID returns the MicrosoftPolicyTemplateOID field if non-nil, zero value otherwise.

### GetMicrosoftPolicyTemplateOIDOk

`func (o *RequestExtensions) GetMicrosoftPolicyTemplateOIDOk() (*string, bool)`

GetMicrosoftPolicyTemplateOIDOk returns a tuple with the MicrosoftPolicyTemplateOID field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMicrosoftPolicyTemplateOID

`func (o *RequestExtensions) SetMicrosoftPolicyTemplateOID(v string)`

SetMicrosoftPolicyTemplateOID sets MicrosoftPolicyTemplateOID field to given value.

### HasMicrosoftPolicyTemplateOID

`func (o *RequestExtensions) HasMicrosoftPolicyTemplateOID() bool`

HasMicrosoftPolicyTemplateOID returns a boolean if a field has been set.

### SetMicrosoftPolicyTemplateOIDNil

`func (o *RequestExtensions) SetMicrosoftPolicyTemplateOIDNil(b bool)`

 SetMicrosoftPolicyTemplateOIDNil sets the value for MicrosoftPolicyTemplateOID to be an explicit nil

### UnsetMicrosoftPolicyTemplateOID
`func (o *RequestExtensions) UnsetMicrosoftPolicyTemplateOID()`

UnsetMicrosoftPolicyTemplateOID ensures that no value is present for MicrosoftPolicyTemplateOID, not even an explicit nil
### GetRequestDNS

`func (o *RequestExtensions) GetRequestDNS() RequestDNS`

GetRequestDNS returns the RequestDNS field if non-nil, zero value otherwise.

### GetRequestDNSOk

`func (o *RequestExtensions) GetRequestDNSOk() (*RequestDNS, bool)`

GetRequestDNSOk returns a tuple with the RequestDNS field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestDNS

`func (o *RequestExtensions) SetRequestDNS(v RequestDNS)`

SetRequestDNS sets RequestDNS field to given value.

### HasRequestDNS

`func (o *RequestExtensions) HasRequestDNS() bool`

HasRequestDNS returns a boolean if a field has been set.

### GetRequestRFC822

`func (o *RequestExtensions) GetRequestRFC822() RequestRFC822`

GetRequestRFC822 returns the RequestRFC822 field if non-nil, zero value otherwise.

### GetRequestRFC822Ok

`func (o *RequestExtensions) GetRequestRFC822Ok() (*RequestRFC822, bool)`

GetRequestRFC822Ok returns a tuple with the RequestRFC822 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestRFC822

`func (o *RequestExtensions) SetRequestRFC822(v RequestRFC822)`

SetRequestRFC822 sets RequestRFC822 field to given value.

### HasRequestRFC822

`func (o *RequestExtensions) HasRequestRFC822() bool`

HasRequestRFC822 returns a boolean if a field has been set.

### GetRequestUPN

`func (o *RequestExtensions) GetRequestUPN() RequestUPN`

GetRequestUPN returns the RequestUPN field if non-nil, zero value otherwise.

### GetRequestUPNOk

`func (o *RequestExtensions) GetRequestUPNOk() (*RequestUPN, bool)`

GetRequestUPNOk returns a tuple with the RequestUPN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestUPN

`func (o *RequestExtensions) SetRequestUPN(v RequestUPN)`

SetRequestUPN sets RequestUPN field to given value.

### HasRequestUPN

`func (o *RequestExtensions) HasRequestUPN() bool`

HasRequestUPN returns a boolean if a field has been set.

### GetRequestIP

`func (o *RequestExtensions) GetRequestIP() RequestIP`

GetRequestIP returns the RequestIP field if non-nil, zero value otherwise.

### GetRequestIPOk

`func (o *RequestExtensions) GetRequestIPOk() (*RequestIP, bool)`

GetRequestIPOk returns a tuple with the RequestIP field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestIP

`func (o *RequestExtensions) SetRequestIP(v RequestIP)`

SetRequestIP sets RequestIP field to given value.

### HasRequestIP

`func (o *RequestExtensions) HasRequestIP() bool`

HasRequestIP returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


