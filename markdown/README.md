# Documentation for SwissSign RA REST API

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.ra.pre.swisssign.ch*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *RAApi* | [**addCertificateOrderAdditionalRecipients**](Apis/RAApi.md#addcertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/add/recipients | Add additional recipients to Certificate Order |
*RAApi* | [**createClientPrevalidatedDomains**](Apis/RAApi.md#createclientprevalidateddomains) | **POST** /v2/client/domain/{clientReference}/register | Register new pre validated domains for the selected client given its reference Id |
*RAApi* | [**deleteCertificateOrderAdditionalRecipients**](Apis/RAApi.md#deletecertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/delete/recipients | Delete additional recipients to Certificate Order |
*RAApi* | [**deleteClientPrevalidatedDomain**](Apis/RAApi.md#deleteclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/delete | Delete pre validated domain for the selected reference Id |
*RAApi* | [**deleteClientPrevalidatedDomainToken**](Apis/RAApi.md#deleteclientprevalidateddomaintoken) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/delete | Delete pre validated domain token for the selected reference Id |
*RAApi* | [**getCertificateChain**](Apis/RAApi.md#getcertificatechain) | **POST** /v2/order/{orderReference}/certificate/chain | Retrieve the certificate chain for the given Order reference |
*RAApi* | [**getCertificateOrder**](Apis/RAApi.md#getcertificateorder) | **POST** /v2/order/{orderReference} | Retrieve a Certificate Order given the Order reference |
*RAApi* | [**getCertificateOrderStatus**](Apis/RAApi.md#getcertificateorderstatus) | **POST** /v2/order/{orderReference}/status | Retrieve a Certificate Order status given the Order reference |
*RAApi* | [**getCertificateOrderTasks**](Apis/RAApi.md#getcertificateordertasks) | **POST** /v2/order/{orderReference}/tasks | Retrieve a Certificate Order Tasks given the Order reference |
*RAApi* | [**getCertificateOrders**](Apis/RAApi.md#getcertificateorders) | **POST** /v2/orders | Search Certificate Orders |
*RAApi* | [**getClient**](Apis/RAApi.md#getclient) | **POST** /v2/client/{clientReference} | Get a client given its reference Id |
*RAApi* | [**getClientPrevalidatedDomain**](Apis/RAApi.md#getclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference} | Get pre validated domains for the selected domain reference Id |
*RAApi* | [**getClientPrevalidatedDomains**](Apis/RAApi.md#getclientprevalidateddomains) | **POST** /v2/client/domain/{clientReference}/list | Get the list of pre validated domains for the selected client given its reference Id |
*RAApi* | [**issueCertificate**](Apis/RAApi.md#issuecertificate) | **POST** /v2/issue/csr/{productReference} | Issue certificate using CSR |
*RAApi* | [**issueCertificateV22**](Apis/RAApi.md#issuecertificatev22) | **POST** /v2/issue | Issue certificate using extended request attributes |
*RAApi* | [**jwt**](Apis/RAApi.md#jwt) | **POST** /v2/jwt/{userName} | Produce a user JWT |
*RAApi* | [**listCertificateOrderAdditionalRecipients**](Apis/RAApi.md#listcertificateorderadditionalrecipients) | **POST** /v2/order/{orderReference}/list/recipients | Obtain a list of additional Certificate Order recipients |
*RAApi* | [**publishCertificate**](Apis/RAApi.md#publishcertificate) | **POST** /v2/order/{orderReference}/publish | Send a certificate publication request for selected Certificate Order |
*RAApi* | [**replaceCertificateOrderTags**](Apis/RAApi.md#replacecertificateordertags) | **POST** /v2/order/{orderReference}/tags | Replace Certificate Order custom tags |
*RAApi* | [**resetClientPrevalidatedDomain**](Apis/RAApi.md#resetclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/token/reset | Reset pre validated domain token for the selected reference Id |
*RAApi* | [**revokeCertificates**](Apis/RAApi.md#revokecertificates) | **POST** /v2/revoke | Revoke certificates |
*RAApi* | [**searchClients**](Apis/RAApi.md#searchclients) | **POST** /v2/clients | Search Clients available to the RA Operator |
*RAApi* | [**searchPagedCertificateOrders**](Apis/RAApi.md#searchpagedcertificateorders) | **POST** /v2/orders/paged | Search Certificate Orders |
*RAApi* | [**searchPagedClients**](Apis/RAApi.md#searchpagedclients) | **POST** /v2/clients/paged | Search Clients available to the RA Operator |
*RAApi* | [**unpublishCertificate**](Apis/RAApi.md#unpublishcertificate) | **POST** /v2/order/{orderReference}/unpublish | Send a certificate un-publication request for selected Certificate Order |
*RAApi* | [**validateClientPrevalidatedDomain**](Apis/RAApi.md#validateclientprevalidateddomain) | **POST** /v2/client/domain/{prevalidatedDomainReference}/validate | Prevalidate domain for the selected domain reference Id |
*RAApi* | [**validateIssueRequest**](Apis/RAApi.md#validateissuerequest) | **POST** /v2/validate | Validate an issue request structure. Validates the request but does not issue any certificate |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [APIError](./Models/APIError.md)
 - [AdditionalRecipient](./Models/AdditionalRecipient.md)
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
 - [RequestDeviceSerialNumber](./Models/RequestDeviceSerialNumber.md)
 - [RequestExtensions](./Models/RequestExtensions.md)
 - [RequestIP](./Models/RequestIP.md)
 - [RequestOverrides](./Models/RequestOverrides.md)
 - [RequestRFC822](./Models/RequestRFC822.md)
 - [RequestRole](./Models/RequestRole.md)
 - [RequestScope](./Models/RequestScope.md)
 - [RequestUPN](./Models/RequestUPN.md)
 - [RevocationReason](./Models/RevocationReason.md)
 - [RevocationRequest](./Models/RevocationRequest.md)
 - [RevocationStatus](./Models/RevocationStatus.md)
 - [SearchCertificateOrder](./Models/SearchCertificateOrder.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerAuth"></a>
### BearerAuth

- **Type**: HTTP Bearer Token authentication (JWT)

