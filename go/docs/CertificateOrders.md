# CertificateOrders

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Draw** | **int32** |  | [readonly] 
**RecordsFiltered** | **int32** | Total records, after filtering (i.e. the total number of records after filtering has been applied - not just the number of records being returned for this page of data). | [readonly] 
**RecordsTotal** | **int32** | Total records, before filtering (i.e. the total number of records in the database) | [readonly] 
**Data** | [**[]CertificateOrder**](CertificateOrder.md) |  | 

## Methods

### NewCertificateOrders

`func NewCertificateOrders(draw int32, recordsFiltered int32, recordsTotal int32, data []CertificateOrder, ) *CertificateOrders`

NewCertificateOrders instantiates a new CertificateOrders object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCertificateOrdersWithDefaults

`func NewCertificateOrdersWithDefaults() *CertificateOrders`

NewCertificateOrdersWithDefaults instantiates a new CertificateOrders object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDraw

`func (o *CertificateOrders) GetDraw() int32`

GetDraw returns the Draw field if non-nil, zero value otherwise.

### GetDrawOk

`func (o *CertificateOrders) GetDrawOk() (*int32, bool)`

GetDrawOk returns a tuple with the Draw field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraw

`func (o *CertificateOrders) SetDraw(v int32)`

SetDraw sets Draw field to given value.


### GetRecordsFiltered

`func (o *CertificateOrders) GetRecordsFiltered() int32`

GetRecordsFiltered returns the RecordsFiltered field if non-nil, zero value otherwise.

### GetRecordsFilteredOk

`func (o *CertificateOrders) GetRecordsFilteredOk() (*int32, bool)`

GetRecordsFilteredOk returns a tuple with the RecordsFiltered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsFiltered

`func (o *CertificateOrders) SetRecordsFiltered(v int32)`

SetRecordsFiltered sets RecordsFiltered field to given value.


### GetRecordsTotal

`func (o *CertificateOrders) GetRecordsTotal() int32`

GetRecordsTotal returns the RecordsTotal field if non-nil, zero value otherwise.

### GetRecordsTotalOk

`func (o *CertificateOrders) GetRecordsTotalOk() (*int32, bool)`

GetRecordsTotalOk returns a tuple with the RecordsTotal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordsTotal

`func (o *CertificateOrders) SetRecordsTotal(v int32)`

SetRecordsTotal sets RecordsTotal field to given value.


### GetData

`func (o *CertificateOrders) GetData() []CertificateOrder`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CertificateOrders) GetDataOk() (*[]CertificateOrder, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CertificateOrders) SetData(v []CertificateOrder)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


