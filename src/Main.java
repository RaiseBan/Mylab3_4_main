import Exceptions.InputException;
import Exceptions.LengthOfSentenceException;
import actions.Knock;
import characters.*;
import emotions.TypeOfEmotions;
import items.Items;
import items.Meal;
import locations.Location;
import characters.AbstractCharacter;

public class Main {
    public static void main(String[] args) {
        try {
            HistoryControl.startStory();
            Weather weather = new Weather();
            weather.change("утро");
            Location.Time time = new Location.Time();
            Piytka piytka = new Piytka("Пятка");
            RobinAbobin robin = new RobinAbobin("РобинАбобин");
            VinniPux vini = new VinniPux("Опух");
            Kozel kozel = new Kozel("Козел 5%");
            time.changeTime("Утро");
            System.out.println(time.getTime());
            robin.toBe(Location.ROOM, time);
            robin.travel(Location.AFRICA);


            robin.saySentence("Интересно, какая сейчас на улице погода", true, true, false);


            Knock knock = new Knock() {
                @Override
                public void knock(AbstractCharacter abs, String name, Items item) {
                    System.out.println(abs.getName() + " стучит в " + item.getItemName() + name);
                }
            };
            knock.knock(kozel, "Робин", Items.DOOR);


            robin.toEmotional(TypeOfEmotions.ASTONISHMENT, false);
            robin.putOn("теплая шапка", "теплые ботинки", "теплое пальто");
            robin.goToPlace(Location.GROVE);
            kozel.goToPlace(Location.GROVE);
            robin.listen("не слушал Козла 0.5");
            robin.listen(" прислушается к чем-то другому");
            AbstractCharacter.allIsListen();
            Singers musician = new Singers("Певцы");
            musician.toCommunicate("напевали, что и он идет, и снег идет");
            weather.change("Снег");
            musician.changeText();
            musician.stopTalking();

            System.out.println();
            piytka.run("бежит по ", Location.EDGE);
            piytka.run("вокруг ", Location.GROVE);
            robin.run("бежит по ", Location.EDGE);
            robin.run("вокруг ", Location.GROVE);
            System.out.println();
            System.out.println(Location.ROOM.toString());
            System.out.println();

            vini.toEmotional(TypeOfEmotions.CHEERS);
            System.out.println();
            vini.toCommunicate(" Спросил почему по четвергам");
            robin.toCommunicate("начал рассказывать грустную историю пропавшего дома IA (((");
            System.out.println();
            piytka.listen("слушает");
            vini.listen("Слушает");
            if (!(vini.getName().equals("Пух") | piytka.getName().equals("Козел 0.5%") | robin.getName().equals("РобинАбобин"))){
                System.out.println("1111111111111111111");
                throw new InputException();
            }

            System.out.println();
            piytka.toEmotional(TypeOfEmotions.ASTONISHMENT);
            vini.toEmotional(TypeOfEmotions.ASTONISHMENT);
            System.out.println();
            vini.goToPlace(Location.EDGE);
            piytka.goToPlace(Location.EDGE);


            System.out.println(Location.HOUSE.toString());
            MasterOfTheHouse master = new MasterOfTheHouse("Хозяин дома");
            kozel.goToPlace(Location.HOUSE);
            kozel.goToPlace(Location.STREET);
            kozel.bye();
            vini.bye();
            piytka.bye();
            robin.bye();
            Location.Time.maelTaking(Meal.DINNER);
            vini.toCommunicate(" рассказал Робину об Ужасной Ошибке, которую они совершили,");
            piytka.toCommunicate(" рассказал Робину об Ужасной Ошибке, которую они совершили,");
            robin.toCommunicate("перестал смеяться");
            robin.sing("хорошо поет");
            vini.sing("также хорошо поет");
            piytka.sing("только тирлимбомбомкал");
            piytka.toCommunicate("сказал про себя, что надо это легко, но не каждый этим справиться!");
            HistoryControl.chapter();
            time.changeTime("полночь");
            vini.wakeup(time);
            vini.careful();
            vini.wakeup(Location.BED);
            vini.take(Items.CANDLE);
            vini.goToPlace(Location.BUFFET);
            vini.check("не пытается ли кто-нибудь туда залезть");
            vini.goToPlace(Location.BED);
            vini.listen("Снова слышит подозрительные звуки");
            robin.notToBe();
            HistoryControl.endOfTheStory();


        }catch (InputException e){
            System.out.println("OutputException");
        }catch (LengthOfSentenceException e){
            System.err.println(e.getMessage());
        }
    }
}
