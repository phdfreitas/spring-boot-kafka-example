package com.project.restkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaExampleProject(){
        return TopicBuilder.name("kafkaExample")
                .build();
    }

    @Bean
    public NewTopic kafkaExampleProjectJson(){
        return TopicBuilder.name("kafkaExampleJson")
                .build();
    }

}
