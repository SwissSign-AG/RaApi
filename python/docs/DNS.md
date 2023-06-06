# DNS


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dns** | **str** | requested domain name (gets converted to punycode if required) | 
**include_base_domain_for_wildcard** | **bool** | Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option.  | [optional] 
**include_www_domain** | **bool** | Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


