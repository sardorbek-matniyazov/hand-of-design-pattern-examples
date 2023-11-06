package DP.creational.objectPool.charger;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public class TypeBCharger implements Charger {
    private String whose;

    public TypeBCharger(String whose) {
        this.whose = whose;
    }

    @Override
    public void charge() {
        System.out.printf("TypeB charger. I work for %s", this.whose());
    }

    public String whose() {
        return this.whose;
    }
}
