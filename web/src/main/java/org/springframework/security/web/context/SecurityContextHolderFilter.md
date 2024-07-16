* := `jakarta.servlet.Filter` / 
  * allows
    * -- via `SecurityContextRepository` -- get the `SecurityContext`
    * set the `SecurityContext` -- via `SecurityContextRepository` -- | `SecurityContextHolder`
  * vs `SecurityContextPersistenceFilter`
    * more available auth mechanisms
      * **Reason:** 🧠 `SecurityContextPersistenceFilter` requires to save the `SecurityContext` EXPLICITLY -- via -- `.saveContext()`  🧠 