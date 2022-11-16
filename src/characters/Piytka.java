package characters;
import actions.*;
import emotions.Emotional;
import emotions.TypeOfEmotions;
import locations.Location;

public class Piytka extends AbstractCharacter implements Run, Listen, Emotional, Goto, ByeBye, Communicate, Sing {

    public Piytka(String name){
        super(name);
    }

    @Override
    public void run(String str, Location loc) {
        System.out.println(this.getName() + str + loc.getLocation());
    }

    @Override
    public void toCommunicate(String str) {
        System.out.println(this.getName() + str);
    }

    @Override
    public void listen(String str) {
        System.out.println(this.getName() + str);
    }

    @Override
    public void toEmotional(TypeOfEmotions type) {
        System.out.println(this.getName() + " испытывает эмоцию " + type.getEmotion());
    }

    @Override
    public void goToPlace(Location loc) {
        System.out.println(this.getName() + " идет на " + loc.getLocation());
    }

    @Override
    public void bye() {
        System.out.println(this.getName() + " попращался");
    }

    @Override
    public void sing(String str) {
        System.out.println(this.getName() + str);
    }
}
