package DP.creational.singleton.game;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 27 Oct 2023
 **/
public class Dota2 implements Game {
    public static Dota2 INSTANCE;

    private Dota2() {}

    public static Dota2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Dota2();
        }
        return INSTANCE;
    }

    @Override
    public void play() {
        System.out.println("Victory is ours.");
    }
}
