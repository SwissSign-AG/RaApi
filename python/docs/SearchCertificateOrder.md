# SearchCertificateOrder


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**order_reference** | **str, none_type** | Certificate Order reference | [optional] 
**serial_number** | **str, none_type** | Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or * | [optional] 
**order_status** | [**[CertificateOrderStatus], none_type**](CertificateOrderStatus.md) |  | [optional] 
**revocation_reason** | [**[RevocationReason], none_type**](RevocationReason.md) |  | [optional] 
**client_references** | **[str], none_type** | Client reference UUID | [optional] 
**start_after** | **date, none_type** | End Validity not starting after Date | [optional] 
**start_before** | **date, none_type** | Validity not starting before Date | [optional] 
**attribute** | **str, none_type** | Any certificate attribute OID or value with optional wildcard attributes ? and/or * | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


