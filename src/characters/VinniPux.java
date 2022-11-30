package characters;

import Exceptions.LengthOfSentenceException;
import actions.*;
import emotions.Emotional;
import emotions.TypeOfEmotions;
import items.Items;
import locations.Location;

public class VinniPux extends AbstractCharacter implements Run, Listen, Emotional, Communicate, Goto, ByeBye, Sing {
    public VinniPux(String name){
        super(name);
    }

    @Override
    public void run(String str, Location loc) {
        System.out.println(this.getName() + str + loc.getLocation());
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
    public void toCommunicate(String str) throws LengthOfSentenceException {
        if (str.length() > 40){
            throw new LengthOfSentenceException("ОСТАНОВКА!!!!!, вы привысили скорость! !! ! ! ");
        }
        System.out.println(this.getName() + str);


    }

    @Override
    public void sing(String str) {
        System.out.println(this.getName() + str);
    }

    @Override
    public void goToPlace(Location loc) {
        System.out.println(this.getName() + " пошел на " + loc.getLocation());
    }
    @Override
    public void bye() {
        System.out.println(this.getName() + " попращался");
    }

    public void wakeup(Location location) {
        System.out.println(this.getName() + " встал" + location);
    }
    public void wakeup(Location.Time time){
        System.out.println(this.getName() + " встал в " + time.getTime());

    }
    public void careful() {
        System.out.println(this.getName() + " насторожился");
    }



    public void take(Items item) {
        System.out.println(this.getName() + " взял " + item);
    }

    public void check(String str) {
        System.out.println(this.getName() + " проверяет " + str);
    }
}
