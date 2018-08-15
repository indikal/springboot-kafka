package lk.inli.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lk.inli.springboot.model.Student;

@RestController
@RequestMapping(value = "/springboot-kafka/")
public class RestJsonController {
	@Autowired
	KafkaTemplate<String, Student> kafkaTemplate;
	private static final String TOPIC = "springboot_kafka";

	@GetMapping(value = "publish/{name}")
	public String producer(@PathVariable("name") String name) {
		kafkaTemplate.send(TOPIC, new Student(name, "CSES2018", 20));

		return "Json message sent to the Kafka Topic springboot_kafka_topic Successfully";
	}
}
