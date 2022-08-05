# CertificateOrderCertificate

Certificate reference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**revocation_status** | [**CertificateRevocationStatus**](CertificateRevocationStatus.md) |  | [optional] 
**subject** | **str** | Certificate Subject Distinguished Name | [optional] [readonly] 
**issuer** | **str** | Certificate Issuer Distinguished Name | [optional] [readonly] 
**serial** | **str** | Certificate serial number (Big Integer HEX encoded) | [optional] [readonly] 
**start_validity** | **datetime** | Certificate start validity in UTC | [optional] [readonly] 
**end_validity** | **datetime** | Certificate start validity in UTC | [optional] [readonly] 
**certificate** | **file_type** | base64 encoded DER certificate | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


