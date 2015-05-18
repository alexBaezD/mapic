@echo off
REM Please adjust the paths JFLEX_HOME and JAVA_HOME to suit your needs
REM (please do not add a trailing backslash)

set JFLEX_HOME=C:\Jflex

REM only needed for JDK 1.1.x:
set JAVA_HOME=c:\j2sdk1.4.0_02\bin

set CLASSPATH=C:\Jflex\lib\JFlex.jar

REM ------------------------------------------------------------------- 

set CLASSPATH=%JAVA_HOME%\lib\classes.zip;%JFLEX_HOME%\lib\JFlex.jar

REM for JDK 1.1.x
rem %JAVA_HOME%\bin\java -classpath %CLASSPATH% JFlex.Main %1 %2 %3 %4 %5 %6 %7 %8 %9

REM for JDK 1.2
java -Xmx128m -jar %JFLEX_HOME%\lib\JFlex.jar %1 %2 %3 %4 %5 %6 %7 %8 %9






