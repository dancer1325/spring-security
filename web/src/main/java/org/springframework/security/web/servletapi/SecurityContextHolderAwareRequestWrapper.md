* == Spring Security-aware `HttpServletRequestWrapper` / 
  * -- via SecurityContext-defined Authentication object, implement -- servlet API security methods
    * `getUserPrincipal()`
    * `SecurityContextHolderAwareRequestWrapper.isUserInRole(String)`
    * `HttpServletRequestWrapper.getRemoteUser()`