package io.github.vicen621.ejercicio1;

import io.github.vicen621.ejercicio1.exporters.JacksonExporter;
import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.Collections;

public class JacksonExporterTest {
    private JacksonExporter exporter;

    @BeforeEach
    public void setUp() {
        exporter = new JacksonExporter();
    }

    @Test
    public void testExportarVacio() throws JSONException {
        JSONAssert.assertEquals("[]", exporter.exportar(Collections.emptyList()), true);
    }

    @Test
    public void testExportarConSocios() throws JSONException {
        JSONAssert.assertEquals(
                "[{\"nombre\": \"Arya Stark\",\"email\": \"needle@stark.com\",\"legajo\": \"5234-5\"}]",
                exporter.exportar(Collections.singletonList(new Socio("Arya Stark", "needle@stark.com", "5234-5"))),
                true
        );
    }
}
