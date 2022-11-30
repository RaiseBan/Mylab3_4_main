package characters;
import actions.Communicate;

public class Singers extends AbstractCharacter implements Communicate {

    public Singers(String name){
        super(name);
    }
    public void stopTalking() {
        System.out.println("");
    }

    @Override
    public void toCommunicate(String str) {
        System.out.println(this.getName() + str);
    }

    public void changeText() {
        System.out.println("Певцы резко поменяли слова песни");
    }

}
