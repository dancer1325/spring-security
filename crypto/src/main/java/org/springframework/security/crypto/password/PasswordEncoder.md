* == interface -- for -- encoding passwords
  * `BCryptPasswordEncoder`
    * recommended implementation
* `boolean matches(CharSequence rawPassword, String encodedPassword);`
  * `CharSequence rawPassword`
    * -- to -- encode & match
  * `String encodedPassword`
    * stored | storage
      * -- to -- compare
      * NEVER decoded
  * if `rawPassword` encoded == `encodedPassword` -> returns `true` 
  * use cases
    * | password-based authentication schemes
* TODO: