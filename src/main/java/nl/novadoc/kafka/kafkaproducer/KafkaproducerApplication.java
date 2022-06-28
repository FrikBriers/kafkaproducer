package nl.novadoc.kafka.kafkaproducer;

import nl.novadoc.kafka.kafkaproducer.service.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaproducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(KafkaproducerApplication.class, args);

	}

}
