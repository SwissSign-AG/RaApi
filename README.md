## Getting started




### Basic workflow to generate a certificate via the RA API:

---
* Get your Client, Service Account and API Key from [https://ra.swisssign.ch/account/my/SAAPIKeys]
  This key will be shared with all operators entitled to use your MPKI.
* Use your API Key to generate a JWT Token for your session.
* Retrieve your client uuid and products from [/v2/clients](https://github.com/SwissSign-AG/RaApi#search-for-clients-and-associated-products)
* Pre-Validate your domains (Optional, otherwise the individual certificate order has to be validated). Pre-validated domains are valid 13 Months.
  * Get a domain validation token: [/v2/client/domain/{clientReference}/register](https://github.com/SwissSign-AG/RaApi#register-client-domains)
  * Configure this token in your DNS
  * Query for the prevalidatedDomainReference: [/v2/client/domain/{clientReference}/list](https://github.com/SwissSign-AG/RaApi#list-client-domains)
  * Trigger instant validation: [/v2/client/domain/{prevalidatedDomainReference}/validate](https://github.com/SwissSign-AG/RaApi#validate-a-client-domain)
* Generate private key and CSR
* Send CSR through API for the desired product: [/v2/issue/csr/{productReference}](https://github.com/SwissSign-AG/RaApi#issue-a-certificate-using-a-csr-for-the-selected-certificate-product-identifier-pma-uuid) to create a Certificate Order.
* Poll Order Status until "issued" or "failed": [/v2/order/{orderReference}/status](https://github.com/SwissSign-AG/RaApi#retrieve-a-certificate-order-status-given-its-reference-identifier-ord-uuid)
* Download Certificate with chain as pkcs7: [/v2/order/{orderReference}/certificate/chain](#todo)

## Table of Contents

* [Generate a user JWT given an account and API Key](https://github.com/SwissSign-AG/RaApi#generate-a-user-jwt-given-an-account-and-api-key)
* [Search for Clients and associated Products](https://github.com/SwissSign-AG/RaApi#search-for-clients-and-associated-products)
* [Lookup a Client using its reference identifier (cli-_uuid_)](https://github.com/SwissSign-AG/RaApi#lookup-a-client-using-its-reference-identifier-cli-uuid)
* [Issue a certificate using a CSR for the selected certificate product](https://github.com/SwissSign-AG/RaApi#issue-a-certificate-using-a-csr-for-the-selected-certificate-product)
* [Retrieve a Certificate Order status given its reference identifier (ord-_uuid_)](https://github.com/SwissSign-AG/RaApi#retrieve-a-certificate-order-status-given-its-reference-identifier-ord-uuid)
* [Retrieve a Certificate Order given its reference identifier (ord-_uuid_)](https://github.com/SwissSign-AG/RaApi#retrieve-a-certificate-order-given-its-reference-identifier-ord-uuid)
* [Retrieve a certificate chain](https://github.com/SwissSign-AG/RaApi#retrieve-a-certificate-chain)
* [Revoke one or multiple issued certificates](https://github.com/SwissSign-AG/RaApi#revoke-one-or-multiple-issued-certificates)
* [Client domain owner check management](https://github.com/SwissSign-AG/RaApi#client-domain-owner-check-management)
  * [List Client Domains](https://github.com/SwissSign-AG/RaApi#list-client-domains)
  * [Register Client Domains](https://github.com/SwissSign-AG/RaApi#register-client-domains)
  * [Get a Client Domain](https://github.com/SwissSign-AG/RaApi#get-a-client-domain)
  * [Delete a Client Domain](https://github.com/SwissSign-AG/RaApi#delete-a-client-domain)
  * [Validate a Client Domain](https://github.com/SwissSign-AG/RaApi#validate-a-client-domain)
  * [Reset a pre validated Client Domain token](https://github.com/SwissSign-AG/RaApi#reset-a-pre-validated-client-domain-token)
  * [Delete a pre validated Client Domain token](https://github.com/SwissSign-AG/RaApi#delete-a-pre-validated-client-domain-token)

* [Error Messages and Codes](https://github.com/SwissSign-AG/RaApi#error-messages-and-codes)
  *  [Module codes(related to API only)](https://github.com/SwissSign-AG/RaApi#module-codes-related-to-api-only)
  *  [Section codes](https://github.com/SwissSign-AG/RaApi#section-codes)
  *  [Error codes](https://github.com/SwissSign-AG/RaApi#error-codes)

### Generate a user JWT given an account and API Key

__/v2/jwt/{userName}__

Helper method to generate a `JWT` for authenticating subsequent calls.

The generated JWT has a validity of 8 hours. If you plan to generate the JWT
yourself, you need to set the following attributes and `HMAC256` sign the
JWT with your API Key.
             
|JWT attribute       |Value            |Description      |
|--------------------|-----------------|-----------------|
|Issuer      (_iss_) |SwissPKI         |The JWT was issued by the SwissSign CA platform.|
|Audience    (_aud_) |REST API         |The JWT is to be consumed by the OpenAPI v3 RA API.|
|Subject     (_sub_) |_user account_   |The (technical) account the token was issued to.|             
|Issued at   (_iat_) |Date/Time UTC    |issueance date of the token|             
|Not before  (_nbf_) |Date/Time UTC    |Start date of validity|            
|Expires at  (_exp_) |Date/Time UTC    |End date of validity|
             
__Prerequisites__

This method requires a valid RA Operator account and API Key. The API Key is
obtained from your RA Operator 
user account (_requires permissions to manage API Keys. Login to your RA
Account and retrieve the API Key from 'My Account'_) or is provided to
you via your CA Operator.
             
__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/jwt/service.account' \
-H 'accept: application/json' \
-H 'Content-Type: application/x-www-form-urlencoded' \
-d
'userSecret=n1dNUaDMoOJSG4AkMlMNnOR5C6LtGNm0dfeSdPKy8x1ddyhWqJCmuekK6k41j88w'
```

---

### Search for Clients and associated Products

__/v2/clients__

Search for Clients and their associated products. Returns a list of all
available Clients and associated certificate products you can issue.

Each client product has a unique product reference (pma-_uuid_) which you
reference for issuing certificates for the selected certificate product.

You can also access a client directly by using the client reference
(cli-_uuid_).

Optionally, you may search for specific clients by providing a search
parameter value.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/clients?search=Client%2A' \
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

---

### Lookup a Client using its reference identifier (cli-_uuid_)

__/v2/client/{clientReference}__

Fetch a client description by reference.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/cli-xxxx' \
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
-d '' | python -m json.tool
```

---

### Issue a certificate using a CSR for the selected certificate product

identifier (pma-_uuid_)

__/v2/issue/csr/{productReference}__

Issue a new Certificate Order using a CSR for the selected certificate
product. The request will create a new Certificate Order and process the
request.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/issue/csr/pma-60b9ba99-f4ed-44ad-ba48-c8fa512015ed' \
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
-H 'Content-Type: text/plain' \
-d -----BEGIN CERTIFICATE REQUEST-----
MIICnTCCAYUCAQAwWDELMAkGA1UEBhMCQ0gxETAPBgNVBAcMCExhdXNhbm5lMR0w

... [snipped] ...

+BczD0fUdQvOg3A39IPvVF/92bBt7qODr2MRCWfCTqa3yJd/34rAEuHK9aSrYboL
Rw==
-----END CERTIFICATE REQUEST----- \
| python -m json.tool
```

---

### Retrieve a Certificate Order status given its reference identifier (ord-_uuid_)

(ord-_uuid_)

__/v2/order/{orderReference}/status__

Retrieve the Certificate Order status given an order reference (ord-_uuid_).

Certificate order processing is an asynchronous process and the issuance of
a certificate may enter wait states until all validation rules (e.g. DNS
validation) are successfully executed.
Please refer to chapter 3.5 of the SwissSign RA Operator Handbook for a list of certificate order statuses and their descriptions.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/order/ord-157e726e-cf28-44cc-bfbe-485c0a5abe7b/status'
\
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
| python -m json.tool
```

---

### Retrieve a Certificate Order given its reference identifier (ord-_uuid_)

__/v2/orders__

Retrieve the Certificate Order given an order reference (ord-_uuid_). 

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/order/order-uuid' \
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
-d '{ _optional search parameters_}' \
| python -m json.tool
```

---

### Retrieve a certificate chain

Retrieve a certificate chain given its Order reference identifier (ord-uuid)

__/v2/order/{orderReference}/certificate/chain__

Retrieve the certificate chain as a list of certificates, given an order reference (ord-uuid).

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/order/ord-157e726e-cf28-44cc-bfbe-485c0a5abe7b/certificate/chain' \
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._ 9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
```

---

### Revoke one or multiple issued certificates

__/v2/revoke__

Revoke one or multiple valid certificates. 

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/revoke' \
-H 'accept: */*' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
-H 'Content-Type: application/json' \
-d '[
      {
        "serialNumber": "3893409CB666E1F092B7B6F28E1EAF4582AA7F21",
        "issuerName": "DC=COM,DC=Some Domain,OU=Some Organizational Unit,CN=Some SubCA",
        "revocationReason": "superseded"
      }
    ]' \
| python -m json.tool
```

---

### Client domain owner check management

Client domain owner check management is available to the RA Operator API for
Public Trust domain validation.

Using the RA Operator API for Public Trust domain validation, you can
register domain names for clients which require domain 
owner check validation based on DNS only. You generate tokens for the
client domain names you register as TXT records on the DNS server.

The generated tokens are valid for a 30 days period during which you can
enter them in the DNS TXT record in order to proof the ownership of the according domain.

For example, registering a client domain _déjà.vu.com_ for domain owner check
pre validation would generate

a token _swiss-pki=CTvhWIvNCuEjIynG574gD5Jeopo_ to register in the DNS with
a TXT record for _xn--dj-kia8a.vu.com_.

#### List Client Domains

__/v2/client/domains/{clientReference}/list__

Retrieve the list of domains and their status for the selected Client using
its client reference uuid (cli-_uuid_).

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domains/cli-90dbaeb2-0047-49e7-bc5d-1c63848e1acd/list'
\
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

#### Register Client Domains

__/v2/client/domain/{clientReference}/register__

Register new domain names for the selected Client using its client reference
uuid (cli-_uuid_). Registering a new client domain name
generates a validation token you can register on the 

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cli-90dbaeb2-0047-49e7-bc5d-1c63848e1acd/register'
\
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
-H 'Content-Type: application/json' \
-d '[
      "déjà.vu.com",
      "jamais.vu.com",
      "encore.vu.com"
    ]' \
-d '' | python -m json.tool
```

#### Get a Client Domain

__/v2/client/domain/{prevalidatedDomainReference}

Get a pre validated client domain.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cld-a45daaf0-78f8-49e9-83e9-3584f673c6e0'
\
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

#### Delete a Client Domain

__/v2/client/domain/{prevalidatedDomainReference}/delete__

Delete a pre validated client domain.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cld-a45daaf0-78f8-49e9-83e9-3584f673c6e0/delete'
\
-H 'accept: */*' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk'
```

#### Validate a Client Domain

__/v2/client/domain/{prevalidatedDomainReference}/validate

Validate client domain.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cld-a45daaf0-78f8-49e9-83e9-3584f673c6e0/validate'
\
-H 'accept: application/json' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

#### Reset a pre validated Client Domain token

__/v2/client/domain/{prevalidatedDomainReference}/token/reset__

Reset the pre validated client domain token. Generates a new validation
token.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cld-a45daaf0-78f8-49e9-83e9-3584f673c6e0/token/reset'
\
-H 'accept: */*' \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

#### Delete a pre validated Client Domain token

__/v2/client/domain/{prevalidatedDomainReference}/token/delete__

Delete the pre validated client domain token. Delete the validation token
value.

__Example__

```
curl -X 'POST' \
'https://api.ra.swisssign.ch/v2/client/domain/cld-a45daaf0-78f8-49e9-83e9-3584f673c6e0/token/delete'
\
-H 'accept: application/json \
-H 'Authorization: Bearer eyJ0eXAi _... [snipped] ..._
9Vpt_k2BdnTKssp5btKA7MfHkVVEvk' \
-d '' | python -m json.tool
```

---

### Error Messages and Codes

Errors replies are JSon objects of type _APIError_ which contain following
attribute information

|Attributes    | Value/description                                                                                              |
|--------------|----------------------------------------------------------------------------------------------------------------|
|uuid          |A correlation UUID (Universally Unique Identifer), i.e. a unique identifier for the server error code. You can
use this correlation value when contacting support. |             
|errorCode     |An error code represented in the form _<module.section.error>_ as in _<001.002.0003>_                           |
|errorMessages |A list of error messages |

#### Module codes (related to API only)

|Module                       |Code|
|-----------------------------|----|
|MODULE_COMMONS               | 001|             
|MODULE_HSM                   | 006|             
|MODULE_CA                    | 007|             
|MODULE_AUTHENTICATION        | 009|             
|MODULE_RAO_API               | 011|             
   
#### Section codes

|Section                          |Code|
|---------------------------------|----|
|SECTION_UTILS                    | 010|             
|SECTION_API                      | 110|             
|SECTION_SERVICES                 | 120|             
|SECTION_DAO                      | 140|             
|SECTION_CALLBACK                 | 150|             
|SECTION_JWT                      | 250|             
|SECTION_RAO_API_APP              | 350|             
|SECTION_RAO_API_FORM_VALIDATION  | 351|             
|SECTION_RAO_API_ACCESS_DENIED    | 352|             
|SECTION_RAO_API_AUTHENTICATION   | 353|             
|SECTION_RAO_API_RUNTIME          | 354|             

#### Error codes

|Error codes                  |Code|
|-----------------------------|----|
|AUTHENTICATION               | 0223|             
|ACCESS_DENIED                | 0224|             
|RUNTIME                      | 0225|             
|VALIDATION                   | 0226|             
|APPLICATION                  | 0227|             
|JWT                          | 0228|             
|NULL_VALUE                   | 0229|             
|INVALID_CERTIFICATE_S/N      | 0230|             
|INVALID_CLIENT               | 0231|             
|CERTIFICATE_EXPIRED          | 0232|             
|CERTIFICATE_ALREADY_REVOKED  | 0233|             
|INVALID_PRODUCT_MAPPING      | 0234|             
|CERTIFICATE_IS_CA            | 0235|             
|CERTIFICATE_IS_ENTITY        | 0236|             
|FAILED_PARSING_DN            | 0237|             
|INVALID_ISSUER_NAME          | 0238|             
|FAILED_SUBMIT_ORDER          | 0239|             
|FAILED_VALIDATING_REQUEST    | 0240|             
|FAILED_PARSING_CSR           | 0241|             
|MISSING_CDP                  | 0242|             
|INVALID_PRODUCT_ID           | 0243|             
|INVALID_PRODUCT_TYPE         | 0244|             
|PRODUCT_API_DISABLED         | 0245|             
|PRODUCT_RETIRED              | 0246|             
|PRODUCT_EXPIRED              | 0247|             
|INVALID_CLIENT_PRODCT        | 0248|

---
