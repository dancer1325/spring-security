/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.config.annotation.web.configurers.oauth2.client;

import org.junit.jupiter.api.Test;

import org.springframework.mock.web.MockHttpServletRequest;

import static org.assertj.core.api.Assertions.assertThat;

public class OidcBackChannelLogoutHandlerTests {

	// gh-14553
	@Test
	public void computeLogoutEndpointWhenDifferentHostnameThenLocalhost() {
		OidcBackChannelLogoutHandler logoutHandler = new OidcBackChannelLogoutHandler();
		MockHttpServletRequest request = new MockHttpServletRequest("GET", "/back-channel/logout");
		request.setServerName("host.docker.internal");
		request.setServerPort(8090);
		String endpoint = logoutHandler.computeLogoutEndpoint(request);
		assertThat(endpoint).isEqualTo("http://localhost:8090/logout");
	}

	@Test
	public void computeLogoutEndpointWhenUsingBaseUrlTemplateThenServerName() {
		OidcBackChannelLogoutHandler logoutHandler = new OidcBackChannelLogoutHandler();
		logoutHandler.setLogoutUri("{baseUrl}/logout");
		MockHttpServletRequest request = new MockHttpServletRequest("GET", "/back-channel/logout");
		request.setServerName("host.docker.internal");
		request.setServerPort(8090);
		String endpoint = logoutHandler.computeLogoutEndpoint(request);
		assertThat(endpoint).isEqualTo("http://host.docker.internal:8090/logout");
	}

	// gh-14609
	@Test
	public void computeLogoutEndpointWhenLogoutUriThenUses() {
		OidcBackChannelLogoutHandler logoutHandler = new OidcBackChannelLogoutHandler();
		logoutHandler.setLogoutUri("http://localhost:8090/logout");
		MockHttpServletRequest request = new MockHttpServletRequest("GET", "/back-channel/logout");
		request.setScheme("https");
		request.setServerName("server-one.com");
		request.setServerPort(80);
		String endpoint = logoutHandler.computeLogoutEndpoint(request);
		assertThat(endpoint).isEqualTo("http://localhost:8090/logout");
	}

}
