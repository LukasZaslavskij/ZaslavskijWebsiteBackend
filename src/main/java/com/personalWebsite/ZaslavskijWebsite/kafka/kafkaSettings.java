package com.personalWebsite.ZaslavskijWebsite.kafka;

import lombok.Getter;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;

@Getter
@Configuration
public class kafkaSettings {

    @Autowired
    KafkaTemplate kafkaTemplate;

    // Group ID
    private @Value("${kafka.group_id}")  String groupId;

    // Topics
   // private @Value("${kafka.topic.skill}")  String skillTopic;


    //SendJson
    public ResponseEntity<String> sendJson(String topic, String json) {
        try {
            ProducerRecord<String, String> rec = new ProducerRecord<>(topic, json);
            kafkaTemplate.send(rec);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed with exception: " + e.getMessage());
        }
        return ResponseEntity.ok("Message successfully sent to queue");
    }
}
