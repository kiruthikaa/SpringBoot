package io.kiru.springstarterboot.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	//Autowired - declares dependency so that it can be injected
	@Autowired
	private TopicService topicService;
    @RequestMapping("/topics")
	public List <Topic> getAllTopics()
	{
    	
		return topicService.getallTopics();
	}
    //to pass id value from URL dynamically from URL use {} and then use it as Path variable
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
    	return topicService.getTopic(id);
    }
    //to denote method to handle post request, and @RequestBody will take json and converts to Topic instance
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic )
    {
    	topicService.addTopic(topic);
    }
  //to denote method to handle put (update full) request, and @RequestBody will take json and converts to Topic instance
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void addTopic(@RequestBody Topic topic, @PathVariable String id )
    {
    	topicService.putTopic(topic , id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id )
    {
    	topicService.deleteTopic(id);
    }
}
