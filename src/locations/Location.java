package locations;

import items.Meal;

public enum Location {
    GROVE("Роща"),
    EDGE("Опушка"),
    AFRICA("Африка"),
    ROOM("Комната"),
    SHIP("Корабль"),
    STREET("Улица"),
    HOUSE("Дом"),
    BED("кровать"),
    BUFFET("Буфет");
    private String name;
    Location(String name){
        this.name = name;
    }
    public static class Time{
        public static void maelTaking(Meal var){
            System.out.println("Время " + var.getTypeOfMeal() + "a");
        }
        private static String timenow;
        public void changeTime(String t){
            timenow = t;
            System.out.println("Настало " +  timenow);
        }
        public String getTime(){
            return timenow;
        }
    }
    public String getLocation(){
        return this.name;
    }
    @Override
    public String toString(){
        return "Локация объявлена, как - " + this.getLocation();
    }
}
