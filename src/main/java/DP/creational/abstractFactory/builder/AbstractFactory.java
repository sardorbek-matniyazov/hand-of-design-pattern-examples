package DP.creational.abstractFactory.builder;

import DP.creational.abstractFactory.phone.Phone;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public abstract class AbstractFactory {
    public abstract Phone createPhone(String type);
}
