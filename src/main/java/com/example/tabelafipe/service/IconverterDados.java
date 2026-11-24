package com.example.tabelafipe.service;

import java.io.IOException;

public interface IconverterDados {
    <T> T converterDados(String json, Class<T> clazz) throws IOException;
}
