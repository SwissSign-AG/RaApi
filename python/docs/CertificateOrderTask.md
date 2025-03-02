# CertificateOrderTask


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uuid** | **str** | Certificate Order Task reference | [readonly] 
**time_created** | **datetime** | Certificate Order creation date time | [optional] [readonly] 
**time_scheduled** | **datetime** | Scheduled date time | [optional] [readonly] 
**time_started** | **datetime** | Started date time | [optional] [readonly] 
**time_finished** | **datetime** | Finished date time | [optional] [readonly] 
**status** | [**JobStatus**](JobStatus.md) |  | 
**type** | [**JobType**](JobType.md) |  | 
**number_of_executions** | **int** | Number of executions | [readonly] 
**response** | **str** | Response | [optional] [readonly] 
**error** | **str** | Error message | [optional] [readonly] 

## Example

```python
from swisssign_ra_api.v2.models.certificate_order_task import CertificateOrderTask

# TODO update the JSON string below
json = "{}"
# create an instance of CertificateOrderTask from a JSON string
certificate_order_task_instance = CertificateOrderTask.from_json(json)
# print the JSON string representation of the object
print(CertificateOrderTask.to_json())

# convert the object into a dict
certificate_order_task_dict = certificate_order_task_instance.to_dict()
# create an instance of CertificateOrderTask from a dict
certificate_order_task_from_dict = CertificateOrderTask.from_dict(certificate_order_task_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


