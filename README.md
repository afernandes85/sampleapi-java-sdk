<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# Sample API Java SDK

[![build](https://img.shields.io/github/workflow/status/factset/sampleapi-java-sdk/CI)](https://github.com/factset/sampleapi-java-sdk/actions?query=workflow%3ACI)
[![maven](https://img.shields.io/maven-central/v/com.factset.sampleapi/sampleapi-sdk)](https://mvnrepository.com/artifact/com.factset.sampleapi)
![API version](https://img.shields.io/badge/API-v1-blue)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Use this library to integrate with FactSet's Sample APIs. Below APIs are supported by this SDK.

* [Sample API](https://developer.factset.com/api-catalog/sample-api)

## Contents

* [auto-generated-sdk](auto-generated-sdk) - Auto-generated code using [Sample API SDK Generator](https://github.com/factset/sampleapi-sdk-generator)
* [examples](examples) - Sample project containing code snippets to quickly get started with the SDK  
* [tests](tests) - Integration tests

## Requirements

* Java 1.7 or Java 1.8
* Maven to build and install the SDK

## Installation

* Install the SDK to your local Maven repository:

  ```sh
  mvn install -DskipTests
  ```

* Install the client dynamically by adding a dependency to the POM file:

  ```xml
  <dependency>
    <groupId>com.factset.sampleapi</groupId>
    <artifactId>sampleapi-sdk</artifactId>
    <version>ARTIFACT_VERSION</version>
  </dependency>
  ```

## Usage

Refer [examples](examples) project for sample code snippets to quickly get started with the SDK

## Tests

First, clone the repo locally and `cd` into the directory.

```sh
git clone https://github.com/factset/sampleapi-java-sdk.git
cd tests
```

Before running the tests, set the below environment variables. Use the [Developer Portal Manage API Keys page](https://developer.factset.com/manage-api-keys) to get these values.

```sh
export SAMPLE_API_USERNAME_SERIAL = "username-serial"
export SAMPLE_API_PASSWORD = "apikey"
```

Run the tests with below command.

```sh
mvn -q test -Dtest=ApiTestsRunner
```

## Contributing

* Files in [auto-generated-sdk](auto-generated-sdk) directory are auto-generated and should not be manually edited here. Refer [Sample API SDK Generator](https://github.com/factset/sampleapi-sdk-generator) for instructions on how to modify these files.
* Projects [examples](examples) and [tests](tests) are open to enhancements and bug fixes. Please create a pull requests with the proposed changes.
