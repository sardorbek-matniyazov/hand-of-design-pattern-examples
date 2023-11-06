package DP.creational.objectPool.chargerPool;

import DP.creational.objectPool.charger.Charger;
import DP.creational.objectPool.exceptions.UnknownChargerException;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 06 Nov 2023
 **/
public abstract class AbstractChargerPool<CH extends Charger> {
    public static final AtomicInteger counter = new AtomicInteger();
    private final Set<CH> available = new HashSet<>();
    private final Set<CH> inUse = new HashSet<>();

    protected abstract CH buyCharger();
    public synchronized CH getCharger() {
        if(this.available.isEmpty()) {
            return buyCharger();
        }
        CH charger = available.iterator().next();
        this.available.remove(charger);
        this.inUse.add(charger);

        return charger;
    }

    public synchronized void returnCharger(CH charger) throws UnknownChargerException {
        if (this.inUse.contains(charger)) {
            this.inUse.remove(charger);
            this.available.add(charger);
        } else {
            throw new UnknownChargerException(String.format("this %s charger doesn't belong here.", charger));
        }
    }

    public void printStatus() {
        System.out.printf("all changers count: %d, available chargers count: %d, in use chargers count: %d", counter.get(), available.size(), available.size());
    }

    protected void addNewChargerToInUse(CH charger) {
        int i = counter.incrementAndGet();
        this.inUse.add(charger);
    }
}
