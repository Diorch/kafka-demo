package com.mykafkademo.kafkademo.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static com.mykafkademo.kafkademo.Consts.KAFKA_TOPIC;

@Service
public class KafkaSender implements ApplicationContextAware {

	@Autowired
	private ApplicationContext ctx;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	

	
	public void send(String message) {
	    
	    kafkaTemplate.send(KAFKA_TOPIC, message);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
}