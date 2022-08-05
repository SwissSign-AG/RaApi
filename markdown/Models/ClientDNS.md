# ClientDNS
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **uuid** | **String** | Pre validated client domain reference | [default to null] |
| **domain** | **String** | Client domain in punycode | [default to null] |
| **domainUnicode** | **String** | Client domain in unicode | [default to null] |
| **validated** | **Boolean** | Indicates if the domain is validated | [default to null] |
| **trustedDomain** | **Boolean** | Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs. | [default to null] |
| **timeValidated** | **Date** | Indicates when the domain got validated | [optional] [default to null] |
| **validationMethod** | [**DNSOwnerCheck**](DNSOwnerCheck.md) |  | [default to null] |
| **randomValue** | **String** | The random value to add to the DNS TXT record for the domain | [optional] [default to null] |
| **randomValueTimeCreated** | **Date** | Indicates when the random value was created | [optional] [default to null] |
| **randomValueTimeExpire** | **Date** | Indicates when the random value expires | [optional] [default to null] |
| **validationResult** | **String** | Indicates the validation result | [optional] [default to null] |
| **timeExpired** | **Date** | Indicates when the random value was created | [optional] [default to null] |
| **expired** | **Boolean** | Indicates if the pre validation of the domain has expired | [default to null] |
| **randomValueTimeExpired** | **Boolean** | Indicates if the random value is expired | [default to null] |
| **status** | [**ClientDomainValidationStatus**](ClientDomainValidationStatus.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

