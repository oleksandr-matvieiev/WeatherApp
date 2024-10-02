package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherParser {
    public WeatherInfo parseWeather(String jsonResponse) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(jsonResponse);

        double currentTemperature = jsonNode.get("main").get("temp").asDouble();
        double minTemperature = jsonNode.get("main").get("temp_min").asDouble();
        double maxTemperature = jsonNode.get("main").get("temp_max").asDouble();
        String weatherDescription = jsonNode.get("weather").get(0).get("description").asText();
        String weather = jsonNode.get("weather").get(0).get("main").asText();
        int humidity = jsonNode.get("main").get("humidity").asInt();
        String city = jsonNode.get("name").asText();
        return new WeatherInfo(city, currentTemperature, minTemperature, maxTemperature, weather, weatherDescription, humidity);
    }
}
