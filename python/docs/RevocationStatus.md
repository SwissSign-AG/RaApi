# RevocationStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revoked_on** | **datetime** | Revocation date in UTC | [readonly] 
**reason** | [**RevocationReason**](RevocationReason.md) |  | 
**revoked_by** | **str** | email of the person who revoked the certificate | [readonly] 
**revocation_requestor** | **str** | First- and last name of revocation requestor | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.revocation_status import RevocationStatus

# TODO update the JSON string below
json = "{}"
# create an instance of RevocationStatus from a JSON string
revocation_status_instance = RevocationStatus.from_json(json)
# print the JSON string representation of the object
print(RevocationStatus.to_json())

# convert the object into a dict
revocation_status_dict = revocation_status_instance.to_dict()
# create an instance of RevocationStatus from a dict
revocation_status_from_dict = RevocationStatus.from_dict(revocation_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


