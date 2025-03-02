# swisssign_ra_api.v2.RAApi

All URIs are relative to *https://api.ra.pre.swisssign.ch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_certificate_order_additional_recipients**](RAApi.md#add_certificate_order_additional_recipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order
[**create_client_prevalidated_domains**](RAApi.md#create_client_prevalidated_domains) | **POST** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id
[**delete_certificate_order_additional_recipients**](RAApi.md#delete_certificate_order_additional_recipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order
[**delete_client_prevalidated_domain**](RAApi.md#delete_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id
[**delete_client_prevalidated_domain_token**](RAApi.md#delete_client_prevalidated_domain_token) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id
[**get_certificate_chain**](RAApi.md#get_certificate_chain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference
[**get_certificate_order**](RAApi.md#get_certificate_order) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference
[**get_certificate_order_status**](RAApi.md#get_certificate_order_status) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference
[**get_certificate_order_tasks**](RAApi.md#get_certificate_order_tasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference
[**get_certificate_orders**](RAApi.md#get_certificate_orders) | **POST** /v2/orders | Search Certificate Orders
[**get_client**](RAApi.md#get_client) | **POST** /v2/client/{clientReference} | Get a client given its reference Id
[**get_client_prevalidated_domain**](RAApi.md#get_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id
[**get_client_prevalidated_domains**](RAApi.md#get_client_prevalidated_domains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id
[**issue_certificate**](RAApi.md#issue_certificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR
[**issue_certificate_v22**](RAApi.md#issue_certificate_v22) | **POST** /v2/issue | Issue certificate using extended request attributes
[**jwt**](RAApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT
[**list_certificate_order_additional_recipients**](RAApi.md#list_certificate_order_additional_recipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients
[**publish_certificate**](RAApi.md#publish_certificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order
[**replace_certificate_order_tags**](RAApi.md#replace_certificate_order_tags) | **POST** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags
[**reset_client_prevalidated_domain**](RAApi.md#reset_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id
[**revoke_certificates**](RAApi.md#revoke_certificates) | **POST** /v2/revoke | Revoke certificates
[**search_clients**](RAApi.md#search_clients) | **POST** /v2/clients | Search Clients available to the RA Operator
[**search_paged_certificate_orders**](RAApi.md#search_paged_certificate_orders) | **POST** /v2/orders/paged | Search Certificate Orders
[**search_paged_clients**](RAApi.md#search_paged_clients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator
[**unpublish_certificate**](RAApi.md#unpublish_certificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order
[**validate_client_prevalidated_domain**](RAApi.md#validate_client_prevalidated_domain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id
[**validate_issue_request**](RAApi.md#validate_issue_request) | **POST** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate


# **add_certificate_order_additional_recipients**
> List[AdditionalRecipient] add_certificate_order_additional_recipients(order_reference, additional_recipient)

Add additional recipients to Certificate Order

Add additional recipients to Certificate Order.
Existing users are skipped.
Returns list of effectively added additional recipients.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.additional_recipient import AdditionalRecipient
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 
    additional_recipient = [swisssign_ra_api.v2.AdditionalRecipient()] # List[AdditionalRecipient] | Array of additional recipients

    try:
        # Add additional recipients to Certificate Order
        api_response = api_instance.add_certificate_order_additional_recipients(order_reference, additional_recipient)
        print("The response of RAApi->add_certificate_order_additional_recipients:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->add_certificate_order_additional_recipients: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 
 **additional_recipient** | [**List[AdditionalRecipient]**](AdditionalRecipient.md)| Array of additional recipients | 

### Return type

[**List[AdditionalRecipient]**](AdditionalRecipient.md)

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

# **create_client_prevalidated_domains**
> List[ClientDNS] create_client_prevalidated_domains(client_reference, request_body)

Register new pre validated domains for the selected client given its reference Id

Create and issue domains pre validation tokens for the selected client


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    client_reference = 'cli-123e4567-e89b-12d3-a456-426614174000' # str | Client reference UUID
    request_body = ['request_body_example'] # List[str] | Client domains

    try:
        # Register new pre validated domains for the selected client given its reference Id
        api_response = api_instance.create_client_prevalidated_domains(client_reference, request_body)
        print("The response of RAApi->create_client_prevalidated_domains:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->create_client_prevalidated_domains: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_reference** | **str**| Client reference UUID | 
 **request_body** | [**List[str]**](str.md)| Client domains | 

### Return type

[**List[ClientDNS]**](ClientDNS.md)

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

# **delete_certificate_order_additional_recipients**
> List[AdditionalRecipient] delete_certificate_order_additional_recipients(order_reference, additional_recipient)

Delete additional recipients to Certificate Order

Delete additional recipients to Certificate Order.
Unknown users are skipped.
Returns list of effectively deleted additional recipients.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.additional_recipient import AdditionalRecipient
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 
    additional_recipient = [swisssign_ra_api.v2.AdditionalRecipient()] # List[AdditionalRecipient] | Array of additional recipients to delete

    try:
        # Delete additional recipients to Certificate Order
        api_response = api_instance.delete_certificate_order_additional_recipients(order_reference, additional_recipient)
        print("The response of RAApi->delete_certificate_order_additional_recipients:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->delete_certificate_order_additional_recipients: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 
 **additional_recipient** | [**List[AdditionalRecipient]**](AdditionalRecipient.md)| Array of additional recipients to delete | 

### Return type

[**List[AdditionalRecipient]**](AdditionalRecipient.md)

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

Delete pre validated domain for the selected reference Id

Delete pre validated domain


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    prevalidated_domain_reference = 'cld-2263d498-6569-46d6-9359-f08a1d298d2d' # str | Pre validated domain reference UUID

    try:
        # Delete pre validated domain for the selected reference Id
        api_instance.delete_client_prevalidated_domain(prevalidated_domain_reference)
    except Exception as e:
        print("Exception when calling RAApi->delete_client_prevalidated_domain: %s\n" % e)
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

Delete pre validated domain token for the selected reference Id

Delete pre validated domain token


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    prevalidated_domain_reference = 'cld-2263d498-6569-46d6-9359-f08a1d298d2d' # str | Pre validated domain reference UUID

    try:
        # Delete pre validated domain token for the selected reference Id
        api_response = api_instance.delete_client_prevalidated_domain_token(prevalidated_domain_reference)
        print("The response of RAApi->delete_client_prevalidated_domain_token:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->delete_client_prevalidated_domain_token: %s\n" % e)
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
> List[str] get_certificate_chain(order_reference)

Retrieve the certificate chain for the given Order reference

Retrieve the certificate chain base64 encoded text. First element in list is leaf certificate, last element is Root certificate.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Retrieve the certificate chain for the given Order reference
        api_response = api_instance.get_certificate_chain(order_reference)
        print("The response of RAApi->get_certificate_chain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_certificate_chain: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 

### Return type

**List[str]**

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
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Retrieve a Certificate Order given the Order reference
        api_response = api_instance.get_certificate_order(order_reference)
        print("The response of RAApi->get_certificate_order:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_certificate_order: %s\n" % e)
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
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order_status import CertificateOrderStatus
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Retrieve a Certificate Order status given the Order reference
        api_response = api_instance.get_certificate_order_status(order_reference)
        print("The response of RAApi->get_certificate_order_status:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_certificate_order_status: %s\n" % e)
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
> List[CertificateOrderTask] get_certificate_order_tasks(order_reference)

Retrieve a Certificate Order Tasks given the Order reference

Retrieve a certificate order tasks given the order reference identifier.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order_task import CertificateOrderTask
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Retrieve a Certificate Order Tasks given the Order reference
        api_response = api_instance.get_certificate_order_tasks(order_reference)
        print("The response of RAApi->get_certificate_order_tasks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_certificate_order_tasks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 

### Return type

[**List[CertificateOrderTask]**](CertificateOrderTask.md)

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
> List[CertificateOrder] get_certificate_orders(search_certificate_order)

Search Certificate Orders

Search for Certificate Orders given search parameters.
The result list is limited to the maximum (default is 300) query result list settings.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder
from swisssign_ra_api.v2.models.search_certificate_order import SearchCertificateOrder
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    search_certificate_order = swisssign_ra_api.v2.SearchCertificateOrder() # SearchCertificateOrder | Certificate order search options

    try:
        # Search Certificate Orders
        api_response = api_instance.get_certificate_orders(search_certificate_order)
        print("The response of RAApi->get_certificate_orders:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_certificate_orders: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_certificate_order** | [**SearchCertificateOrder**](SearchCertificateOrder.md)| Certificate order search options | 

### Return type

[**List[CertificateOrder]**](CertificateOrder.md)

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
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client import Client
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    client_reference = 'cli-123e4567-e89b-12d3-a456-426614174000' # str | Client reference UUID

    try:
        # Get a client given its reference Id
        api_response = api_instance.get_client(client_reference)
        print("The response of RAApi->get_client:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_client: %s\n" % e)
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

Get pre validated domains for the selected domain reference Id

Get pre validated domain token for the selected identifier


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    prevalidated_domain_reference = 'cld-123e4567-e89b-12d3-a456-426614174000' # str | Pre validated domain reference UUID

    try:
        # Get pre validated domains for the selected domain reference Id
        api_response = api_instance.get_client_prevalidated_domain(prevalidated_domain_reference)
        print("The response of RAApi->get_client_prevalidated_domain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_client_prevalidated_domain: %s\n" % e)
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
> List[ClientDNS] get_client_prevalidated_domains(client_reference)

Get the list of pre validated domains for the selected client given its reference Id

Retrieve the list of pre validated domains and their status for the selected client


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    client_reference = 'cli-123e4567-e89b-12d3-a456-426614174000' # str | Client reference UUID

    try:
        # Get the list of pre validated domains for the selected client given its reference Id
        api_response = api_instance.get_client_prevalidated_domains(client_reference)
        print("The response of RAApi->get_client_prevalidated_domains:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->get_client_prevalidated_domains: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **client_reference** | **str**| Client reference UUID | 

### Return type

[**List[ClientDNS]**](ClientDNS.md)

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
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    product_reference = 'pma-123e4567-e89b-12d3-a456-426614174000' # str | Certificate product reference UUID
    body = 'body_example' # str | Certificate Request in Base64 with start/end beacon

    try:
        # Issue certificate using CSR
        api_response = api_instance.issue_certificate(product_reference, body)
        print("The response of RAApi->issue_certificate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->issue_certificate: %s\n" % e)
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

 - **Content-Type**: text/plain, application/json
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

# **issue_certificate_v22**
> CertificateOrder issue_certificate_v22(issue_request)

Issue certificate using extended request attributes

Issue a certificate based on the Product reference with extended attributes and CSR


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder
from swisssign_ra_api.v2.models.issue_request import IssueRequest
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    issue_request = swisssign_ra_api.v2.IssueRequest() # IssueRequest | Issue Request

    try:
        # Issue certificate using extended request attributes
        api_response = api_instance.issue_certificate_v22(issue_request)
        print("The response of RAApi->issue_certificate_v22:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->issue_certificate_v22: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**IssueRequest**](IssueRequest.md)| Issue Request | 

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **jwt**
> str jwt(user_name, user_secret)

Produce a user JWT

Helper service to generate a JWT derived from you login username and API Key
---
* Use the generated JWT in the header of __each__ HTTP request to the service

`Authorization: Bearer <encoded JWT>`


### Example


```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)


# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    user_name = 'user_name_example' # str | 
    user_secret = 'user_secret_example' # str | 

    try:
        # Produce a user JWT
        api_response = api_instance.jwt(user_name, user_secret)
        print("The response of RAApi->jwt:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->jwt: %s\n" % e)
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

# **list_certificate_order_additional_recipients**
> List[AdditionalRecipient] list_certificate_order_additional_recipients(order_reference)

Obtain a list of additional Certificate Order recipients

List additional Certificate Order recipients


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.additional_recipient import AdditionalRecipient
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Obtain a list of additional Certificate Order recipients
        api_response = api_instance.list_certificate_order_additional_recipients(order_reference)
        print("The response of RAApi->list_certificate_order_additional_recipients:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->list_certificate_order_additional_recipients: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 

### Return type

[**List[AdditionalRecipient]**](AdditionalRecipient.md)

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

# **publish_certificate**
> publish_certificate(order_reference)

Send a certificate publication request for selected Certificate Order

Publish or republish a certificate to the external source (LDAP, SFTP or file system).
Publication rule must be enabled on the issued certificate.
An error is raised if the certificate is already published.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Send a certificate publication request for selected Certificate Order
        api_instance.publish_certificate(order_reference)
    except Exception as e:
        print("Exception when calling RAApi->publish_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 

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

# **replace_certificate_order_tags**
> CertificateOrder replace_certificate_order_tags(order_reference, request_body)

Replace Certificate Order custom tags

Replace certificate order custom tags with a new set of user defined tags/labels


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_order import CertificateOrder
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 
    request_body = ['request_body_example'] # List[str] | List of user defined tags/labels

    try:
        # Replace Certificate Order custom tags
        api_response = api_instance.replace_certificate_order_tags(order_reference, request_body)
        print("The response of RAApi->replace_certificate_order_tags:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->replace_certificate_order_tags: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 
 **request_body** | [**List[str]**](str.md)| List of user defined tags/labels | 

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_client_prevalidated_domain**
> ClientDNS reset_client_prevalidated_domain(prevalidated_domain_reference)

Reset pre validated domain token for the selected reference Id

Reset pre validated domain token


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    prevalidated_domain_reference = 'cld-2263d498-6569-46d6-9359-f08a1d298d2d' # str | Pre validated domain reference UUID

    try:
        # Reset pre validated domain token for the selected reference Id
        api_response = api_instance.reset_client_prevalidated_domain(prevalidated_domain_reference)
        print("The response of RAApi->reset_client_prevalidated_domain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->reset_client_prevalidated_domain: %s\n" % e)
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
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.revocation_request import RevocationRequest
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    revocation_request = [swisssign_ra_api.v2.RevocationRequest()] # List[RevocationRequest] | Certificate references to revoke

    try:
        # Revoke certificates
        api_instance.revoke_certificates(revocation_request)
    except Exception as e:
        print("Exception when calling RAApi->revoke_certificates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revocation_request** | [**List[RevocationRequest]**](RevocationRequest.md)| Certificate references to revoke | 

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
> List[Client] search_clients(search=search)

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries.
The Client information includes the list of assigned certificate products.
The result list is limited to the maximum (default is 300) query result list settings


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client import Client
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    search = 'C?mpan* Ltd' # str | search query string with optional wildcard attributes ? and/or * (optional)

    try:
        # Search Clients available to the RA Operator
        api_response = api_instance.search_clients(search=search)
        print("The response of RAApi->search_clients:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->search_clients: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **str**| search query string with optional wildcard attributes ? and/or * | [optional] 

### Return type

[**List[Client]**](Client.md)

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

# **search_paged_certificate_orders**
> CertificateOrders search_paged_certificate_orders(search_certificate_order, length=length, start=start)

Search Certificate Orders

Search for Certificate Orders given search parameters.
The search supports paging


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.certificate_orders import CertificateOrders
from swisssign_ra_api.v2.models.search_certificate_order import SearchCertificateOrder
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    search_certificate_order = swisssign_ra_api.v2.SearchCertificateOrder() # SearchCertificateOrder | Certificate order search options
    length = 56 # int | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used.  (optional)
    start = 56 # int | the offset in search result for paging support (optional)

    try:
        # Search Certificate Orders
        api_response = api_instance.search_paged_certificate_orders(search_certificate_order, length=length, start=start)
        print("The response of RAApi->search_paged_certificate_orders:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->search_paged_certificate_orders: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search_certificate_order** | [**SearchCertificateOrder**](SearchCertificateOrder.md)| Certificate order search options | 
 **length** | **int**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] 
 **start** | **int**| the offset in search result for paging support | [optional] 

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_paged_clients**
> Clients search_paged_clients(search=search, length=length, start=start)

Search Clients available to the RA Operator

Search for clients for which the RA Operator can issue, revoke or pre validate DNS entries.
The Client information includes the list of assigned certificate products.
The search supports paging


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.clients import Clients
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    search = 'C?mpan* Ltd' # str | search query string with optional wildcard attributes ? and/or * (optional)
    length = 56 # int | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used.  (optional)
    start = 56 # int | the offset in search result for paging support (optional)

    try:
        # Search Clients available to the RA Operator
        api_response = api_instance.search_paged_clients(search=search, length=length, start=start)
        print("The response of RAApi->search_paged_clients:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->search_paged_clients: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **str**| search query string with optional wildcard attributes ? and/or * | [optional] 
 **length** | **int**| The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | [optional] 
 **start** | **int**| the offset in search result for paging support | [optional] 

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
**200** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unpublish_certificate**
> unpublish_certificate(order_reference)

Send a certificate un-publication request for selected Certificate Order

Remove the certificate from the external source (LDAP, SFTP or file system).
Publication rule must be enabled on the issued certificate.
An error is raised if the certificate is already un published.


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    order_reference = 'ord-f0725b50-c533-4802-a844-de57bfb7a80e' # str | 

    try:
        # Send a certificate un-publication request for selected Certificate Order
        api_instance.unpublish_certificate(order_reference)
    except Exception as e:
        print("Exception when calling RAApi->unpublish_certificate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_reference** | **str**|  | 

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

# **validate_client_prevalidated_domain**
> ClientDNS validate_client_prevalidated_domain(prevalidated_domain_reference)

Prevalidate domain for the selected domain reference Id

Pre validate domain token for the selected identifier


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.client_dns import ClientDNS
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    prevalidated_domain_reference = 'cld-123e4567-e89b-12d3-a456-426614174000' # str | Pre validated domain reference UUID

    try:
        # Prevalidate domain for the selected domain reference Id
        api_response = api_instance.validate_client_prevalidated_domain(prevalidated_domain_reference)
        print("The response of RAApi->validate_client_prevalidated_domain:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling RAApi->validate_client_prevalidated_domain: %s\n" % e)
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

# **validate_issue_request**
> validate_issue_request(issue_request)

Validate an issue request structure. Validates the request but does not issue any certificate

Validates the request but does not issue any certificate


### Example

* Bearer (JWT) Authentication (BearerAuth):

```python
import swisssign_ra_api.v2
from swisssign_ra_api.v2.models.issue_request import IssueRequest
from swisssign_ra_api.v2.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.ra.pre.swisssign.ch
# See configuration.py for a list of all supported configuration parameters.
configuration = swisssign_ra_api.v2.Configuration(
    host = "https://api.ra.pre.swisssign.ch"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (JWT): BearerAuth
configuration = swisssign_ra_api.v2.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with swisssign_ra_api.v2.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = swisssign_ra_api.v2.RAApi(api_client)
    issue_request = swisssign_ra_api.v2.IssueRequest() # IssueRequest | Validate Issue Request

    try:
        # Validate an issue request structure. Validates the request but does not issue any certificate
        api_instance.validate_issue_request(issue_request)
    except Exception as e:
        print("Exception when calling RAApi->validate_issue_request: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**IssueRequest**](IssueRequest.md)| Validate Issue Request | 

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
**204** | success |  -  |
**400** | bad request |  -  |
**401** | Unauthorized |  -  |
**404** | not found |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

