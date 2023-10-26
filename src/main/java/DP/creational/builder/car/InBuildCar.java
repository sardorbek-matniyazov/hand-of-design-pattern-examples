package DP.creational.builder.car;

import DP.creational.builder.car.device.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 25 Oct 2023
 **/
final public class InBuildCar implements Car {
    private InBuildCar(List<Device> devices) {
        this.devices = devices;
    }

    public static class Builder {
        private List<Device> devices;
        public static Builder builder () {
            Builder builder = new Builder();
            builder.devices = new ArrayList<>();
            return builder;
        }

        public Builder addEngine(Device engine) {
            this.devices.add(engine);
            return this;
        }

        public Builder addWheel(Device wheel) {
            this.devices.add(wheel);
            return this;
        }

        public InBuildCar build() {
            return new InBuildCar(devices);
        }
    }


    private final List<Device> devices;

    @Override
    public void move() {
        signal();
        System.out.printf("devices are -> %s%n", this.devices.stream().map(Device::getName).collect(Collectors.toList()));
        System.out.println("look my builder is in me )");
    }

    @Override
    public void signal() {
        System.out.println("builder is part of me )");
    }

    private void addDevice(Device device) {
        this.devices.add(device);
    }
}
