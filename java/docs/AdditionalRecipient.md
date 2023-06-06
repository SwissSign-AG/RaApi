

# AdditionalRecipient


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | RFC822 email |  |
|**recipientType** | [**RecipientTypeEnum**](#RecipientTypeEnum) | Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.  |  |
|**language** | [**LanguageEnum**](#LanguageEnum) | Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages.  |  |



## Enum: RecipientTypeEnum

| Name | Value |
|---- | -----|
| DNS_OWNER_CHECK_EMAIL_LINK | &quot;DNS_OWNER_CHECK_EMAIL_LINK&quot; |
| DNS_CAB | &quot;DNS_CAB&quot; |
| ISSUANCE | &quot;ISSUANCE&quot; |
| REVOCATION | &quot;REVOCATION&quot; |
| RENEWAL | &quot;RENEWAL&quot; |
| RECOVERY | &quot;RECOVERY&quot; |
| AUTHORIZATION | &quot;AUTHORIZATION&quot; |
| AUTHORIZATION_ACCEPTED | &quot;AUTHORIZATION_ACCEPTED&quot; |
| AUTHORIZATION_REJECTED | &quot;AUTHORIZATION_REJECTED&quot; |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| NEUTRAL | &quot;NEUTRAL&quot; |
| EN | &quot;EN&quot; |
| FR | &quot;FR&quot; |
| DE | &quot;DE&quot; |



