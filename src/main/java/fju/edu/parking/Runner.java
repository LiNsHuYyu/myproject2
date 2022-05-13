package fju.edu.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "09:00";
        String exitTime = "12:25";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try{
            d = sdf.parse(enterTime);
        }catch (Exception e){
            System.out.println("Wrong Format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        //long ms = 3*60*60*1000;
        Date d2 = null;
        try{
            d2 = sdf.parse(exitTime);
        }catch (Exception e){
            System.out.println("Wrong Format");
        }
        //d2.setTime(d.getTime()+ms);
        System.out.println(d2);
        System.out.println(d2.getTime());
        int mins = (int)(d2.getTime()-d.getTime())/1000/60;
        System.out.println(mins);
        int fees = 30*(mins/60);
        /*if(mins%60>=15){
            fees+=30;
        }*/
        if(mins%60<=14){
            fees+=0;
        }else if(mins%60<=30){
            fees+=15;
        }else {
            fees+=30;
        }
        System.out.println("Fee:"+fees);
        //one hour(60minutes) NT 30
        //3:14 => NT 90 , 3:15 => NT 120
        //3:15~3:30 => NT 105
    }
}
