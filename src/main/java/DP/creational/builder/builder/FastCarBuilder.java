package DP.creational.builder.builder;

import DP.creational.builder.car.Car;
import DP.creational.builder.car.FastCar;
import DP.creational.builder.car.device.FastEngine;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
public class FastCarBuilder {
    public static Car createFastCar() {
        return new FastCar(new FastEngine());
    }
}
