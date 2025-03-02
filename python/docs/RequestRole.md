# RequestRole


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Role extension as defined in OID 1.3.6.1.4.1.43121.1.4.2.0.1 (UTF8String) | 

## Example

```python
from swisssign_ra_api.v2.models.request_role import RequestRole

# TODO update the JSON string below
json = "{}"
# create an instance of RequestRole from a JSON string
request_role_instance = RequestRole.from_json(json)
# print the JSON string representation of the object
print(RequestRole.to_json())

# convert the object into a dict
request_role_dict = request_role_instance.to_dict()
# create an instance of RequestRole from a dict
request_role_from_dict = RequestRole.from_dict(request_role_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


