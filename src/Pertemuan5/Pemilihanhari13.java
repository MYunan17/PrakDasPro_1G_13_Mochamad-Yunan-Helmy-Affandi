package Pertemuan5;
import java.util.Scanner ;

public class Pemilihanhari13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        String dayName,dayType;
        System.out.print("Input Day Name : ") ;
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType="weekday";
                break;
                case "saturday":
                case "sunday":
                    dayType="weekend";
                    break;
            default:
                dayType = "Invalid day name";
        }
        System.out.println(dayName + " is a " + dayType);
    }
}
