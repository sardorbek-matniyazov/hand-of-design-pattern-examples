package DP.creational.prototype.exception;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class AnimalNotFoundException extends RuntimeException {
    public AnimalNotFoundException(String msg) {
        super(msg);
    }
}
