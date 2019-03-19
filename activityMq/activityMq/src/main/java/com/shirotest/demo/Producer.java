package com.shirotest.demo;

import net.sf.json.JSONObject;
import net.sf.json.JSONString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

@Component
@EnableScheduling
public class Producer {
    @Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	/*@Autowired
	private Queue queue;*/
	@Autowired
    private Topic topic;


	/*@Scheduled(fixedDelay = 5000)
	public void send() {
		System.out.println("-----------------------");
		User user = new User();
		user.setName("张三");
		user.setPassword("amdin");
        JSONObject jsonObject = JSONObject.fromObject(user);

        jmsMessagingTemplate.convertAndSend(queue,jsonObject.toString());
	}*/

	@Scheduled(fixedDelay = 5000)
	public void send1() {
		System.out.println("-----------------------");
		User user = new User();
		user.setName("张三");
		user.setPassword("amdin");
        JSONObject jsonObject = JSONObject.fromObject(user);

//        jmsMessagingTemplate.convertAndSend(topic,jsonObject.toString());
        jmsMessagingTemplate.convertAndSend(topic,user);
	}






}
