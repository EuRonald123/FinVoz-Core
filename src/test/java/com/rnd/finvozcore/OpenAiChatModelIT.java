package com.rnd.finvozcore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENROUTER_API_KEY", matches = ".*")

public class OpenAiChatModelIT {
    @Autowired
    OpenAiChatModel model;

    @Test
    void should_receiveResponse_when_chatModelIsCalled() {
        String response = model.call("em português, me diga qual seu modelo de linguagem e qual a temperatura que você está usando para gerar as respostas");
        System.out.println("****** RESPONSE FROM OPENAI MODEL ******");
        System.out.println(response);
    }
}
