package org.example;

import java.io.IOException;

public class Main {
    private static final View view = new View();
    private static final WeatherService service = new WeatherService();
    private static final WeatherParser parser = new WeatherParser();

    public static void main(String[] args) {
        try {
            String city = view.input("Enter city: ");

            String jsonResponse = service.getWeather(city); // get JSON from API
            WeatherInfo weatherInfo = parser.parseWeather(jsonResponse); // parse JSON

            view.outLine("Weather in " + weatherInfo.getCityName() + ":");
            view.outLine("Temperature: " + weatherInfo.getCurrentTemperature() + "°C");
            view.outLine("Min. temperature: " + weatherInfo.getMinTemperature() + "°C");
            view.outLine("Max. temperature: " + weatherInfo.getMaxTemperature() + "°C");
            view.outLine("Humidity: " + weatherInfo.getHumidity() + "%");
            view.outLine("Weather: " + weatherInfo.getWeather());
            view.outLine("description: " + weatherInfo.getDescription());
        } catch (IOException | InterruptedException e) {
            view.outLine("Error fetching weather data: " + e.getMessage());
        }
    }

}