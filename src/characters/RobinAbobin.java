package characters;

import Exceptions.OutputException;
import actions.*;
import emotions.Emotional;
import emotions.TypeOfEmotions;
import locations.Location;

public class RobinAbobin extends AbstractCharacter implements NotToBe, Run, Communicate, ToBe, ByeBye,Travel, GetOff, Think, Emotional, Goto, Listen, Sing {
    Clothes clo = new Clothes();




    public RobinAbobin(String name){
        super(name);

    }

    @Override
    public void saySentence(String sentence, boolean var1, boolean var2, boolean var3) {
        class TypeOfSentence{
            private final boolean interest = var1;
            private final boolean punctuation = var2;
            private final boolean emotion = var3;
            String getSentenceInfo(){
                return "SentenceInfo{"
                        + "interest'" + this.interest + '\''
                        + ", punctuation='" + this.punctuation + '\''
                        + ",emotion'" + this.emotion + '\''
                        + '}';
            }
        }
        TypeOfSentence type = new TypeOfSentence();
        System.out.println(sentence);
        System.out.println(type.getSentenceInfo());


    }
    public void saySentence(String sentence){
        System.out.println(sentence);
    }

    @Override
    public void getOff() {
        System.out.println(this.getName() + " сошёл с " + Location.SHIP);
    }

    @Override
    public void travel(Location loc) {
        System.out.println(this.getName() + " Путешествует в " + loc);
    }


    @Override
    public void toBe(Location loc) {
        System.out.println(this.getName() + " Пробыл в " + loc.getLocation());
    }

    public void toBe(Location loc, Location.Time time){
        System.out.println(this.getName() + "провел весь " + time.getTime() + " в " + loc.getLocation());
    }

    public class Clothes{
        private void setClothes(String[] stuff){
            for(String var: stuff){
                System.out.println(RobinAbobin.this.getName() + " одевает " + var);
            }
        }
        private void takeoffCloth(String stuff){
            System.out.println(RobinAbobin.this.getName() + " снял " + stuff);
        }
    }
    public void putOn(String ... stuff){
        clo.setClothes(stuff);
    }
    public void takeOff(String stuff){
        clo.takeoffCloth(stuff);
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
    public void toEmotional(TypeOfEmotions type) {
        System.out.println("Испытывает эмоцию " + type.getEmotion());
    }
    public void toEmotional(TypeOfEmotions type, boolean bool) throws OutputException{
        if (bool){
            throw new OutputException("shalom");
        }
        System.out.println("Не испытывает эмоцию " + type.getEmotion());
    }
    @Override
    public void goToPlace(Location loc) {
        System.out.println(this.getName() + "идет к " + loc.getLocation());
    }

    @Override
    public void listen(String str) {
        System.out.println(this.getName() + str);
    }
    @Override
    public void bye() {
        System.out.println(this.getName() + " попращался");
    }

    @Override
    public void sing(String str) {
        System.out.println(this.getName() + str);
    }

    @Override
    public void notToBe() {
        System.out.println("Это был не " + this.getName());
    }
}