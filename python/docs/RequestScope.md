# RequestScope


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Scope extension as defined in OID 1.3.6.1.4.1.43121.1.4.2.0.3 (HEX encoded OCTET STRING) | 

## Example

```python
from swisssign_ra_api.v2.models.request_scope import RequestScope

# TODO update the JSON string below
json = "{}"
# create an instance of RequestScope from a JSON string
request_scope_instance = RequestScope.from_json(json)
# print the JSON string representation of the object
print(RequestScope.to_json())

# convert the object into a dict
request_scope_dict = request_scope_instance.to_dict()
# create an instance of RequestScope from a dict
request_scope_from_dict = RequestScope.from_dict(request_scope_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


