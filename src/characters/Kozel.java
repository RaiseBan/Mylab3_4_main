package characters;

import actions.ByeBye;
import actions.Goto;
import items.Items;
import actions.Knock;
import locations.Location;

public class Kozel extends AbstractCharacter implements Goto, ByeBye {
    public Kozel(String name){
        super(name);

    }
//    public void knock(String str, Items item){
//        knock.knock(str, item);
//    }

    @Override
    public void goToPlace(Location loc) {
        System.out.println(this.getName() + "идет к " + loc.getLocation());
    }
    @Override
    public void bye() {
        System.out.println(this.getName() +  " попращался");
    }
}
