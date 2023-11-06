package DP.creational.objectPool.chargerPool;

import DP.creational.objectPool.charger.IphoneCharger;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public class FreeIphoneChargerPool extends AbstractChargerPool<IphoneCharger> {
    public FreeIphoneChargerPool() {
    }

    @Override
    protected IphoneCharger buyCharger() {
        IphoneCharger iphoneCharger = new IphoneCharger();
        addNewChargerToInUse(iphoneCharger);
        return iphoneCharger;
    }
}
