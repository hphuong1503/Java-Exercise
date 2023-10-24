package Enum;

public class EnumMain {
    public static void main(String[] args) {
        DayOfTheWeek day;
        day = DayOfTheWeek.FRIDAY;

        switch (day){
            case MONDAY -> System.out.println("monday");
            case TUESDAY -> System.out.println("tuesday");
            case WEDNESDAY -> System.out.println("wednesday");
            case THURSDAY -> System.out.println("thursday");
            case FRIDAY -> System.out.println("friday");
            case SATURDAY -> System.out.println("saturday");
            case SUNDAY -> System.out.println("sunday");
        }
    }
}
