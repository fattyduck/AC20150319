package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 3/19/15.
 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class birthdayCalc {
    public static int birthDay(int month, int day){
        int bday=day;
        int bmonth=month;
        int bdoy=0;
        if(month==1){
            bdoy=bday;
        }else if(month==2){
            bdoy=bday+31;
        }else if(month==3){
            bdoy=bday+59;
        }else if(month==4){
            bdoy=bday+90;
        }else if(month==5){
            bdoy=bday+120;
        }else if(month==6){
            bdoy=bday+151;
        }else if(month==7){
            bdoy=bday+181;
        }else if(month==8){
            bdoy=bday+212;
        }else if(month==9){
            bdoy=bday+243;
        }else if(month==10){
            bdoy=bday+273;
        }else if(month==11){
            bdoy=bday+304;
        }else if(month==12){
            bdoy=bday+334;
        }
        return bdoy;
    }
    public static void main(String[] args){
        Calendar now=Calendar.getInstance();
        Scanner cow=new Scanner(System.in);
        int currDay=now.get(Calendar.DAY_OF_YEAR);
        System.out.println("Which month of the year were you born in");
        int month=cow.nextInt();
        System.out.println("Which day of the month were you born in");
        int day=cow.nextInt();

        int daysLeft;
        if(birthDay(month, day)<currDay){
            daysLeft=365-currDay+birthDay(month, day);
            System.out.println(daysLeft);
        }else{
            daysLeft=birthDay(month, day)-currDay;
            System.out.println(daysLeft);
        }

    }

}
