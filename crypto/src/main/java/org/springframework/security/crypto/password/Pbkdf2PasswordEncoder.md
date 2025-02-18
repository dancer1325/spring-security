* == `PasswordEncoder` implementation / uses `PBKDF2` +
  * `saltLength`
    * configurable random salt value length
    * `DEFAULT_SALT_LENGTH` bytes
  * `iterations`
    * configurable
    * `DEFAULT_ITERATIONS`
  * `algorithm`
    * key derivation function
    * see `SecretKeyFactoryAlgorithm`
  * `secret`
    * appended | random salt
    * by default, it's empty
* TODO: