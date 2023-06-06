# SearchCertificateOrder
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **orderReference** | **String** | Certificate Order reference | [optional] [default to null] |
| **serialNumber** | **String** | Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or * | [optional] [default to null] |
| **orderStatus** | [**List**](CertificateOrderStatus.md) |  | [optional] [default to null] |
| **revocationReason** | [**List**](RevocationReason.md) |  | [optional] [default to null] |
| **clientReferences** | **List** | Client reference UUID | [optional] [default to null] |
| **startAfter** | **date** | Certificate Order not starting after Date | [optional] [default to null] |
| **startBefore** | **date** | Certificate Order not starting before Date | [optional] [default to null] |
| **attribute** | **String** | Any certificate attribute OID or value with optional wildcard attributes ? and/or * | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

