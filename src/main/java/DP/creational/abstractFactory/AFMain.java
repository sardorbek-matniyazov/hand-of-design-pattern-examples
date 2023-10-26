package DP.creational.abstractFactory;

import DP.creational.abstractFactory.builder.AbstractFactory;
import DP.creational.abstractFactory.builder.FactoryProvider;
import DP.creational.abstractFactory.phone.Phone;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class AFMain {
    public static void main(String[] args) {
        final AbstractFactory iphoneFactory = FactoryProvider.getFactory("iphone");

        Phone iphone13 = iphoneFactory.createPhone("iphone13");
        iphone13.ring();


        final AbstractFactory samsungFactory = FactoryProvider.getFactory("samsung");

        Phone s23 = samsungFactory.createPhone("S23");
        s23.ring();
    }
}
