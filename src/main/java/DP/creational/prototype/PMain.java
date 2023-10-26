package DP.creational.prototype;

import DP.creational.prototype.animal.Animal;
import DP.creational.prototype.cache.AnimalsCache;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class PMain {
    public static void main(String[] args) {
        Animal rosa = AnimalsCache.getAnimal("Rosa");
        Animal goofy = AnimalsCache.getAnimal("Goofy");
        rosa.saySomething();
        goofy.saySomething();

        Animal goofySecond = AnimalsCache.getAnimal("Goofy");
        System.out.printf("Hey Goofys are you the same ? -> %s ", goofySecond.equals(goofy));
    }
}
