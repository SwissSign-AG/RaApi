# RegistrationDocument


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**document_name** | **str** | document name | 
**document** | **str** | Base64 encoded byte array of the document content | 

## Example

```python
from swisssign_ra_api.v2.models.registration_document import RegistrationDocument

# TODO update the JSON string below
json = "{}"
# create an instance of RegistrationDocument from a JSON string
registration_document_instance = RegistrationDocument.from_json(json)
# print the JSON string representation of the object
print(RegistrationDocument.to_json())

# convert the object into a dict
registration_document_dict = registration_document_instance.to_dict()
# create an instance of RegistrationDocument from a dict
registration_document_from_dict = RegistrationDocument.from_dict(registration_document_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


