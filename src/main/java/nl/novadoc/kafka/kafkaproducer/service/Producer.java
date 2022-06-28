package nl.novadoc.kafka.kafkaproducer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Producer {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String payload) {
        log.info("sending payload='{}' to topic='{}'", payload, "TEST_TOPIC");
        kafkaTemplate.send("TEST_TOPIC", payload);
    }

}