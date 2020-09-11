package _02Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participan> {

    private String name;
    private List<T> participanList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participan) {
        participanList.add(participan);
        System.out.println("V komandu " + name + " bil dovablen novij ucasnik " + participan.getName());
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Vigrala komanda: " + winnerName);
    }
}
