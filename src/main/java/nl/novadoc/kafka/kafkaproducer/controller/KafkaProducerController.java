package nl.novadoc.kafka.kafkaproducer.controller;

import nl.novadoc.kafka.kafkaproducer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/novadockafka/producer")
public class KafkaProducerController {

    @Autowired
    Producer producer;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody String message) {
        producer.send(message);
    }
}
