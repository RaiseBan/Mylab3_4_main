package characters;

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
    public String toString(){
        return "Character{"
                + "fullName='" + this.getName() + '\''
                + ", Action= Преподаватель запретил ArrayList( => вот этих ваших действий НЕ БУДЕТ!!! "
                + '}';
    }

}
