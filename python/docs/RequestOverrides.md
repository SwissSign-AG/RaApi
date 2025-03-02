# RequestOverrides


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject_dn** | **str** | Override the CSR Subject Distinguished Name with user provided value Supported attributes are (lower or uppercase):   - c, country (Country)   - o, organization (Organization)   - ou, organizationalUnit (Organizational Unit)   - t, title (Title)    - cn, commonName (Common Name)   - sn, surName (Surname)   - gn, givenName (Given name)   - i, initials (Initials)   - street, streetAddress (Street Address)   - serialnumber (Serial number)   - l, locality (Locality)   - st, state (State)   - e, email, emailAddress (Email)   - dc, domainController (Domain Controller)   - uid (UID)   - generationQualifier, generation (Generation Qualifier)   - description (Description)   - role (Role)   - joil (Jurisdiction of Incorporation, Locality)   - joist (Jurisdiction of Incorporation, State)   - joic (Jurisdiction of Incorporation, Country)   - orgId, organizationIdentifier (Organization Identifier)   - uniqueIdentifier (Unique Identifier)   - name (Name)   - pseudonym (Pseudonym)   - postalAddress (Postal Address)   - postalCode (Postal Code)   - unstructuredaddress (Unstructed Address)   - unstructuredname (Unstructed Name)   - dn (DN Qualifier)   - nameatbirth (Name at Birth)   - countryofcitizenship (Country of Citizenship)   - countryofresidence (Country of Residence)   - gender (Gender)   - placeofbirth (Place of Birth)   - dateofbirth (Date of Birth)   - businesscategory (Business Category)   - telephonenumber (Telephone Number)   - scionisdasnumber (SCION ISD AS Number)   - tpmmanufacturer (TPM Manufacturer)   - tpmmodel (TPM Model)   - tpmversion (TPM Version)  | [optional] 
**validity** | **int** | Optional certificate validity set if enabled on the Product  | [optional] 
**request_extensions** | [**RequestExtensions**](RequestExtensions.md) |  | [optional] 

## Example

```python
from swisssign_ra_api.v2.models.request_overrides import RequestOverrides

# TODO update the JSON string below
json = "{}"
# create an instance of RequestOverrides from a JSON string
request_overrides_instance = RequestOverrides.from_json(json)
# print the JSON string representation of the object
print(RequestOverrides.to_json())

# convert the object into a dict
request_overrides_dict = request_overrides_instance.to_dict()
# create an instance of RequestOverrides from a dict
request_overrides_from_dict = RequestOverrides.from_dict(request_overrides_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


