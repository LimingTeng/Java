package Generics;

/**
 * Created by LynnTeng on 2019/5/1.
 */
public class LeagueMain {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaide = new Team<>("Adelaide");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaide, 3, 8);
        adelaide.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaide);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();
    }
}
