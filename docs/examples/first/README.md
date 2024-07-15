# Goal
* Simplest way to indicate a user is authenticated
  * == set directly
* Way to get current authenticated principal
* Order of `Filter` | `FilterChain` is important -- TODO: Implement --

## How to run locally?
* `mvn springboot:run`

## Notes
* How to check?
  * set a break point in `SpringApplication.run()`
  * start in debug mode the spring boot application
  * check the context contains an authenticated user
* `SecurityContextHolder.createEmptyContext()` vs `SecurityContextHolder.getContext().setAuthentication(authentication)`
  * `SecurityContextHolder.createEmptyContext()`
    * creates a new instance
    * ⚠️recommended to use ⚠️
      * Reason: 🧠avoid racing conditions -- across -- multiple threads 🧠
* `TestingAuthenticationToken`
  * very simple Authentication
* "sampleRequest.http"
  * sample requests