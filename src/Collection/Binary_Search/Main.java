package Collection.Binary_Search;

import Collection.Collection_Overview.Theatre;

/**
 * Created by LynnTeng on 2019/5/6.
 */
public class Main {
    public static void main(String[] args) {
        Collection.Collection_Overview.Theatre theatre = new Theatre("Olympian", 8, 12);
        //theatre.getSeats();
        if (theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        if (theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }
}
