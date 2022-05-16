## Security with OAuth2 client

steps that I did to create this application that use OAuth
as login method.

 1. Generate the project from Intellij or from Spring
    Initialzr (https://start.spring.io/) 
    with the next dependencies:

       - Spring Security
       - Spring Web
       - Spring Boot DevTools
       - OAuth2 Client
       - Thymeleaf

 2. Generate credentials OAuth in GitHub:
    1. login in your GitHub account or create one if you
     don't have.
       1. going to Settings-> Developer settings -> OAuth Apps
    2. Register or create a new application and fill in the fields
    3. copy the client ID and past into the application.properties
    4. copy the client secret and past into the application.properties
 3. Configure the "config" class 
 4. Create two html class 
 5. Create the controller class to call the html class
 6. Run the project and verify its running

## Conclusion

OAuth2 is to log in with GitHub, Google or Okta, but  
application not see the data