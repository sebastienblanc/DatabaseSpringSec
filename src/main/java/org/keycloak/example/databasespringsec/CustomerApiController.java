/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.keycloak.example.databasespringsec;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:9000")
//@CacheControl(policy = CachePolicy.NO_CACHE)
public class CustomerApiController {

	private static final Logger log = LoggerFactory.getLogger(CustomerApiController.class);

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getCustomers() {

		log.info("Returning customer list.");

		return Arrays.asList("Scott Rossillo", "Kyung Lee", "Keith Leggins", "Ben Loy");
	}
}