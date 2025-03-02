# CertificateOrders


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**draw** | **int** |  | [readonly] 
**records_filtered** | **int** | Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data). | [readonly] 
**records_total** | **int** | Total records, before filtering (i.e. the total number of records in the database) | [readonly] 
**data** | [**List[CertificateOrder]**](CertificateOrder.md) |  | 

## Example

```python
from swisssign_ra_api.v2.models.certificate_orders import CertificateOrders

# TODO update the JSON string below
json = "{}"
# create an instance of CertificateOrders from a JSON string
certificate_orders_instance = CertificateOrders.from_json(json)
# print the JSON string representation of the object
print(CertificateOrders.to_json())

# convert the object into a dict
certificate_orders_dict = certificate_orders_instance.to_dict()
# create an instance of CertificateOrders from a dict
certificate_orders_from_dict = CertificateOrders.from_dict(certificate_orders_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


