public class Weather {
    private String weatherNow;
    public Condition condition = new Condition();
    class Condition{
        void change(String tt){
            System.out.println("Погода была изменена на " + tt);
            weatherNow = tt;
        }
    }
    public void change(String str){
        condition.change(str);
    }

    public String getWeatherNow() {
        return weatherNow;
    }
}
