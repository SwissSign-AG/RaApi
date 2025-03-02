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
**certificate_chain** | **List[str]** | Certificate chain | [optional] 
**tags** | **List[str]** | User defined tags/labels | [optional] 
**additional_recipients** | [**List[AdditionalRecipient]**](AdditionalRecipient.md) |  | [optional] 
**issued_by** | **str** | email of the person who created the order | [optional] [readonly] 

## Example

```python
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder

# TODO update the JSON string below
json = "{}"
# create an instance of CertificateOrder from a JSON string
certificate_order_instance = CertificateOrder.from_json(json)
# print the JSON string representation of the object
print(CertificateOrder.to_json())

# convert the object into a dict
certificate_order_dict = certificate_order_instance.to_dict()
# create an instance of CertificateOrder from a dict
certificate_order_from_dict = CertificateOrder.from_dict(certificate_order_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


