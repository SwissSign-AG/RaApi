# RevocationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serial_number** | **str** | Certificate serial number (Big Integer HEX encoded) | 
**revocation_reason** | **str** | Revocation reason | 
**issuer_name** | **str** | Certificate issuer distinguished name | 
**revocation_requestor** | **str** | First- and last name of revocation requestor. Revocation requestor must be used when API account is of type SERVICE_ACCOUNT | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.revocation_request import RevocationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RevocationRequest from a JSON string
revocation_request_instance = RevocationRequest.from_json(json)
# print the JSON string representation of the object
print(RevocationRequest.to_json())

# convert the object into a dict
revocation_request_dict = revocation_request_instance.to_dict()
# create an instance of RevocationRequest from a dict
revocation_request_from_dict = RevocationRequest.from_dict(revocation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


