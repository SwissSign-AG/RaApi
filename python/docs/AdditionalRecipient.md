# AdditionalRecipient


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | RFC822 email | 
**recipient_type** | **str** | Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.  | 
**language** | **str** | Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages.  | 

## Example

```python
from swisssign_ra_api.v2.models.additional_recipient import AdditionalRecipient

# TODO update the JSON string below
json = "{}"
# create an instance of AdditionalRecipient from a JSON string
additional_recipient_instance = AdditionalRecipient.from_json(json)
# print the JSON string representation of the object
print(AdditionalRecipient.to_json())

# convert the object into a dict
additional_recipient_dict = additional_recipient_instance.to_dict()
# create an instance of AdditionalRecipient from a dict
additional_recipient_from_dict = AdditionalRecipient.from_dict(additional_recipient_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


