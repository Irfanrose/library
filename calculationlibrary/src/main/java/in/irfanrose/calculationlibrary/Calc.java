package in.irfanrose.calculationlibrary;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calc {
    //-----------------------------Addition of two numbers------------------------------------------
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static float add(float num1,float num2){
        return num1+num2;
    }
    public static long add(long num1,long num2){
        return num1+num2;
    }

    //-----------------------------Subtraction of two numbers---------------------------------------
    public static int sub(int num1,int num2){
        return num1-num2;
    }
    public static float sub(float num1,float num2){
        return num1-num2;
    }
    public static long sub(long num1,long num2){
        return num1-num2;
    }

    //-----------------------------Multiplication of two numbers------------------------------------
    public static int multiply(int num1,int num2){
        return num1*num2;
    }
    public static float multiply(float num1,float num2){
        return num1*num2;
    }
    public static long multiply(long num1,long num2){
        return num1*num2;
    }

    //-----------------------------Division of two numbers------------------------------------------
    public static int divide(int num1,int num2){
        try{
            int result=num1/num2;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static float divide(float num1,float num2){
        try{
            float result=num1/num2;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static long divide(long num1,long num2){
        try{
            long result=num1/num2;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //---------------------------------Percentage---------------------------------------------------

   /* public static double percentage(double amount,int percentage){
        try{
            double result=((amount/100)*percentage);

            //for display output with two decimal place
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.FLOOR);
            double result1 = new Double(df.format(result));

            return result1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }*/
}
