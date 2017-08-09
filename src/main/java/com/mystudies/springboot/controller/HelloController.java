/**
 * 
 */
package com.mystudies.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pradeep
 *
 */
@RestController
public class HelloController {

	@RequestMapping ("/hello") //get mapping
	public String sayHello(){
		return "hello pradeep";
	}
}
