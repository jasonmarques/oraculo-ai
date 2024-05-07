package com.oraculo.ai.oraculoai.controllers;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("oraculo")
public class OraculoController {
    
    private OpenAiChatClient chatClient;

    public OraculoController(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

     @GetMapping("question")
    public String oraculoChat(@RequestBody String message) {
        return chatClient.call(message);
    }
}