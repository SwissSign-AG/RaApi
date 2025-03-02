# Client


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Client UUID reference | [readonly] 
**name** | **str** | Client name | [readonly] 
**description** | **str** | Client description | [optional] [readonly] 
**products** | [**List[Product]**](Product.md) | List of available certificate products | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.client import Client

# TODO update the JSON string below
json = "{}"
# create an instance of Client from a JSON string
client_instance = Client.from_json(json)
# print the JSON string representation of the object
print(Client.to_json())

# convert the object into a dict
client_dict = client_instance.to_dict()
# create an instance of Client from a dict
client_from_dict = Client.from_dict(client_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


