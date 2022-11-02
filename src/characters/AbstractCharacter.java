package characters;

import locations.AbstractLocation;

public abstract class AbstractCharacter {
    private String name;
//    Constructors
    public AbstractCharacter(String name){
        this.name = name;
    }
//    Methods
    public String getName(){
        return this.name;
    }
    @Override
    public int hashCode() {
        return (name != null ? name.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractCharacter loc = (AbstractCharacter) o;
        return (name == loc.name);
    }

    @Override
    public String toString(){
        return "Character{"
                + "fullName='" + this.getName() + '\''
                + ", Action= Преподаватель запретил ArrayList( => вот этих ваших действий НЕ БУДЕТ!!! "
                + '}';
    }

}
