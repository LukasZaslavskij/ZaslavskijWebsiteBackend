package com.personalWebsite.ZaslavskijWebsite.kafka;

import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;


import static org.springframework.kafka.support.KafkaHeaders.CORRELATION_ID;


@Component
@Slf4j
@Transactional
public class skillMDB {
    @KafkaListener(topics = "skill", groupId = "${kafka.group_id}", containerFactory = "skillListenerFactory", autoStartup = "${kafka.enabled:true}")
    public void listener(Skill data) {
        log.info("Received message, skill is {}",  data);

        if (data == null) {
            log.error("Invalid input data");
            return;
        }

    }
}

