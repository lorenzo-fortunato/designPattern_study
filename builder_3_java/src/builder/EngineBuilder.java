package builder;

import car.Engine;

public class EngineBuilder {
    private double volume;
    private double km;
    private String alimentation;

    public EngineBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setKm(double km) {
        this.km = km;
        return this;
    }

    public EngineBuilder setAlimentation(String alimentation) {
        this.alimentation = alimentation;
        return this;
    }

    public Engine build() {
        return new Engine(volume, km, alimentation);
    }
}
