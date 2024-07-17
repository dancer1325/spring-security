# Goal
* CORS
  * custom configuration
  * default / -- provided by -- Spring MVC

## How to run locally?
* `mvn spring-boot:run`
  * Problems:
    * Problem1: "corsConfigurationSource .. bean with that name has already been defined in class path"
      * Attempt1: `@Primary`, `@Order(value=1)`
      * Solution: `spring.main.allow-bean-definition-overriding=true`

## Notes
* Why `DefaultSecurityFilterChain` is used, and NOT the custom one ?
  * Solution: TODO:
  