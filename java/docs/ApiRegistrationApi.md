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
> List&lt;ClientDNS&gt; createClientPrevalidatedDomains(clientReference, requestBody)

Register new prevalidated domains for the selected client given its reference Id

Create and issue domains pre validation tokens for the selected client 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    List<String> requestBody = Arrays.asList(); // List<String> | Client domains
    try {
      List<ClientDNS> result = apiInstance.createClientPrevalidatedDomains(clientReference, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#createClientPrevalidatedDomains");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Client domains | |

### Return type

[**List&lt;ClientDNS&gt;**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="deleteClientPrevalidatedDomain"></a>
# **deleteClientPrevalidatedDomain**
> deleteClientPrevalidatedDomain(prevalidatedDomainReference)

Delete prevalidated domain for the selected reference Id

Delete pre validated domain 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      apiInstance.deleteClientPrevalidatedDomain(prevalidatedDomainReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#deleteClientPrevalidatedDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="deleteClientPrevalidatedDomainToken"></a>
# **deleteClientPrevalidatedDomainToken**
> ClientDNS deleteClientPrevalidatedDomainToken(prevalidatedDomainReference)

Delete prevalidated domain token for the selected reference Id

Delete pre validated domain token 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.deleteClientPrevalidatedDomainToken(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#deleteClientPrevalidatedDomainToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | |

### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getCertificateChain"></a>
# **getCertificateChain**
> List&lt;String&gt; getCertificateChain(orderReference)

Retrieve the certificate chain for the given Order reference

Retrieve the certificate chain base64 encoded text. First element in list is leaf certificate, last element is Root certificate. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<String> result = apiInstance.getCertificateChain(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getCertificateChain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | |

### Return type

**List&lt;String&gt;**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getCertificateOrder"></a>
# **getCertificateOrder**
> CertificateOrder getCertificateOrder(orderReference)

Retrieve a Certificate Order given the Order reference

Retrieve a certificate order given the order reference identifier. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      CertificateOrder result = apiInstance.getCertificateOrder(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getCertificateOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | |

### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getCertificateOrderStatus"></a>
# **getCertificateOrderStatus**
> CertificateOrderStatus getCertificateOrderStatus(orderReference)

Retrieve a Certificate Order status given the Order reference

Retrieve a certificate order status given the order reference identifier. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      CertificateOrderStatus result = apiInstance.getCertificateOrderStatus(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getCertificateOrderStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | |

### Return type

[**CertificateOrderStatus**](CertificateOrderStatus.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getCertificateOrderTasks"></a>
# **getCertificateOrderTasks**
> List&lt;CertificateOrderTask&gt; getCertificateOrderTasks(orderReference)

Retrieve a Certificate Order Tasks given the Order reference

Retrieve a certificate order tasks given the order reference identifier. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<CertificateOrderTask> result = apiInstance.getCertificateOrderTasks(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getCertificateOrderTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderReference** | **String**|  | |

### Return type

[**List&lt;CertificateOrderTask&gt;**](CertificateOrderTask.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getCertificateOrders"></a>
# **getCertificateOrders**
> List&lt;CertificateOrder&gt; getCertificateOrders(searchCertificateOrder)

Search Certificate Orders

Search for Certificate Orders given search parameters 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    SearchCertificateOrder searchCertificateOrder = new SearchCertificateOrder(); // SearchCertificateOrder | Certificate order search options
    try {
      List<CertificateOrder> result = apiInstance.getCertificateOrders(searchCertificateOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getCertificateOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchCertificateOrder** | [**SearchCertificateOrder**](SearchCertificateOrder.md)| Certificate order search options | |

### Return type

[**List&lt;CertificateOrder&gt;**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getClient"></a>
# **getClient**
> Client getClient(clientReference)

Get a client given its reference Id

Get a client given its reference UUID 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    try {
      Client result = apiInstance.getClient(clientReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | |

### Return type

[**Client**](Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getClientPrevalidatedDomain"></a>
# **getClientPrevalidatedDomain**
> ClientDNS getClientPrevalidatedDomain(prevalidatedDomainReference)

Get prevalidated domains for the selected domain reference Id

Get pre validatied domain token for the selected identifier 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String prevalidatedDomainReference = "cld-123e4567-e89b-12d3-a456-426614174000"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.getClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getClientPrevalidatedDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | |

### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="getClientPrevalidatedDomains"></a>
# **getClientPrevalidatedDomains**
> List&lt;ClientDNS&gt; getClientPrevalidatedDomains(clientReference)

Get the list of prevalidated domains for the selected client given its reference Id

Retrieve the list of pre validated domains and their status for the selected client 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    try {
      List<ClientDNS> result = apiInstance.getClientPrevalidatedDomains(clientReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#getClientPrevalidatedDomains");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientReference** | **String**| Client reference UUID | |

### Return type

[**List&lt;ClientDNS&gt;**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="issueCertificate"></a>
# **issueCertificate**
> CertificateOrder issueCertificate(productReference, body)

Issue certificate using CSR

Issue a certificate based on the Product reference (CSR) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String productReference = "pma-123e4567-e89b-12d3-a456-426614174000"; // String | Certificate product reference UUID
    String body = ----BEGIN CERTIFICATE REQUEST-----
MIIBQDCByAIBADBFMQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEh
... [snipped] ...
6EYCyy3DWH2/ZTmKYjcaCE/iuOigqJOtgRyIeufDV9HKF4UP
-----END CERTIFICATE REQUEST-----
; // String | Certificate Request in Base64 with start/end beacon
    try {
      CertificateOrder result = apiInstance.issueCertificate(productReference, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#issueCertificate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productReference** | **String**| Certificate product reference UUID | |
| **body** | **String**| Certificate Request in Base64 with start/end beacon | |

### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="jwt"></a>
# **jwt**
> String jwt(userName, userSecret)

Produce a user JWT

Helper service to generate a JWT derived from you login username and API Key --- * Use the generated JWT in the header of __each__ HTTP request to the service  &#x60;Authorization: Bearer &lt;encoded JWT&gt;&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String userName = "userName_example"; // String | 
    String userSecret = "userSecret_example"; // String | 
    try {
      String result = apiInstance.jwt(userName, userSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#jwt");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userName** | **String**|  | |
| **userSecret** | **String**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="resetClientPrevalidatedDomain"></a>
# **resetClientPrevalidatedDomain**
> ClientDNS resetClientPrevalidatedDomain(prevalidatedDomainReference)

Reset prevalidated domain token for the selected reference Id

Reset pre validated domain token 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.resetClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#resetClientPrevalidatedDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | |

### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="revokeCertificates"></a>
# **revokeCertificates**
> revokeCertificates(revocationRequest)

Revoke certificates

Revoke one or more certificates 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    List<RevocationRequest> revocationRequest = Arrays.asList(); // List<RevocationRequest> | Certificate references to revoke
    try {
      apiInstance.revokeCertificates(revocationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#revokeCertificates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **revocationRequest** | [**List&lt;RevocationRequest&gt;**](RevocationRequest.md)| Certificate references to revoke | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully submitted revocation request |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="searchClients"></a>
# **searchClients**
> List&lt;Client&gt; searchClients(search)

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String search = "C?mpan* Ltd"; // String | 
    try {
      List<Client> result = apiInstance.searchClients(search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#searchClients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**|  | [optional] |

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="validateClientPrevalidatedDomain"></a>
# **validateClientPrevalidatedDomain**
> ClientDNS validateClientPrevalidatedDomain(prevalidatedDomainReference)

Prevalidate domain for the selected domain reference Id

Pre validate domain token for the selected identifier 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch/v2");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String prevalidatedDomainReference = "cld-123e4567-e89b-12d3-a456-426614174000"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.validateClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#validateClientPrevalidatedDomain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prevalidatedDomainReference** | **String**| Pre validated domain reference UUID | |

### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

