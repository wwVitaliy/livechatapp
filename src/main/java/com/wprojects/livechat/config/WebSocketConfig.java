package com.wprojects.livechat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration //indicating that a class is a source of bean definitions
// Classes annotated with @Configuration primarily contain methods annotated with @Bean.
// Each @Bean method returns an instance of a class that the Spring IoC (Inversion of Control) container will manage.
// The method name typically serves as the bean's ID/name.
@EnableWebSocketMessageBroker //enables WebSocket message handling
public class WebSocketConfig
    implements WebSocketMessageBrokerConfigurer
{
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")   // add endpoint
                .setAllowedOrigins("http://localhost:5173") // allow requests from the url only
                .withSockJS();  // allows clients to connect even if native WebSockets are unavailable
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // set message broker
        registry.enableSimpleBroker("/topic"); // clients can subscribe to /topic/* and receive broadcast messages
        registry.setApplicationDestinationPrefixes("/app"); // message sent to /app/* is handled by Spring controllers annotated with @MessageMapping
       }
}
