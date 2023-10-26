package DP.creational.builder.car;

import DP.creational.builder.car.device.Device;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
public class FastCar implements Car {
    private Device engine;

    public FastCar(Device engine) {
        this.engine = engine;
    }

    @Override
    public void move() {
        signal();
        System.out.printf("engine is -> %s%n", this.engine.getName());
        System.out.println("move fast car");
    }

    @Override
    public void signal() {
        System.out.println("Im super fast");
    }
}
