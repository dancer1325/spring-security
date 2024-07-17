* == `<http>` | XML configuration
* allows
  * 👁️configuring web based security / specific HTTP requests 👁️
    * ⭐ by default, applied to ALL HTTP requests ⭐
    * ways to restrict affected HTTP requests
      * `.requestMatcher(RequestMatcher)`
* uses
  * form based configurations
* `.authorizeHttpRequests(Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> authorizeHttpRequestsCustomizer)`
  * allows
    * restricting access -- via `RequestMatcher` implementations -- upon `HttpServletRequest`
      * `RequestMatcher` implementations == URL patterns
* Tests
  * Check "HttpConfigurationTests.java"