package DP.creational.prototype.animal;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf("Me %s, I'm a dog. Guf, Guf\n", super.name);
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
