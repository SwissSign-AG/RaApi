# DNS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dns** | **str** | requested domain name (gets converted to punycode if required) | 
**include_base_domain_for_wildcard** | **bool** | Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option.  | [optional] 
**include_www_domain** | **bool** | Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS.  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.dns import DNS

# TODO update the JSON string below
json = "{}"
# create an instance of DNS from a JSON string
dns_instance = DNS.from_json(json)
# print the JSON string representation of the object
print(DNS.to_json())

# convert the object into a dict
dns_dict = dns_instance.to_dict()
# create an instance of DNS from a dict
dns_from_dict = DNS.from_dict(dns_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


