package com.personalWebsite.ZaslavskijWebsite.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    public NewTopic skillTopic (){

        return TopicBuilder.name("skill")
                .build();
    }
}
