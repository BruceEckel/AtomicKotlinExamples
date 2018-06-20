#!/usr/bin/env bash
echo gradlew clean
./gradlew clean
echo bb code extract
bb code extract without_duplicates
echo rm Tests/TestExamples.java
rm Tests/TestExamples.java
echo gradlew GenerateTests
./gradlew GenerateTests
echo gradlew test
./gradlew test
