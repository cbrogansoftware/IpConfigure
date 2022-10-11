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
         To skip tests:
           mvn clean package -Dmaven.test.skip
         With tests:
           mvn clean package

    5. The executable jar will be placed in the default location:
         <path to project>\IpConfigure12\target
       Unless specified otherwise, it will be named:
         IpConfigure12-1.0-SNAPSHOT.jar

    6. Proceed to 'Execution Instructions' below.

Execution Instructions:

    Baseline
      cd <path to project>\IpConfigure12\target
      java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.Main

    1. Inheritance
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.inheritance.ShapeMain

    2. Generics
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.generics.Printer

    3. Object Comparison
        cd <path to project>\IpConfigure12\target
        java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.objectcomparison.CompareMain

    4. Unit Test and Mocking
        To run the tests :
          cd <path to project>\IpConfigure12
          mvn test

        If you get unexpected errors then you will need to rerun the following before proceeding to
        solution number 5 (GCD):
          cd <path to project>\IpConfigure12
          mvn clean package -Dmaven.test.skip

           SPECIAL NOTE:
             Because of the various versions of Mockito and JUnit available, there is some concern
             about differences between my execution environment and the evaluator's.  These tests
             did pass on both my IntelliJ and command line environments.  Therefore, if you find that
             these tests unexpectedly fail on yours then please reach out to me to discuss.  Thanks.

    5. Greatest Common Divisor
        Create 'pairs.txt' file in the following location on Windows:
          C:\tmp\pairs.txt

        Then run the following:
          cd <path to project>\IpConfigure12\target
          java -cp IpConfigure12-1.0-SNAPSHOT.jar org.cbrogansoftware.gcd.GcdMain

        Note:
          A pairs.txt example file is available in this project folder as a sibling of this README file.
          Create pairs.txt file in the following location on Windows. (Modify path as appropriate for other OS types.
          See GcdMain.java line 10.  If this is changed you will need to do a rebuild.  See above
          under 'Build Instructions'.