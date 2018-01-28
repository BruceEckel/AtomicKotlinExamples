@echo off
echo gradlew clean
call gradlew clean
echo:
echo bb code extract
bb code extract
echo:
echo rm Tests\TestExamples.java
call rm Tests\TestExamples.java
echo:
echo gradlew GenerateTests
call gradlew GenerateTests
echo:
echo gradlew test
call gradlew test
