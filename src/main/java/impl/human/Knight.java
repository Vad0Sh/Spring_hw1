package impl.human;

import interfaces.Human;
import interfaces.Quest;

public class Knight implements Human {
    private Quest quest;

    public Quest getQuest() {
        return quest;
    }

    public Knight() {
    }

    public Knight(Quest quest) {
        this.quest  = quest;
    }

    public void move() {
        System.out.println("I go to make a quest!");

    }
}
