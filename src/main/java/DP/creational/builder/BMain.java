package DP.creational.builder;

import DP.creational.builder.builder.FastCarBuilder;
import DP.creational.builder.builder.CarBuilder;
import DP.creational.builder.car.Car;
import DP.creational.builder.car.InBuildCar;
import DP.creational.builder.car.device.FastEngine;
import DP.creational.builder.car.device.SlowEngine;
import DP.creational.builder.car.device.Wheel;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
public class BMain {
    public static void main(String[] args) {
//        simple builder
        Car fastCar = FastCarBuilder.createFastCar();
        fastCar.move();

//        best builder
        Car car = CarBuilder.builder()
                .engine(new SlowEngine())
                .wheel(new Wheel())
                .build();
        car.move();

//        inner builder
        InBuildCar bCar = InBuildCar.Builder.builder()
                .addEngine(new FastEngine())
                .addEngine(new Wheel())
                .build();
        bCar.move();
    }
}
