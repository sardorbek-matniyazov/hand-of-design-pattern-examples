package DP.creational.lazyinItialization.engineer;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 15 Nov 2023
 **/
public class JavaEngineer implements Engineer {
    private final String developmentType;

    public JavaEngineer(String developmentType) {
        this.developmentType = developmentType;
    }

    @Override
    public void sayName() {
        System.out.printf("Hi, I'm a java %s developer\n", this.developmentType);
    }
}
