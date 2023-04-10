package com.aziz.notificationservice.consumers;

import com.aziz.orderservice.event.OrderPlacedEvent;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class OrderEventConsumer {
    private final ObjectMapper objectMapper;
    @KafkaListener(topics = "notification-topic")
    public void listen(OrderPlacedEvent orderPlacedEvent){
//        OrderPlacedEvent orderPojo = objectMapper.readValue(orderPlacedEvent, OrderPlacedEvent.class);
        log.info("The object is: {}", orderPlacedEvent);
        //TODO: Send an email
    }
}
