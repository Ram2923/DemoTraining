set projectLocation=F:\TrainingDemo\Demo
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\libbat\*
java org.testng.TestNG %projectLocation%\testng.xml
pause