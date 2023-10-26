package DP.creational.prototype.cache;

import DP.creational.prototype.animal.Animal;
import DP.creational.prototype.animal.Dog;
import DP.creational.prototype.exception.AnimalNotFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 26 Oct 2023
 **/
public class AnimalsCache {
    private static final Map<String, Animal> animals = new HashMap<>();

    static {
        animals.put("Goofy", new Dog("Goofy"));
        animals.put("Rosa", new Dog("Rosa")); // rosa is female cat .
    }

    private AnimalsCache () {}

    public static Animal getAnimal(String name) {
        Animal orDefault = animals.getOrDefault(name, null);
        if (orDefault != null) {
            return (Animal) orDefault.clone();
        }
        throw new AnimalNotFoundException(String.format("Animal us missing :: Name:[%s]", name));
    }
}
