package items;

public enum Meal {
    BREAKFAST("завтрак"),
    DINNER("обед"),
    SUPPER("ужин");
    private String name;
    Meal(String name){
        this.name = name;
    }
    public String getTypeOfMeal(){
        return this.name;
    }

}
