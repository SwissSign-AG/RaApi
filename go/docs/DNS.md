# DNS

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dns** | **string** | requested domain name (gets converted to punycode if required) | 
**IncludeBaseDomainForWildcard** | Pointer to **bool** | Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option.  | [optional] 
**IncludeWWWDomain** | Pointer to **bool** | Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS.  | [optional] 

## Methods

### NewDNS

`func NewDNS(dns string, ) *DNS`

NewDNS instantiates a new DNS object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDNSWithDefaults

`func NewDNSWithDefaults() *DNS`

NewDNSWithDefaults instantiates a new DNS object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDns

`func (o *DNS) GetDns() string`

GetDns returns the Dns field if non-nil, zero value otherwise.

### GetDnsOk

`func (o *DNS) GetDnsOk() (*string, bool)`

GetDnsOk returns a tuple with the Dns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDns

`func (o *DNS) SetDns(v string)`

SetDns sets Dns field to given value.


### GetIncludeBaseDomainForWildcard

`func (o *DNS) GetIncludeBaseDomainForWildcard() bool`

GetIncludeBaseDomainForWildcard returns the IncludeBaseDomainForWildcard field if non-nil, zero value otherwise.

### GetIncludeBaseDomainForWildcardOk

`func (o *DNS) GetIncludeBaseDomainForWildcardOk() (*bool, bool)`

GetIncludeBaseDomainForWildcardOk returns a tuple with the IncludeBaseDomainForWildcard field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeBaseDomainForWildcard

`func (o *DNS) SetIncludeBaseDomainForWildcard(v bool)`

SetIncludeBaseDomainForWildcard sets IncludeBaseDomainForWildcard field to given value.

### HasIncludeBaseDomainForWildcard

`func (o *DNS) HasIncludeBaseDomainForWildcard() bool`

HasIncludeBaseDomainForWildcard returns a boolean if a field has been set.

### GetIncludeWWWDomain

`func (o *DNS) GetIncludeWWWDomain() bool`

GetIncludeWWWDomain returns the IncludeWWWDomain field if non-nil, zero value otherwise.

### GetIncludeWWWDomainOk

`func (o *DNS) GetIncludeWWWDomainOk() (*bool, bool)`

GetIncludeWWWDomainOk returns a tuple with the IncludeWWWDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeWWWDomain

`func (o *DNS) SetIncludeWWWDomain(v bool)`

SetIncludeWWWDomain sets IncludeWWWDomain field to given value.

### HasIncludeWWWDomain

`func (o *DNS) HasIncludeWWWDomain() bool`

HasIncludeWWWDomain returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


