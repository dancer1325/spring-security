* Once you add Spring Security on the application’s classpath & you run it → print the generated password --  '/servlet/springBoot/java/hello-security' --
* If you try to hit an endpoint -- '/servlet/springBoot/java/hello-security' --
  * without credentials → you get a HTTP 401
    * if you hit from browser → redirect to a default login page
  * with the `user:PasswordPrintInConsole` → you get HTTP 200
* @Spring Boot + @Spring Security  enables by default at runtime
  * authenticated user / any endpoint    -- '/servlet/springBoot/java/hello-security' --
    * also for Spring Boot’s /error endpoint
  * registers a default user with a generated password  -- '/servlet/springBoot/java/hello-security' --
    * password is printed in the console at startup
  * protects the password storage -- TODO: Where to find ? --

# Note:
* Check 'spring-security-samples' repo, under the project
  * '/servlet/springBoot/java/hello'
  * '/servlet/springBoot/java/hello-security'