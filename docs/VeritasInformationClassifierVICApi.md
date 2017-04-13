# VeritasInformationClassifierVICApi

All URIs are relative to *http://veritas-prod-prod.apigee.net/vic/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateTag**](VeritasInformationClassifierVICApi.md#createOrUpdateTag) | **PUT** /management/tags/{tag} | Create or update tag
[**createPattern**](VeritasInformationClassifierVICApi.md#createPattern) | **POST** /management/patterns | Create pattern
[**createPolicy**](VeritasInformationClassifierVICApi.md#createPolicy) | **POST** /management/policies | Create policy
[**deletePattern**](VeritasInformationClassifierVICApi.md#deletePattern) | **DELETE** /management/patterns/{id} | Delete pattern
[**deletePolicy**](VeritasInformationClassifierVICApi.md#deletePolicy) | **DELETE** /management/policies/{id} | Delete policy
[**deleteTag**](VeritasInformationClassifierVICApi.md#deleteTag) | **DELETE** /management/tags/{tag} | Delete tag
[**getMetadataDefinitions**](VeritasInformationClassifierVICApi.md#getMetadataDefinitions) | **GET** /management/policies/metadata | List metadata definitions
[**getPattern**](VeritasInformationClassifierVICApi.md#getPattern) | **GET** /management/patterns/{id} | Get pattern
[**getPatternCollection**](VeritasInformationClassifierVICApi.md#getPatternCollection) | **GET** /management/patterns | List patterns
[**getPoliciesByPattern**](VeritasInformationClassifierVICApi.md#getPoliciesByPattern) | **GET** /management/patterns/{id}/policies | List policies that use a pattern
[**getPoliciesByTag**](VeritasInformationClassifierVICApi.md#getPoliciesByTag) | **GET** /management/tags/{tag}/policies | List policies that use a tag
[**getPolicy**](VeritasInformationClassifierVICApi.md#getPolicy) | **GET** /management/policies/{id} | Get policy
[**getPolicyCollection**](VeritasInformationClassifierVICApi.md#getPolicyCollection) | **GET** /management/policies | List policies
[**getTag**](VeritasInformationClassifierVICApi.md#getTag) | **GET** /management/tags/{tag} | Get tag
[**getTagPropertyDefinitions**](VeritasInformationClassifierVICApi.md#getTagPropertyDefinitions) | **GET** /management/tags/propertyDefinitions | List tag property definitions
[**getTagsCollection**](VeritasInformationClassifierVICApi.md#getTagsCollection) | **GET** /management/tags | List tags
[**patchPolicy**](VeritasInformationClassifierVICApi.md#patchPolicy) | **PATCH** /management/policies/{id} | Patch policy
[**resetPolicy**](VeritasInformationClassifierVICApi.md#resetPolicy) | **DELETE** /management/policies/{id}/overrides | Reset policy to defaults
[**updatePattern**](VeritasInformationClassifierVICApi.md#updatePattern) | **PUT** /management/patterns/{id} | Update pattern
[**updatePolicy**](VeritasInformationClassifierVICApi.md#updatePolicy) | **PUT** /management/policies/{id} | Update policy


<a name="createOrUpdateTag"></a>
# **createOrUpdateTag**
> Tag createOrUpdateTag(tag, body, tenantId)

Create or update tag

Create or update a tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tag = "tag_example"; // String | 
Tag body = new Tag(); // Tag | Tag
String tenantId = "_Default"; // String | The tenant identifier
try {
    Tag result = apiInstance.createOrUpdateTag(tag, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#createOrUpdateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **body** | [**Tag**](Tag.md)| Tag |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPattern"></a>
# **createPattern**
> Pattern createPattern(body, tenantId)

Create pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
Pattern body = new Pattern(); // Pattern | New pattern
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.createPattern(body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#createPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pattern**](Pattern.md)| New pattern |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPolicy"></a>
# **createPolicy**
> Policy createPolicy(body, tenantId)

Create policy

Create a custom policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
Policy body = new Policy(); // Policy | New policy
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.createPolicy(body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#createPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Policy**](Policy.md)| New policy |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePattern"></a>
# **deletePattern**
> deletePattern(id, tenantId)

Delete pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The pattern identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deletePattern(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#deletePattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePolicy"></a>
# **deletePolicy**
> deletePolicy(id, tenantId)

Delete policy

Delete a custom policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deletePolicy(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#deletePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tag, tenantId)

Delete tag

Delete a custom tag.  (Built-in tags cannot be deleted.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.deleteTag(tag, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMetadataDefinitions"></a>
# **getMetadataDefinitions**
> MetadataDefinitionCollection getMetadataDefinitions(tenantId)

List metadata definitions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tenantId = "_Default"; // String | The tenant identifier
try {
    MetadataDefinitionCollection result = apiInstance.getMetadataDefinitions(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getMetadataDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**MetadataDefinitionCollection**](MetadataDefinitionCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPattern"></a>
# **getPattern**
> Pattern getPattern(id, tenantId)

Get pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The pattern identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.getPattern(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPatternCollection"></a>
# **getPatternCollection**
> PatternCollection getPatternCollection(tenantId, ifNoneMatch)

List patterns



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tenantId = "_Default"; // String | The tenant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    PatternCollection result = apiInstance.getPatternCollection(tenantId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPatternCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**PatternCollection**](PatternCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoliciesByPattern"></a>
# **getPoliciesByPattern**
> PolicyCollection getPoliciesByPattern(id, tenantId)

List policies that use a pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    PolicyCollection result = apiInstance.getPoliciesByPattern(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPoliciesByPattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPoliciesByTag"></a>
# **getPoliciesByTag**
> PolicyCollection getPoliciesByTag(tag, tenantId)

List policies that use a tag



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    PolicyCollection result = apiInstance.getPoliciesByTag(tag, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPoliciesByTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicy"></a>
# **getPolicy**
> Policy getPolicy(id, tenantId)

Get policy

Retrieve a policy

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.getPolicy(id, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPolicyCollection"></a>
# **getPolicyCollection**
> PolicyCollection getPolicyCollection(tenantId, includeDisabled, includeEngineBody, ifNoneMatch)

List policies

Retrieve the policies for a tenant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tenantId = "_Default"; // String | The tenant identifier
Boolean includeDisabled = true; // Boolean | Include disabled policies (as well as enabled ones)
Boolean includeEngineBody = true; // Boolean | Include the engine body for policies, and the engine rule sets.
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    PolicyCollection result = apiInstance.getPolicyCollection(tenantId, includeDisabled, includeEngineBody, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getPolicyCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **includeDisabled** | **Boolean**| Include disabled policies (as well as enabled ones) | [optional]
 **includeEngineBody** | **Boolean**| Include the engine body for policies, and the engine rule sets. | [optional]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**PolicyCollection**](PolicyCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> Tag getTag(tag, tenantId)

Get tag

Get a tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tag = "tag_example"; // String | 
String tenantId = "_Default"; // String | The tenant identifier
try {
    Tag result = apiInstance.getTag(tag, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Tag**](Tag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagPropertyDefinitions"></a>
# **getTagPropertyDefinitions**
> TagPropertyDefinitionCollection getTagPropertyDefinitions(tenantId)

List tag property definitions

Get definitions of properties that can be associated with a tag. This is useful, for example, for user interfaces that need to know the supported values for such properties. Generally the tag properties are application-specific and not part of the core service functionality.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tenantId = "_Default"; // String | The tenant identifier
try {
    TagPropertyDefinitionCollection result = apiInstance.getTagPropertyDefinitions(tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getTagPropertyDefinitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**TagPropertyDefinitionCollection**](TagPropertyDefinitionCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTagsCollection"></a>
# **getTagsCollection**
> TagsCollection getTagsCollection(tenantId, ifNoneMatch)

List tags

Retrieve all of the tags for a tenant.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String tenantId = "_Default"; // String | The tenant identifier
String ifNoneMatch = "ifNoneMatch_example"; // String | 
try {
    TagsCollection result = apiInstance.getTagsCollection(tenantId, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#getTagsCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]
 **ifNoneMatch** | **String**|  | [optional]

### Return type

[**TagsCollection**](TagsCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="patchPolicy"></a>
# **patchPolicy**
> Policy patchPolicy(id, patch, tenantId)

Patch policy

Update part of a policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The policy identifier
List<JsonPatchDocument> patch = Arrays.asList(new JsonPatchDocument()); // List<JsonPatchDocument> | A patch containing instructions for how the policy should be modified. See RFC 6902.
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.patchPolicy(id, patch, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#patchPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **patch** | [**List&lt;JsonPatchDocument&gt;**](JsonPatchDocument.md)| A patch containing instructions for how the policy should be modified. See RFC 6902. |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/json-patch+json
 - **Accept**: application/json

<a name="resetPolicy"></a>
# **resetPolicy**
> resetPolicy(id, tenantId)

Reset policy to defaults

Reset a policy to its default settings.  Only valid for built-in policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The policy identifier
String tenantId = "_Default"; // String | The tenant identifier
try {
    apiInstance.resetPolicy(id, tenantId);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#resetPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updatePattern"></a>
# **updatePattern**
> Pattern updatePattern(id, body, tenantId)

Update pattern



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The pattern identifier
Pattern body = new Pattern(); // Pattern | Updated pattern
String tenantId = "_Default"; // String | The tenant identifier
try {
    Pattern result = apiInstance.updatePattern(id, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#updatePattern");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The pattern identifier |
 **body** | [**Pattern**](Pattern.md)| Updated pattern |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Pattern**](Pattern.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePolicy"></a>
# **updatePolicy**
> Policy updatePolicy(id, body, tenantId)

Update policy

Update a policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VeritasInformationClassifierVICApi;


VeritasInformationClassifierVICApi apiInstance = new VeritasInformationClassifierVICApi();
String id = "id_example"; // String | The policy identifier
Policy body = new Policy(); // Policy | Updated policy
String tenantId = "_Default"; // String | The tenant identifier
try {
    Policy result = apiInstance.updatePolicy(id, body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VeritasInformationClassifierVICApi#updatePolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The policy identifier |
 **body** | [**Policy**](Policy.md)| Updated policy |
 **tenantId** | **String**| The tenant identifier | [optional] [default to _Default]

### Return type

[**Policy**](Policy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

