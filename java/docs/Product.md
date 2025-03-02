

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
|**expirationDate** | **OffsetDateTime** | Indicate if the certificate product has an expiration date |  [optional] [readonly] |
|**allowAdditionalIssuanceNotificationRecipients** | **Boolean** | When enabled, additional certificate issuance notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**allowAdditionalRevocationNotificationRecipients** | **Boolean** | When enabled, additional certificate revocation notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**allowAdditionalRenewalNotificationRecipients** | **Boolean** | When enabled, additional certificate renewal notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**allowAdditionalAuthorizationNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**allowAdditionalAuthorizationAcceptedNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients (for accepted requests) can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**allowAdditionalAuthorizationRejectedNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients (for rejected requests) can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**isCABDNSValidationRequired** | **Boolean** | When enabled, indicates CAB DNS or HTTP domain validation is required. |  [readonly] |
|**allowAdditionalCABDNSNotificationRecipients** | **Boolean** | When enabled, indicates that additional notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. |  [readonly] |
|**isCABDNSEmailLinkValidationRequired** | **Boolean** | When enabled, indicates CAB DNS via constructed email link to domain owner is required. |  [readonly] |
|**isEmailBoxValidationRequired** | **Boolean** | When enabled, indicates that the recipient must validate the email box via a link. |  [readonly] |
|**requiresRegistrationDocuments** | **Boolean** | When enabled, registration documents must provided with the certificate order. Documents are skipped when disabled. |  [readonly] |
|**requiresRegistrationDocumentsOnRegister** | **Boolean** | When enabled, registration documents must provided when submitting the certificate order. When disabled, documents can be added to the certificate order at a later time via the RA UI. |  [readonly] |
|**allowRegistrationDocumentsPDF** | **Boolean** | PDF registration document are allowed. |  [readonly] |
|**allowRegistrationDocumentsJPG** | **Boolean** | JPG/PNG registration images are allowed. |  [readonly] |
|**isGenerateRevocationCode** | **Boolean** | Indicates if a revocation code is issued for the recipient (link to self service revocation). |  [readonly] |
|**productValidity** | [**ProductValidity**](ProductValidity.md) |  |  [optional] |



## Enum: KeyGenerationTypeEnum

| Name | Value |
|---- | -----|
| PKCS10 | &quot;PKCS10&quot; |
| PKCS12 | &quot;PKCS12&quot; |
| PKCS12WITH_PIN | &quot;PKCS12withPIN&quot; |
| PKCS12WITH_CAPIN | &quot;PKCS12withCAPIN&quot; |
| PKCS10OR12WITH_PIN | &quot;PKCS10or12withPIN&quot; |
| PKCS10OR12WITH_CAPIN | &quot;PKCS10or12withCAPIN&quot; |
| HSM | &quot;HSM&quot; |
| CNG | &quot;CNG&quot; |



