# \ApiRegistrationApi

All URIs are relative to *https://api.ra.pre.swisssign.ch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#AddCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order
[**CreateClientPrevalidatedDomains**](ApiRegistrationApi.md#CreateClientPrevalidatedDomains) | **Post** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id
[**DeleteCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#DeleteCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order
[**DeleteClientPrevalidatedDomain**](ApiRegistrationApi.md#DeleteClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete prevalidated domain for the selected reference Id
[**DeleteClientPrevalidatedDomainToken**](ApiRegistrationApi.md#DeleteClientPrevalidatedDomainToken) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete prevalidated domain token for the selected reference Id
[**GetCertificateChain**](ApiRegistrationApi.md#GetCertificateChain) | **Post** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference
[**GetCertificateOrder**](ApiRegistrationApi.md#GetCertificateOrder) | **Post** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference
[**GetCertificateOrderStatus**](ApiRegistrationApi.md#GetCertificateOrderStatus) | **Post** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference
[**GetCertificateOrderTasks**](ApiRegistrationApi.md#GetCertificateOrderTasks) | **Post** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference
[**GetCertificateOrders**](ApiRegistrationApi.md#GetCertificateOrders) | **Post** /v2/orders | Search Certificate Orders
[**GetClient**](ApiRegistrationApi.md#GetClient) | **Post** /v2/client/{clientReference} | Get a client given its reference Id
[**GetClientPrevalidatedDomain**](ApiRegistrationApi.md#GetClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference} | Get prevalidated domains for the selected domain reference Id
[**GetClientPrevalidatedDomains**](ApiRegistrationApi.md#GetClientPrevalidatedDomains) | **Post** /v2/client/domain/{clientReference}/list | Get the list of prevalidated domains for the selected client given its reference Id
[**IssueCertificate**](ApiRegistrationApi.md#IssueCertificate) | **Post** /v2/issue/csr/{productReference} | Issue certificate using CSR
[**IssueCertificateV22**](ApiRegistrationApi.md#IssueCertificateV22) | **Post** /v2/issue | Issue certificate using extended request attributes
[**Jwt**](ApiRegistrationApi.md#Jwt) | **Post** /v2/jwt/{userName} | Produce a user JWT
[**ListCertificateOrderAdditionalRecipients**](ApiRegistrationApi.md#ListCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients
[**PublishCertificate**](ApiRegistrationApi.md#PublishCertificate) | **Post** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order
[**ResetClientPrevalidatedDomain**](ApiRegistrationApi.md#ResetClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id
[**RevokeCertificates**](ApiRegistrationApi.md#RevokeCertificates) | **Post** /v2/revoke | Revoke certificates
[**SearchClients**](ApiRegistrationApi.md#SearchClients) | **Post** /v2/clients | Search Clients available to the RA Operator
[**UnpublishCertificate**](ApiRegistrationApi.md#UnpublishCertificate) | **Post** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order
[**ValidateClientPrevalidatedDomain**](ApiRegistrationApi.md#ValidateClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id



## AddCertificateOrderAdditionalRecipients

> []AdditionalRecipient AddCertificateOrderAdditionalRecipients(ctx, orderReference).AdditionalRecipient(additionalRecipient).Execute()

Add additional recipients to Certificate Order



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 
    additionalRecipient := []openapiclient.AdditionalRecipient{*openapiclient.NewAdditionalRecipient("shared.mailbox@sample.org", "DNS_OWNER_CHECK_EMAIL_LINK", "NEUTRAL")} // []AdditionalRecipient | Array of additional recipients

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.AddCertificateOrderAdditionalRecipients(context.Background(), orderReference).AdditionalRecipient(additionalRecipient).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.AddCertificateOrderAdditionalRecipients``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AddCertificateOrderAdditionalRecipients`: []AdditionalRecipient
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.AddCertificateOrderAdditionalRecipients`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddCertificateOrderAdditionalRecipientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **additionalRecipient** | [**[]AdditionalRecipient**](AdditionalRecipient.md) | Array of additional recipients | 

### Return type

[**[]AdditionalRecipient**](AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateClientPrevalidatedDomains

> []ClientDNS CreateClientPrevalidatedDomains(ctx, clientReference).RequestBody(requestBody).Execute()

Register new prevalidated domains for the selected client given its reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID
    requestBody := []string{"déjà.vu.com"} // []string | Client domains

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.CreateClientPrevalidatedDomains(context.Background(), clientReference).RequestBody(requestBody).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.CreateClientPrevalidatedDomains``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `CreateClientPrevalidatedDomains`: []ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.CreateClientPrevalidatedDomains`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**clientReference** | **string** | Client reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiCreateClientPrevalidatedDomainsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **requestBody** | **[]string** | Client domains | 

### Return type

[**[]ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteCertificateOrderAdditionalRecipients

> []AdditionalRecipient DeleteCertificateOrderAdditionalRecipients(ctx, orderReference).AdditionalRecipient(additionalRecipient).Execute()

Delete additional recipients to Certificate Order



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 
    additionalRecipient := []openapiclient.AdditionalRecipient{*openapiclient.NewAdditionalRecipient("shared.mailbox@sample.org", "DNS_OWNER_CHECK_EMAIL_LINK", "NEUTRAL")} // []AdditionalRecipient | Array of additional recipients to delete

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.DeleteCertificateOrderAdditionalRecipients(context.Background(), orderReference).AdditionalRecipient(additionalRecipient).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.DeleteCertificateOrderAdditionalRecipients``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeleteCertificateOrderAdditionalRecipients`: []AdditionalRecipient
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.DeleteCertificateOrderAdditionalRecipients`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteCertificateOrderAdditionalRecipientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **additionalRecipient** | [**[]AdditionalRecipient**](AdditionalRecipient.md) | Array of additional recipients to delete | 

### Return type

[**[]AdditionalRecipient**](AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteClientPrevalidatedDomain

> DeleteClientPrevalidatedDomain(ctx, prevalidatedDomainReference).Execute()

Delete prevalidated domain for the selected reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.DeleteClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.DeleteClientPrevalidatedDomain``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**prevalidatedDomainReference** | **string** | Pre validated domain reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteClientPrevalidatedDomainRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteClientPrevalidatedDomainToken

> ClientDNS DeleteClientPrevalidatedDomainToken(ctx, prevalidatedDomainReference).Execute()

Delete prevalidated domain token for the selected reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.DeleteClientPrevalidatedDomainToken(context.Background(), prevalidatedDomainReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.DeleteClientPrevalidatedDomainToken``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeleteClientPrevalidatedDomainToken`: ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.DeleteClientPrevalidatedDomainToken`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**prevalidatedDomainReference** | **string** | Pre validated domain reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiDeleteClientPrevalidatedDomainTokenRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCertificateChain

> []string GetCertificateChain(ctx, orderReference).Execute()

Retrieve the certificate chain for the given Order reference



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetCertificateChain(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetCertificateChain``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCertificateChain`: []string
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetCertificateChain`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCertificateChainRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

**[]string**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCertificateOrder

> CertificateOrder GetCertificateOrder(ctx, orderReference).Execute()

Retrieve a Certificate Order given the Order reference



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetCertificateOrder(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetCertificateOrder``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCertificateOrder`: CertificateOrder
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetCertificateOrder`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCertificateOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCertificateOrderStatus

> CertificateOrderStatus GetCertificateOrderStatus(ctx, orderReference).Execute()

Retrieve a Certificate Order status given the Order reference



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetCertificateOrderStatus(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetCertificateOrderStatus``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCertificateOrderStatus`: CertificateOrderStatus
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetCertificateOrderStatus`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCertificateOrderStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**CertificateOrderStatus**](CertificateOrderStatus.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCertificateOrderTasks

> []CertificateOrderTask GetCertificateOrderTasks(ctx, orderReference).Execute()

Retrieve a Certificate Order Tasks given the Order reference



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetCertificateOrderTasks(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetCertificateOrderTasks``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCertificateOrderTasks`: []CertificateOrderTask
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetCertificateOrderTasks`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetCertificateOrderTasksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**[]CertificateOrderTask**](CertificateOrderTask.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetCertificateOrders

> []CertificateOrder GetCertificateOrders(ctx).SearchCertificateOrder(searchCertificateOrder).Execute()

Search Certificate Orders



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    searchCertificateOrder := *openapiclient.NewSearchCertificateOrder() // SearchCertificateOrder | Certificate order search options

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetCertificateOrders(context.Background()).SearchCertificateOrder(searchCertificateOrder).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetCertificateOrders``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetCertificateOrders`: []CertificateOrder
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetCertificateOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetCertificateOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCertificateOrder** | [**SearchCertificateOrder**](SearchCertificateOrder.md) | Certificate order search options | 

### Return type

[**[]CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetClient

> Client GetClient(ctx, clientReference).Execute()

Get a client given its reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetClient(context.Background(), clientReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetClient``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetClient`: Client
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetClient`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**clientReference** | **string** | Client reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetClientRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Client**](Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetClientPrevalidatedDomain

> ClientDNS GetClientPrevalidatedDomain(ctx, prevalidatedDomainReference).Execute()

Get prevalidated domains for the selected domain reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    prevalidatedDomainReference := "cld-123e4567-e89b-12d3-a456-426614174000" // string | Pre validated domain reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetClientPrevalidatedDomain``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetClientPrevalidatedDomain`: ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetClientPrevalidatedDomain`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**prevalidatedDomainReference** | **string** | Pre validated domain reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetClientPrevalidatedDomainRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetClientPrevalidatedDomains

> []ClientDNS GetClientPrevalidatedDomains(ctx, clientReference).Execute()

Get the list of prevalidated domains for the selected client given its reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.GetClientPrevalidatedDomains(context.Background(), clientReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.GetClientPrevalidatedDomains``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetClientPrevalidatedDomains`: []ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.GetClientPrevalidatedDomains`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**clientReference** | **string** | Client reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetClientPrevalidatedDomainsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**[]ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IssueCertificate

> CertificateOrder IssueCertificate(ctx, productReference).Body(body).Execute()

Issue certificate using CSR



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    productReference := "pma-123e4567-e89b-12d3-a456-426614174000" // string | Certificate product reference UUID
    body := "----BEGIN CERTIFICATE REQUEST-----
MIIBQDCByAIBADBFMQswCQYDVQQGEwJBVTETMBEGA1UECAwKU29tZS1TdGF0ZTEh
... [snipped] ...
6EYCyy3DWH2/ZTmKYjcaCE/iuOigqJOtgRyIeufDV9HKF4UP
-----END CERTIFICATE REQUEST-----
" // string | Certificate Request in Base64 with start/end beacon

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.IssueCertificate(context.Background(), productReference).Body(body).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.IssueCertificate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `IssueCertificate`: CertificateOrder
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.IssueCertificate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**productReference** | **string** | Certificate product reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiIssueCertificateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **body** | **string** | Certificate Request in Base64 with start/end beacon | 

### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: text/plain, application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## IssueCertificateV22

> CertificateOrder IssueCertificateV22(ctx).IssueRequest(issueRequest).Execute()

Issue certificate using extended request attributes



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    issueRequest := *openapiclient.NewIssueRequest("pma-10877aec-412f-4b96-a5d4-f5f95da8634e") // IssueRequest | Issue Request

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.IssueCertificateV22(context.Background()).IssueRequest(issueRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.IssueCertificateV22``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `IssueCertificateV22`: CertificateOrder
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.IssueCertificateV22`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIssueCertificateV22Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueRequest** | [**IssueRequest**](IssueRequest.md) | Issue Request | 

### Return type

[**CertificateOrder**](CertificateOrder.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## Jwt

> string Jwt(ctx, userName).UserSecret(userSecret).Execute()

Produce a user JWT



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    userName := "userName_example" // string | 
    userSecret := "userSecret_example" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.Jwt(context.Background(), userName).UserSecret(userSecret).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.Jwt``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Jwt`: string
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.Jwt`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**userName** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiJwtRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **userSecret** | **string** |  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: text/plain, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ListCertificateOrderAdditionalRecipients

> []AdditionalRecipient ListCertificateOrderAdditionalRecipients(ctx, orderReference).Execute()

Obtain a list of additional Certificate Order recipients



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.ListCertificateOrderAdditionalRecipients(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.ListCertificateOrderAdditionalRecipients``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ListCertificateOrderAdditionalRecipients`: []AdditionalRecipient
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.ListCertificateOrderAdditionalRecipients`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiListCertificateOrderAdditionalRecipientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**[]AdditionalRecipient**](AdditionalRecipient.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PublishCertificate

> PublishCertificate(ctx, orderReference).Execute()

Send a certificate publication request for selected Certificate Order



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.PublishCertificate(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.PublishCertificate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiPublishCertificateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ResetClientPrevalidatedDomain

> ClientDNS ResetClientPrevalidatedDomain(ctx, prevalidatedDomainReference).Execute()

Reset prevalidated domain token for the selected reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.ResetClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.ResetClientPrevalidatedDomain``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ResetClientPrevalidatedDomain`: ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.ResetClientPrevalidatedDomain`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**prevalidatedDomainReference** | **string** | Pre validated domain reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiResetClientPrevalidatedDomainRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RevokeCertificates

> RevokeCertificates(ctx).RevocationRequest(revocationRequest).Execute()

Revoke certificates



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    revocationRequest := []openapiclient.RevocationRequest{*openapiclient.NewRevocationRequest("3893409CB666E1F092B7B6F28E1EAF4582AA7F21", "CESSATION_OF_OPERATION", "DC=COM,DC=Some Domain,OU=Some Organizational Unit,CN=Some SubCA")} // []RevocationRequest | Certificate references to revoke

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.RevokeCertificates(context.Background()).RevocationRequest(revocationRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.RevokeCertificates``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRevokeCertificatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **revocationRequest** | [**[]RevocationRequest**](RevocationRequest.md) | Certificate references to revoke | 

### Return type

 (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchClients

> []Client SearchClients(ctx).Search(search).Execute()

Search Clients available to the RA Operator



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    search := "C?mpan* Ltd" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.SearchClients(context.Background()).Search(search).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.SearchClients``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SearchClients`: []Client
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.SearchClients`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchClientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string** |  | 

### Return type

[**[]Client**](Client.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UnpublishCertificate

> UnpublishCertificate(ctx, orderReference).Execute()

Send a certificate un-publication request for selected Certificate Order



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.UnpublishCertificate(context.Background(), orderReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.UnpublishCertificate``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiUnpublishCertificateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ValidateClientPrevalidatedDomain

> ClientDNS ValidateClientPrevalidatedDomain(ctx, prevalidatedDomainReference).Execute()

Prevalidate domain for the selected domain reference Id



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    prevalidatedDomainReference := "cld-123e4567-e89b-12d3-a456-426614174000" // string | Pre validated domain reference UUID

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.ApiRegistrationApi.ValidateClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `ApiRegistrationApi.ValidateClientPrevalidatedDomain``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ValidateClientPrevalidatedDomain`: ClientDNS
    fmt.Fprintf(os.Stdout, "Response from `ApiRegistrationApi.ValidateClientPrevalidatedDomain`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**prevalidatedDomainReference** | **string** | Pre validated domain reference UUID | 

### Other Parameters

Other parameters are passed through a pointer to a apiValidateClientPrevalidatedDomainRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ClientDNS**](ClientDNS.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

