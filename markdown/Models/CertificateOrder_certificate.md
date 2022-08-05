# CertificateOrder_certificate
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **subject** | **String** | Certificate Subject Distinguished Name | [default to null] |
| **issuer** | **String** | Certificate Issuer Distinguished Name | [default to null] |
| **serial** | **String** | Certificate serial number (Big Integer HEX encoded) | [default to null] |
| **startValidity** | **Date** | Certificate start validity in UTC | [default to null] |
| **endValidity** | **Date** | Certificate start validity in UTC | [default to null] |
| **certificate** | **File** | base64 encoded DER certificate | [default to null] |
| **revocationStatus** | [**Certificate_revocationStatus**](Certificate_revocationStatus.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

