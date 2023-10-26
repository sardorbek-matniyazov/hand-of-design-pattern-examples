package DP.creational.abstractFactory.builder;

import DP.creational.abstractFactory.exception.NoPhoneException;

import java.util.Locale;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class FactoryProvider {
    private FactoryProvider() {}

    public static AbstractFactory getFactory(String type) {
        if (type.toLowerCase().equals("iphone".toLowerCase(Locale.ROOT))) {
            return new IphoneFactory();
        } else if (type.toLowerCase().equals("samsung".toLowerCase(Locale.ROOT))) {
            return new SamsungFactory();
        }

        throw new NoPhoneException(String.format("There are no factory like %s", type));
    }
}
