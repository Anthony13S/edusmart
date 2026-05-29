package com.edusmart.service;

import dev.langchain4j.service.UserMessage;

public interface EduSmartAIService {

    @UserMessage("Redacta una frase publicitaria de máximo 100 caracteres para vender un curso de {{tema}} dirigido a {{audiencia}}.")
    String generarPublicidad(String tema, String audiencia);

}