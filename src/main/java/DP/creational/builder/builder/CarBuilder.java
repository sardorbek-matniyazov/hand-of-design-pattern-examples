package DP.creational.builder.builder;

import DP.creational.builder.car.Car;
import DP.creational.builder.car.SlowCar;
import DP.creational.builder.car.device.Device;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
public class CarBuilder {
    private Device engine;
    private Device wheel;

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public CarBuilder wheel(Device wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder engine(Device engine) {
        this.engine = engine;
        return this;
    }

    public Car build() {
        SlowCar slowCar = new SlowCar();
        slowCar.setEngine(this.engine);
        slowCar.setWheel(this.wheel);
        return slowCar;
    }
}
