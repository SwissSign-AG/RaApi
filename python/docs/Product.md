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
**product_name** | **str** | Certificate product name | [optional] [readonly] 
**product_description** | **str, none_type** | Product additional description | [optional] [readonly] 
**expiration_date** | **date, none_type** | Indicate if the certificate product has an expiration date | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


