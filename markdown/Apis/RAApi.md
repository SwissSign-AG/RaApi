# RAApi

All URIs are relative to *https://api.ra.pre.swisssign.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCertificateOrderAdditionalRecipients**](RAApi.md#addCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order |
| [**createClientPrevalidatedDomains**](RAApi.md#createClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id |
| [**deleteCertificateOrderAdditionalRecipients**](RAApi.md#deleteCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order |
| [**deleteClientPrevalidatedDomain**](RAApi.md#deleteClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id |
| [**deleteClientPrevalidatedDomainToken**](RAApi.md#deleteClientPrevalidatedDomainToken) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id |
| [**getCertificateChain**](RAApi.md#getCertificateChain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference |
| [**getCertificateOrder**](RAApi.md#getCertificateOrder) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference |
| [**getCertificateOrderStatus**](RAApi.md#getCertificateOrderStatus) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference |
| [**getCertificateOrderTasks**](RAApi.md#getCertificateOrderTasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference |
| [**getCertificateOrders**](RAApi.md#getCertificateOrders) | **POST** /v2/orders | Search Certificate Orders |
| [**getClient**](RAApi.md#getClient) | **POST** /v2/client/{clientReference} | Get a client given its reference Id |
| [**getClientPrevalidatedDomain**](RAApi.md#getClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id |
| [**getClientPrevalidatedDomains**](RAApi.md#getClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id |
| [**issueCertificate**](RAApi.md#issueCertificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR |
| [**issueCertificateV22**](RAApi.md#issueCertificateV22) | **POST** /v2/issue | Issue certificate using extended request attributes |
| [**jwt**](RAApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
| [**listCertificateOrderAdditionalRecipients**](RAApi.md#listCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients |
| [**publishCertificate**](RAApi.md#publishCertificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order |
| [**replaceCertificateOrderTags**](RAApi.md#replaceCertificateOrderTags) | **POST** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags |
| [**resetClientPrevalidatedDomain**](RAApi.md#resetClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id |
| [**revokeCertificates**](RAApi.md#revokeCertificates) | **POST** /v2/revoke | Revoke certificates |
| [**searchClients**](RAApi.md#searchClients) | **POST** /v2/clients | Search Clients available to the RA Operator |
| [**searchPagedCertificateOrders**](RAApi.md#searchPagedCertificateOrders) | **POST** /v2/orders/paged | Search Certificate Orders |
| [**searchPagedClients**](RAApi.md#searchPagedClients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator |
| [**unpublishCertificate**](RAApi.md#unpublishCertificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order |
| [**validateClientPrevalidatedDomain**](RAApi.md#validateClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |
| [**validateIssueRequest**](RAApi.md#validateIssueRequest) | **POST** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate |


<a name="addCertificateOrderAdditionalRecipients"></a>
# **addCertificateOrderAdditionalRecipients**
> List addCertificateOrderAdditionalRecipients(orderReference, AdditionalRecipient)

Add additional recipients to Certificate Order

    Add additional recipients to Certificate Order. Existing users are skipped. Returns list of effectively added additional recipients. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |
| **AdditionalRecipient** | [**List**](../Models/AdditionalRecipient.md)| Array of additional recipients | |

### Return type

[**List**](../Models/AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="createClientPrevalidatedDomains"></a>
# **createClientPrevalidatedDomains**
> List createClientPrevalidatedDomains(clientReference, request\_body)

Register new pre validated domains for the selected client given its reference Id

    Create and issue domains pre validation tokens for the selected client 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | [default to null] |
| **request\_body** | [**List**](../Models/string.md)| Client domains | |

### Return type

[**List**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteCertificateOrderAdditionalRecipients"></a>
# **deleteCertificateOrderAdditionalRecipients**
> List deleteCertificateOrderAdditionalRecipients(orderReference, AdditionalRecipient)

Delete additional recipients to Certificate Order

    Delete additional recipients to Certificate Order. Unknown users are skipped. Returns list of effectively deleted additional recipients. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |
| **AdditionalRecipient** | [**List**](../Models/AdditionalRecipient.md)| Array of additional recipients to delete | |

### Return type

[**List**](../Models/AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteClientPrevalidatedDomain"></a>
# **deleteClientPrevalidatedDomain**
> deleteClientPrevalidatedDomain(prevalidatedDomainReference)

Delete pre validated domain for the selected reference Id

    Delete pre validated domain 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteClientPrevalidatedDomainToken"></a>
# **deleteClientPrevalidatedDomainToken**
> ClientDNS deleteClientPrevalidatedDomainToken(prevalidatedDomainReference)

Delete pre validated domain token for the selected reference Id

    Delete pre validated domain token 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateChain"></a>
# **getCertificateChain**
> List getCertificateChain(orderReference)

Retrieve the certificate chain for the given Order reference

    Retrieve the certificate chain base64 encoded text. First element in list is leaf certificate, last element is Root certificate. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

**List**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateOrder"></a>
# **getCertificateOrder**
> CertificateOrder getCertificateOrder(orderReference)

Retrieve a Certificate Order given the Order reference

    Retrieve a certificate order given the order reference identifier. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

[**CertificateOrder**](../Models/CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateOrderStatus"></a>
# **getCertificateOrderStatus**
> CertificateOrderStatus getCertificateOrderStatus(orderReference)

Retrieve a Certificate Order status given the Order reference

    Retrieve a certificate order status given the order reference identifier. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

[**CertificateOrderStatus**](../Models/CertificateOrderStatus.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateOrderTasks"></a>
# **getCertificateOrderTasks**
> List getCertificateOrderTasks(orderReference)

Retrieve a Certificate Order Tasks given the Order reference

    Retrieve a certificate order tasks given the order reference identifier. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

[**List**](../Models/CertificateOrderTask.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateOrders"></a>
# **getCertificateOrders**
> List getCertificateOrders(SearchCertificateOrder)

Search Certificate Orders

    Search for Certificate Orders given search parameters. The result list is limited to the maximum (default is 300) query result list settings. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **SearchCertificateOrder** | [**SearchCertificateOrder**](../Models/SearchCertificateOrder.md)| Certificate order search options | |

### Return type

[**List**](../Models/CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getClient"></a>
# **getClient**
> Client getClient(clientReference)

Get a client given its reference Id

    Get a client given its reference UUID 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | [default to null] |

### Return type

[**Client**](../Models/Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getClientPrevalidatedDomain"></a>
# **getClientPrevalidatedDomain**
> ClientDNS getClientPrevalidatedDomain(prevalidatedDomainReference)

Get pre validated domains for the selected domain reference Id

    Get pre validated domain token for the selected identifier 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getClientPrevalidatedDomains"></a>
# **getClientPrevalidatedDomains**
> List getClientPrevalidatedDomains(clientReference)

Get the list of pre validated domains for the selected client given its reference Id

    Retrieve the list of pre validated domains and their status for the selected client 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | [default to null] |

### Return type

[**List**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="issueCertificate"></a>
# **issueCertificate**
> CertificateOrder issueCertificate(productReference, body)

Issue certificate using CSR

    Issue a certificate based on the Product reference (CSR) 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productReference** | **String**| Certificate product reference UUID | [default to null] |
| **body** | **String**| Certificate Request in Base64 with start/end beacon | |

### Return type

[**CertificateOrder**](../Models/CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: text/plain, application/json
- **Accept**: application/json

<a name="issueCertificateV22"></a>
# **issueCertificateV22**
> CertificateOrder issueCertificateV22(IssueRequest)

Issue certificate using extended request attributes

    Issue a certificate based on the Product reference with extended attributes and CSR 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **IssueRequest** | [**IssueRequest**](../Models/IssueRequest.md)| Issue Request | |

### Return type

[**CertificateOrder**](../Models/CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="jwt"></a>
# **jwt**
> String jwt(userName, userSecret)

Produce a user JWT

    Helper service to generate a JWT derived from you login username and API Key --- * Use the generated JWT in the header of __each__ HTTP request to the service  &#x60;Authorization: Bearer &lt;encoded JWT&gt;&#x60; 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userName** | **String**|  | [default to null] |
| **userSecret** | **String**|  | [default to null] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: text/plain, application/json

<a name="listCertificateOrderAdditionalRecipients"></a>
# **listCertificateOrderAdditionalRecipients**
> List listCertificateOrderAdditionalRecipients(orderReference)

Obtain a list of additional Certificate Order recipients

    List additional Certificate Order recipients 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

[**List**](../Models/AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="publishCertificate"></a>
# **publishCertificate**
> publishCertificate(orderReference)

Send a certificate publication request for selected Certificate Order

    Publish or republish a certificate to the external source (LDAP, SFTP or file system). Publication rule must be enabled on the issued certificate. An error is raised if the certificate is already published. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="replaceCertificateOrderTags"></a>
# **replaceCertificateOrderTags**
> CertificateOrder replaceCertificateOrderTags(orderReference, request\_body)

Replace Certificate Order custom tags

    Replace certificate order custom tags with a new set of user defined tags/labels 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |
| **request\_body** | [**List**](../Models/string.md)| List of user defined tags/labels | |

### Return type

[**CertificateOrder**](../Models/CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="resetClientPrevalidatedDomain"></a>
# **resetClientPrevalidatedDomain**
> ClientDNS resetClientPrevalidatedDomain(prevalidatedDomainReference)

Reset pre validated domain token for the selected reference Id

    Reset pre validated domain token 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="revokeCertificates"></a>
# **revokeCertificates**
> revokeCertificates(RevocationRequest)

Revoke certificates

    Revoke one or more certificates 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **RevocationRequest** | [**List**](../Models/RevocationRequest.md)| Certificate references to revoke | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="searchClients"></a>
# **searchClients**
> List searchClients(search)

Search Clients available to the RA Operator

    Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. The result list is limited to the maximum (default is 300) query result list settings 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| search query string with optional wildcard attributes ? and/or * | [optional] [default to null] |

### Return type

[**List**](../Models/Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="searchPagedCertificateOrders"></a>
# **searchPagedCertificateOrders**
> CertificateOrders searchPagedCertificateOrders(SearchCertificateOrder, length, start)

Search Certificate Orders

    Search for Certificate Orders given search parameters. The search supports paging 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **SearchCertificateOrder** | [**SearchCertificateOrder**](../Models/SearchCertificateOrder.md)| Certificate order search options | |
| **length** | **Integer**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] [default to null] |
| **start** | **Integer**| the offset in search result for paging support | [optional] [default to null] |

### Return type

[**CertificateOrders**](../Models/CertificateOrders.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="searchPagedClients"></a>
# **searchPagedClients**
> Clients searchPagedClients(search, length, start)

Search Clients available to the RA Operator

    Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. The search supports paging 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**| search query string with optional wildcard attributes ? and/or * | [optional] [default to null] |
| **length** | **Integer**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] [default to null] |
| **start** | **Integer**| the offset in search result for paging support | [optional] [default to null] |

### Return type

[**Clients**](../Models/Clients.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="unpublishCertificate"></a>
# **unpublishCertificate**
> unpublishCertificate(orderReference)

Send a certificate un-publication request for selected Certificate Order

    Remove the certificate from the external source (LDAP, SFTP or file system). Publication rule must be enabled on the issued certificate. An error is raised if the certificate is already un published. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="validateClientPrevalidatedDomain"></a>
# **validateClientPrevalidatedDomain**
> ClientDNS validateClientPrevalidatedDomain(prevalidatedDomainReference)

Prevalidate domain for the selected domain reference Id

    Pre validate domain token for the selected identifier 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="validateIssueRequest"></a>
# **validateIssueRequest**
> validateIssueRequest(IssueRequest)

Validate an issue request structure. Validates the request but does not issue any certificate

    Validates the request but does not issue any certificate 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **IssueRequest** | [**IssueRequest**](../Models/IssueRequest.md)| Validate Issue Request | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

