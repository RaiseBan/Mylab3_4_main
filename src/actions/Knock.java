package actions;

import characters.AbstractCharacter;
import items.Items;

public interface Knock {
    void knock(AbstractCharacter abs, String name, Items item);
}
