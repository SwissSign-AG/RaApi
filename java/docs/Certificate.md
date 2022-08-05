

# Certificate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subject** | **String** | Certificate Subject Distinguished Name |  [readonly] |
|**issuer** | **String** | Certificate Issuer Distinguished Name |  [readonly] |
|**serial** | **String** | Certificate serial number (Big Integer HEX encoded) |  [readonly] |
|**startValidity** | **OffsetDateTime** | Certificate start validity in UTC |  [readonly] |
|**endValidity** | **OffsetDateTime** | Certificate start validity in UTC |  [readonly] |
|**certificate** | **File** | base64 encoded DER certificate |  [readonly] |
|**revocationStatus** | [**CertificateRevocationStatus**](CertificateRevocationStatus.md) |  |  [optional] |



