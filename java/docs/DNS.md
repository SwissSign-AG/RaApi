

# DNS


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dns** | **String** | requested domain name (gets converted to punycode if required) |  |
|**includeBaseDomainForWildcard** | **Boolean** | Append base domain to wildcard DNS. Adds sample.org when *.sample.org is requested. Applies only to certificate policies which allow wildcard issuance. This flag has no effect if the certificate policy does not include the wildcard option.  |  [optional] |
|**includeWWWDomain** | **Boolean** | Append www to requested DNS.  Adds www.sample.org when sample.org is requested. When enabled, www is prefixed to all requested DNS.  |  [optional] |



