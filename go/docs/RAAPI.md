# \RAAPI

All URIs are relative to *https://api.ra.pre.swisssign.ch*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCertificateOrderAdditionalRecipients**](RAAPI.md#AddCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order
[**CreateClientPrevalidatedDomains**](RAAPI.md#CreateClientPrevalidatedDomains) | **Post** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id
[**DeleteCertificateOrderAdditionalRecipients**](RAAPI.md#DeleteCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order
[**DeleteClientPrevalidatedDomain**](RAAPI.md#DeleteClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id
[**DeleteClientPrevalidatedDomainToken**](RAAPI.md#DeleteClientPrevalidatedDomainToken) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id
[**GetCertificateChain**](RAAPI.md#GetCertificateChain) | **Post** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference
[**GetCertificateOrder**](RAAPI.md#GetCertificateOrder) | **Post** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference
[**GetCertificateOrderStatus**](RAAPI.md#GetCertificateOrderStatus) | **Post** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference
[**GetCertificateOrderTasks**](RAAPI.md#GetCertificateOrderTasks) | **Post** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference
[**GetCertificateOrders**](RAAPI.md#GetCertificateOrders) | **Post** /v2/orders | Search Certificate Orders
[**GetClient**](RAAPI.md#GetClient) | **Post** /v2/client/{clientReference} | Get a client given its reference Id
[**GetClientPrevalidatedDomain**](RAAPI.md#GetClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id
[**GetClientPrevalidatedDomains**](RAAPI.md#GetClientPrevalidatedDomains) | **Post** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id
[**IssueCertificate**](RAAPI.md#IssueCertificate) | **Post** /v2/issue/csr/{productReference} | Issue certificate using CSR
[**IssueCertificateV22**](RAAPI.md#IssueCertificateV22) | **Post** /v2/issue | Issue certificate using extended request attributes
[**Jwt**](RAAPI.md#Jwt) | **Post** /v2/jwt/{userName} | Produce a user JWT
[**ListCertificateOrderAdditionalRecipients**](RAAPI.md#ListCertificateOrderAdditionalRecipients) | **Post** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients
[**PublishCertificate**](RAAPI.md#PublishCertificate) | **Post** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order
[**ReplaceCertificateOrderTags**](RAAPI.md#ReplaceCertificateOrderTags) | **Post** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags
[**ResetClientPrevalidatedDomain**](RAAPI.md#ResetClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id
[**RevokeCertificates**](RAAPI.md#RevokeCertificates) | **Post** /v2/revoke | Revoke certificates
[**SearchClients**](RAAPI.md#SearchClients) | **Post** /v2/clients | Search Clients available to the RA Operator
[**SearchPagedCertificateOrders**](RAAPI.md#SearchPagedCertificateOrders) | **Post** /v2/orders/paged | Search Certificate Orders
[**SearchPagedClients**](RAAPI.md#SearchPagedClients) | **Post** /v2/clients/paged | Search Clients available to the RA Operator
[**UnpublishCertificate**](RAAPI.md#UnpublishCertificate) | **Post** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order
[**ValidateClientPrevalidatedDomain**](RAAPI.md#ValidateClientPrevalidatedDomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id
[**ValidateIssueRequest**](RAAPI.md#ValidateIssueRequest) | **Post** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate



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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 
	additionalRecipient := []openapiclient.AdditionalRecipient{*openapiclient.NewAdditionalRecipient("shared.mailbox@sample.org", "DNS_OWNER_CHECK_EMAIL_LINK", "NEUTRAL")} // []AdditionalRecipient | Array of additional recipients

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.AddCertificateOrderAdditionalRecipients(context.Background(), orderReference).AdditionalRecipient(additionalRecipient).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.AddCertificateOrderAdditionalRecipients``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `AddCertificateOrderAdditionalRecipients`: []AdditionalRecipient
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.AddCertificateOrderAdditionalRecipients`: %v\n", resp)
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

Register new pre validated domains for the selected client given its reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID
	requestBody := []string{"déjà.vu.com"} // []string | Client domains

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.CreateClientPrevalidatedDomains(context.Background(), clientReference).RequestBody(requestBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.CreateClientPrevalidatedDomains``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CreateClientPrevalidatedDomains`: []ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.CreateClientPrevalidatedDomains`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 
	additionalRecipient := []openapiclient.AdditionalRecipient{*openapiclient.NewAdditionalRecipient("shared.mailbox@sample.org", "DNS_OWNER_CHECK_EMAIL_LINK", "NEUTRAL")} // []AdditionalRecipient | Array of additional recipients to delete

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.DeleteCertificateOrderAdditionalRecipients(context.Background(), orderReference).AdditionalRecipient(additionalRecipient).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.DeleteCertificateOrderAdditionalRecipients``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteCertificateOrderAdditionalRecipients`: []AdditionalRecipient
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.DeleteCertificateOrderAdditionalRecipients`: %v\n", resp)
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

Delete pre validated domain for the selected reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.RAAPI.DeleteClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.DeleteClientPrevalidatedDomain``: %v\n", err)
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

Delete pre validated domain token for the selected reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.DeleteClientPrevalidatedDomainToken(context.Background(), prevalidatedDomainReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.DeleteClientPrevalidatedDomainToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `DeleteClientPrevalidatedDomainToken`: ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.DeleteClientPrevalidatedDomainToken`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetCertificateChain(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetCertificateChain``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCertificateChain`: []string
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetCertificateChain`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetCertificateOrder(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetCertificateOrder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCertificateOrder`: CertificateOrder
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetCertificateOrder`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetCertificateOrderStatus(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetCertificateOrderStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCertificateOrderStatus`: CertificateOrderStatus
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetCertificateOrderStatus`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetCertificateOrderTasks(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetCertificateOrderTasks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCertificateOrderTasks`: []CertificateOrderTask
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetCertificateOrderTasks`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	searchCertificateOrder := *openapiclient.NewSearchCertificateOrder() // SearchCertificateOrder | Certificate order search options

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetCertificateOrders(context.Background()).SearchCertificateOrder(searchCertificateOrder).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetCertificateOrders``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetCertificateOrders`: []CertificateOrder
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetCertificateOrders`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetClient(context.Background(), clientReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetClient``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetClient`: Client
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetClient`: %v\n", resp)
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

Get pre validated domains for the selected domain reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	prevalidatedDomainReference := "cld-123e4567-e89b-12d3-a456-426614174000" // string | Pre validated domain reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetClientPrevalidatedDomain``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetClientPrevalidatedDomain`: ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetClientPrevalidatedDomain`: %v\n", resp)
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

Get the list of pre validated domains for the selected client given its reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	clientReference := "cli-123e4567-e89b-12d3-a456-426614174000" // string | Client reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.GetClientPrevalidatedDomains(context.Background(), clientReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.GetClientPrevalidatedDomains``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetClientPrevalidatedDomains`: []ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.GetClientPrevalidatedDomains`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	productReference := "pma-123e4567-e89b-12d3-a456-426614174000" // string | Certificate product reference UUID
	body := "body_example" // string | Certificate Request in Base64 with start/end beacon

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.IssueCertificate(context.Background(), productReference).Body(body).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.IssueCertificate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IssueCertificate`: CertificateOrder
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.IssueCertificate`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	issueRequest := *openapiclient.NewIssueRequest("pma-10877aec-412f-4b96-a5d4-f5f95da8634e") // IssueRequest | Issue Request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.IssueCertificateV22(context.Background()).IssueRequest(issueRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.IssueCertificateV22``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IssueCertificateV22`: CertificateOrder
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.IssueCertificateV22`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	userName := "userName_example" // string | 
	userSecret := "userSecret_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.Jwt(context.Background(), userName).UserSecret(userSecret).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.Jwt``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `Jwt`: string
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.Jwt`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.ListCertificateOrderAdditionalRecipients(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.ListCertificateOrderAdditionalRecipients``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ListCertificateOrderAdditionalRecipients`: []AdditionalRecipient
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.ListCertificateOrderAdditionalRecipients`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.RAAPI.PublishCertificate(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.PublishCertificate``: %v\n", err)
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


## ReplaceCertificateOrderTags

> CertificateOrder ReplaceCertificateOrderTags(ctx, orderReference).RequestBody(requestBody).Execute()

Replace Certificate Order custom tags



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 
	requestBody := []string{"my-cmdb-label"} // []string | List of user defined tags/labels

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.ReplaceCertificateOrderTags(context.Background(), orderReference).RequestBody(requestBody).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.ReplaceCertificateOrderTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ReplaceCertificateOrderTags`: CertificateOrder
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.ReplaceCertificateOrderTags`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**orderReference** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiReplaceCertificateOrderTagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **requestBody** | **[]string** | List of user defined tags/labels | 

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


## ResetClientPrevalidatedDomain

> ClientDNS ResetClientPrevalidatedDomain(ctx, prevalidatedDomainReference).Execute()

Reset pre validated domain token for the selected reference Id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	prevalidatedDomainReference := "cld-2263d498-6569-46d6-9359-f08a1d298d2d" // string | Pre validated domain reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.ResetClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.ResetClientPrevalidatedDomain``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ResetClientPrevalidatedDomain`: ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.ResetClientPrevalidatedDomain`: %v\n", resp)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	revocationRequest := []openapiclient.RevocationRequest{*openapiclient.NewRevocationRequest("3893409CB666E1F092B7B6F28E1EAF4582AA7F21", "CESSATION_OF_OPERATION", "DC=COM,DC=Some Domain,OU=Some Organizational Unit,CN=Some SubCA")} // []RevocationRequest | Certificate references to revoke

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.RAAPI.RevokeCertificates(context.Background()).RevocationRequest(revocationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.RevokeCertificates``: %v\n", err)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	search := "C?mpan* Ltd" // string | search query string with optional wildcard attributes ? and/or * (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.SearchClients(context.Background()).Search(search).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.SearchClients``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchClients`: []Client
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.SearchClients`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchClientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string** | search query string with optional wildcard attributes ? and/or * | 

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


## SearchPagedCertificateOrders

> CertificateOrders SearchPagedCertificateOrders(ctx).SearchCertificateOrder(searchCertificateOrder).Length(length).Start(start).Execute()

Search Certificate Orders



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	searchCertificateOrder := *openapiclient.NewSearchCertificateOrder() // SearchCertificateOrder | Certificate order search options
	length := int32(56) // int32 | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used.  (optional)
	start := int32(56) // int32 | the offset in search result for paging support (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.SearchPagedCertificateOrders(context.Background()).SearchCertificateOrder(searchCertificateOrder).Length(length).Start(start).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.SearchPagedCertificateOrders``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchPagedCertificateOrders`: CertificateOrders
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.SearchPagedCertificateOrders`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchPagedCertificateOrdersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchCertificateOrder** | [**SearchCertificateOrder**](SearchCertificateOrder.md) | Certificate order search options | 
 **length** | **int32** | The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | 
 **start** | **int32** | the offset in search result for paging support | 

### Return type

[**CertificateOrders**](CertificateOrders.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SearchPagedClients

> Clients SearchPagedClients(ctx).Search(search).Length(length).Start(start).Execute()

Search Clients available to the RA Operator



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	search := "C?mpan* Ltd" // string | search query string with optional wildcard attributes ? and/or * (optional)
	length := int32(56) // int32 | The number of items to return. When unset or < 0, the maximum (default is 300) server side configured length setting is used. If length > maximum (default is 300) server side configured length, then the server side setting is used.  (optional)
	start := int32(56) // int32 | the offset in search result for paging support (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.SearchPagedClients(context.Background()).Search(search).Length(length).Start(start).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.SearchPagedClients``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SearchPagedClients`: Clients
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.SearchPagedClients`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSearchPagedClientsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **string** | search query string with optional wildcard attributes ? and/or * | 
 **length** | **int32** | The number of items to return. When unset or &lt; 0, the maximum (default is 300) server side configured length setting is used. If length &gt; maximum (default is 300) server side configured length, then the server side setting is used.  | 
 **start** | **int32** | the offset in search result for paging support | 

### Return type

[**Clients**](Clients.md)

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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	orderReference := "ord-f0725b50-c533-4802-a844-de57bfb7a80e" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.RAAPI.UnpublishCertificate(context.Background(), orderReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.UnpublishCertificate``: %v\n", err)
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
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	prevalidatedDomainReference := "cld-123e4567-e89b-12d3-a456-426614174000" // string | Pre validated domain reference UUID

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.RAAPI.ValidateClientPrevalidatedDomain(context.Background(), prevalidatedDomainReference).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.ValidateClientPrevalidatedDomain``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ValidateClientPrevalidatedDomain`: ClientDNS
	fmt.Fprintf(os.Stdout, "Response from `RAAPI.ValidateClientPrevalidatedDomain`: %v\n", resp)
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


## ValidateIssueRequest

> ValidateIssueRequest(ctx).IssueRequest(issueRequest).Execute()

Validate an issue request structure. Validates the request but does not issue any certificate



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	issueRequest := *openapiclient.NewIssueRequest("pma-10877aec-412f-4b96-a5d4-f5f95da8634e") // IssueRequest | Validate Issue Request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	r, err := apiClient.RAAPI.ValidateIssueRequest(context.Background()).IssueRequest(issueRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `RAAPI.ValidateIssueRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiValidateIssueRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issueRequest** | [**IssueRequest**](IssueRequest.md) | Validate Issue Request | 

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

