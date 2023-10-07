package Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="weather_data")
public class WeatherData {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   private double temperature;
   private double pressure;
   private double humidity;
   private double windSpeed;
   private String windDirection;
   private LocalDate date;  // Data associated with the weather data

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

