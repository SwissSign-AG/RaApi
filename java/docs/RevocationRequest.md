

# RevocationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serialNumber** | **String** | Certificate serial number (Big Integer HEX encoded) |  |
|**revocationReason** | [**RevocationReasonEnum**](#RevocationReasonEnum) | Revocation reason |  |
|**issuerName** | **String** | Certificate issuer distinguished name |  |



## Enum: RevocationReasonEnum

| Name | Value |
|---- | -----|
| UNUSED | &quot;unused&quot; |
| KEYCOMPROMISE | &quot;keyCompromise&quot; |
| AFFILIATIONCHANGED | &quot;affiliationChanged&quot; |
| SUPERSEDED | &quot;superseded&quot; |
| CESSATIONOFOPERATION | &quot;cessationOfOperation&quot; |
| PRIVILEGEWITHDRAWN | &quot;privilegeWithdrawn&quot; |



