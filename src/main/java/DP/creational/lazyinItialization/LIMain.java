package DP.creational.lazyinItialization;

import DP.creational.lazyinItialization.engineer.Engineer;
import DP.creational.lazyinItialization.engineer.EngineerProvider;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 08 Nov 2023
 **/
public class LIMain {
    public static void main(String[] args) {
//        Objects created when only they needed
        EngineerProvider engineerProvider = new EngineerProvider();
        Engineer javaBackend = engineerProvider.getEngineer("java-backend");
        Engineer javaGame = engineerProvider.getEngineer("java-game");
        Engineer js = engineerProvider.getEngineer("js");
        Engineer db = engineerProvider.getEngineer("db");

        javaBackend.sayName();
        javaGame.sayName();
        js.sayName();
        db.sayName();

        System.out.println("works fine");

        Engineer anotherJavaBackend = engineerProvider.getEngineer("java-backend");
        System.out.printf("javaBackend==anotherJavaBackend -> %b", anotherJavaBackend == javaBackend);
    }
}
