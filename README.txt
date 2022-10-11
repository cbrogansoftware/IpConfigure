IPConfigure Java Programming Evaluation
Author: Chris Brogan
Date: 10/10/2022

Maven Version:
    Apache Maven 3.8.1

JDK Version:
    openjdk version "1.8.0_342"
    OpenJDK Runtime Environment Corretto-8.342.07.3 (build 1.8.0_342-b07)
    OpenJDK 64-Bit Server VM Corretto-8.342.07.3 (build 25.342-b07, mixed mode)

Build Instructions:
    1. Extract zip file to desired file system location.

    2. Change directory into the project directory.
         cd <path to project>\IpConfigure12

    3. Note that the Maven pom.xml file is at the project directory level.

    4. Run the following command to create an executable jar to be used with the 'Execution Instructions':
       For ALL solutions EXCEPT for the Unit Test/Mocking use the following:
         mvn clean package -Dmaven.test.skip

    5. The executable jar will be placed in the default location:
         <path to project>\IpConfigure12\target
       Unless specified otherwise, it will be named (or similar):
         IpConfigure12-1.0-SNAPSHOT.jar

    6. Proceed to 'Execution Instructions' below.

Execution Instructions:

    Baseline - cd (if needed) and run command:
      cd <path to project>\IpConfigure12\target
      java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.Main

    1. Inheritance - cd (if needed) and run command:
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.inheritance.ShapeMain

    2. Generics
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.generics.Printer

    3. Object Comparison
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.objectcomparison.CompareMain

    4. Unit Test and Mocking
        You can try to build and run the tests on your machine from the command line with the following:
          cd <path to project>\IpConfigure12
          mvn clean package
        If you get errors then you will need to rerun the following before testing solution number 5 (GCD):
          cd <path to project>\IpConfigure12
          mvn clean package -Dmaven.test.skip

           SPECIAL NOTE:
            Junit and Mockito combination were problematic from the command line on my laptop.
            The solution to these problems were successfully tested from within IntelliJ with
            JUnit Jupiter 5.8.2 and Mockito 4.8.0 configured.  If you would like to see this demonstrated please
            let me know and I can share my screen and show you.  I was advised that in the interest of time it would
            be better to get this solution turned in rather than spend an unknown amount of time with this install/config issue.

    5. Greatest Common Divisor
        Create pairs.txt file in the following location on windows (modify path as appropriate on other OS types):
          C:\tmp\pairs.txt
        cd <path to project>\IpConfigure12\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.gcd.GcdMain