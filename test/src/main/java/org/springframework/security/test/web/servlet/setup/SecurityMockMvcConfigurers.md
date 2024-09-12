* provide
  * security -- related to -- `org.springframework.test.web.servlet.setup.MockMvcConfigurer`'s implementations
* `MockMvcConfigurer springSecurity() {}`
  * configure `MockMvcBuilder` -- for use with -- Spring Security
    * Spring Bean `springSecurityFilterChain` -- is configured as a -- Filter
    * `TestSecurityContextHolder` -- via applying `SecurityMockMvcRequestPostProcessors.testSecurityContext()` -- is leveraged / request
* `MockMvcConfigurer springSecurity(Filter){}`
  * configure `MockMvcBuilder` -- for use with -- Spring Security /
    * adds the `Filter`
  * `TestSecurityContextHolder` / request, is leveraged -- via -- applying `SecurityMockMvcRequestPostProcessors.testSecurityContext()`
* TODO: