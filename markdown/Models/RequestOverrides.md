# RequestOverrides
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **subjectDN** | **String** | Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c (Country)   - dc (Domain Controller)   - l (Locality)   - state (State)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - streetAddress (Street Address)   - o (Organization)   - organizationIdentifier (Organization Identifier)   - ou (Organizational Unit)   - uid (UID)   - uniqueIdentifier (Unique Identifier)   - serialnumber (Serial number)   - email (Email)   - title (Title)   - cn (Common Name)   - sn (Surname)   - gn (Given name)   - name (Name)   - initials (Initials)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - generationQualifier (Generation Qualifier)  | [optional] [default to null] |
| **validity** | **Integer** | Optional certificate validity set if enabled on the Product  | [optional] [default to null] |
| **requestExtensions** | [**RequestExtensions**](RequestExtensions.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

