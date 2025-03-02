# RequestDNS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List[DNS]**](DNS.md) |  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.request_dns import RequestDNS

# TODO update the JSON string below
json = "{}"
# create an instance of RequestDNS from a JSON string
request_dns_instance = RequestDNS.from_json(json)
# print the JSON string representation of the object
print(RequestDNS.to_json())

# convert the object into a dict
request_dns_dict = request_dns_instance.to_dict()
# create an instance of RequestDNS from a dict
request_dns_from_dict = RequestDNS.from_dict(request_dns_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


