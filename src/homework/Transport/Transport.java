package homework.Transport;

import homework.Competing;
import homework.Drivers.Driver;

public abstract class Transport<T extends Driver> implements Competing {
    private String type;
    protected String brand;
    protected String model;
    protected Double engineVolume;
//    protected String type;
   protected T driver;

    public Transport(String brand, String model, Double engineVolume, String type) {
        if (brand != null  && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isBlank()) {
            this.model = model;
        }
        setEngineVolume(this.engineVolume);
        this.type = type;

    }
        public void startMoving() {
        System.out.println("Транспорт начинает движение!");
    }

    public void stopMoving() {
        System.out.println("Транспорт останавливается!");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver() {
        this.driver = driver;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume <= 0) {
            this.engineVolume = engineVolume;

        }
    }

    public abstract void printType();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }
    public void roundTime() {
        System.out.println("roundTime");
    }

    public void pitStopTime() {
        System.out.println("PitStopTime");
    }

    public  void maxVelocity() {
        System.out.println("maxVelocity");
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public void printInfo() {
}


}
