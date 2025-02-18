* == factory -- for -- MORE commonly key generators
  * define the Public API / constructs
    * `BytesKeyGenerator`
    * `StringKeyGenerator`
* `BytesKeyGenerator secureRandom(){}`
  * create a `BytesKeyGenerator` / -- via `SecureRandom`, generate -- keys / 's length=8
* `BytesKeyGenerator secureRandom(int keyLength){}`
  * create a `BytesKeyGenerator` / -- via `SecureRandom`, generate -- keys / 's custom length
  * `int keyLength`
    * key length | bytes
* `BytesKeyGenerator shared(int keyLength){}`
  * create a `BytesKeyGenerator` / -- via `SecureRandom`, generate -- 1! key / 
    * 's custom length
    * shared
  * `int keyLength`
    * key length | bytes 
* `StringKeyGenerator string(){}`
  * creates a `StringKeyGenerator` / -- via hex-encodes `SecureRandom` keys of 8 bytes, generate -- keys /
    * hex-encoded
    * 's length = `keyLength` * 2 characters in length
  