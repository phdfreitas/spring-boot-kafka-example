package com.project.restkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "kafkaExample", groupId = "myGroup")
    public void consume(String message){ // this method acts like a subscriber to the "kafkaExample" topic
        LOGGER.info(String.format("Message received: %s", message));

    }

}
