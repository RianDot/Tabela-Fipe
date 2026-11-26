package com.example.tabelafipe.service;

import org.springframework.boot.json.JsonParseException;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.type.CollectionType;

import java.util.List;

public class ConverterDados implements IconverterDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T converterDados(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) {
        CollectionType lista = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);

      try {
          return mapper.readValue(json, lista);
      } catch (JsonParseException e) {
          throw new RuntimeException(e);
      }
    }
}
