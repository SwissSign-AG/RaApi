# Documentation for SwissSign RA REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ra.pre.swisssign.ch*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ApiRegistrationApi* | [**addCertificateOrderAdditionalRecipients**](Apis/ApiRegistrationApi.md#addcertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order |
*ApiRegistrationApi* | [**createClientPrevalidatedDomains**](Apis/ApiRegistrationApi.md#createclientprevalidateddomains) | **POST** /v2/client/domain/{clientReference}/register | Register new prevalidated domains for the selected client given its reference Id |
*ApiRegistrationApi* | [**deleteCertificateOrderAdditionalRecipients**](Apis/ApiRegistrationApi.md#deletecertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order |
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
*ApiRegistrationApi* | [**issueCertificateV22**](Apis/ApiRegistrationApi.md#issuecertificatev22) | **POST** /v2/issue | Issue certificate using extended request attributes |
*ApiRegistrationApi* | [**jwt**](Apis/ApiRegistrationApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
*ApiRegistrationApi* | [**listCertificateOrderAdditionalRecipients**](Apis/ApiRegistrationApi.md#listcertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients |
*ApiRegistrationApi* | [**publishCertificate**](Apis/ApiRegistrationApi.md#publishcertificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order |
*ApiRegistrationApi* | [**replaceCertificateOrderTags**](Apis/ApiRegistrationApi.md#replacecertificateordertags) | **POST** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags |
*ApiRegistrationApi* | [**resetClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#resetclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset prevalidated domain token for the selected reference Id |
*ApiRegistrationApi* | [**revokeCertificates**](Apis/ApiRegistrationApi.md#revokecertificates) | **POST** /v2/revoke | Revoke certificates |
*ApiRegistrationApi* | [**searchClients**](Apis/ApiRegistrationApi.md#searchclients) | **POST** /v2/clients | Search Clients available to the RA Operator |
*ApiRegistrationApi* | [**searchPagedCertificateOrders**](Apis/ApiRegistrationApi.md#searchpagedcertificateorders) | **POST** /v2/orders/paged | Search Certificate Orders |
*ApiRegistrationApi* | [**searchPagedClients**](Apis/ApiRegistrationApi.md#searchpagedclients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator |
*ApiRegistrationApi* | [**unpublishCertificate**](Apis/ApiRegistrationApi.md#unpublishcertificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order |
*ApiRegistrationApi* | [**validateClientPrevalidatedDomain**](Apis/ApiRegistrationApi.md#validateclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [APIError](./Models/APIError.md)
 - [AdditionalRecipient](./Models/AdditionalRecipient.md)
 - [AdditionalRecipientType](./Models/AdditionalRecipientType.md)
 - [Certificate](./Models/Certificate.md)
 - [CertificateOrder](./Models/CertificateOrder.md)
 - [CertificateOrderStatus](./Models/CertificateOrderStatus.md)
 - [CertificateOrderTask](./Models/CertificateOrderTask.md)
 - [CertificateOrders](./Models/CertificateOrders.md)
 - [Client](./Models/Client.md)
 - [ClientDNS](./Models/ClientDNS.md)
 - [ClientDomainValidationStatus](./Models/ClientDomainValidationStatus.md)
 - [Clients](./Models/Clients.md)
 - [DNS](./Models/DNS.md)
 - [IssueRequest](./Models/IssueRequest.md)
 - [JobStatus](./Models/JobStatus.md)
 - [JobType](./Models/JobType.md)
 - [KeyType](./Models/KeyType.md)
 - [Product](./Models/Product.md)
 - [ProductValidity](./Models/ProductValidity.md)
 - [RegistrationDocument](./Models/RegistrationDocument.md)
 - [RequestDNS](./Models/RequestDNS.md)
 - [RequestExtensions](./Models/RequestExtensions.md)
 - [RequestIP](./Models/RequestIP.md)
 - [RequestOverrides](./Models/RequestOverrides.md)
 - [RequestRFC822](./Models/RequestRFC822.md)
 - [RequestUPN](./Models/RequestUPN.md)
 - [RevocationReason](./Models/RevocationReason.md)
 - [RevocationRequest](./Models/RevocationRequest.md)
 - [RevocationStatus](./Models/RevocationStatus.md)
 - [SearchCertificateOrder](./Models/SearchCertificateOrder.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP basic authentication

