package io.kiru.springstarterboot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
 List <Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Boot", "Spring Boot Tutorial"),
			new Topic("Core Java", "Jave SE 11", "Jave SE 11 Tutorial"),
			new Topic("Python", "Python", "Python Tutorial")
			));
 public List <Topic> getallTopics()
 {
	 return topics;
 }
 
 public Topic getTopic(String id)
 {
	 for( Topic t : topics) {
		if(t.getId().compareTo(id)==0)
			return t;
	 }
	 return null; 
 }
 public void addTopic(Topic topic)
 {
	 topics.add(topic);
}

public void putTopic(Topic topic, String id) {
	 for( int i =0;i< topics.size();i++) {
		    Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
	 }
	
}

public void deleteTopic(String id) {
	for( int i =0;i< topics.size();i++) {
	    Topic t = topics.get(i);
		if(t.getId().equals(id))
		{
			topics.remove(i);
			return;
		}
 }

	
}
}
