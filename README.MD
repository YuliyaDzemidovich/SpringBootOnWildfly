### Example of Spring Boot 3 project running on WildFly 28.

### Required:
1. JDK 17
2. Maven 3.8.1 or any other compatible version.

### How to run

1. Download and run WildFly server:  
1.1 [Wildfly download page](https://www.wildfly.org/downloads/) - in this example Wildfly 28.0.1 is used  
1.2 (optional) add user for wildfly admin panel:  
in the {wildfly_path}/bin/ run  
    ```
    ./add-user.sh -m -u administrator1 -p password1!
    ```
    1.3 Start wildfly server:  
    ```
    ./standalone.sh
    ```  
2. Build and deploy the spring boot app:  
2.1 Run maven command  
    ```
    mvn clean install wildfly:deploy
    ```
    2.2 (optional) check that `jboss-deployment-structure.xml` is present in the war `META-INF` folder.  
3. Call get endpoint - you should see 200 OK and the response string:  
```
http://localhost:8080/springonwildfly/hello
```
