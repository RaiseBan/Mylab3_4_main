package locations;

public abstract class AbstractLocation {
    private String location;


    public AbstractLocation(String name){this.location = name;}

    public String getLocation(){return this.location;}


    @Override
    public int hashCode() {
        return (location != null ? location.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractLocation loc = (AbstractLocation) o;
        return (location == loc.location);
    }

//    @Override
//    public String toString(){
//        return "Loc{"
//                + "fullName='" + this.getLocation() + '\''
//                + ", Мест не будет"
//                + '}';
//    }
}
