package lk.inli.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lk.inli.springboot.model.Student;

@Service
public class KafkaSender {
	
	@Autowired
	private KafkaTemplate<String, Student> kafkaTemplate;
	
	String kafkaTopic = "springboot_kafka";
	
	public void send(String message) {
	    
	    kafkaTemplate.send(kafkaTopic, new Student(message, "0001", 20));
	}
}
