* == class / implements OpenBSD-style Blowfish password hashing
  * -- via -- scheme described | ["A Future-Adaptable Password Scheme"](https://www.researchgate.net/publication/2519476_A_Future-Adaptable_Password_Scheme)
  * == password hashing system / avoid cracking off-line passwords -- via -- computationally-intensive hashing algorithm /
    * -- based on -- Bruce Schneier's Blowfish cipher
  * algorithm's work factor == parameterised ->
    * as computers get faster -> it can be increased 
* How to use?
  * | first time, hash a password
  * invoke `.hashpw(*, randomSalt)`
    * _Example:_ 
      ```
      String pw_hash = BCrypt.hashpw(plain_password, BCrypt.gensalt());
      ```
* How to check whether a plaintext password == one / hashed PREVIOUSLY?
  * invoke `.checkpw()`
    * _Example:_
      ```
      if (BCrypt.checkpw(candidate_password, stored_hash))<br />
        System.out.println("It matches");
      else
        System.out.println("It does not match");
      ```
* `gensalt(log_rounds, *)`
  * `log_rounds`
    * -- determines the -- hashing's computational complexity
    * by default, 10
    * ALLOWED [4,31]
  * amount of work == `2**log_rounds`
  * _Example:_ 
    ```
    String strong_salt = BCrypt.gensalt(10);
    String stronger_salt = BCrypt.gensalt(12)
    ```
* TODO: