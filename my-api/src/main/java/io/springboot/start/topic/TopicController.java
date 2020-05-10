package io.springboot.start.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired  //to declare dependency
	private TopicService topicService;
	
	@RequestMapping("/topics")       //get method
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{foo}")          // {any name} want to say this is a variable
	public Topic getTopic(@PathVariable("foo") String id) {     //Path variable used to pass that variable of url as a id in this method
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")         //post call we will not have any url but have method
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")         //put call to updatde we will not have any url but have method
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")          //{any name} want to say this is a variable // delete call
	public void deleteTopic(@PathVariable() String id) {     //Path variable used to pass that variable of url as a id in this method
		topicService.deleteTopic(id);
	}
}
