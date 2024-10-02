package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherService {
    private static final String API_KEY = "ccc905f1cc92c956ee531f6c5e3051ce";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?q=";

    public String getWeather(String city) throws IOException, InterruptedException {
        String url = BASE_URL + city + "&appid=" + API_KEY + "&units=metric";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body();
    }
}
