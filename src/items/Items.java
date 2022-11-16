package items;

public enum Items {
    DOOR("дверь"),
    CANDLE("Свечка");
    private String name;
    Items(String name){
        this.name = name;
    }
    public String getItemName(){
        return this.name;
    }

}
