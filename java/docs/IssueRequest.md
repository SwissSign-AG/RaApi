

# IssueRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productReference** | **String** | Product reference |  |
|**csr** | **String** | CSR PEM encoded with or without ----BEGIN/END CERTIFICATE REQUEST-----. When null, a key-pair is generated if the certificate policy allows it (SubjectDN and optional overrides must be provided where necessary). |  [optional] |
|**overrides** | [**RequestOverrides**](RequestOverrides.md) |  |  [optional] |
|**additionalRecipients** | [**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md) |  |  [optional] |
|**registrationDocuments** | [**List&lt;RegistrationDocument&gt;**](RegistrationDocument.md) |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**note** | **String** | User note added to issued certificate order |  [optional] |
|**publishCertificate** | **Boolean** | Publish certificate to repository. Publication occurs if option is enabled on certificate policy or if the account has the option enabled to override the publication.  |  [optional] |
|**synchrone** | **Boolean** | Request is sent asynchronously to the backend by default.  Setting this value to _true_ will wait until the certificate is issued and return the completed certificate order. For successful synchrone issuance, _insure_ that you have all prerequisites for DNS validation and/or Authorization fulfilled.  |  [optional] |
|**acceptTandC** | **Boolean** | When server backend has T&amp;C enabled, this value is checked.  |  [optional] |
|**includeCertificateChain** | **Boolean** | Include the certificate chain in the reply (only valid when &#39;synchrone&#39; is true).  |  [optional] |



