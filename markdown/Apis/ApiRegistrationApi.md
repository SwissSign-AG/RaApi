# ApiRegistrationApi

All URIs are relative to *https://api.ra.pre.swisssign.ch/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createClientPrevalidatedDomains**](ApiRegistrationApi.md#createClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id |
| [**deleteClientPrevalidatedDomain**](ApiRegistrationApi.md#deleteClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete prevalidated domain for the selected reference Id |
| [**deleteClientPrevalidatedDomainToken**](ApiRegistrationApi.md#deleteClientPrevalidatedDomainToken) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete prevalidated domain token for the selected reference Id |
| [**getCertificateChain**](ApiRegistrationApi.md#getCertificateChain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference |
| [**getCertificateOrder**](ApiRegistrationApi.md#getCertificateOrder) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference |
| [**getCertificateOrderStatus**](ApiRegistrationApi.md#getCertificateOrderStatus) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference |
| [**getCertificateOrderTasks**](ApiRegistrationApi.md#getCertificateOrderTasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference |
| [**getCertificateOrders**](ApiRegistrationApi.md#getCertificateOrders) | **POST** /v2/orders | Search Certificate Orders |
| [**getClient**](ApiRegistrationApi.md#getClient) | **POST** /v2/client/{clientReference} | Get a client given its reference Id |
| [**getClientPrevalidatedDomain**](ApiRegistrationApi.md#getClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get prevalidated domains for the selected domain reference Id |
| [**getClientPrevalidatedDomains**](ApiRegistrationApi.md#getClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of prevalidated domains for the selected client given its reference Id |
| [**issueCertificate**](ApiRegistrationApi.md#issueCertificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR |
| [**jwt**](ApiRegistrationApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
| [**resetClientPrevalidatedDomain**](ApiRegistrationApi.md#resetClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id |
| [**revokeCertificates**](ApiRegistrationApi.md#revokeCertificates) | **POST** /v2/revoke | Revoke certificates |
| [**searchClients**](ApiRegistrationApi.md#searchClients) | **POST** /v2/clients | Search Clients available to the RA Operator |
| [**validateClientPrevalidatedDomain**](ApiRegistrationApi.md#validateClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |


<a name="createClientPrevalidatedDomains"></a>
# **createClientPrevalidatedDomains**
> List createClientPrevalidatedDomains(clientReference, request\_body)

Register new prevalidated domains for the selected client given its reference Id

    Create and issue domains pre validation tokens for the selected client 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | [default to null] |
| **request\_body** | [**List**](../Models/string.md)| Client domains | |

### Return type

[**List**](../Models/ClientDNS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="deleteClientPrevalidatedDomain"></a>
# **deleteClientPrevalidatedDomain**
> deleteClientPrevalidatedDomain(prevalidatedDomainReference)

Delete prevalidated domain for the selected reference Id

    Delete pre validated domain 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="deleteClientPrevalidatedDomainToken"></a>
# **deleteClientPrevalidatedDomainToken**
> ClientDNS deleteClientPrevalidatedDomainToken(prevalidatedDomainReference)

Delete prevalidated domain token for the selected reference Id

    Delete pre validated domain token 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getCertificateOrders"></a>
# **getCertificateOrders**
> List getCertificateOrders(SearchCertificateOrder)

Search Certificate Orders

    Search for Certificate Orders given search parameters 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **SearchCertificateOrder** | [**SearchCertificateOrder**](../Models/SearchCertificateOrder.md)| Certificate order search options | |

### Return type

[**List**](../Models/CertificateOrder.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getClientPrevalidatedDomain"></a>
# **getClientPrevalidatedDomain**
> ClientDNS getClientPrevalidatedDomain(prevalidatedDomainReference)

Get prevalidated domains for the selected domain reference Id

    Get pre validatied domain token for the selected identifier 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getClientPrevalidatedDomains"></a>
# **getClientPrevalidatedDomains**
> List getClientPrevalidatedDomains(clientReference)

Get the list of prevalidated domains for the selected client given its reference Id

    Retrieve the list of pre validated domains and their status for the selected client 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | [default to null] |

### Return type

[**List**](../Models/ClientDNS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
| **body** | **String**| Certificate Request in Base64 with start/end beacon | [optional] |

### Return type

[**CertificateOrder**](../Models/CertificateOrder.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: text/plain
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

<a name="resetClientPrevalidatedDomain"></a>
# **resetClientPrevalidatedDomain**
> ClientDNS resetClientPrevalidatedDomain(prevalidatedDomainReference)

Reset prevalidated domain token for the selected reference Id

    Reset pre validated domain token 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | [default to null] |

### Return type

[**ClientDNS**](../Models/ClientDNS.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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
| **RevocationRequest** | [**List**](../Models/RevocationRequest.md)| Certificate references to revoke | [optional] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="searchClients"></a>
# **searchClients**
> List searchClients(search)

Search Clients available to the RA Operator

    Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**|  | [optional] [default to null] |

### Return type

[**List**](../Models/Client.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

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

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

