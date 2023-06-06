

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
| UNUSED | &quot;UNUSED&quot; |
| KEY_COMPROMISE | &quot;KEY_COMPROMISE&quot; |
| AFFILIATION_CHANGED | &quot;AFFILIATION_CHANGED&quot; |
| SUPERSEDED | &quot;SUPERSEDED&quot; |
| CESSATION_OF_OPERATION | &quot;CESSATION_OF_OPERATION&quot; |



