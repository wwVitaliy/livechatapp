package com.wprojects.livechat.controller;

import com.wprojects.livechat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles all incoming messages from the frontend and broadcasts them to all the clients
 */
@Controller //marks the class as a web controller, enabling it to handle HTTP requests
//@RequestMapping("/tasks")
public class ChatController {

    //define a message routing path from client -> server -> all subscribers
    @MessageMapping("/sendMessage") // method handles messages sent to the endpoint
    @SendTo("/topic/messages")  //  broadcast return value to all subscribers of the endpoint
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";  // return thymeleaf template
    }

}
