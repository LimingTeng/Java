package Generics;

import java.util.ArrayList;

/**
 * Created by LynnTeng on 2019/5/1.
 */
public class Team<T extends Player> {
    private String name;
    //track: keep the basic number of fields
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    //create an ArrayList using generics
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
    * accepting the parameter of Player,
    * which enable us with one call, to pass a baseballPlayer, footballPlayer, soccerPlayer
    * and we are able to do that because we use an abstract class and generics here
    * for the array list definition of type player
    * */
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name );
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;

        //here we also save the result of the opponent team
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
