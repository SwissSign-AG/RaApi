# AdditionalRecipient

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Email** | **string** | RFC822 email | 
**RecipientType** | **string** | Notification type for additional recipient.   - DNS_OWNER_CHECK_EMAIL_LINK: send notification for DNS validation (email link) to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - DNS_CAB: send notification for CAB DNS change or CAB Agreed upon to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - ISSUANCE: send notification for certificate issuance to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - REVOCATION: send notification for certificate revocation to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RENEWAL: send notification for certificate renewal to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - RECOVERY: send notification for key recovery to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION: send notification for authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_ACCEPTED: send notification for accepted authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.   - AUTHORIZATION_REJECTED: send notification for issuance authorization to additional recipient. Requires notification enabled for &#39;Additional recipient&#39; on notification template.  | 
**Language** | **string** | Notification language for additional recipient. The NEUTRAL type is the default notification is no notification with type of DE, FR or EN is defined. This is usually a notification which contains a message in three languages.  | 

## Methods

### NewAdditionalRecipient

`func NewAdditionalRecipient(email string, recipientType string, language string, ) *AdditionalRecipient`

NewAdditionalRecipient instantiates a new AdditionalRecipient object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAdditionalRecipientWithDefaults

`func NewAdditionalRecipientWithDefaults() *AdditionalRecipient`

NewAdditionalRecipientWithDefaults instantiates a new AdditionalRecipient object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmail

`func (o *AdditionalRecipient) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *AdditionalRecipient) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *AdditionalRecipient) SetEmail(v string)`

SetEmail sets Email field to given value.


### GetRecipientType

`func (o *AdditionalRecipient) GetRecipientType() string`

GetRecipientType returns the RecipientType field if non-nil, zero value otherwise.

### GetRecipientTypeOk

`func (o *AdditionalRecipient) GetRecipientTypeOk() (*string, bool)`

GetRecipientTypeOk returns a tuple with the RecipientType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecipientType

`func (o *AdditionalRecipient) SetRecipientType(v string)`

SetRecipientType sets RecipientType field to given value.


### GetLanguage

`func (o *AdditionalRecipient) GetLanguage() string`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *AdditionalRecipient) GetLanguageOk() (*string, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *AdditionalRecipient) SetLanguage(v string)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


