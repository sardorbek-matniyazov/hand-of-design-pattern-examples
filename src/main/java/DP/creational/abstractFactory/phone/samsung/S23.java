package DP.creational.abstractFactory.phone.samsung;

import DP.creational.abstractFactory.phone.Phone;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 24 Oct 2023
 **/
public class S23 implements Phone {
    @Override
    public void ring() {
        System.out.println("Bum, I'm Samgsung S23");
    }
}
