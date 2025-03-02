# ProductValidity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ValidityType** | **string** | Certificate validity types.   - YEARS: certificate validity in years.   - MONTHS: certificate validity in months.   - DAYS: certificate validity in days.   - HOURS: certificate validity in hours.   - MINUTES: certificate validity in minutes.   - SECONDS: certificate validity in seconds.  | [readonly] 
**Validity** | Pointer to **int32** | The default certificate validity | [optional] [readonly] 
**ValidityOptions** | Pointer to **[]int32** | Optional certificate validity values | [optional] 

## Methods

### NewProductValidity

`func NewProductValidity(validityType string, ) *ProductValidity`

NewProductValidity instantiates a new ProductValidity object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewProductValidityWithDefaults

`func NewProductValidityWithDefaults() *ProductValidity`

NewProductValidityWithDefaults instantiates a new ProductValidity object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValidityType

`func (o *ProductValidity) GetValidityType() string`

GetValidityType returns the ValidityType field if non-nil, zero value otherwise.

### GetValidityTypeOk

`func (o *ProductValidity) GetValidityTypeOk() (*string, bool)`

GetValidityTypeOk returns a tuple with the ValidityType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidityType

`func (o *ProductValidity) SetValidityType(v string)`

SetValidityType sets ValidityType field to given value.


### GetValidity

`func (o *ProductValidity) GetValidity() int32`

GetValidity returns the Validity field if non-nil, zero value otherwise.

### GetValidityOk

`func (o *ProductValidity) GetValidityOk() (*int32, bool)`

GetValidityOk returns a tuple with the Validity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidity

`func (o *ProductValidity) SetValidity(v int32)`

SetValidity sets Validity field to given value.

### HasValidity

`func (o *ProductValidity) HasValidity() bool`

HasValidity returns a boolean if a field has been set.

### GetValidityOptions

`func (o *ProductValidity) GetValidityOptions() []int32`

GetValidityOptions returns the ValidityOptions field if non-nil, zero value otherwise.

### GetValidityOptionsOk

`func (o *ProductValidity) GetValidityOptionsOk() (*[]int32, bool)`

GetValidityOptionsOk returns a tuple with the ValidityOptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValidityOptions

`func (o *ProductValidity) SetValidityOptions(v []int32)`

SetValidityOptions sets ValidityOptions field to given value.

### HasValidityOptions

`func (o *ProductValidity) HasValidityOptions() bool`

HasValidityOptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


