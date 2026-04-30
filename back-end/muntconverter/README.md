# 💱 Muntconverter - Conversor de Monedas (Java)

Aplicaicón en *Java* para la conversión de divisas mediante consumo de una API de tasas de cambio, obtenido de [EXCHANGERATE](https://www.exchangerate-api.com/).

## 💡 Descripción

El proyecto permite convertir un valor entre distintas monedas utilizando Currency Codes, obteniendo las tasas de cambio en tiempo real desde una API ([EXCHANGERATE](https://www.exchangerate-api.com/)), además este codigó desarrolla dos classes de una de monedad para salir de manera correcta y otra para obtener la conversión, así mismo se descargo la [biblioteca Gson *2.10.1*](https://mvnrepository.com/artifact/com.google.code.gson/gson). 

El código está estructurado en varias clases para separar responsabilidades como:

* Entrada de datos.
* Consumo de API.
* Lógica de conversión.

## ⚙️ Funcionamiento
1. El usuario ingresa:
* Moneda base.
* Moneda destino.
* Cantidad a convertir.
2. Se realiza una solicitud HTTP a la API de tasas de cambio.
3. Se procesa la respuesta en formato JSON.
4. Se calcula la conversión y se muestra el resultado.

## 🧩 Estructura del código
* Main
  * Maneja la interacción con el usuario
  * Realiza la solicitud HTTP
  * Procesa la respuesta de la API
* Moneda
  * Representa una moneda (valor + código)
* Conversion
  * Contiene la lógica para convertir entre monedas
    
## 🛠️ Tecnologías
* Java
* HttpClient, HttpRequest, HttpResponse
* Gson (procesamiento de JSON)

## 🎯 Enfoque
* Consumo de APIs externas.
* Manejo de solicitudes HTTP.
* Procesamiento de datos JSON.
* Separación básica de responsabilidades.
  
## 📌 Nota

Proyecto orientado a fundamentos de desarrollo backend e integración de servicios externos, con una estructura modular simple. Recuerde que la clave para aser uso de la API es personal para poder usarla debera crear una cuente y en la parte de *API_KEY* podra su llave.

