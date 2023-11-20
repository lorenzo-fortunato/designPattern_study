package locality;

public class Locality {
    private int id;
    private String name;
    private int lat;
    private int longi;
    private int temperature;
    private int humidity;

    public Locality() {
    }

    public Locality(int id, String name, int lat, int longi, int temperature, int humidity) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.longi = longi;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        System.out.println("locality.Locality{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lat=" + lat +
                ", longi=" + longi +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}');
        return null;
    }
}
