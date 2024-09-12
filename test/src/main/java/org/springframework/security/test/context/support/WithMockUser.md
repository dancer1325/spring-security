* \+ `WithSecurityContextTestExecutionListener`
  * emulate running a test -- with a -- mocked user
* to work with `MockMvc` -> `SecurityContext` must 
  * be created with `SecurityContextHolder.createEmptyContext()`
  * be populated with
    * `UsernamePasswordAuthenticationToken` / username is `value()` or `username()`
    * `GrantedAuthority` / `roles()` & `password()`
* TODO: