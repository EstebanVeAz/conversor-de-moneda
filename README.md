# 💱 Conversor de Monedas en Java

Este es un proyecto de consola desarrollado en Java que permite convertir valores entre distintas monedas utilizando una API de tasas de cambio en tiempo real. Forma parte de un desafío de desarrollo backend para reforzar habilidades en Java, uso de APIs y estructuras de proyecto limpias.

---

## 🚀 Funcionalidades

- Consulta de tasas de cambio actualizadas desde la [ExchangeRate API](https://www.exchangerate-api.com/).
- Conversión entre múltiples monedas (USD, CLP, EUR, BRL, ARS, MXN, JPY, etc).
- Interfaz de texto interactiva.
- Bucle de menú para realizar múltiples conversiones sin reiniciar la aplicación.
- Validación básica de errores en la entrada del usuario.
- (Opcional) Historial de conversiones.

---

## 🧱 Estructura del Proyecto

conversor-de-moneda/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── eva/
│                   └── conversor/
│                       ├── ConversorApp.java
│                       ├── model/
│                       │   └── ExchangeRatesResponse.java
│                       └── service/
│                           └── ConversionService.java

---

## 🛠️ Tecnologías Utilizadas

- Java 17+
- Gson para el manejo de JSON
- HTTPURLConnection para llamadas HTTP
- Scanner para la entrada por consola

---

## 🔧 Cómo Usar

1. Clona el repositorio:
   git clone https://github.com/tu-usuario/conversor-de-moneda.git
   cd conversor-de-moneda

2. Compila y ejecuta el proyecto (desde la raíz):

   javac -cp gson-2.8.9.jar -d out src/main/java/com/eva/conversor/**/*.java
   java -cp "out;gson-2.8.9.jar" com.eva.conversor.ConversorApp

   Asegúrate de tener el archivo gson-2.8.9.jar en el mismo directorio o ajustar el classpath según tu entorno.

---

## 🔑 API Key

Este proyecto utiliza ExchangeRate-API con una clave gratuita:

API Key: 8dc5ba3334d3b6719685f3b5  
Endpoint de ejemplo: https://v6.exchangerate-api.com/v6/8dc5ba3334d3b6719685f3b5/latest/USD

Puedes reemplazar la API key por la tuya propia si lo deseas.

---

## 📈 Próximas Mejoras (Extras)

- Mostrar historial de conversiones con fecha/hora.
- Guardar historial en un archivo .txt.
- Interfaz gráfica con JavaFX o Swing.
- Más monedas disponibles para conversión.

---

## 🧑‍💻 Autor

Proyecto desarrollado por Esteban Veliz como parte de un desafío de programación backend.

---

## 📜 Licencia

Este proyecto es de código abierto bajo la licencia MIT.
