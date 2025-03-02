# RaApi

All URIs are relative to *https://api.ra.pre.swisssign.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCertificateOrderAdditionalRecipients**](RaApi.md#addCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order |
| [**createClientPrevalidatedDomains**](RaApi.md#createClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id |
| [**deleteCertificateOrderAdditionalRecipients**](RaApi.md#deleteCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order |
| [**deleteClientPrevalidatedDomain**](RaApi.md#deleteClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id |
| [**deleteClientPrevalidatedDomainToken**](RaApi.md#deleteClientPrevalidatedDomainToken) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id |
| [**getCertificateChain**](RaApi.md#getCertificateChain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference |
| [**getCertificateOrder**](RaApi.md#getCertificateOrder) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference |
| [**getCertificateOrderStatus**](RaApi.md#getCertificateOrderStatus) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference |
| [**getCertificateOrderTasks**](RaApi.md#getCertificateOrderTasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference |
| [**getCertificateOrders**](RaApi.md#getCertificateOrders) | **POST** /v2/orders | Search Certificate Orders |
| [**getClient**](RaApi.md#getClient) | **POST** /v2/client/{clientReference} | Get a client given its reference Id |
| [**getClientPrevalidatedDomain**](RaApi.md#getClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id |
| [**getClientPrevalidatedDomains**](RaApi.md#getClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id |
| [**issueCertificate**](RaApi.md#issueCertificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR |
| [**issueCertificateV22**](RaApi.md#issueCertificateV22) | **POST** /v2/issue | Issue certificate using extended request attributes |
| [**jwt**](RaApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
| [**listCertificateOrderAdditionalRecipients**](RaApi.md#listCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients |
| [**publishCertificate**](RaApi.md#publishCertificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order |
| [**replaceCertificateOrderTags**](RaApi.md#replaceCertificateOrderTags) | **POST** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags |
| [**resetClientPrevalidatedDomain**](RaApi.md#resetClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id |
| [**revokeCertificates**](RaApi.md#revokeCertificates) | **POST** /v2/revoke | Revoke certificates |
| [**searchClients**](RaApi.md#searchClients) | **POST** /v2/clients | Search Clients available to the RA Operator |
| [**searchPagedCertificateOrders**](RaApi.md#searchPagedCertificateOrders) | **POST** /v2/orders/paged | Search Certificate Orders |
| [**searchPagedClients**](RaApi.md#searchPagedClients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator |
| [**unpublishCertificate**](RaApi.md#unpublishCertificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order |
| [**validateClientPrevalidatedDomain**](RaApi.md#validateClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |
| [**validateIssueRequest**](RaApi.md#validateIssueRequest) | **POST** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate |


<a id="addCertificateOrderAdditionalRecipients"></a>
# **addCertificateOrderAdditionalRecipients**
> List&lt;AdditionalRecipient&gt; addCertificateOrderAdditionalRecipients(orderReference, additionalRecipient)

Add additional recipients to Certificate Order

Add additional recipients to Certificate Order. Existing users are skipped. Returns list of effectively added additional recipients. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    List<AdditionalRecipient> additionalRecipient = Arrays.asList(); // List<AdditionalRecipient> | Array of additional recipients
    try {
      List<AdditionalRecipient> result = apiInstance.addCertificateOrderAdditionalRecipients(orderReference, additionalRecipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#addCertificateOrderAdditionalRecipients");
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
| **additionalRecipient** | [**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md)| Array of additional recipients | |

### Return type

[**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md)

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

<a id="createClientPrevalidatedDomains"></a>
# **createClientPrevalidatedDomains**
> List&lt;ClientDNS&gt; createClientPrevalidatedDomains(clientReference, requestBody)

Register new pre validated domains for the selected client given its reference Id

Create and issue domains pre validation tokens for the selected client 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    List<String> requestBody = Arrays.asList(); // List<String> | Client domains
    try {
      List<ClientDNS> result = apiInstance.createClientPrevalidatedDomains(clientReference, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#createClientPrevalidatedDomains");
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

<a id="deleteCertificateOrderAdditionalRecipients"></a>
# **deleteCertificateOrderAdditionalRecipients**
> List&lt;AdditionalRecipient&gt; deleteCertificateOrderAdditionalRecipients(orderReference, additionalRecipient)

Delete additional recipients to Certificate Order

Delete additional recipients to Certificate Order. Unknown users are skipped. Returns list of effectively deleted additional recipients. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    List<AdditionalRecipient> additionalRecipient = Arrays.asList(); // List<AdditionalRecipient> | Array of additional recipients to delete
    try {
      List<AdditionalRecipient> result = apiInstance.deleteCertificateOrderAdditionalRecipients(orderReference, additionalRecipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#deleteCertificateOrderAdditionalRecipients");
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
| **additionalRecipient** | [**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md)| Array of additional recipients to delete | |

### Return type

[**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md)

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

<a id="deleteClientPrevalidatedDomain"></a>
# **deleteClientPrevalidatedDomain**
> deleteClientPrevalidatedDomain(prevalidatedDomainReference)

Delete pre validated domain for the selected reference Id

Delete pre validated domain 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      apiInstance.deleteClientPrevalidatedDomain(prevalidatedDomainReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#deleteClientPrevalidatedDomain");
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

<a id="deleteClientPrevalidatedDomainToken"></a>
# **deleteClientPrevalidatedDomainToken**
> ClientDNS deleteClientPrevalidatedDomainToken(prevalidatedDomainReference)

Delete pre validated domain token for the selected reference Id

Delete pre validated domain token 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.deleteClientPrevalidatedDomainToken(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#deleteClientPrevalidatedDomainToken");
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

<a id="getCertificateChain"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<String> result = apiInstance.getCertificateChain(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getCertificateChain");
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

<a id="getCertificateOrder"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      CertificateOrder result = apiInstance.getCertificateOrder(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getCertificateOrder");
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

<a id="getCertificateOrderStatus"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      CertificateOrderStatus result = apiInstance.getCertificateOrderStatus(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getCertificateOrderStatus");
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

<a id="getCertificateOrderTasks"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<CertificateOrderTask> result = apiInstance.getCertificateOrderTasks(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getCertificateOrderTasks");
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

<a id="getCertificateOrders"></a>
# **getCertificateOrders**
> List&lt;CertificateOrder&gt; getCertificateOrders(searchCertificateOrder)

Search Certificate Orders

Search for Certificate Orders given search parameters. The result list is limited to the maximum (default is 300) query result list settings. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    SearchCertificateOrder searchCertificateOrder = new SearchCertificateOrder(); // SearchCertificateOrder | Certificate order search options
    try {
      List<CertificateOrder> result = apiInstance.getCertificateOrders(searchCertificateOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getCertificateOrders");
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

<a id="getClient"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    try {
      Client result = apiInstance.getClient(clientReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getClient");
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

<a id="getClientPrevalidatedDomain"></a>
# **getClientPrevalidatedDomain**
> ClientDNS getClientPrevalidatedDomain(prevalidatedDomainReference)

Get pre validated domains for the selected domain reference Id

Get pre validated domain token for the selected identifier 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String prevalidatedDomainReference = "cld-123e4567-e89b-12d3-a456-426614174000"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.getClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getClientPrevalidatedDomain");
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

<a id="getClientPrevalidatedDomains"></a>
# **getClientPrevalidatedDomains**
> List&lt;ClientDNS&gt; getClientPrevalidatedDomains(clientReference)

Get the list of pre validated domains for the selected client given its reference Id

Retrieve the list of pre validated domains and their status for the selected client 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String clientReference = "cli-123e4567-e89b-12d3-a456-426614174000"; // String | Client reference UUID
    try {
      List<ClientDNS> result = apiInstance.getClientPrevalidatedDomains(clientReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#getClientPrevalidatedDomains");
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

<a id="issueCertificate"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String productReference = "pma-123e4567-e89b-12d3-a456-426614174000"; // String | Certificate product reference UUID
    String body = "body_example"; // String | Certificate Request in Base64 with start/end beacon
    try {
      CertificateOrder result = apiInstance.issueCertificate(productReference, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#issueCertificate");
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

 - **Content-Type**: text/plain, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a id="issueCertificateV22"></a>
# **issueCertificateV22**
> CertificateOrder issueCertificateV22(issueRequest)

Issue certificate using extended request attributes

Issue a certificate based on the Product reference with extended attributes and CSR 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    IssueRequest issueRequest = new IssueRequest(); // IssueRequest | Issue Request
    try {
      CertificateOrder result = apiInstance.issueCertificateV22(issueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#issueCertificateV22");
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
| **issueRequest** | [**IssueRequest**](IssueRequest.md)| Issue Request | |

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

<a id="jwt"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");

    RaApi apiInstance = new RaApi(defaultClient);
    String userName = "userName_example"; // String | 
    String userSecret = "userSecret_example"; // String | 
    try {
      String result = apiInstance.jwt(userName, userSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#jwt");
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
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a id="listCertificateOrderAdditionalRecipients"></a>
# **listCertificateOrderAdditionalRecipients**
> List&lt;AdditionalRecipient&gt; listCertificateOrderAdditionalRecipients(orderReference)

Obtain a list of additional Certificate Order recipients

List additional Certificate Order recipients 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<AdditionalRecipient> result = apiInstance.listCertificateOrderAdditionalRecipients(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#listCertificateOrderAdditionalRecipients");
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

[**List&lt;AdditionalRecipient&gt;**](AdditionalRecipient.md)

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

<a id="publishCertificate"></a>
# **publishCertificate**
> publishCertificate(orderReference)

Send a certificate publication request for selected Certificate Order

Publish or republish a certificate to the external source (LDAP, SFTP or file system). Publication rule must be enabled on the issued certificate. An error is raised if the certificate is already published. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      apiInstance.publishCertificate(orderReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#publishCertificate");
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

<a id="replaceCertificateOrderTags"></a>
# **replaceCertificateOrderTags**
> CertificateOrder replaceCertificateOrderTags(orderReference, requestBody)

Replace Certificate Order custom tags

Replace certificate order custom tags with a new set of user defined tags/labels 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | List of user defined tags/labels
    try {
      CertificateOrder result = apiInstance.replaceCertificateOrderTags(orderReference, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#replaceCertificateOrderTags");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of user defined tags/labels | |

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

<a id="resetClientPrevalidatedDomain"></a>
# **resetClientPrevalidatedDomain**
> ClientDNS resetClientPrevalidatedDomain(prevalidatedDomainReference)

Reset pre validated domain token for the selected reference Id

Reset pre validated domain token 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String prevalidatedDomainReference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.resetClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#resetClientPrevalidatedDomain");
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

<a id="revokeCertificates"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    List<RevocationRequest> revocationRequest = Arrays.asList(); // List<RevocationRequest> | Certificate references to revoke
    try {
      apiInstance.revokeCertificates(revocationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#revokeCertificates");
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

<a id="searchClients"></a>
# **searchClients**
> List&lt;Client&gt; searchClients(search)

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. The result list is limited to the maximum (default is 300) query result list settings 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String search = "C?mpan* Ltd"; // String | search query string with optional wildcard attributes ? and/or *
    try {
      List<Client> result = apiInstance.searchClients(search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#searchClients");
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
| **search** | **String**| search query string with optional wildcard attributes ? and/or * | [optional] |

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

<a id="searchPagedCertificateOrders"></a>
# **searchPagedCertificateOrders**
> CertificateOrders searchPagedCertificateOrders(searchCertificateOrder, length, start)

Search Certificate Orders

Search for Certificate Orders given search parameters. The search supports paging 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    SearchCertificateOrder searchCertificateOrder = new SearchCertificateOrder(); // SearchCertificateOrder | Certificate order search options
    Integer length = 56; // Integer | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used. 
    Integer start = 56; // Integer | the offset in search result for paging support
    try {
      CertificateOrders result = apiInstance.searchPagedCertificateOrders(searchCertificateOrder, length, start);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#searchPagedCertificateOrders");
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
| **length** | **Integer**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] |
| **start** | **Integer**| the offset in search result for paging support | [optional] |

### Return type

[**CertificateOrders**](CertificateOrders.md)

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

<a id="searchPagedClients"></a>
# **searchPagedClients**
> Clients searchPagedClients(search, length, start)

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. The search supports paging 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String search = "C?mpan* Ltd"; // String | search query string with optional wildcard attributes ? and/or *
    Integer length = 56; // Integer | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used. 
    Integer start = 56; // Integer | the offset in search result for paging support
    try {
      Clients result = apiInstance.searchPagedClients(search, length, start);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#searchPagedClients");
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
| **search** | **String**| search query string with optional wildcard attributes ? and/or * | [optional] |
| **length** | **Integer**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] |
| **start** | **Integer**| the offset in search result for paging support | [optional] |

### Return type

[**Clients**](Clients.md)

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

<a id="unpublishCertificate"></a>
# **unpublishCertificate**
> unpublishCertificate(orderReference)

Send a certificate un-publication request for selected Certificate Order

Remove the certificate from the external source (LDAP, SFTP or file system). Publication rule must be enabled on the issued certificate. An error is raised if the certificate is already un published. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      apiInstance.unpublishCertificate(orderReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#unpublishCertificate");
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

<a id="validateClientPrevalidatedDomain"></a>
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
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    String prevalidatedDomainReference = "cld-123e4567-e89b-12d3-a456-426614174000"; // String | Pre validated domain reference UUID
    try {
      ClientDNS result = apiInstance.validateClientPrevalidatedDomain(prevalidatedDomainReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#validateClientPrevalidatedDomain");
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

<a id="validateIssueRequest"></a>
# **validateIssueRequest**
> validateIssueRequest(issueRequest)

Validate an issue request structure. Validates the request but does not issue any certificate

Validates the request but does not issue any certificate 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    RaApi apiInstance = new RaApi(defaultClient);
    IssueRequest issueRequest = new IssueRequest(); // IssueRequest | Validate Issue Request
    try {
      apiInstance.validateIssueRequest(issueRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RaApi#validateIssueRequest");
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
| **issueRequest** | [**IssueRequest**](IssueRequest.md)| Validate Issue Request | |

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
| **204** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

