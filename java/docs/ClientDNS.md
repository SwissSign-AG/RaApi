

# ClientDNS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Pre validated client domain reference |  [readonly] |
|**domain** | **String** | Client domain in punycode |  |
|**domainUnicode** | **String** | Client domain in unicode |  [readonly] |
|**validated** | **Boolean** | Indicates if the domain is validated |  [readonly] |
|**trustedDomain** | **Boolean** | Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs. |  |
|**timeValidated** | **OffsetDateTime** | Indicates when the domain got validated |  [optional] [readonly] |
|**validationMethod** | **String** | DNS validation type |  [readonly] |
|**randomValue** | **String** | The random value to add to the DNS TXT record for the domain |  [optional] [readonly] |
|**randomValueTimeCreated** | **OffsetDateTime** | Indicates when the random value was created |  [optional] [readonly] |
|**randomValueTimeExpire** | **OffsetDateTime** | Indicates when the random value expires |  [optional] [readonly] |
|**validationResult** | **String** | Indicates the validation result |  [optional] [readonly] |
|**timeExpired** | **OffsetDateTime** | Indicates when the random value was created |  [optional] [readonly] |
|**expired** | **Boolean** | Indicates if the pre validation of the domain has expired |  [readonly] |
|**randomValueTimeExpired** | **Boolean** | Indicates if the random value is expired |  [readonly] |
|**status** | **ClientDomainValidationStatus** |  |  [optional] |



