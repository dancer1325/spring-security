# `FilterChainProxy`
* contains
  * SecurityFilters
  * `SecurityFilterChain` API

---

# `SecurityFilterChain`
* := interface which
* uses
  * `FilterChainProxy` used it — to determine — `Filter` instance to be invoked / current request
        
---

# SecurityFilters
## == `Filters` which
* are executed in specific order
  *  ⚠️≠ from top to bottom ⚠️
  * Typically it’s NOT necessary to know the order
    * `FilterOrderRegistration`
      * allows
        * getting the order
* _Examples:_
  * Cross Site Request Forgery (CSRF)
  * `UsernamePasswordAuthenticationFilter`
  * `BasicAuthenticationFilter`
  * `AuthorizationFilter`
* are printed at startup on the application
## uses
* inserted into `FilterChainProxy`
  * Authentication
  * Authorization
  * Protection against exploits
            
---

# Logging
* most is printed at           -- Trigger a request in 'servlet/spring-boot/java/authentication/username-password/mfa' --
  * DEBUG
  * TRACE
️* Spring Security does NOT add any detail in the response body 
* ways to configure it         -- 'servlet/spring-boot/java/authentication/username-password/mfa' --
  * in Spring Boot -> `logging.level.org.springframework.security=TRACE` 
  * via logback.xml

---
# Note
* All the examples are under  'spring-security-samples' repo