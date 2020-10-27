

# Pet

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**category** | [**Category**](Category.md) |  |  [optional]
**name** | **String** |  | 
**photoUrls** | **java.util.List&lt;String&gt;** |  | 
**tags** | [**java.util.List&lt;Tag&gt;**](Tag.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | pet status in the store |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
PENDING | &quot;pending&quot;
SOLD | &quot;sold&quot;


## Implemented Interfaces

* Serializable


