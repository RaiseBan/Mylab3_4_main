package characters;

import actions.Communicate;
import actions.Listen;
import actions.Run;
import emotions.Emotional;
import emotions.TypeOfEmotions;

public class VinniPux extends AbstractCharacter implements Run, Listen, Emotional, Communicate {
    public VinniPux(String name){
        super(name);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " теперь бежит по опушке вокруг рощи");
    }

    @Override
    public void listen() {
        System.out.println(this.getName() + " слушает");
    }

    @Override
    public void toEmotional(TypeOfEmotions type) {
        System.out.println(this.getName() + " испытывает эмоцию " + type);
    }

    @Override
    public void toCommunicate() {
        System.out.println(this.getName() + " Спросил почему по четвергам");

    }

}
