package com.edusmart.config;

import com.edusmart.service.EduSmartAIService;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static dev.langchain4j.service.AiServices.create;

@Configuration
public class AIConfig {

    @Bean
    public EduSmartAIService eduSmartAIService() {

        OpenAiChatModel model = OpenAiChatModel.builder()
                .apiKey("test")
                .modelName("gpt-3.5-turbo")
                .build();

        return create(EduSmartAIService.class, model);
    }
}