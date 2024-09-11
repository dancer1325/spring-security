* configures Spring Security -- via -- adding
  * `springSecurityFilterChain`
  * `SecurityMockMvcRequestPostProcessors.testSecurityContext()`
* `DelegateFilter`
  * allows
    * adding | `afterConfigurerAdded()` -> preserve Filter order &
    * lazily set the delegate | `beforeMockMvcCreated()`
  * DelegatingFilterProxy is NOT used
    * Reason: 🧠 NOT easy to lazily set the delegate or get the delegate / -- necessary for -- test infrastructure 🧠
* TODO: