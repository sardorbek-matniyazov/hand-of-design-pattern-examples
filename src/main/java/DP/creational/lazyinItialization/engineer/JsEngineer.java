package DP.creational.lazyinItialization.engineer;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 15 Nov 2023
 **/
public class JsEngineer implements Engineer {
    private final String developmentType;

    public JsEngineer(String developmentType) {
        this.developmentType = developmentType;
    }

    @Override
    public void sayName() {
        System.out.printf("Hi, I'm a js %s developer\n", this.developmentType);
    }
}
