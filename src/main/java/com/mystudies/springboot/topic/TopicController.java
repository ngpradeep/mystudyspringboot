/**
 * 
 */
package com.mystudies.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pradeep
 *
 */
@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")

	public List<TopicPojo> getAlltopics() {

		return topicService.getAlltopics();

	}
	@RequestMapping ("/topics/{id}")
	public TopicPojo getTopics(@PathVariable long id){
		
		return topicService.getTopic(id);
	}
}
