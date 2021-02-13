[![Maven Central](https://maven-badges.herokuapp.com/maven-central/ru.oleg-cherednik.utils/gson-utils/badge.svg)](https://maven-badges.herokuapp.com/maven-central/ru.oleg-cherednik.utils/gson-utils)
[![javadoc](https://javadoc.io/badge2/ru.oleg-cherednik.utils/gson-utils/javadoc.svg)](https://javadoc.io/doc/ru.oleg-cherednik.utils/gson-utils)
[![java8](https://badgen.net/badge/java/8+/blue)](https://badgen.net/)
[![travis-ci](https://travis-ci.com/oleg-cherednik/GsonUtils.svg?branch=dev)](https://travis-ci.com/oleg-cherednik/GsonUtils)
[![circle-ci](https://circleci.com/gh/oleg-cherednik/GsonUtils/tree/dev.svg?style=shield)](https://app.circleci.com/pipelines/github/oleg-cherednik/GsonUtils)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.txt)
[![codecov](https://codecov.io/gh/oleg-cherednik/GsonUtils/branch/dev/graph/badge.svg?token=UnqBOd1gbA)](https://codecov.io/gh/oleg-cherednik/GsonUtils)
[![Known Vulnerabilities](https://snyk.io/test/github/oleg-cherednik/GsonUtils/badge.svg?targetFile=build.gradle)](https://snyk.io/test/github/oleg-cherednik/GsonUtils?targetFile=build.gradle)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/ba0faab92b44432491376ee5d331a63e)](https://www.codacy.com/gh/oleg-cherednik/GsonUtils/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=oleg-cherednik/GsonUtils&amp;utm_campaign=Badge_Grade)     
# GsonUtils
> a java tool to make working with [Gson](https://github.com/google/gson) more comfortable

## Features
*   Encapsulate all checked exceptions from Gson with custom runtime exception;
*   A central place for configuration;
*   A central place for holding `Gson` instances;
*   Utility class to make most common operations much more comfortable to use;
*   Ability to change `Zone` to save `ZonedDateTime` independently of original zone;
*   `Reader`/`Writer` support for objects, lists and maps;
*   Lazy read support for list from `Writer`;
*   Read numeric as `Integer`, `Long`, `BigInteger` or `Double` (but not only as `Double`). 

## Gradle

```groovy
compile 'ru.oleg-cherednik.gson-utils:gson-utils:2.1'
```

## Maven

```xml
<dependency>
    <groupId>ru.oleg-cherednik.gson-utils</groupId>
    <artifactId>gson-utils</artifactId>
    <version>2.1</version>
</dependency>
```
