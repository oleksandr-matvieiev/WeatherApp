# Weather Application

## Overview

This Java-based weather application fetches and displays current weather data for a given city using the OpenWeatherMap
API. It is designed to be simple, with clear functionality and modular architecture.

---

## Features

- Fetches current weather information for any city.
- Displays:
    - Current temperature, minimum and maximum temperatures.
    - Humidity level.
    - General weather description.
- Modular codebase with clean separation of concerns:
    - **`WeatherService`**: Handles API requests.
    - **`WeatherParser`**: Parses JSON responses into Java objects.
    - **`WeatherInfo`**: Represents weather data as a structured object.
    - **`View`**: Provides user interaction via the console.

---

## Requirements

- **Java Version**: 11 or later.
- **Dependencies**:
    - `com.fasterxml.jackson.core:jackson-databind` for JSON parsing.

---

## How to Set Up and Run

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/<repository-name>.git
cd <repository-name>
```

### 2. Add Configuration

Create a ```config.properties``` file in the root of your project to store the API key:

```properties
API_KEY=your_openweathermap_api_key
```

### 3. Compile and Run

**Using Command Line:**

1. Compile the project:
```bash
javac -d out src/org/example/*.java
```
2. Run the application:
```markdown
java -cp out org.example.Main
```
**Using IntelliJ IDEA**:

1. Open the project in IntelliJ IDEA.
2. Add config.properties to the project root.
3. Run the Main class.
---
### Example Output
**Input**:
```markdown
Enter city: Paris
```
**Output:**
```yaml
Weather in Paris:
Temperature: 8.23°C
Min. temperature: 7.2°C
Max. temperature: 9.34°C
Humidity: 75%
Weather: Clear
description: clear sky
```
