package DP.creational.singleton.game;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 27 Oct 2023
 **/
public enum EnGame implements Game {
    INSTANCE;

    @Override
    public void play() {
        System.out.println("This is enum based singleton game..");
    }
}
