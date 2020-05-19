package in.irfanrose.calculationlibrary;

public class TimeCalc {

    //-------------------------------Milliseconds to Minutes---------------------------------------
    public static long msToMin(long milliseconds){
        return (milliseconds / 1000) / 60;
    }

    //-------------------------------Milliseconds to Seconds---------------------------------------
    public static long msToSec(long milliseconds){
        return (milliseconds / 1000);
    }

    //-------------------------------Minutes to Seconds---------------------------------------
    public static long minToSec(long minutes){
        return (minutes *60);
    }

    //-------------------------------Minutes to Seconds---------------------------------------
    public static long minToMs(long minutes){
       // return minutes * 60 * 1000;
        return minutes * 60000;
    }

    //-------------------------------Minutes to Hour---------------------------------------
    public static long minToHr(long minutes){
        // return minutes * 60 * 1000;
        return minutes%60;
    }

    //-------------------------------Hour to Milliseconds---------------------------------------
    public static long hrToMs(long hours){
        // return hours * 60 * 60 *1000;
        return hours * 3600000;
    }

    //-------------------------------Hour to Minutes---------------------------------------
    public static long hrToMin(long hours){
        return hours * 60;
    }

    //-------------------------------Hour to Seconds---------------------------------------
    public static long hrToSec(long hours){
        // return hours * 60 * 60;
        return hours * 3600;
    }


}
