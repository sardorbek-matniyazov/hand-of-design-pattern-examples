package DP.creational.singleton.game;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 27 Oct 2023
 **/
public class CsGo implements Game {
    private static final CsGo INSTANCE = new CsGo();

    /**Cannot access from outside*/
    private CsGo() {}

    public static CsGo getInstance() {
        return INSTANCE;
    }

    @Override
    public void play() {
        System.out.println("Bang, Bang!");
    }
}
