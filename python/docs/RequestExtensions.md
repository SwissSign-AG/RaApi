# RequestExtensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**microsoft_security_identifier** | **str** | Microsoft Security Identifier (SID) Override or add the X.509 extension is present in the certificate policy  | [optional] 
**microsoft_policy_template_oid** | **str** | Microsoft Policy Template Object Identifier. Override or add the X.509 extension is present in the certificate policy  | [optional] 
**request_dns** | [**RequestDNS**](RequestDNS.md) |  | [optional] 
**request_rfc822** | [**RequestRFC822**](RequestRFC822.md) |  | [optional] 
**request_upn** | [**RequestUPN**](RequestUPN.md) |  | [optional] 
**request_ip** | [**RequestIP**](RequestIP.md) |  | [optional] 
**request_role** | [**RequestRole**](RequestRole.md) |  | [optional] 
**request_device_serial_number** | [**RequestDeviceSerialNumber**](RequestDeviceSerialNumber.md) |  | [optional] 
**request_scope** | [**RequestScope**](RequestScope.md) |  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.request_extensions import RequestExtensions

# TODO update the JSON string below
json = "{}"
# create an instance of RequestExtensions from a JSON string
request_extensions_instance = RequestExtensions.from_json(json)
# print the JSON string representation of the object
print(RequestExtensions.to_json())

# convert the object into a dict
request_extensions_dict = request_extensions_instance.to_dict()
# create an instance of RequestExtensions from a dict
request_extensions_from_dict = RequestExtensions.from_dict(request_extensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


