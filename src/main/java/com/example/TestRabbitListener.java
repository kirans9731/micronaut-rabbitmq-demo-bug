package com.example;

import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;

import javax.inject.Singleton;

@Singleton
@RabbitListener(connection = "one")
public class TestRabbitListener {

    @Queue("test")
    public void receive(byte[] bytes) {

    }
}
