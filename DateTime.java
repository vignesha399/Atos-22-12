import java.time.LocalDateTime;

public class DateTime {
    public static void Date() {
        LocalDateTime local = LocalDateTime.now();
        System.out.println("Local Date Time : "+local.getDayOfYear()+"\n getyear :  "+local.getYear()+"\n get DayOfMonth "+local.getDayOfMonth()+"\n getMonthValue : "+local.getMonthValue()+"\n getMonth : "+local.getMonth()+ "\n getDayOfWeek"+local.getDayOfWeek());
    }
    public static void main(String[] args) {
        Date();
    }
    
}
