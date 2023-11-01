# IssueRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **productReference** | **String** | Product reference | [default to null] |
| **csr** | **String** | CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary). | [optional] [default to null] |
| **overrides** | [**RequestOverrides**](RequestOverrides.md) |  | [optional] [default to null] |
| **additionalRecipients** | [**List**](AdditionalRecipient.md) |  | [optional] [default to null] |
| **registrationDocuments** | [**List**](RegistrationDocument.md) |  | [optional] [default to null] |
| **note** | **String** | User note added to issued certificate order | [optional] [default to null] |
| **publishCertificate** | **Boolean** | Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication.  | [optional] [default to null] |
| **synchrone** | **Boolean** | Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled.  | [optional] [default to false] |
| **acceptTandC** | **Boolean** | When server backend has T&amp;C enabled, this value is checked.  | [optional] [default to true] |
| **includeCertificateChain** | **Boolean** | Include the certificate chain in the reply (only valid when &#39;synchrone&#39; is true).  | [optional] [default to false] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

