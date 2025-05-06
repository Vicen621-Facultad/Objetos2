package io.github.vicen621;

import io.github.vicen621.builder.DisplayStrategyBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileOO2Test {
    private FileOO2 file;
    private DisplayStrategyBuilder displayStrategyBuilder;
    
    @BeforeEach
    public void setup() {
        file = new FileOO2("test", "txt", "rwxr-xr-x");
        displayStrategyBuilder = DisplayStrategyBuilder.getInstance();
    }

    @Test
    public void test_without_strategy() {
        assertEquals("", file.prettyPrint());
    }

    @Test
    public void test_nombre_extension() {
        file.setStrategy(displayStrategyBuilder.addExtension().addNombre().getResult());
        assertEquals(file.getNombre() + " - " + file.getExtension(),file.prettyPrint());
    }

    @Test
    public void test_nombre_creacion_extension() {
        file.setStrategy(displayStrategyBuilder.addExtension().addCreacion().addNombre().getResult());
        assertEquals(file.getNombre() + " - " + file.getCreacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - " + file.getExtension(),file.prettyPrint());
    }

    @Test
    public void test_nombre_tamanio_permisos_extension() {
        file.setStrategy(displayStrategyBuilder.addExtension().addPermisos().addTamanio().addNombre().getResult());
        assertEquals(file.getNombre() + " - " + file.getTamanio() + " - " + file.getPermisos() + " - " + file.getExtension(),file.prettyPrint());
    }
}
