# ClientDNS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Pre validated client domain reference | [readonly] 
**domain** | **str** | Client domain in punycode | 
**domain_unicode** | **str** | Client domain in unicode | [readonly] 
**validated** | **bool** | Indicates if the domain is validated | [readonly] 
**trusted_domain** | **bool** | Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs. | 
**time_validated** | **datetime** | Indicates when the domain got validated | [optional] [readonly] 
**validation_method** | **str** | DNS validation type | [readonly] 
**random_value** | **str** | The random value to add to the DNS TXT record for the domain | [optional] [readonly] 
**random_value_time_created** | **datetime** | Indicates when the random value was created | [optional] [readonly] 
**random_value_time_expire** | **datetime** | Indicates when the random value expires | [optional] [readonly] 
**validation_result** | **str** | Indicates the validation result | [optional] [readonly] 
**time_expired** | **datetime** | Indicates when the random value was created | [optional] [readonly] 
**expired** | **bool** | Indicates if the pre validation of the domain has expired | [readonly] 
**random_value_time_expired** | **bool** | Indicates if the random value is expired | [readonly] 
**status** | [**ClientDomainValidationStatus**](ClientDomainValidationStatus.md) |  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.client_dns import ClientDNS

# TODO update the JSON string below
json = "{}"
# create an instance of ClientDNS from a JSON string
client_dns_instance = ClientDNS.from_json(json)
# print the JSON string representation of the object
print(ClientDNS.to_json())

# convert the object into a dict
client_dns_dict = client_dns_instance.to_dict()
# create an instance of ClientDNS from a dict
client_dns_from_dict = ClientDNS.from_dict(client_dns_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


