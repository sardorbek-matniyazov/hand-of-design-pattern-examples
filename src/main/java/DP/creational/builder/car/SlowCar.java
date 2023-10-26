package DP.creational.builder.car;

import DP.creational.builder.car.device.Device;
import DP.creational.builder.car.device.Wheel;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
public class SlowCar implements Car {
    private Device engine;
    private Device wheel;

    @Override
    public void move() {
        signal();
        System.out.printf("engine is -> %s%n", this.engine.getName());
        System.out.println("slow car is mooooooving.(");
    }

    @Override
    public void signal() {
        System.out.println("bump bump!");
    }

    public Device getEngine() {
        return engine;
    }

    public void setEngine(Device engine) {
        this.engine = engine;
    }

    public Device getWheel() {
        return wheel;
    }

    public void setWheel(Device wheel) {
        this.wheel = wheel;
    }
}
