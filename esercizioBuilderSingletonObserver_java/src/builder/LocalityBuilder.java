package builder;

import locality.Locality;

public class LocalityBuilder {
    private int id;
    private String name;
    private int lat;
    private int longi;
    private int temperature;
    private int humidity;

    public LocalityBuilder getId(int id) {
        this.id = id;
        return this;
    }

    public LocalityBuilder getName(String name) {
        this.name = name;
        return this;
    }

    public LocalityBuilder getlLat(int lat) {
        this.lat = lat;
        return this;
    }

    public LocalityBuilder getLongi(int longi) {
        this.longi = longi;
        return this;
    }

    public LocalityBuilder getTemp(int temp) {
        this.temperature = temp;
        return this;
    }

    public LocalityBuilder getHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public Locality build() {
        return new Locality(id, name, lat, longi, temperature, humidity);
    }
}
