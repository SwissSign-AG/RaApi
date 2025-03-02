# ProductValidity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validity_type** | **str** | Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds.  | [readonly] 
**validity** | **int** | The default certificate validity | [optional] [readonly] 
**validity_options** | **List[int]** | Optional certificate validity values | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.product_validity import ProductValidity

# TODO update the JSON string below
json = "{}"
# create an instance of ProductValidity from a JSON string
product_validity_instance = ProductValidity.from_json(json)
# print the JSON string representation of the object
print(ProductValidity.to_json())

# convert the object into a dict
product_validity_dict = product_validity_instance.to_dict()
# create an instance of ProductValidity from a dict
product_validity_from_dict = ProductValidity.from_dict(product_validity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


