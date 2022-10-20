package locations;

public class Edge extends AbstractLocation{
    public Edge(String nameOfLocation){
        super(nameOfLocation);
        System.out.println("Локация объявлена как " + nameOfLocation);
    }
}
