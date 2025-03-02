# Client

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Client UUID reference | [readonly] 
**Name** | **string** | Client name | [readonly] 
**Description** | Pointer to **string** | Client description | [optional] [readonly] 
**Products** | Pointer to [**[]Product**](Product.md) | List of available certificate products | [optional] 

## Methods

### NewClient

`func NewClient(uuid string, name string, ) *Client`

NewClient instantiates a new Client object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClientWithDefaults

`func NewClientWithDefaults() *Client`

NewClientWithDefaults instantiates a new Client object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUuid

`func (o *Client) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *Client) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *Client) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetName

`func (o *Client) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Client) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Client) SetName(v string)`

SetName sets Name field to given value.


### GetDescription

`func (o *Client) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *Client) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *Client) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *Client) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetProducts

`func (o *Client) GetProducts() []Product`

GetProducts returns the Products field if non-nil, zero value otherwise.

### GetProductsOk

`func (o *Client) GetProductsOk() (*[]Product, bool)`

GetProductsOk returns a tuple with the Products field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProducts

`func (o *Client) SetProducts(v []Product)`

SetProducts sets Products field to given value.

### HasProducts

`func (o *Client) HasProducts() bool`

HasProducts returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


