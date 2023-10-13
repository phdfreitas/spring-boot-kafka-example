package com.project.restkafka.kafka;

import com.project.restkafka.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "kafkaExampleJson", groupId = "myGroup")
    public void consume(Person person){ // this method acts like a subscriber to the "kafkaExample" topic
        LOGGER.info(String.format("Message/Person received: %s", person));

    }

}
