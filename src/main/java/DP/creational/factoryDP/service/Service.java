package DP.creational.factoryDP.service;

import java.util.Locale;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public abstract class Service {
    public abstract void serve();

    public enum ServiceTypes {
        MAIN("main"),
        SECONDARY("secondary");
        private final String name;

        ServiceTypes(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("The service name is: [%s]", this.name);
        }

        public boolean equals(String type) {
            return this.name.toLowerCase(Locale.ROOT).equals(type.toLowerCase(Locale.ROOT));
        }
    }
}
