package DP.creational.objectPool.charger;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public class TypeCCharger implements Charger {
    private String whose;

    public TypeCCharger(String whose) {
        this.whose = whose;
    }

    @Override
    public void charge() {
        System.out.printf("TypeC charger. I work for %s", this.whose());
    }

    public String whose() {
        return this.whose;
    }
}
