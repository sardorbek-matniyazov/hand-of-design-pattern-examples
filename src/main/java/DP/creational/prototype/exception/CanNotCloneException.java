package DP.creational.prototype.exception;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class CanNotCloneException extends RuntimeException {
    public CanNotCloneException(String msg) {
        super(msg);
    }
}
