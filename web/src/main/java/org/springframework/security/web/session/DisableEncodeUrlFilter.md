* := class /
  * disable encode URLs / use `HttpServletResponse`
  * uses
    * prevent to include sessionId | URLs
      * **Reason:** 🧠 session is NOT part of a URL & avoid leaking in HTTP access logs 🧠	