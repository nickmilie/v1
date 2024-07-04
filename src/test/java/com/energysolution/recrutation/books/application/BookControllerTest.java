package com.energysolution.recrutation.books.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerTest {

    @Autowired
    MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    void should_return_status_200() throws Exception {

        String json = "{\"title\":\"title\",\"author\":\"author\",\"isbn\":\"9780521705266\",\"publicationDate\":\"01-01-1900 00:00:00\"}";
        this.mockMvc.perform(post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(content().json(json));
    }

    @Test
    void should_return_status_400() throws Exception {

        String json = "{\"title\":\"title\",\"author\":\"author\",\"isbn\":\"1\",\"publicationDate\":\"01-01-1900 00:00:00\"}";
        this.mockMvc.perform(post("/books")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isBadRequest())
                .andExpect(content().json("{\"error\":\"Incorrect ISBN format\"}"));
    }
}
