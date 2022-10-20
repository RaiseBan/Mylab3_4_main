package characters;

import actions.Listen;
import actions.Run;
import emotions.Emotional;
import emotions.TypeOfEmotions;

public class Piytka extends AbstractCharacter implements Run, Listen, Emotional {
    public Piytka(String name){
        super(name);
        System.out.println("Создан персонаж " + name);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " бежит, а не только есть грязь");
    }


    @Override
    public void listen() {
        System.out.println(this.getName() + " слушает");
    }

    @Override
    public void toEmotional(TypeOfEmotions type) {
        System.out.println(this.getName() + " испытывает эмоцию " + type);
    }

}
