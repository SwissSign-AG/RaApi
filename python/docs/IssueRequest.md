# IssueRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_reference** | **str** | Product reference | 
**csr** | **str, none_type** | CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary). | [optional] 
**overrides** | [**RequestOverrides**](RequestOverrides.md) |  | [optional] 
**additional_recipients** | [**[AdditionalRecipient]**](AdditionalRecipient.md) |  | [optional] 
**registration_documents** | [**[RegistrationDocument]**](RegistrationDocument.md) |  | [optional] 
**note** | **str, none_type** | User note added to issued certificate order | [optional] 
**publish_certificate** | **bool** | Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication.  | [optional] 
**synchrone** | **bool** | Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled.  | [optional]  if omitted the server will use the default value of False
**accept_tand_c** | **bool** | When server backend has T&amp;C enabled, this value is checked.  | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


