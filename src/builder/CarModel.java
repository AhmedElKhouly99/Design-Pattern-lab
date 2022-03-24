/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ahmed
 */
public class CarModel {

    public CarModel(CarBuilder car) {
        this.model = car.model;
        this.heatCoolSeats = car.heatCoolSeats;
        this.selfParking = car.selfParking;
        this.driverAssist = car.driverAssist;
    }
    private final String model;
    private final boolean selfParking;
    private final boolean driverAssist;
    private final boolean heatCoolSeats;

    public String getModel() {
        return model;
    }

    public boolean isSelfParking() {
        return selfParking;
    }

    public boolean isDriverAssist() {
        return driverAssist;
    }

    public boolean isHeatCoolSeats() {
        return heatCoolSeats;
    }
    public static class CarBuilder{

        public CarBuilder(String model) {
            this.model = model;
        }
        private final String model;
        private boolean selfParking;
        private boolean driverAssist;
        private boolean heatCoolSeats;

        public CarBuilder driverAssist(boolean driverAssist) {
            this.driverAssist = driverAssist;
            return this;
        }

        public CarBuilder selfParking(boolean selfParking) {
            this.selfParking = selfParking;
            return this;
        }

        public CarBuilder heatCoolSeats(boolean heatCoolSeats) {
            this.heatCoolSeats = heatCoolSeats;
            return this;
        }
        
        public CarModel build(){
           return new CarModel(this);
        }
    }
}
