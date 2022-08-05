

# Product


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Product UUID reference |  [readonly] |
|**productName** | **String** | Certificate product name |  [optional] [readonly] |
|**productDescription** | **String** | Product additional description |  [optional] [readonly] |
|**keyGenerationType** | [**KeyGenerationTypeEnum**](#KeyGenerationTypeEnum) | Key generation protocol |  [readonly] |
|**keyType** | **KeyType** |  |  |
|**issuanceNotification** | **Boolean** | Indicate if the certificate sends a notification on issuance |  [readonly] |
|**revocationNotification** | **Boolean** | Indicate if the certificate sends a notification on revocation |  [readonly] |
|**authorization** | **Boolean** | Indicate if the certificate requires an authorization on issuance/revocation |  [readonly] |
|**renewalRule** | **Boolean** | Indicate if the certificate sends a notification for renewal |  [readonly] |
|**publishCertificate** | **Boolean** | Indicate if the certificate is published to the public LDAP after issuance |  [readonly] |
|**clientPublishCertificateOverride** | **Boolean** | Indicate if the certificate publication can be overridden |  [readonly] |
|**clientPublishCertificateOverrideDefault** | **Boolean** | Indicate the default value if publication override is enabled |  [readonly] |
|**expirationDate** | **LocalDate** | Indicate if the certificate product has an expiration date |  [optional] [readonly] |



## Enum: KeyGenerationTypeEnum

| Name | Value |
|---- | -----|
| PKCS10 | &quot;PKCS10&quot; |
| PKCS12 | &quot;PKCS12&quot; |



