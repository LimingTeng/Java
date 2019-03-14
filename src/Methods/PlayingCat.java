package Methods;

/**
 * Created by LynnTeng on 2019/3/13.
 */
public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if ( summer == false && temperature >=25 && temperature <=35) return true;
        if (summer == true && temperature >=25 && temperature <=45 ) return true;
        else return false;
    }
}
