* == factory -- for -- MORE commonly used encryptors
  * define the public API / constructs
    * `BytesEncryptor` implementations
    * `TextEncryptor` implementations
* `BytesEncryptor stronger(CharSequence password, CharSequence salt) {}`
  * requirements
    * Java v6
  * `CharSequence password`
    * 👀-- used to generate the -- encryptor's secret key 👀
    * store | secure place
  * `CharSequence salt`
    * requirements
      * hex-encoded String form,
      * random,
      * length >= 8 bytes
    * -- used to generate the -- key
    * prevent dictionary attacks | key
  * 👀creates a standard password-based bytes encryptor -- via -- 256 bit AES Galois Counter Mode (GCM) encryption 👀
    * -- applies a -- random 16-byte initialization vector 
      * Reason: 🧠ensure EACH encrypted message is unique 🧠
  * 👀secret key -- is got, via -- PKCS #5's PBKDF2 👀
    * PBKDF2 == Password-Based Key Derivation Function #2
* `BytesEncryptor standard(CharSequence password, CharSequence salt) {}`
  * requirements
    * Java v6
  * `CharSequence password`
    * 👀-- used to generate the -- encryptor's secret key 👀
  * `CharSequence salt`
    * requirements
      * hex-encoded String form,
      * random
      * length >= 8 bytes
    * -- used to generate the -- key
    * prevent dictionary attacks | key
  * 👀creates a standard password-based bytes encryptor -- via -- 256 bit AES encryption Cipher Block Chaining (CBC) Mode 👀
    * -- applies a -- random 16-byte initialization vector 
      * Reason: 🧠ensure EACH encrypted message is unique 🧠
  * 👀secret key -- is got, via -- PKCS #5's PBKDF2 👀
    * PBKDF2 == Password-Based Key Derivation Function #2
  * ❌NOT
    * [authenticated](https://en.wikipedia.org/wiki/Authenticated_encryption)
    * provide guarantees -- about the -- authenticity of the data ❌
* TODO:
* `TextEncryptor text(CharSequence password, CharSequence salt) {}`
  * `CharSequence password`
    * 👀-- used to generate the -- encryptor's secret key 👀
  * creates a text encryptor / 
    * -- uses -- "standard" password-based encryption 
    * encrypted text is hex-encoded
      * Reason: 🧠easy storage 🧠
* TODO: