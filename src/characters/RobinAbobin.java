package characters;

import actions.Communicate;
import actions.Run;

public class RobinAbobin extends AbstractCharacter implements Run, Communicate {
    public RobinAbobin(String name){
        super(name);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " бежит");
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " начал рассказывать  грустную историю пропавшего дома ИАААА (((");
    }

}
