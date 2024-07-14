package com.example.first;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {

		// Create an empty context
		SecurityContext context = SecurityContextHolder.createEmptyContext();
		Authentication authentication =
				new TestingAuthenticationToken("Alfred", "Bingo", "ROLE_USER");
		context.setAuthentication(authentication);		// NOT care the type of Authentication
		SecurityContextHolder.setContext(context);

		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping( "/current")
	public String getCurrentAuthenticatedPrincipal() {
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication authentication = context.getAuthentication();

		if (authentication == null) return "NOT authenticated";

 		String username = authentication.getName();
		Object principal = authentication.getPrincipal();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		return authorities.toString();
	}

}
