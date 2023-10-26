package DP.creational.prototype.animal;

import DP.creational.prototype.exception.CanNotCloneException;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public abstract class Animal implements Cloneable {
    protected String name;
    public abstract void saySomething();

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CanNotCloneException(e.getMessage());
        }
    }
}
