package io.github.vicen621.ejercicio1.exporters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.vicen621.ejercicio1.Socio;

import java.util.List;

public class JacksonExporter {

    public String exportar(List<Socio> socios) {
        try {
            return new ObjectMapper().writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
