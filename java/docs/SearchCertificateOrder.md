

# SearchCertificateOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderReference** | **String** | Certificate Order reference |  [optional] |
|**serialNumber** | **String** | Certificate serial number (Big Integer HEX encoded) with optional wildcard attributes ? and/or * |  [optional] |
|**orderStatus** | **List&lt;CertificateOrderStatus&gt;** |  |  [optional] |
|**revocationReason** | **List&lt;RevocationReason&gt;** |  |  [optional] |
|**clientReferences** | **List&lt;String&gt;** | Client reference UUID |  [optional] |
|**startAfter** | **LocalDate** | Certificate Order not starting after Date |  [optional] |
|**startBefore** | **LocalDate** | Certificate Order not starting before Date |  [optional] |
|**attribute** | **String** | Any certificate attribute OID or value with optional wildcard attributes ? and/or * |  [optional] |



