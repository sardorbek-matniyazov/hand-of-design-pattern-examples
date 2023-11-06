package DP.creational.objectPool;

import DP.creational.objectPool.charger.IphoneCharger;
import DP.creational.objectPool.chargerPool.AbstractChargerPool;
import DP.creational.objectPool.chargerPool.FreeIphoneChargerPool;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public class OPMain {
    public static void main(String[] args) {
        System.out.println("Object pool pattern");
        AbstractChargerPool<IphoneCharger> iphoneChargersFreeGarage = new FreeIphoneChargerPool();

        IphoneCharger charger1 = iphoneChargersFreeGarage.getCharger();
        IphoneCharger charger2 = iphoneChargersFreeGarage.getCharger();
        IphoneCharger charger3 = iphoneChargersFreeGarage.getCharger();
        IphoneCharger charger4 = iphoneChargersFreeGarage.getCharger();

        charger1.charge();
        charger2.charge();
        charger3.charge();
        charger4.charge();
        iphoneChargersFreeGarage.printStatus();

        iphoneChargersFreeGarage.returnCharger(charger1);
        iphoneChargersFreeGarage.returnCharger(charger3);
        iphoneChargersFreeGarage.printStatus();
    }
}
