# IssueRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_reference** | **str** | Product reference | 
**csr** | **str** | CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary). | [optional] 
**overrides** | [**RequestOverrides**](RequestOverrides.md) |  | [optional] 
**additional_recipients** | [**List[AdditionalRecipient]**](AdditionalRecipient.md) |  | [optional] 
**registration_documents** | [**List[RegistrationDocument]**](RegistrationDocument.md) |  | [optional] 
**tags** | **List[str]** |  | [optional] 
**note** | **str** | User note added to issued certificate order | [optional] 
**publish_certificate** | **bool** | Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication.  | [optional] 
**synchrone** | **bool** | Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchronous issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled.  | [optional] [default to False]
**accept_tand_c** | **bool** | When server backend has T&amp;C enabled, this value is checked.  | [optional] [default to True]
**include_certificate_chain** | **bool** | Include the certificate chain in the reply (only valid when &#39;synchronous&#39; is true).  | [optional] [default to False]

## Example

```python
from swisssign_ra_api.v2.models.issue_request import IssueRequest

# TODO update the JSON string below
json = "{}"
# create an instance of IssueRequest from a JSON string
issue_request_instance = IssueRequest.from_json(json)
# print the JSON string representation of the object
print(IssueRequest.to_json())

# convert the object into a dict
issue_request_dict = issue_request_instance.to_dict()
# create an instance of IssueRequest from a dict
issue_request_from_dict = IssueRequest.from_dict(issue_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


