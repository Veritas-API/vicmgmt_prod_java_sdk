# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.VeritasInformationClassifierVICApi;

import java.io.File;
import java.util.*;

public class VeritasInformationClassifierVICApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://veritas-prod-prod.apigee.net/vic/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*VeritasInformationClassifierVICApi* | [**createOrUpdateTag**](docs/VeritasInformationClassifierVICApi.md#createOrUpdateTag) | **PUT** /management/tags/{tag} | Create or update tag
*VeritasInformationClassifierVICApi* | [**createPattern**](docs/VeritasInformationClassifierVICApi.md#createPattern) | **POST** /management/patterns | Create pattern
*VeritasInformationClassifierVICApi* | [**createPolicy**](docs/VeritasInformationClassifierVICApi.md#createPolicy) | **POST** /management/policies | Create policy
*VeritasInformationClassifierVICApi* | [**deletePattern**](docs/VeritasInformationClassifierVICApi.md#deletePattern) | **DELETE** /management/patterns/{id} | Delete pattern
*VeritasInformationClassifierVICApi* | [**deletePolicy**](docs/VeritasInformationClassifierVICApi.md#deletePolicy) | **DELETE** /management/policies/{id} | Delete policy
*VeritasInformationClassifierVICApi* | [**deleteTag**](docs/VeritasInformationClassifierVICApi.md#deleteTag) | **DELETE** /management/tags/{tag} | Delete tag
*VeritasInformationClassifierVICApi* | [**getMetadataDefinitions**](docs/VeritasInformationClassifierVICApi.md#getMetadataDefinitions) | **GET** /management/policies/metadata | List metadata definitions
*VeritasInformationClassifierVICApi* | [**getPattern**](docs/VeritasInformationClassifierVICApi.md#getPattern) | **GET** /management/patterns/{id} | Get pattern
*VeritasInformationClassifierVICApi* | [**getPatternCollection**](docs/VeritasInformationClassifierVICApi.md#getPatternCollection) | **GET** /management/patterns | List patterns
*VeritasInformationClassifierVICApi* | [**getPoliciesByPattern**](docs/VeritasInformationClassifierVICApi.md#getPoliciesByPattern) | **GET** /management/patterns/{id}/policies | List policies that use a pattern
*VeritasInformationClassifierVICApi* | [**getPoliciesByTag**](docs/VeritasInformationClassifierVICApi.md#getPoliciesByTag) | **GET** /management/tags/{tag}/policies | List policies that use a tag
*VeritasInformationClassifierVICApi* | [**getPolicy**](docs/VeritasInformationClassifierVICApi.md#getPolicy) | **GET** /management/policies/{id} | Get policy
*VeritasInformationClassifierVICApi* | [**getPolicyCollection**](docs/VeritasInformationClassifierVICApi.md#getPolicyCollection) | **GET** /management/policies | List policies
*VeritasInformationClassifierVICApi* | [**getTag**](docs/VeritasInformationClassifierVICApi.md#getTag) | **GET** /management/tags/{tag} | Get tag
*VeritasInformationClassifierVICApi* | [**getTagPropertyDefinitions**](docs/VeritasInformationClassifierVICApi.md#getTagPropertyDefinitions) | **GET** /management/tags/propertyDefinitions | List tag property definitions
*VeritasInformationClassifierVICApi* | [**getTagsCollection**](docs/VeritasInformationClassifierVICApi.md#getTagsCollection) | **GET** /management/tags | List tags
*VeritasInformationClassifierVICApi* | [**patchPolicy**](docs/VeritasInformationClassifierVICApi.md#patchPolicy) | **PATCH** /management/policies/{id} | Patch policy
*VeritasInformationClassifierVICApi* | [**resetPolicy**](docs/VeritasInformationClassifierVICApi.md#resetPolicy) | **DELETE** /management/policies/{id}/overrides | Reset policy to defaults
*VeritasInformationClassifierVICApi* | [**updatePattern**](docs/VeritasInformationClassifierVICApi.md#updatePattern) | **PUT** /management/patterns/{id} | Update pattern
*VeritasInformationClassifierVICApi* | [**updatePolicy**](docs/VeritasInformationClassifierVICApi.md#updatePolicy) | **PUT** /management/policies/{id} | Update policy


## Documentation for Models

 - [AllowedValue](docs/AllowedValue.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [JsonPatchDocument](docs/JsonPatchDocument.md)
 - [Link](docs/Link.md)
 - [MetadataDefinition](docs/MetadataDefinition.md)
 - [MetadataDefinitionCollection](docs/MetadataDefinitionCollection.md)
 - [Node](docs/Node.md)
 - [OperatorNode](docs/OperatorNode.md)
 - [Pattern](docs/Pattern.md)
 - [PatternCollection](docs/PatternCollection.md)
 - [Policy](docs/Policy.md)
 - [PolicyBody](docs/PolicyBody.md)
 - [PolicyCollection](docs/PolicyCollection.md)
 - [Tag](docs/Tag.md)
 - [TagProperty](docs/TagProperty.md)
 - [TagPropertyAllowedValue](docs/TagPropertyAllowedValue.md)
 - [TagPropertyDefinition](docs/TagPropertyDefinition.md)
 - [TagPropertyDefinitionCollection](docs/TagPropertyDefinitionCollection.md)
 - [TagsCollection](docs/TagsCollection.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



