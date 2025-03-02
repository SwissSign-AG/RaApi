# CertificateOrderTask

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Uuid** | **string** | Certificate Order Task reference | [readonly] 
**TimeCreated** | Pointer to **time.Time** | Certificate Order creation date time | [optional] [readonly] 
**TimeScheduled** | Pointer to **time.Time** | Scheduled date time | [optional] [readonly] 
**TimeStarted** | Pointer to **time.Time** | Started date time | [optional] [readonly] 
**TimeFinished** | Pointer to **time.Time** | Finished date time | [optional] [readonly] 
**Status** | [**JobStatus**](JobStatus.md) |  | 
**Type** | [**JobType**](JobType.md) |  | 
**NumberOfExecutions** | **int32** | Number of executions | [readonly] 
**Response** | Pointer to **string** | Response | [optional] [readonly] 
**Error** | Pointer to **string** | Error message | [optional] [readonly] 

## Methods

### NewCertificateOrderTask

`func NewCertificateOrderTask(uuid string, status JobStatus, type_ JobType, numberOfExecutions int32, ) *CertificateOrderTask`

NewCertificateOrderTask instantiates a new CertificateOrderTask object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCertificateOrderTaskWithDefaults

`func NewCertificateOrderTaskWithDefaults() *CertificateOrderTask`

NewCertificateOrderTaskWithDefaults instantiates a new CertificateOrderTask object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUuid

`func (o *CertificateOrderTask) GetUuid() string`

GetUuid returns the Uuid field if non-nil, zero value otherwise.

### GetUuidOk

`func (o *CertificateOrderTask) GetUuidOk() (*string, bool)`

GetUuidOk returns a tuple with the Uuid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUuid

`func (o *CertificateOrderTask) SetUuid(v string)`

SetUuid sets Uuid field to given value.


### GetTimeCreated

`func (o *CertificateOrderTask) GetTimeCreated() time.Time`

GetTimeCreated returns the TimeCreated field if non-nil, zero value otherwise.

### GetTimeCreatedOk

`func (o *CertificateOrderTask) GetTimeCreatedOk() (*time.Time, bool)`

GetTimeCreatedOk returns a tuple with the TimeCreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeCreated

`func (o *CertificateOrderTask) SetTimeCreated(v time.Time)`

SetTimeCreated sets TimeCreated field to given value.

### HasTimeCreated

`func (o *CertificateOrderTask) HasTimeCreated() bool`

HasTimeCreated returns a boolean if a field has been set.

### GetTimeScheduled

`func (o *CertificateOrderTask) GetTimeScheduled() time.Time`

GetTimeScheduled returns the TimeScheduled field if non-nil, zero value otherwise.

### GetTimeScheduledOk

`func (o *CertificateOrderTask) GetTimeScheduledOk() (*time.Time, bool)`

GetTimeScheduledOk returns a tuple with the TimeScheduled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeScheduled

`func (o *CertificateOrderTask) SetTimeScheduled(v time.Time)`

SetTimeScheduled sets TimeScheduled field to given value.

### HasTimeScheduled

`func (o *CertificateOrderTask) HasTimeScheduled() bool`

HasTimeScheduled returns a boolean if a field has been set.

### GetTimeStarted

`func (o *CertificateOrderTask) GetTimeStarted() time.Time`

GetTimeStarted returns the TimeStarted field if non-nil, zero value otherwise.

### GetTimeStartedOk

`func (o *CertificateOrderTask) GetTimeStartedOk() (*time.Time, bool)`

GetTimeStartedOk returns a tuple with the TimeStarted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeStarted

`func (o *CertificateOrderTask) SetTimeStarted(v time.Time)`

SetTimeStarted sets TimeStarted field to given value.

### HasTimeStarted

`func (o *CertificateOrderTask) HasTimeStarted() bool`

HasTimeStarted returns a boolean if a field has been set.

### GetTimeFinished

`func (o *CertificateOrderTask) GetTimeFinished() time.Time`

GetTimeFinished returns the TimeFinished field if non-nil, zero value otherwise.

### GetTimeFinishedOk

`func (o *CertificateOrderTask) GetTimeFinishedOk() (*time.Time, bool)`

GetTimeFinishedOk returns a tuple with the TimeFinished field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeFinished

`func (o *CertificateOrderTask) SetTimeFinished(v time.Time)`

SetTimeFinished sets TimeFinished field to given value.

### HasTimeFinished

`func (o *CertificateOrderTask) HasTimeFinished() bool`

HasTimeFinished returns a boolean if a field has been set.

### GetStatus

`func (o *CertificateOrderTask) GetStatus() JobStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *CertificateOrderTask) GetStatusOk() (*JobStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *CertificateOrderTask) SetStatus(v JobStatus)`

SetStatus sets Status field to given value.


### GetType

`func (o *CertificateOrderTask) GetType() JobType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CertificateOrderTask) GetTypeOk() (*JobType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CertificateOrderTask) SetType(v JobType)`

SetType sets Type field to given value.


### GetNumberOfExecutions

`func (o *CertificateOrderTask) GetNumberOfExecutions() int32`

GetNumberOfExecutions returns the NumberOfExecutions field if non-nil, zero value otherwise.

### GetNumberOfExecutionsOk

`func (o *CertificateOrderTask) GetNumberOfExecutionsOk() (*int32, bool)`

GetNumberOfExecutionsOk returns a tuple with the NumberOfExecutions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumberOfExecutions

`func (o *CertificateOrderTask) SetNumberOfExecutions(v int32)`

SetNumberOfExecutions sets NumberOfExecutions field to given value.


### GetResponse

`func (o *CertificateOrderTask) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *CertificateOrderTask) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *CertificateOrderTask) SetResponse(v string)`

SetResponse sets Response field to given value.

### HasResponse

`func (o *CertificateOrderTask) HasResponse() bool`

HasResponse returns a boolean if a field has been set.

### GetError

`func (o *CertificateOrderTask) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *CertificateOrderTask) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *CertificateOrderTask) SetError(v string)`

SetError sets Error field to given value.

### HasError

`func (o *CertificateOrderTask) HasError() bool`

HasError returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


