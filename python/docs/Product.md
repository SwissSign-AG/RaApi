# Product


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Product UUID reference | [readonly] 
**key_generation_type** | **str** | Key generation protocol | [readonly] 
**key_type** | [**KeyType**](KeyType.md) |  | 
**issuance_notification** | **bool** | Indicate if the certificate sends a notification on issuance | [readonly] 
**revocation_notification** | **bool** | Indicate if the certificate sends a notification on revocation | [readonly] 
**authorization** | **bool** | Indicate if the certificate requires an authorization on issuance/revocation | [readonly] 
**renewal_rule** | **bool** | Indicate if the certificate sends a notification for renewal | [readonly] 
**publish_certificate** | **bool** | Indicate if the certificate is published to the public LDAP after issuance | [readonly] 
**client_publish_certificate_override** | **bool** | Indicate if the certificate publication can be overridden | [readonly] 
**client_publish_certificate_override_default** | **bool** | Indicate the default value if publication override is enabled | [readonly] 
**allow_additional_issuance_notification_recipients** | **bool** | When enabled, additional certificate issuance notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**allow_additional_revocation_notification_recipients** | **bool** | When enabled, additional certificate revocation notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**allow_additional_renewal_notification_recipients** | **bool** | When enabled, additional certificate renewal notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**allow_additional_authorization_notification_recipients** | **bool** | When enabled, additional authorization notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**allow_additional_authorization_accepted_notification_recipients** | **bool** | When enabled, additional authorization notification recipients (for accepted requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**allow_additional_authorization_rejected_notification_recipients** | **bool** | When enabled, additional authorization notification recipients (for rejected requests) can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**is_cabdns_validation_required** | **bool** | When enabled, indicates CAB DNS or HTTP domain validation is required. | [readonly] 
**allow_additional_cabdns_notification_recipients** | **bool** | When enabled, indicates that additional notification recipients can be added to the certificate order. Additional recipients are skipped when disabled. | [readonly] 
**is_cabdns_email_link_validation_required** | **bool** | When enabled, indicates CAB DNS via constructed email link to domain owner is required. | [readonly] 
**is_email_box_validation_required** | **bool** | When enabled, indicates that the recipient must validate the email box via a link. | [readonly] 
**requires_registration_documents** | **bool** | When enabled, registration documents must provided with the certificate order. Documents are skipped when disabled. | [readonly] 
**requires_registration_documents_on_register** | **bool** | When enabled, registration documents must provided when submitting the certificate order. When disabled, documents can be added to the certificate order at a later time via the RA UI. | [readonly] 
**allow_registration_documents_pdf** | **bool** | PDF registration document are allowed. | [readonly] 
**allow_registration_documents_jpg** | **bool** | JPG/PNG registration images are allowed. | [readonly] 
**is_generate_revocation_code** | **bool** | Indicates if a revocation code is issued for the recipient (link to self service revocation). | [readonly] 
**product_name** | **str** | Certificate product name | [optional] [readonly] 
**product_description** | **str, none_type** | Product additional description | [optional] [readonly] 
**expiration_date** | **date, none_type** | Indicate if the certificate product has an expiration date | [optional] [readonly] 
**product_validity** | [**ProductValidity**](ProductValidity.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


