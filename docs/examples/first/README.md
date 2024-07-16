# Goal
* Simplest way to indicate a user is authenticated
  * == set directly
* Way to get current authenticated principal
* Order of `Filter` | `FilterChain` is important 
* Print the security filters list invoked / request
* Different ways to login

## How to run locally?
* `mvn springboot:run`
  * check the existing filters logged 

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
  * check by logs, the filters passed in order / request-specific
    * `DisableEncodeUrlFilter`
      * TODO: Why is it passed, although I have NOT specified ?
        * Attempt1: Check the constructor invoked
    * `WebAsyncManagerIntegrationFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `SecurityContextHolderFilter`
      * TODO: Why is it passed, although I have NOT specified ?
        * Attempt1: Set a break point | `SecurityContextHolderFilter()`  -- `AbstractSecurityBuilder.build()` is the first entryClass in springSecurity
        * Attempt2: `AbstractSecurityBuilder` used by ALL to guarantee uniqueness
    * `HeaderWriterFilter`
      * TODO: Why is it passed, although I have NOT specified ?
        * Attempt1: Set a break point | `HeaderWriterFilter()`  -- `AbstractSecurityBuilder.build()` is the first entryClass in springSecurity
    * `CorsFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `CsrfFilter`
      * -- specified via -- `http.csrf`
    * `LogoutFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `UsernamePasswordAuthenticationFilter`
      * TODO: How is it specified via `http.formLogin()`
    * `DefaultLoginPageGeneratingFilter`
    * `DefaultLogoutPageGeneratingFilter`
    * `BasicAuthenticationFilter`
      * -- specified via -- `http.httpBasic`
    * `RequestCacheAwareFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `SecurityContextHolderAwareRequestFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `AnonymousAuthenticationFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `ExceptionTranslationFilter`
      * TODO: Why is it passed, although I have NOT specified ?
    * `AuthorizationFilter`
      * -- specified via -- `http.authorizeHttpRequests`
* different ways to login
  * TODO: via 'logback.xml' NOT logged