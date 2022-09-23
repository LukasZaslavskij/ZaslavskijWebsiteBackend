package com.personalWebsite.ZaslavskijWebsite.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import com.personalWebsite.ZaslavskijWebsite.entity.Skill;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class kafkaConsumerConfig {

    @Autowired
    private kafkaSettings settings;

    @Value("${kafka.bootstrapAddress.sche}")
    private String KafkaAdress;
    @Bean
    public ConsumerFactory<String, Skill> consumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        props.put(ErrorHandlingDeserializer.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class);
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaAdress);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, settings.getGroupId());
       // props.put("spring.json.value.default.type",Skill.class);

        return new DefaultKafkaConsumerFactory<>(props,
                new StringDeserializer(),
                new ErrorHandlingDeserializer<Skill>(new JsonDeserializer<Skill>(Skill.class,new ObjectMapper())));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Skill> skillListenerFactory() {
            ConcurrentKafkaListenerContainerFactory<String, Skill> factory = new ConcurrentKafkaListenerContainerFactory<>();
            factory.setConsumerFactory(consumerFactory());
            return factory;
        }

    }

