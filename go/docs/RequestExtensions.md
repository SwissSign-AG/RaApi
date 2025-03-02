# RequestExtensions

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MicrosoftSecurityIdentifier** | Pointer to **string** | Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy  | [optional] 
**MicrosoftPolicyTemplateOID** | Pointer to **string** | Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy  | [optional] 
**RequestDNS** | Pointer to [**RequestDNS**](RequestDNS.md) |  | [optional] 
**RequestRFC822** | Pointer to [**RequestRFC822**](RequestRFC822.md) |  | [optional] 
**RequestUPN** | Pointer to [**RequestUPN**](RequestUPN.md) |  | [optional] 
**RequestIP** | Pointer to [**RequestIP**](RequestIP.md) |  | [optional] 
**RequestRole** | Pointer to [**RequestRole**](RequestRole.md) |  | [optional] 
**RequestDeviceSerialNumber** | Pointer to [**RequestDeviceSerialNumber**](RequestDeviceSerialNumber.md) |  | [optional] 
**RequestScope** | Pointer to [**RequestScope**](RequestScope.md) |  | [optional] 

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

### GetRequestRole

`func (o *RequestExtensions) GetRequestRole() RequestRole`

GetRequestRole returns the RequestRole field if non-nil, zero value otherwise.

### GetRequestRoleOk

`func (o *RequestExtensions) GetRequestRoleOk() (*RequestRole, bool)`

GetRequestRoleOk returns a tuple with the RequestRole field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestRole

`func (o *RequestExtensions) SetRequestRole(v RequestRole)`

SetRequestRole sets RequestRole field to given value.

### HasRequestRole

`func (o *RequestExtensions) HasRequestRole() bool`

HasRequestRole returns a boolean if a field has been set.

### GetRequestDeviceSerialNumber

`func (o *RequestExtensions) GetRequestDeviceSerialNumber() RequestDeviceSerialNumber`

GetRequestDeviceSerialNumber returns the RequestDeviceSerialNumber field if non-nil, zero value otherwise.

### GetRequestDeviceSerialNumberOk

`func (o *RequestExtensions) GetRequestDeviceSerialNumberOk() (*RequestDeviceSerialNumber, bool)`

GetRequestDeviceSerialNumberOk returns a tuple with the RequestDeviceSerialNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestDeviceSerialNumber

`func (o *RequestExtensions) SetRequestDeviceSerialNumber(v RequestDeviceSerialNumber)`

SetRequestDeviceSerialNumber sets RequestDeviceSerialNumber field to given value.

### HasRequestDeviceSerialNumber

`func (o *RequestExtensions) HasRequestDeviceSerialNumber() bool`

HasRequestDeviceSerialNumber returns a boolean if a field has been set.

### GetRequestScope

`func (o *RequestExtensions) GetRequestScope() RequestScope`

GetRequestScope returns the RequestScope field if non-nil, zero value otherwise.

### GetRequestScopeOk

`func (o *RequestExtensions) GetRequestScopeOk() (*RequestScope, bool)`

GetRequestScopeOk returns a tuple with the RequestScope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestScope

`func (o *RequestExtensions) SetRequestScope(v RequestScope)`

SetRequestScope sets RequestScope field to given value.

### HasRequestScope

`func (o *RequestExtensions) HasRequestScope() bool`

HasRequestScope returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


