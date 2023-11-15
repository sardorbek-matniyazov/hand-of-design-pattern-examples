package DP.creational.lazyinItialization.engineer;

import DP.creational.lazyinItialization.exceptions.NoDevelopmentException;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 15 Nov 2023
 **/
public class EngineerProvider {
    private Engineer javaBackendEngineer;
    private Engineer jsEngineer;
    private Engineer dbdEngineer;
    private Engineer javaGamedEngineer;

    public Engineer getEngineer(String developmentType) {
        switch (developmentType) {
            case "java-backend":
                if (this.javaBackendEngineer == null) {
                    this.javaBackendEngineer = new JavaEngineer(developmentType);
                }
                return this.javaBackendEngineer;
            case "java-game":
                if (this.javaGamedEngineer == null) {
                    this.javaGamedEngineer = new JavaEngineer(developmentType);
                }
                return this.javaGamedEngineer;
            case "js":
                if (this.jsEngineer == null) {
                    this.jsEngineer = new JsEngineer(developmentType);
                }
                return this.jsEngineer;
            case "db":
                if (this.dbdEngineer == null) {
                    this.dbdEngineer = new DBEngineer();
                }
                return this.dbdEngineer;
            default:
                throw new NoDevelopmentException("We don't deal such like a development");
        }
    }
}
