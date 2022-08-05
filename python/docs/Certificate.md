# Certificate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **str** | Certificate Subject Distinguished Name | [readonly] 
**issuer** | **str** | Certificate Issuer Distinguished Name | [readonly] 
**serial** | **str** | Certificate serial number (Big Integer HEX encoded) | [readonly] 
**start_validity** | **datetime** | Certificate start validity in UTC | [readonly] 
**end_validity** | **datetime** | Certificate start validity in UTC | [readonly] 
**certificate** | **str** | base64 encoded DER certificate | [readonly] 
**revocation_status** | [**RevocationStatus**](RevocationStatus.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


