

# CertificateOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** | Certificate Order reference |  |
|**createdOn** | **OffsetDateTime** | Certificate Order creation date time |  |
|**status** | **CertificateOrderStatus** |  |  |
|**clientReference** | **String** | Client reference UUID |  [readonly] |
|**productReference** | **String** | Product reference UUID |  [readonly] |
|**certificate** | [**Certificate**](Certificate.md) |  |  [optional] |
|**additionalRecipients** | [**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md) |  |  [optional] |
|**issuedBy** | **String** | email of the person who created the order |  [optional] [readonly] |



