package com.project.restkafka.controller;

import com.project.restkafka.kafka.JsonKafkaProducer;
import com.project.restkafka.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/json/message")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/jsonPublish")
    public ResponseEntity<Person> jsonPublish(@RequestBody Person person){
        jsonKafkaProducer.sendMessage(person);

        return ResponseEntity.ok(person);
    }

}
