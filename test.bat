@echo off
echo gradlew clean
call gradlew --warning-mode all clean
echo:
echo bb code extract without_duplicates
bb code extract without_duplicates
echo:
echo rm Tests\TestExamples.java
call rm Tests\TestExamples.java
echo:
echo gradlew GenerateTests
call gradlew --warning-mode all GenerateTests
echo:
echo gradlew test
call gradlew --warning-mode all test
copy buildjar.bat Examples\ObjectOrientedDesign
@rem if exist ./build/reports/tests/test/classes/TestExamples.html start ./build/reports/tests/test/classes/TestExamples.html
