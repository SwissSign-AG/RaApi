# ClientDNS


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Pre validated client domain reference | [readonly] 
**domain** | **str** | Client domain in punycode | 
**domain_unicode** | **str** | Client domain in unicode | [readonly] 
**validated** | **bool** | Indicates if the domain is validated | [readonly] 
**trusted_domain** | **bool** | Indicates if the domain is a trusted domain (for private PKIs). This setting is linked to the certificate product DNS validation rule for Private PKIs. | 
**validation_method** | **str** | DNS validation type | [readonly] 
**expired** | **bool** | Indicates if the pre validation of the domain has expired | [readonly] 
**random_value_time_expired** | **bool** | Indicates if the random value is expired | [readonly] 
**time_validated** | **datetime, none_type** | Indicates when the domain got validated | [optional] [readonly] 
**random_value** | **str, none_type** | The random value to add to the DNS TXT record for the domain | [optional] [readonly] 
**random_value_time_created** | **datetime** | Indicates when the random value was created | [optional] [readonly] 
**random_value_time_expire** | **datetime** | Indicates when the random value expires | [optional] [readonly] 
**validation_result** | **str, none_type** | Indicates the validation result | [optional] [readonly] 
**time_expired** | **datetime, none_type** | Indicates when the random value was created | [optional] [readonly] 
**status** | [**ClientDomainValidationStatus**](ClientDomainValidationStatus.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


