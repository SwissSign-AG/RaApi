# CertificateOrder
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **uuid** | **String** | Certificate Order reference | [default to null] |
| **createdOn** | **Date** | Certificate Order creation date time | [default to null] |
| **status** | [**CertificateOrderStatus**](CertificateOrderStatus.md) |  | [default to null] |
| **clientReference** | **String** | Client reference UUID | [default to null] |
| **productReference** | **String** | Product reference UUID | [default to null] |
| **certificate** | [**Certificate**](Certificate.md) |  | [optional] [default to null] |
| **additionalRecipients** | [**List**](AdditionalRecipient.md) |  | [optional] [default to null] |
| **issuedBy** | **String** | email of the person who created the order | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

