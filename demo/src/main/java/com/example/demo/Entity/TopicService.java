package com.example.demo.Entity;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(
			
			new Topic("java","java core","java description"),
			new Topic("javascrpit","javascrip core","javascript description")));
	
	public List<Topic> getAllTopic(){
		  return topics;
		
	}
	
	

}
