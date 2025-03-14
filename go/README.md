# Go API client for swisssign_ra_api.v2

See https://github.com/SwissSign-AG/RaApi/README.md

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [OpenAPI-spec](https://www.openapis.org/) from a remote server, you can easily generate an API client.

- API version: 3.4.4
- Package version: 3.4.4
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.GoClientCodegen
For more information, please visit [https://support.swisspki.com](https://support.swisspki.com)

## Installation

Install the following dependencies:

```sh
go get github.com/stretchr/testify/assert
go get golang.org/x/net/context
```

Put the package under your project folder and add the following in import:

```go
import swisssign_ra_api.v2 "github.com/GIT_USER_ID/GIT_REPO_ID"
```

To use a proxy, set the environment variable `HTTP_PROXY`:

```go
os.Setenv("HTTP_PROXY", "http://proxy_name:proxy_port")
```

## Configuration of Server URL

Default configuration comes with `Servers` field that contains server objects as defined in the OpenAPI specification.

### Select Server Configuration

For using other server than the one defined on index 0 set context value `swisssign_ra_api.v2.ContextServerIndex` of type `int`.

```go
ctx := context.WithValue(context.Background(), swisssign_ra_api.v2.ContextServerIndex, 1)
```

### Templated Server URL

Templated server URL is formatted using default variables from configuration or from context value `swisssign_ra_api.v2.ContextServerVariables` of type `map[string]string`.

```go
ctx := context.WithValue(context.Background(), swisssign_ra_api.v2.ContextServerVariables, map[string]string{
	"basePath": "v2",
})
```

Note, enum values are always validated and all unused variables are silently ignored.

### URLs Configuration per Operation

Each operation can use different server URL defined using `OperationServers` map in the `Configuration`.
An operation is uniquely identified by `"{classname}Service.{nickname}"` string.
Similar rules for overriding default operation server index and variables applies by using `swisssign_ra_api.v2.ContextOperationServerIndices` and `swisssign_ra_api.v2.ContextOperationServerVariables` context maps.

```go
ctx := context.WithValue(context.Background(), swisssign_ra_api.v2.ContextOperationServerIndices, map[string]int{
	"{classname}Service.{nickname}": 2,
})
ctx = context.WithValue(context.Background(), swisssign_ra_api.v2.ContextOperationServerVariables, map[string]map[string]string{
	"{classname}Service.{nickname}": {
		"port": "8443",
	},
})
```

## Documentation for API Endpoints

All URIs are relative to *https://api.ra.pre.swisssign.ch*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*RAAPI* | [**AddCertificateOrderAdditionalRecipients**](docs/RAAPI.md#addcertificateorderadditionalrecipients) | **Post** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order
*RAAPI* | [**CreateClientPrevalidatedDomains**](docs/RAAPI.md#createclientprevalidateddomains) | **Post** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id
*RAAPI* | [**DeleteCertificateOrderAdditionalRecipients**](docs/RAAPI.md#deletecertificateorderadditionalrecipients) | **Post** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order
*RAAPI* | [**DeleteClientPrevalidatedDomain**](docs/RAAPI.md#deleteclientprevalidateddomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id
*RAAPI* | [**DeleteClientPrevalidatedDomainToken**](docs/RAAPI.md#deleteclientprevalidateddomaintoken) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id
*RAAPI* | [**GetCertificateChain**](docs/RAAPI.md#getcertificatechain) | **Post** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference
*RAAPI* | [**GetCertificateOrder**](docs/RAAPI.md#getcertificateorder) | **Post** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference
*RAAPI* | [**GetCertificateOrderStatus**](docs/RAAPI.md#getcertificateorderstatus) | **Post** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference
*RAAPI* | [**GetCertificateOrderTasks**](docs/RAAPI.md#getcertificateordertasks) | **Post** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference
*RAAPI* | [**GetCertificateOrders**](docs/RAAPI.md#getcertificateorders) | **Post** /v2/orders | Search Certificate Orders
*RAAPI* | [**GetClient**](docs/RAAPI.md#getclient) | **Post** /v2/client/{clientReference} | Get a client given its reference Id
*RAAPI* | [**GetClientPrevalidatedDomain**](docs/RAAPI.md#getclientprevalidateddomain) | **Post** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id
*RAAPI* | [**GetClientPrevalidatedDomains**](docs/RAAPI.md#getclientprevalidateddomains) | **Post** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id
*RAAPI* | [**IssueCertificate**](docs/RAAPI.md#issuecertificate) | **Post** /v2/issue/csr/{productReference} | Issue certificate using CSR
*RAAPI* | [**IssueCertificateV22**](docs/RAAPI.md#issuecertificatev22) | **Post** /v2/issue | Issue certificate using extended request attributes
*RAAPI* | [**Jwt**](docs/RAAPI.md#jwt) | **Post** /v2/jwt/{userName} | Produce a user JWT
*RAAPI* | [**ListCertificateOrderAdditionalRecipients**](docs/RAAPI.md#listcertificateorderadditionalrecipients) | **Post** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients
*RAAPI* | [**PublishCertificate**](docs/RAAPI.md#publishcertificate) | **Post** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order
*RAAPI* | [**ReplaceCertificateOrderTags**](docs/RAAPI.md#replacecertificateordertags) | **Post** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags
*RAAPI* | [**ResetClientPrevalidatedDomain**](docs/RAAPI.md#resetclientprevalidateddomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id
*RAAPI* | [**RevokeCertificates**](docs/RAAPI.md#revokecertificates) | **Post** /v2/revoke | Revoke certificates
*RAAPI* | [**SearchClients**](docs/RAAPI.md#searchclients) | **Post** /v2/clients | Search Clients available to the RA Operator
*RAAPI* | [**SearchPagedCertificateOrders**](docs/RAAPI.md#searchpagedcertificateorders) | **Post** /v2/orders/paged | Search Certificate Orders
*RAAPI* | [**SearchPagedClients**](docs/RAAPI.md#searchpagedclients) | **Post** /v2/clients/paged | Search Clients available to the RA Operator
*RAAPI* | [**UnpublishCertificate**](docs/RAAPI.md#unpublishcertificate) | **Post** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order
*RAAPI* | [**ValidateClientPrevalidatedDomain**](docs/RAAPI.md#validateclientprevalidateddomain) | **Post** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id
*RAAPI* | [**ValidateIssueRequest**](docs/RAAPI.md#validateissuerequest) | **Post** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate


## Documentation For Models

 - [APIError](docs/APIError.md)
 - [AdditionalRecipient](docs/AdditionalRecipient.md)
 - [Certificate](docs/Certificate.md)
 - [CertificateOrder](docs/CertificateOrder.md)
 - [CertificateOrderStatus](docs/CertificateOrderStatus.md)
 - [CertificateOrderTask](docs/CertificateOrderTask.md)
 - [CertificateOrders](docs/CertificateOrders.md)
 - [Client](docs/Client.md)
 - [ClientDNS](docs/ClientDNS.md)
 - [ClientDomainValidationStatus](docs/ClientDomainValidationStatus.md)
 - [Clients](docs/Clients.md)
 - [DNS](docs/DNS.md)
 - [IssueRequest](docs/IssueRequest.md)
 - [JobStatus](docs/JobStatus.md)
 - [JobType](docs/JobType.md)
 - [KeyType](docs/KeyType.md)
 - [Product](docs/Product.md)
 - [ProductValidity](docs/ProductValidity.md)
 - [RegistrationDocument](docs/RegistrationDocument.md)
 - [RequestDNS](docs/RequestDNS.md)
 - [RequestDeviceSerialNumber](docs/RequestDeviceSerialNumber.md)
 - [RequestExtensions](docs/RequestExtensions.md)
 - [RequestIP](docs/RequestIP.md)
 - [RequestOverrides](docs/RequestOverrides.md)
 - [RequestRFC822](docs/RequestRFC822.md)
 - [RequestRole](docs/RequestRole.md)
 - [RequestScope](docs/RequestScope.md)
 - [RequestUPN](docs/RequestUPN.md)
 - [RevocationReason](docs/RevocationReason.md)
 - [RevocationRequest](docs/RevocationRequest.md)
 - [RevocationStatus](docs/RevocationStatus.md)
 - [SearchCertificateOrder](docs/SearchCertificateOrder.md)


## Documentation For Authorization


Authentication schemes defined for the API:
### BearerAuth

- **Type**: HTTP Bearer token authentication

Example

```go
auth := context.WithValue(context.Background(), swisssign_ra_api.v2.ContextAccessToken, "BEARER_TOKEN_STRING")
r, err := client.Service.Operation(auth, args)
```


## Documentation for Utility Methods

Due to the fact that model structure members are all pointers, this package contains
a number of utility functions to easily obtain pointers to values of basic types.
Each of these functions takes a value of the given basic type and returns a pointer to it:

* `PtrBool`
* `PtrInt`
* `PtrInt32`
* `PtrInt64`
* `PtrFloat`
* `PtrFloat32`
* `PtrFloat64`
* `PtrString`
* `PtrTime`

## Author

ssc@swisssign.com

