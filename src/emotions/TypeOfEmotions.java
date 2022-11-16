package emotions;
public enum TypeOfEmotions {

    CHEERS("Приветственные возгласы"),
    ASTONISHMENT("Удивление"),
    SADNESS("грусть"),
    HAPPY("Счастливый");

    String name;
    TypeOfEmotions(String name){
        this.name = name;

    }
    public String getEmotion(){
        return this.name;
    }
}