package HW_160523e;

import java.util.Scanner;

public class HW_07_06 {
    // Создайте переменные (любое имя) и определите типы (наиболее подходящие) для следующих выражений:
    //
    //
    //(float) Math.pow(Math.E, 5) + 1.5;
    //
    //(byte) Math.log(2) + (short) 14;
    //
    //1 + 1.5;

    public static void main(String[] args) {

        //1
        double q = 1.5;
        float result = (float) (Math.pow(Math.E,5) + q);
        System.out.println(result);

        //2
        short w = 14;
        byte result2 = (byte) ((byte) Math.log(2) + w);
        System.out.println(result2);

        //3
        int  r = 1;
        double t = 1.5;
        double result3 = r + t;
        System.out.println(result3);

    }
}
