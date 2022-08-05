# Product
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **uuid** | **String** | Product UUID reference | [default to null] |
| **productName** | **String** | Certificate product name | [optional] [default to null] |
| **productDescription** | **String** | Product additional description | [optional] [default to null] |
| **keyGenerationType** | **String** | Key generation protocol | [default to null] |
| **keyType** | [**KeyType**](KeyType.md) |  | [default to null] |
| **issuanceNotification** | **Boolean** | Indicate if the certificate sends a notification on issuance | [default to null] |
| **revocationNotification** | **Boolean** | Indicate if the certificate sends a notification on revocation | [default to null] |
| **authorization** | **Boolean** | Indicate if the certificate requires an authorization on issuance/revocation | [default to null] |
| **renewalRule** | **Boolean** | Indicate if the certificate sends a notification for renewal | [default to null] |
| **publishCertificate** | **Boolean** | Indicate if the certificate is published to the public LDAP after issuance | [default to null] |
| **clientPublishCertificateOverride** | **Boolean** | Indicate if the certificate publication can be overridden | [default to null] |
| **clientPublishCertificateOverrideDefault** | **Boolean** | Indicate the default value if publication override is enabled | [default to null] |
| **expirationDate** | **date** | Indicate if the certificate product has an expiration date | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

