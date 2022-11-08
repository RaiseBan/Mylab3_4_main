import characters.Piytka;
import characters.RobinAbobin;
import characters.VinniPux;
import emotions.TypeOfEmotions;
import locations.Edge;
import locations.Grove;

public class Main {
    public static void main(String[] args) {
        Piytka p1 = new Piytka("Пятка");
        RobinAbobin p2 = new RobinAbobin("РобинАбобин");
        VinniPux p3 = new VinniPux("Опух");
        System.out.println();
        p1.run();
        p2.run();
        p3.run();
        System.out.println();
        Edge l1 = new Edge("Опушка");
        Grove l2 = new Grove("Роща");
        System.out.println();

        p3.toEmotional(TypeOfEmotions.CHEERS);
        System.out.println();
        p3.toCommunicate();
        p2.toCommunicate();
        System.out.println();
        p1.listen();
        p3.listen();
        System.out.println();
        p1.toEmotional(TypeOfEmotions.ASTONISHMENT);
        p3.toEmotional(TypeOfEmotions.ASTONISHMENT);
        System.out.println();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(l1.toString());


    }
}
