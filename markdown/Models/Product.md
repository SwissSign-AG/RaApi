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
| **allowAdditionalIssuanceNotificationRecipients** | **Boolean** | When enabled, additional certificate issuance notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **allowAdditionalRevocationNotificationRecipients** | **Boolean** | When enabled, additional certificate revocation notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **allowAdditionalRenewalNotificationRecipients** | **Boolean** | When enabled, additional certificate renewal notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **allowAdditionalAuthorizationNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **allowAdditionalAuthorizationAcceptedNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients (for accepted requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **allowAdditionalAuthorizationRejectedNotificationRecipients** | **Boolean** | When enabled, additional authorization notification recipients (for rejected requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **isCABDNSValidationRequired** | **Boolean** | When enabled, indicates CAB DNS or HTTP domain validation is required. | [default to null] |
| **allowAdditionalCABDNSNotificationRecipients** | **Boolean** | When enabled, indicates that additional notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [default to null] |
| **isCABDNSEmailLinkValidationRequired** | **Boolean** | When enabled, indicates CAB DNS via constructed email link to domain owner is required. | [default to null] |
| **isEmailBoxValidationRequired** | **Boolean** | When enabled, indicates that the recipient must validate the email box via a link. | [default to null] |
| **requiresRegistrationDocuments** | **Boolean** | When enabled, registration documents must provided with the certificate order. Documents are skipped when disabled. | [default to null] |
| **requiresRegistrationDocumentsOnRegister** | **Boolean** | When enabled, registration documents must provided when submitting the certificate order. When disabled, documents can be added to the certificate order at a later time via the RA UI. | [default to null] |
| **allowRegistrationDocumentsPDF** | **Boolean** | PDF registration document are allowed. | [default to null] |
| **allowRegistrationDocumentsJPG** | **Boolean** | JPG/PNG registration images are allowed. | [default to null] |
| **isGenerateRevocationCode** | **Boolean** | Indicates if a revocation code is issued for the recipient (link to self service revocation). | [default to null] |
| **productValidity** | [**ProductValidity**](ProductValidity.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

