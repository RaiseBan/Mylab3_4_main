package characters;

import actions.ChangeTextOfTheSong;
import actions.Communicate;
import actions.StopTalking;

public class Singers extends AbstractCharacter implements Communicate, StopTalking, ChangeTextOfTheSong {

    public Singers(String name){
        super(name);
    }

    @Override
    public void stopTalking() {
        System.out.println("");
    }

    @Override
    public void toCommunicate(String str) {
        System.out.println(this.getName() + str);
    }

    @Override
    public void changeText() {
        System.out.println("Певцы резко поменяли слова песни");
    }

}
