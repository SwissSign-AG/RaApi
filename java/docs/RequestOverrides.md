

# RequestOverrides


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subjectDN** | **String** | Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c, country (Country)   - o, organization (Organization)   - ou, organizationalUnit (Organizational Unit)   - t, title (Title)    - cn, commonName (Common Name)   - sn, surName (Surname)   - gn, givenName (Given name)   - i, initials (Initials)   - street, streetAddress (Street Address)   - serialnumber (Serial number)   - l, locality (Locality)   - st, state (State)   - e, email, emailAddress (Email)   - dc, domainController (Domain Controller)   - uid (UID)   - generationQualifier, generation (Generation Qualifier)   - description (Description)   - role (Role)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - orgId, organizationIdentifier (Organization Identifier)   - uniqueIdentifier (Unique Identifier)   - name (Name)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - unstructuredaddress (Unstructed Address)   - unstructuredname (Unstructed Name)   - dn (DN Qualifier)   - nameatbirth (Name at Birth)   - countryofcitizenship (Country of Citizenship)   - countryofresidence (Country of Residence)   - gender (Gender)   - placeofbirth (Place of Birth)   - dateofbirth (Date of Birth)   - businesscategory (Business Category)   - telephonenumber (Telephone Number)   - scionisdasnumber (SCION ISD AS Number)   - tpmmanufacturer (TPM Manufacturer)   - tpmmodel (TPM Model)   - tpmversion (TPM Version)  |  [optional] |
|**validity** | **Integer** | Optional certificate validity set if enabled on the Product  |  [optional] |
|**requestExtensions** | [**RequestExtensions**](RequestExtensions.md) |  |  [optional] |



