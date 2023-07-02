package HW_160523e;

import java.util.Scanner;

public class HW_26_06 {
    public static void main(String[] args) {
        // Создайте алгоритм, который считывал бы через Scanner
        // число и проверял бы четное оно или нет (результат
        // четности/нечетности необходимо вывести в консоль)

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();


        if (number % 2 == 0){
            System.out.println("четное");}

            else
            System.out.println("не четное");


        }
    }
