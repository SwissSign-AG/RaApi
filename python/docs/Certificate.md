# Certificate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **str** | Certificate Subject Distinguished Name | [readonly] 
**issuer** | **str** | Certificate Issuer Distinguished Name | [readonly] 
**serial** | **str** | Certificate serial number (Big Integer HEX encoded) | [readonly] 
**start_validity** | **datetime** | Certificate start validity in UTC | [readonly] 
**end_validity** | **datetime** | Certificate start validity in UTC | [readonly] 
**certificate** | **str** | base64 encoded DER certificate | [readonly] 
**revocation_status** | [**RevocationStatus**](RevocationStatus.md) |  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.certificate import Certificate

# TODO update the JSON string below
json = "{}"
# create an instance of Certificate from a JSON string
certificate_instance = Certificate.from_json(json)
# print the JSON string representation of the object
print(Certificate.to_json())

# convert the object into a dict
certificate_dict = certificate_instance.to_dict()
# create an instance of Certificate from a dict
certificate_from_dict = Certificate.from_dict(certificate_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


