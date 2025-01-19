package com.aluralatam.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Archivo {
	public void guardarJson(List<String> lista) {
        try {
            FileWriter fileWriter = new FileWriter("data/registro.txt");
            for (String resultado : lista) {
                fileWriter.write(resultado);
                fileWriter.write("\n");
            }
            fileWriter.close();
            System.out.println("Se ha guardado satisfactoriamente en registro.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar el historial de consultas: " + e.getMessage());
        }
    }
}
