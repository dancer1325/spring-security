* == implementation of `PasswordEncoder` /
  * uses the `BCrypt` strong hashing function 
  * 's properties
    * `BCryptVersion version`
      * == property / can be set
      * ALLOWED values
        * `2a`,
        * `2b`,
        * `2y`
    * `int strength`
      * by default, 10
      * ⚠️the higher -> MORE work to hash the passwords ⚠️
    * `SecureRandom secureRandom` 
* TODO:
 