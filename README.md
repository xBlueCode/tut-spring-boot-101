# How to develop the First Spring Boot Application?
This is a simple “Hello World!” web application based on Spring Boot including some of its key features. Maven is used to build the project.

**NB.** There is some additional comments to explain some parts of the code but it is still not a complete guide, nevertheless you can visit the links below for more detailed information and a comprehensive documentation of **Spring Boot Project**.

**Spring Boot verison**: 2.0.1.RELEASE
**Maven version:** 3.5.2
**Java version:** JDK 1.8.0_162

___
##  Requirments
 - **Java SDK v1.8** or higher (Verify with terminal: `$ java -version`).
 - **Apache Maven 3.2** or higher (Verify with CLI: `$ mvn -v`) (or **Gradle 4**).
## Tools
 - Spring Boot CLI (Installed via SDKMAN / OSX Homebrew).
## Steps
1. Creating **pom.xml** for maven with the provided configuration (`spring-boot-starter-parent`).
2. Adding Classpath Dependencies to **pom.xml** file.
3. Writing the code of the Class annotated by @RestController (project-dir: **src/main/java/FirstClass.java**)
    - Enable autoconfiguration (`@EnableAutoConfiguration`).
    - Add RequestMapping (`@RequestMapping`).
    - Implement `main` Method.
4. Running the project
     - Run the Application (project-dir: `$ mvn spring-boot:run`).
     - Verify by visiting [http://localhost-8080.com/](http://localhost-8080.com/) (it is supposed to show "Hello World! From My First Spring Boot App"`).
5. Creating the Executable **jar** file
    - Add the `spring-boot-maven-plugin` to the **pom.xml** file.
    - Build the jar: (project-dir: `$ mvn package`)
6. Runing the application using the jar file
    - Run the Application (project-dir: `$ java -jar target/springbootstarter-0.0.1-SNAPSHOT.jar`)
    - Verify by visiting [http://localhost-8080.com/](http://localhost-8080.com/) (it is supposed to show "Hello World! From My First Spring Boot App"`).
---
## Useful Links
 - [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
 - [Spring Framework Documentation](https://docs.spring.io/spring/docs/current/spring-framework-reference/)
 - [The Software Development Kit Manager](http://sdkman.io/)
 - [Apache Maven](https://maven.apache.org/)
---
Thanks for visiting my Repo. `Enjoy Blue Coding !`