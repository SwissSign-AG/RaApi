# Documentation for SwissSign RA REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ra.pre.swisssign.ch/v2*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ApiRegistrationApi* | [**createClientPrevalidatedDomains**](Apis/ApiRegistrationApi.md#createclientprevalidateddomains) | **POST** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id |
*ApiRegistrationApi* | [**deleteClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#deleteclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete prevalidated domain for the selected reference Id |
*ApiRegistrationApi* | [**deleteClientPrevalidatedDomainToken**](Apis/ApiRegistrationApi.md#deleteclientprevalidateddomaintoken) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete prevalidated domain token for the selected reference Id |
*ApiRegistrationApi* | [**getCertificateChain**](Apis/ApiRegistrationApi.md#getcertificatechain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference |
*ApiRegistrationApi* | [**getCertificateOrder**](Apis/ApiRegistrationApi.md#getcertificateorder) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference |
*ApiRegistrationApi* | [**getCertificateOrderStatus**](Apis/ApiRegistrationApi.md#getcertificateorderstatus) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference |
*ApiRegistrationApi* | [**getCertificateOrderTasks**](Apis/ApiRegistrationApi.md#getcertificateordertasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference |
*ApiRegistrationApi* | [**getCertificateOrders**](Apis/ApiRegistrationApi.md#getcertificateorders) | **POST** /v2/orders | Search Certificate Orders |
*ApiRegistrationApi* | [**getClient**](Apis/ApiRegistrationApi.md#getclient) | **POST** /v2/client/{clientReference} | Get a client given its reference Id |
*ApiRegistrationApi* | [**getClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#getclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get prevalidated domains for the selected domain reference Id |
*ApiRegistrationApi* | [**getClientPrevalidatedDomains**](Apis/ApiRegistrationApi.md#getclientprevalidateddomains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of prevalidated domains for the selected client given its reference Id |
*ApiRegistrationApi* | [**issueCertificate**](Apis/ApiRegistrationApi.md#issuecertificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR |
*ApiRegistrationApi* | [**jwt**](Apis/ApiRegistrationApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
*ApiRegistrationApi* | [**resetClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#resetclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id |
*ApiRegistrationApi* | [**revokeCertificates**](Apis/ApiRegistrationApi.md#revokecertificates) | **POST** /v2/revoke | Revoke certificates |
*ApiRegistrationApi* | [**searchClients**](Apis/ApiRegistrationApi.md#searchclients) | **POST** /v2/clients | Search Clients available to the RA Operator |
*ApiRegistrationApi* | [**validateClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#validateclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [APIError](./Models/APIError.md)
 - [Certificate](./Models/Certificate.md)
 - [CertificateOrder](./Models/CertificateOrder.md)
 - [CertificateOrderStatus](./Models/CertificateOrderStatus.md)
 - [CertificateOrderTask](./Models/CertificateOrderTask.md)
 - [Client](./Models/Client.md)
 - [ClientDNS](./Models/ClientDNS.md)
 - [ClientDomainValidationStatus](./Models/ClientDomainValidationStatus.md)
 - [JobStatus](./Models/JobStatus.md)
 - [JobType](./Models/JobType.md)
 - [KeyType](./Models/KeyType.md)
 - [Product](./Models/Product.md)
 - [RevocationReason](./Models/RevocationReason.md)
 - [RevocationRequest](./Models/RevocationRequest.md)
 - [RevocationStatus](./Models/RevocationStatus.md)
 - [SearchCertificateOrder](./Models/SearchCertificateOrder.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP basic authentication

