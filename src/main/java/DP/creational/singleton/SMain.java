package DP.creational.singleton;

import DP.creational.singleton.game.CsGo;
import DP.creational.singleton.game.Dota2;
import DP.creational.singleton.game.EnGame;
import DP.creational.singleton.game.Game;

/**
 * @author :  Sardor Matniyazov
 * @mailto :  sardorbekmatniyazov03@gmail.com
 * @created : 27 Oct 2023
 **/
public class SMain {
    public static void main(String[] args) {
        Game csGo = CsGo.getInstance();
        csGo.play();

        Game dota2 = Dota2.getInstance();
        dota2.play();

        Game enGame = EnGame.INSTANCE;
        enGame.play();

        System.out.printf("Are they single cs go game %s", csGo.equals(CsGo.getInstance()));
    }
}
