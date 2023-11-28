# ApiRegistrationApi

All URIs are relative to *https://api.ra.pre.swisssign.ch*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#addCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order |
| [**createClientPrevalidatedDomains**](ApiRegistrationApi.md#createClientPrevalidatedDomains) | **POST** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id |
| [**deleteCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#deleteCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order |
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
| [**issueCertificateV22**](ApiRegistrationApi.md#issueCertificateV22) | **POST** /v2/issue | Issue certificate using extended request attributes |
| [**jwt**](ApiRegistrationApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
| [**listCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#listCertificateOrderAdditionalRecipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients |
| [**publishCertificate**](ApiRegistrationApi.md#publishCertificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order |
| [**resetClientPrevalidatedDomain**](ApiRegistrationApi.md#resetClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id |
| [**revokeCertificates**](ApiRegistrationApi.md#revokeCertificates) | **POST** /v2/revoke | Revoke certificates |
| [**searchClients**](ApiRegistrationApi.md#searchClients) | **POST** /v2/clients | Search Clients available to the RA Operator |
| [**searchPagedCertificateOrders**](ApiRegistrationApi.md#searchPagedCertificateOrders) | **POST** /v2/orders/paged | Search Certificate Orders |
| [**searchPagedClients**](ApiRegistrationApi.md#searchPagedClients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator |
| [**unpublishCertificate**](ApiRegistrationApi.md#unpublishCertificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order |
| [**validateClientPrevalidatedDomain**](ApiRegistrationApi.md#validateClientPrevalidatedDomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |


<a name="addCertificateOrderAdditionalRecipients"></a>
# **addCertificateOrderAdditionalRecipients**
> List&lt;AdditionalRecipient&gt; addCertificateOrderAdditionalRecipients(orderReference, additionalRecipient)

Add additional recipients to Certificate Order

Add additional recipients to Certificate Order. Existing users are skipped. Retuns list of effectively added additional recipients. 

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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    List<AdditionalRecipient> additionalRecipient = Arrays.asList(); // List<AdditionalRecipient> | Array of additional recipients
    try {
      List<AdditionalRecipient> result = apiInstance.addCertificateOrderAdditionalRecipients(orderReference, additionalRecipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#addCertificateOrderAdditionalRecipients");
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

<a name="deleteCertificateOrderAdditionalRecipients"></a>
# **deleteCertificateOrderAdditionalRecipients**
> List&lt;AdditionalRecipient&gt; deleteCertificateOrderAdditionalRecipients(orderReference, additionalRecipient)

Delete additional recipients to Certificate Order

Delete additional recipients to Certificate Order. Unknown users are skipped. Retuns list of effectively deleted additional recipients. 

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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    List<AdditionalRecipient> additionalRecipient = Arrays.asList(); // List<AdditionalRecipient> | Array of additional recipients to delete
    try {
      List<AdditionalRecipient> result = apiInstance.deleteCertificateOrderAdditionalRecipients(orderReference, additionalRecipient);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#deleteCertificateOrderAdditionalRecipients");
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

Search for Certificate Orders given search parameters. The result list is limited to the maximum (default is 300) query result list settings. 

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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

<a name="issueCertificateV22"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    IssueRequest issueRequest = new IssueRequest(); // IssueRequest | Issue Request
    try {
      CertificateOrder result = apiInstance.issueCertificateV22(issueRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#issueCertificateV22");
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");

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
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="listCertificateOrderAdditionalRecipients"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      List<AdditionalRecipient> result = apiInstance.listCertificateOrderAdditionalRecipients(orderReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#listCertificateOrderAdditionalRecipients");
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

<a name="publishCertificate"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      apiInstance.publishCertificate(orderReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#publishCertificate");
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. The result list is limited to the maximum (default is 300) query result list settings 

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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

<a name="searchPagedCertificateOrders"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    SearchCertificateOrder searchCertificateOrder = new SearchCertificateOrder(); // SearchCertificateOrder | Certificate order search options
    Integer length = 56; // Integer | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used. 
    Integer start = 56; // Integer | the offset in search result for paging support
    try {
      CertificateOrders result = apiInstance.searchPagedCertificateOrders(searchCertificateOrder, length, start);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#searchPagedCertificateOrders");
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

<a name="searchPagedClients"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String search = "C?mpan* Ltd"; // String | 
    Integer length = 56; // Integer | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used. 
    Integer start = 56; // Integer | the offset in search result for paging support
    try {
      Clients result = apiInstance.searchPagedClients(search, length, start);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#searchPagedClients");
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
| **403** | Forbidden |  -  |
| **404** | not found |  -  |
| **500** | Internal server error |  -  |

<a name="unpublishCertificate"></a>
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
import org.openapitools.client.api.ApiRegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    ApiRegistrationApi apiInstance = new ApiRegistrationApi(defaultClient);
    String orderReference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e"; // String | 
    try {
      apiInstance.unpublishCertificate(orderReference);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiRegistrationApi#unpublishCertificate");
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
    defaultClient.setBasePath("https://api.ra.pre.swisssign.ch");
    
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

