package DP.creational.objectPool.charger;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public class IphoneCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Iphone charger. I work for all iphone users");
    }
}
