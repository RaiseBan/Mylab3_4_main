package locations;

public class Grove extends AbstractLocation {
    public Grove(String nameOfLocation){
        super(nameOfLocation);
        System.out.println("Локация объявлена как " + nameOfLocation);
    }
    
}
