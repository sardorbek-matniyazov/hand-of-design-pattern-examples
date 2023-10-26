package DP.creational.abstractFactory.builder;

import DP.creational.abstractFactory.exception.NoPhoneException;
import DP.creational.abstractFactory.phone.Phone;
import DP.creational.abstractFactory.phone.iphone.Iphone13;

import java.util.Locale;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class IphoneFactory extends AbstractFactory {
    @Override
    public Phone createPhone(String type) {
        if (type.toLowerCase().equals("Iphone13".toLowerCase(Locale.ROOT))) {
            return new Iphone13();
        }

        throw new NoPhoneException(String.format("There are no phone like %s", type));
    }
}
