package com.example.tabelafipe.service;

import org.springframework.boot.json.JsonParseException;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ConverterDados implements IconverterDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T converterDados(String json, Class<T> clazz) throws IOException {
        try {
            return mapper.readValue(json, clazz);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }
}
