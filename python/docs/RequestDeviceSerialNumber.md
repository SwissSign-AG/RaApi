# RequestDeviceSerialNumber


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | Device Serial Number extension as defined in OID 1.3.6.1.4.1.43121.1.4.2.0.2 (UTF8String) | 

## Example

```python
from swisssign_ra_api.v2.models.request_device_serial_number import RequestDeviceSerialNumber

# TODO update the JSON string below
json = "{}"
# create an instance of RequestDeviceSerialNumber from a JSON string
request_device_serial_number_instance = RequestDeviceSerialNumber.from_json(json)
# print the JSON string representation of the object
print(RequestDeviceSerialNumber.to_json())

# convert the object into a dict
request_device_serial_number_dict = request_device_serial_number_instance.to_dict()
# create an instance of RequestDeviceSerialNumber from a dict
request_device_serial_number_from_dict = RequestDeviceSerialNumber.from_dict(request_device_serial_number_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


