# swisssign_ra_api.v2.ApiRegistrationApi

All URIs are relative to *https://api.ra.pre.swisssign.ch/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_client_prevalidated_domains**](ApiRegistrationApi.md#create_client_prevalidated_domains) | **POST** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id
[**delete_client_prevalidated_domain**](ApiRegistrationApi.md#delete_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete prevalidated domain for the selected reference Id
[**delete_client_prevalidated_domain_token**](ApiRegistrationApi.md#delete_client_prevalidated_domain_token) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete prevalidated domain token for the selected reference Id
[**get_certificate_chain**](ApiRegistrationApi.md#get_certificate_chain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference
[**get_certificate_order**](ApiRegistrationApi.md#get_certificate_order) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference
[**get_certificate_order_status**](ApiRegistrationApi.md#get_certificate_order_status) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference
[**get_certificate_order_tasks**](ApiRegistrationApi.md#get_certificate_order_tasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference
[**get_certificate_orders**](ApiRegistrationApi.md#get_certificate_orders) | **POST** /v2/orders | Search Certificate Orders
[**get_client**](ApiRegistrationApi.md#get_client) | **POST** /v2/client/{clientReference} | Get a client given its reference Id
[**get_client_prevalidated_domain**](ApiRegistrationApi.md#get_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get prevalidated domains for the selected domain reference Id
[**get_client_prevalidated_domains**](ApiRegistrationApi.md#get_client_prevalidated_domains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of prevalidated domains for the selected client given its reference Id
[**issue_certificate**](ApiRegistrationApi.md#issue_certificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR
[**jwt**](ApiRegistrationApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT
[**reset_client_prevalidated_domain**](ApiRegistrationApi.md#reset_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id
[**revoke_certificates**](ApiRegistrationApi.md#revoke_certificates) | **POST** /v2/revoke | Revoke certificates
[**search_clients**](ApiRegistrationApi.md#search_clients) | **POST** /v2/clients | Search Clients available to the RA Operator
[**validate_client_prevalidated_domain**](ApiRegistrationApi.md#validate_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id


# **create_client_prevalidated_domains**
> [ClientDNS] create_client_prevalidated_domains(client_reference, request_body)

Register new prevalidated domains for the selected client given its reference Id

Create and issue domains pre validation tokens for the selected client 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    client_reference = "cli-123e4567-e89b-12d3-a456-426614174000" # str | Client reference UUID
    request_body = [
        "déjà.vu.com",
    ] # [str] | Client domains

    # example passing only required values which don't have defaults set
    try:
        # Register new prevalidated domains for the selected client given its reference Id
        api_response = api_instance.create_client_prevalidated_domains(client_reference, request_body)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->create_client_prevalidated_domains: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_reference** | **str**| Client reference UUID |
 **request_body** | **[str]**| Client domains |

### Return type

[**[ClientDNS]**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_prevalidated_domain**
> delete_client_prevalidated_domain(prevalidated_domain_reference)

Delete prevalidated domain for the selected reference Id

Delete pre validated domain 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    prevalidated_domain_reference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d" # str | Pre validated domain reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Delete prevalidated domain for the selected reference Id
        api_instance.delete_client_prevalidated_domain(prevalidated_domain_reference)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->delete_client_prevalidated_domain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prevalidated_domain_reference** | **str**| Pre validated domain reference UUID |

### Return type

void (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_client_prevalidated_domain_token**
> ClientDNS delete_client_prevalidated_domain_token(prevalidated_domain_reference)

Delete prevalidated domain token for the selected reference Id

Delete pre validated domain token 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    prevalidated_domain_reference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d" # str | Pre validated domain reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Delete prevalidated domain token for the selected reference Id
        api_response = api_instance.delete_client_prevalidated_domain_token(prevalidated_domain_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->delete_client_prevalidated_domain_token: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prevalidated_domain_reference** | **str**| Pre validated domain reference UUID |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_certificate_chain**
> [str] get_certificate_chain(order_reference)

Retrieve the certificate chain for the given Order reference

Retrieve the certificate chain base64 encoded text. First element in list is leaf certificate, last element is Root certificate. 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    order_reference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Retrieve the certificate chain for the given Order reference
        api_response = api_instance.get_certificate_chain(order_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_certificate_chain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  |

### Return type

**[str]**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_certificate_order**
> CertificateOrder get_certificate_order(order_reference)

Retrieve a Certificate Order given the Order reference

Retrieve a certificate order given the order reference identifier. 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.certificate_order import CertificateOrder
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    order_reference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Retrieve a Certificate Order given the Order reference
        api_response = api_instance.get_certificate_order(order_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_certificate_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_certificate_order_status**
> CertificateOrderStatus get_certificate_order_status(order_reference)

Retrieve a Certificate Order status given the Order reference

Retrieve a certificate order status given the order reference identifier. 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.certificate_order_status import CertificateOrderStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    order_reference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Retrieve a Certificate Order status given the Order reference
        api_response = api_instance.get_certificate_order_status(order_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_certificate_order_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_certificate_order_tasks**
> [CertificateOrderTask] get_certificate_order_tasks(order_reference)

Retrieve a Certificate Order Tasks given the Order reference

Retrieve a certificate order tasks given the order reference identifier. 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.certificate_order_task import CertificateOrderTask
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    order_reference = "ord-f0725b50-c533-4802-a844-de57bfb7a80e" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Retrieve a Certificate Order Tasks given the Order reference
        api_response = api_instance.get_certificate_order_tasks(order_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_certificate_order_tasks: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  |

### Return type

[**[CertificateOrderTask]**](CertificateOrderTask.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_certificate_orders**
> [CertificateOrder] get_certificate_orders(search_certificate_order)

Search Certificate Orders

Search for Certificate Orders given search parameters 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.certificate_order import CertificateOrder
from swisssign_ra_api.v2.model.search_certificate_order import SearchCertificateOrder
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    search_certificate_order = SearchCertificateOrder(
        order_reference="ord-f0725b50-c533-4802-a844-de57bfb7a80e",
        serial_number="3893409CB*66E1F09?",
        order_status=[
            CertificateOrderStatus("issued"),
        ],
        revocation_reason=[
            RevocationReason("unused"),
        ],
        client_references=["cli-123e4567-e89b-12d3-a456-426614174000"],
        start_after=dateutil_parser('1970-01-01').date(),
        start_before=dateutil_parser('1970-01-01').date(),
        attribute="s?me@emai* or 2.5.4.r or streetAddress",
    ) # SearchCertificateOrder | Certificate order search options

    # example passing only required values which don't have defaults set
    try:
        # Search Certificate Orders
        api_response = api_instance.get_certificate_orders(search_certificate_order)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_certificate_orders: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_certificate_order** | [**SearchCertificateOrder**](SearchCertificateOrder.md)| Certificate order search options |

### Return type

[**[CertificateOrder]**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client**
> Client get_client(client_reference)

Get a client given its reference Id

Get a client given its reference UUID 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.client import Client
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    client_reference = "cli-123e4567-e89b-12d3-a456-426614174000" # str | Client reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Get a client given its reference Id
        api_response = api_instance.get_client(client_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_client: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_reference** | **str**| Client reference UUID |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_prevalidated_domain**
> ClientDNS get_client_prevalidated_domain(prevalidated_domain_reference)

Get prevalidated domains for the selected domain reference Id

Get pre validatied domain token for the selected identifier 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    prevalidated_domain_reference = "cld-123e4567-e89b-12d3-a456-426614174000" # str | Pre validated domain reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Get prevalidated domains for the selected domain reference Id
        api_response = api_instance.get_client_prevalidated_domain(prevalidated_domain_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_client_prevalidated_domain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prevalidated_domain_reference** | **str**| Pre validated domain reference UUID |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_client_prevalidated_domains**
> [ClientDNS] get_client_prevalidated_domains(client_reference)

Get the list of prevalidated domains for the selected client given its reference Id

Retrieve the list of pre validated domains and their status for the selected client 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    client_reference = "cli-123e4567-e89b-12d3-a456-426614174000" # str | Client reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Get the list of prevalidated domains for the selected client given its reference Id
        api_response = api_instance.get_client_prevalidated_domains(client_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->get_client_prevalidated_domains: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_reference** | **str**| Client reference UUID |

### Return type

[**[ClientDNS]**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **issue_certificate**
> CertificateOrder issue_certificate(product_reference, body)

Issue certificate using CSR

Issue a certificate based on the Product reference (CSR) 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.certificate_order import CertificateOrder
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    product_reference = "pma-123e4567-e89b-12d3-a456-426614174000" # str | Certificate product reference UUID
    body = '''----BEGIN CERTIFICATE REQUEST-----
MIIBQDCByAIBADBFMQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEh
... [snipped] ...
6EYCyy3DWH2/ZTmKYjcaCE/iuOigqJOtgRyIeufDV9HKF4UP
-----END CERTIFICATE REQUEST-----
''' # str | Certificate Request in Base64 with start/end beacon

    # example passing only required values which don't have defaults set
    try:
        # Issue certificate using CSR
        api_response = api_instance.issue_certificate(product_reference, body)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->issue_certificate: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_reference** | **str**| Certificate product reference UUID |
 **body** | **str**| Certificate Request in Base64 with start/end beacon |

### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jwt**
> str jwt(user_name, user_secret)

Produce a user JWT

Helper service to generate a JWT derived from you login username and API Key --- * Use the generated JWT in the header of __each__ HTTP request to the service  `Authorization: Bearer <encoded JWT>` 

### Example


```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)


# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    user_name = "userName_example" # str | 
    user_secret = "user_secret_example" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Produce a user JWT
        api_response = api_instance.jwt(user_name, user_secret)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->jwt: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_name** | **str**|  |
 **user_secret** | **str**|  |

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_client_prevalidated_domain**
> ClientDNS reset_client_prevalidated_domain(prevalidated_domain_reference)

Reset prevalidated domain token for the selected reference Id

Reset pre validated domain token 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    prevalidated_domain_reference = "cld-2263d498-6569-46d6-9359-f08a1d298d2d" # str | Pre validated domain reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Reset prevalidated domain token for the selected reference Id
        api_response = api_instance.reset_client_prevalidated_domain(prevalidated_domain_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->reset_client_prevalidated_domain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prevalidated_domain_reference** | **str**| Pre validated domain reference UUID |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **revoke_certificates**
> revoke_certificates(revocation_request)

Revoke certificates

Revoke one or more certificates 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.revocation_request import RevocationRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    revocation_request = [
        RevocationRequest(
            serial_number="3893409CB666E1F092B7B6F28E1EAF4582AA7F21",
            revocation_reason="unused",
            issuer_name="DC=COM,DC=Some Domain,OU=Some Organizational Unit,CN=Some SubCA",
        ),
    ] # [RevocationRequest] | Certificate references to revoke

    # example passing only required values which don't have defaults set
    try:
        # Revoke certificates
        api_instance.revoke_certificates(revocation_request)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->revoke_certificates: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revocation_request** | [**[RevocationRequest]**](RevocationRequest.md)| Certificate references to revoke |

### Return type

void (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | successfully submitted revocation request |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_clients**
> [Client] search_clients()

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries. The Client information includes the list of assigned certificate products. 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.client import Client
from swisssign_ra_api.v2.model.api_error import APIError
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    search = "C?mpan* Ltd" # str |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Search Clients available to the RA Operator
        api_response = api_instance.search_clients(search=search)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->search_clients: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **str**|  | [optional]

### Return type

[**[Client]**](Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate_client_prevalidated_domain**
> ClientDNS validate_client_prevalidated_domain(prevalidated_domain_reference)

Prevalidate domain for the selected domain reference Id

Pre validate domain token for the selected identifier 

### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import time
import swisssign_ra_api.v2
from swisssign_ra_api.v2.api import api_registration_api
from swisssign_ra_api.v2.model.api_error import APIError
from swisssign_ra_api.v2.model.client_dns import ClientDNS
from pprint import pprint
# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch/v2
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch/v2"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = api_registration_api.ApiRegistrationApi(api_client)
    prevalidated_domain_reference = "cld-123e4567-e89b-12d3-a456-426614174000" # str | Pre validated domain reference UUID

    # example passing only required values which don't have defaults set
    try:
        # Prevalidate domain for the selected domain reference Id
        api_response = api_instance.validate_client_prevalidated_domain(prevalidated_domain_reference)
        pprint(api_response)
    except swisssign_ra_api.v2.ApiException as e:
        print("Exception when calling ApiRegistrationApi->validate_client_prevalidated_domain: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prevalidated_domain_reference** | **str**| Pre validated domain reference UUID |

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

