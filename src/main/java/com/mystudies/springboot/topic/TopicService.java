/**
 * 
 */
package com.mystudies.springboot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Pradeep
 *
 */
@Service
public class TopicService {

	private List<TopicPojo> topics = Arrays.asList(new TopicPojo(1, "Cloud solution", "Cloud solution architect"),
			new TopicPojo(2, "Spring Framework", "spring framework solution"),
			new TopicPojo(3, "Spring cloud", "spring cloud solution"));

	public List<TopicPojo> getAlltopics() {
		return topics;
	}

	public TopicPojo getTopic(long id) {
		/*TopicPojo topicsObj = null;
		for (TopicPojo topicPojo : topics) {
			long topicId = topicPojo.getId();
			if (topicId == id) {
				topicsObj = topicPojo;
				break;
			}

		}*/
		return topics.stream().filter(t -> t.getId() == id).findFirst().get();
	
		
		
		
	}
	
	
}
