package com.example.tabelafipe.service;

import java.util.List;

public interface IconverterDados {
    <T> T converterDados(String json, Class<T> clazz);

    <T> List<T> obterLista(String json, Class<T> clazz);
}
