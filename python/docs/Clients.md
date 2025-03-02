# Clients


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**draw** | **int** |  | [readonly] 
**records_filtered** | **int** | Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data). | [readonly] 
**records_total** | **int** | Total records, before filtering (i.e. the total number of records in the database) | [readonly] 
**data** | [**List[Client]**](Client.md) |  | 

## Example

```python
from swisssign_ra_api.v2.models.clients import Clients

# TODO update the JSON string below
json = "{}"
# create an instance of Clients from a JSON string
clients_instance = Clients.from_json(json)
# print the JSON string representation of the object
print(Clients.to_json())

# convert the object into a dict
clients_dict = clients_instance.to_dict()
# create an instance of Clients from a dict
clients_from_dict = Clients.from_dict(clients_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


