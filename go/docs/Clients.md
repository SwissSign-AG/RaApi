# Clients

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Draw** | **int32** |  | [readonly] 
**RecordsFiltered** | **int32** | Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data). | [readonly] 
**RecordsTotal** | **int32** | Total records, before filtering (i.e. the total number of records in the database) | [readonly] 
**Data** | [**[]Client**](Client.md) |  | 

## Methods

### NewClients

`func NewClients(draw int32, recordsFiltered int32, recordsTotal int32, data []Client, ) *Clients`

NewClients instantiates a new Clients object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClientsWithDefaults

`func NewClientsWithDefaults() *Clients`

NewClientsWithDefaults instantiates a new Clients object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDraw

`func (o *Clients) GetDraw() int32`

GetDraw returns the Draw field if non-nil, zero value otherwise.

### GetDrawOk

`func (o *Clients) GetDrawOk() (*int32, bool)`

GetDrawOk returns a tuple with the Draw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraw

`func (o *Clients) SetDraw(v int32)`

SetDraw sets Draw field to given value.


### GetRecordsFiltered

`func (o *Clients) GetRecordsFiltered() int32`

GetRecordsFiltered returns the RecordsFiltered field if non-nil, zero value otherwise.

### GetRecordsFilteredOk

`func (o *Clients) GetRecordsFilteredOk() (*int32, bool)`

GetRecordsFilteredOk returns a tuple with the RecordsFiltered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsFiltered

`func (o *Clients) SetRecordsFiltered(v int32)`

SetRecordsFiltered sets RecordsFiltered field to given value.


### GetRecordsTotal

`func (o *Clients) GetRecordsTotal() int32`

GetRecordsTotal returns the RecordsTotal field if non-nil, zero value otherwise.

### GetRecordsTotalOk

`func (o *Clients) GetRecordsTotalOk() (*int32, bool)`

GetRecordsTotalOk returns a tuple with the RecordsTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsTotal

`func (o *Clients) SetRecordsTotal(v int32)`

SetRecordsTotal sets RecordsTotal field to given value.


### GetData

`func (o *Clients) GetData() []Client`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *Clients) GetDataOk() (*[]Client, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *Clients) SetData(v []Client)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


