package org.example;

public class WeatherInfo {
    private final String cityName;
    private final double currentTemperature;
    private final double minTemperature;
    private final double maxTemperature;
    private final String weather;
    private final String description;
    private final int humidity;

    public WeatherInfo(String cityName, double currentTemperature, double minTemperature, double maxTemperature, String weather, String description, int humidity) {
        this.cityName = cityName;
        this.currentTemperature = currentTemperature;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.weather = weather;
        this.description = description;
        this.humidity = humidity;
    }

    public String getCityName() {
        return cityName;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public String getWeather() {
        return weather;
    }

    public String getDescription() {
        return description;
    }

    public int getHumidity() {
        return humidity;
    }
}
