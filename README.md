# ConversorMonedasAlura
Conversor de Monedas

Este proyecto es una aplicación en Java que permite convertir monedas utilizando una API de tipo de cambio. Es una herramienta interactiva que soporta diferentes conversiones entre monedas comunes y permite configuraciones personalizadas.

Características

Conversión rápida entre monedas comunes (MXN a USD, EUR, GBP, entre otros).

Configuración personalizada para cualquier moneda utilizando códigos ISO de tres letras.

Registro de todas las conversiones realizadas, almacenado en un archivo registro.txt.

Menú interactivo para facilitar el uso.

Requisitos del Sistema

Java 11 o superior

Dependencias:

Gson para procesar datos JSON.

Conexión a Internet para acceder a la API de tasas de cambio.

Configuración del Proyecto

Configuración con IDE (Eclipse o IntelliJ IDEA)

Descarga o clona este repositorio.

Añade la dependencia Gson al classpath:

IntelliJ IDEA:

File > Project Structure > Libraries > + > Add Gson JAR.

Eclipse:

Right-click Project > Build Path > Add External Archives > Select Gson JAR.

Ejecuta la clase principal com.aluralatam.controller.AplMain.

Compilación y Ejecución desde la Línea de Comandos

Descarga el archivo JAR de Gson desde Maven Repository.

Compila el proyecto:

javac -cp gson-2.8.9.jar -d out $(find src -name "*.java")

Ejecuta la aplicación:

java -cp out:gson-2.8.9.jar com.aluralatam.controller.AplMain

Uso

Menú Principal

Al ejecutar el programa, se mostrará un menú con las siguientes opciones:

Conversión de Peso Mexicano a Dólar Estadounidense.

Conversión de Peso Mexicano a Euro.

Conversión de Peso Mexicano a Libra Esterlina.

Conversión de Dólar Estadounidense a Peso Mexicano.

Conversión de Euro a Peso Mexicano.

Conversión de Libra Esterlina a Peso Mexicano.

Otras opciones de conversión personalizadas.

Salir del programa.

Conversión Personalizada

Si seleccionas la opción 7, podrás ingresar manualmente las monedas de origen y destino utilizando códigos ISO de tres letras (por ejemplo, USD para dólares estadounidenses).

Detalles Técnicos

API Utilizada

ExchangeRate API:

URL base: https://v6.exchangerate-api.com/v6/{API_KEY}/pair/{monedaBase}/{monedaObjetivo}/{cantidad}

Este proyecto utiliza una API Key de prueba integrada en el código: 5218c5b28a23cd05b9b2466b.

Archivos Principales

Consulta:
Maneja las solicitudes a la API y procesa la información recibida en formato JSON.

Calculos:
Recoge los datos del usuario y utiliza la clase Consulta para realizar las conversiones.

Archivo:
Guarda un historial de conversiones en un archivo registro.txt.

Controlador:
Administra la lógica principal del programa y la interacción del usuario.

AplMain:
Punto de entrada de la aplicación.
