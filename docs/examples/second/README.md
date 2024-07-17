# Goal
* CORS
  * custom configuration
  * default / -- provided by -- Spring MVC
* HttpSecurity

## How to run locally?
* `mvn spring-boot:run`
  * Problems:
    * Problem1: "corsConfigurationSource .. bean with that name has already been defined in class path"
      * Attempt1: `@Primary`, `@Order(value=1)`
      * Solution: `spring.main.allow-bean-definition-overriding=true`

## How to trigger requests?
* HttpSecurity
  * you are redirected to "/login" & you need to pass "user:password"

## Notes
* Why `DefaultSecurityFilterChain` is used, and NOT the custom one ?
  * Solution: Just override some security filters, but NOT the securityFilterChain
* "SecurityConfig"
  * provide several cases
    * -> comment or uncomment -- based on -- your desired case to test
  