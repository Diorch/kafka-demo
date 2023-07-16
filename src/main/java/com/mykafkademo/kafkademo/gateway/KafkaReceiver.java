package com.mykafkademo.kafkademo.gateway;

import com.mykafkademo.kafkademo.Consts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author diorch
 */


@Component
public class KafkaReceiver {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(topics = "java_in_use_topic", groupId = "foo")
    public void listenGroupFoo(String message) {
        LOGGER.warn("Received Message in group foo: {}" , message);
    }
}
