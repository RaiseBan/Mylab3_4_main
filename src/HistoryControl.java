public class HistoryControl {
    private static int chapterNumber = 10;
    public static void startStory(){
        System.out.println("...Начало истории");
    }
    public static void chapter(){
        chapterNumber++;

        System.out.println("\n\t\t Глава №" + chapterNumber);
    }
    public static void endOfTheStory(){
        System.out.println("Продолжение следует...");
    }
}
