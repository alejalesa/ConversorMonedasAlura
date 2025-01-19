package com.aluralatam.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import com.aluralatam.model.*;
import com.google.gson.JsonSyntaxException;

public class Controlador {

	public void run() {

		Scanner lectura = new Scanner(System.in);
		int index = 0;
		Consulta consulta = new Consulta();
		Calculos calculos = new Calculos(consulta);
		Archivo archivo = new Archivo();
		List<String> respuestas = new ArrayList<>();

		String menu = """
				\n***************************************************
				*** Sea bienvenido al Conversor de Monedas ***

				1) Peso Colombiano ==>> Dólar Estadounidense
				2) Peso Colombiano ==>> Euro
				3) Peso Colombiano ==>> Libra Esterlina
				4) Dólar Estadounidense ==>> Peso Colombiano
				5) Euro ==>> Peso Colombiano
				6) Libra Esterlina ==>> Peso Colombiano

				7) Otra opción de conversión

				8) Salir
				***************************************************
				""";

		while (index != 8) {
			try {
				System.out.println(menu);
				index = Integer.parseInt(lectura.nextLine());

				LocalDateTime myDateObj = LocalDateTime.now();
				DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
				String formattedDate = myDateObj.format(myFormatObj);

				switch (index) {
				case 1:
					calculos.almacenarValores("COP", "USD");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 2:
					calculos.almacenarValores("COP", "EUR");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 3:
					calculos.almacenarValores("COP", "GBP");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 4:
					calculos.almacenarValores("USD", "COP");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 5:
					calculos.almacenarValores("EUR", "COP");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 6:
					calculos.almacenarValores("GBP", "COP");
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 7:
					calculos.almacenarValoresPersonalizados();
					respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
					break;
				case 8:
					break;
				default:
					System.out.println("Ingrese una opción válida");
				}
			} catch (JsonSyntaxException | NullPointerException e) {
				System.out.println("Error. Ingrese solo códigos de moneda válidos.");
			} catch (NumberFormatException | InputMismatchException e) {
				System.out.println("Error. Ingrese un valor numérico válido.");
			}
		}
		archivo.guardarJson(respuestas);

		System.out.println("Finalizando programa");
	}
}