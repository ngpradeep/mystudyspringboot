/**
 * 
 */
package com.mystudies.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mystudies.springboot.pojo.TopicPojo;

/**
 * @author Pradeep
 *
 */
@RestController
public class TopicController {

	@RequestMapping ("/topics")
	
	public List<TopicPojo> getAlltopics(){
		return Arrays.asList(
				new TopicPojo(1,"Cloud solution","Cloud solution architect"),
				new TopicPojo(2,"Spring Framework","spring framework solution"),
				new TopicPojo(1,"Spring cloud","spring cloud solution"));
				
	}
}
