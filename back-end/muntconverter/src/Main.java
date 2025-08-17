import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Scanner;

import com.calculos.Conversion;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.modelos.Moneda;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = "Munt Converter";
        String apiKey = "API_KEY";

        System.out.println(title.toUpperCase());

        System.out.println("Ingresa el Currency Code de la moneda:");
        String codeMoneda = scanner.nextLine().toUpperCase();

        System.out.println("Ingres el Currency Code a convertir:");
        String codeNew = scanner.nextLine().toUpperCase();

        System.out.println("Ingresa el valor a convertir:");
        double valorMoneda = scanner.nextDouble();

        Moneda baseMoneda = new Moneda(valorMoneda, codeMoneda);
        System.out.println("Quieres convertir " + baseMoneda + " a " + codeNew);


        try {
            // Cliente Http.
            HttpClient client = HttpClient.newHttpClient();

            // URL con la clave como query param
            String url = "https://v6.exchangerate-api.com/v6/"
                    + apiKey + "/latest/" + codeMoneda;

            // Construir GET
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            // Enviar  y obtener la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Usar Gson para parsear JSON
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);

            JsonObject rates = json.getAsJsonObject("conversion_rates");
            Moneda apiMoneda = new Moneda(rates.get(codeNew).getAsDouble(), codeNew);

            Conversion monedasConvertir = new Conversion(baseMoneda, apiMoneda);
            Moneda newMoneda = monedasConvertir.conversorMoneda();

            // Resultados
            System.out.println(baseMoneda + " es igual a " + newMoneda);

        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

