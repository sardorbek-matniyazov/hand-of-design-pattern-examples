package DP.creational.prototype.animal;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.printf("Me %s, I'm a cat. Meow, Meow\n", super.name);
    }
}
