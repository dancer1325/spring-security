* == `MockMvc` `RequestPostProcessor` implementations -- for -- Spring Security
* TODO:
* `RequestPostProcessor httpBasic(){}`
  * == mechanism /
    * perform necessary Base64 encoding
    * set the Authorization header = HTTP Basic
* `class HttpBasicRequestPostProcessor implements RequestPostProcessor{}`
  * == `httpBasic(){}` / applied | `MockHttpServletRequest`
* `UserRequestPostProcessor user(String){}`
  * create an instance of `UserRequestPostProcessor`
  * requirements
    * user -- must be associated to the -- `HttpServletRequest`
      * ways
        * invoke `SecurityMockMvcConfigurers.springSecurity()`
        * add Spring Security's `FilterChainProxy` | `MockMvc`
        * manually adding `SecurityContextPersistenceFilter` | `MockMvc` instance
* `class UserRequestPostProcessor extends SecurityContextRequestPostProcessorSupport`
  * create `UsernamePasswordAuthenticationToken` / principal is `User` / -- is associated to -- `MockHttpServletRequest`
* TODO: