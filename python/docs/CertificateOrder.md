# CertificateOrder


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Certificate Order reference | 
**created_on** | **datetime** | Certificate Order creation date time | 
**status** | [**CertificateOrderStatus**](CertificateOrderStatus.md) |  | 
**client_reference** | **str** | Client reference UUID | [readonly] 
**product_reference** | **str** | Product reference UUID | [readonly] 
**certificate** | [**Certificate**](Certificate.md) |  | [optional] 
**issued_by** | **str** | email of the person who created the order | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


