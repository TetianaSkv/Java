package homework;

import java.util.Locale;
import java.util.Scanner;

public class JavaHW2104 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("сколько коробок вы хотите отправить?");
        int amount = reader.nextInt();
        System.out.println("сколько весит каждая коробка в киллограммах?");
        double weight = reader.nextDouble();

        System.out.println("Введите имя получателя посылки:");
        reader.nextLine(); // stub
        String name = reader.nextLine();
        System.out.println("Введите фамилию получателя:");
        String secondName = reader.nextLine();
        System.out.println("Введите адрес получателя посылки:");
        String address = reader.nextLine();

        double totalWeight = amount * weight;

        System.out.println("Получатель: \"" + name.toUpperCase() + " " + secondName.toUpperCase() + "\"\n"
                      + "Адрес: \""  + address.toUpperCase() + "\"\n"
                      + "Вес посылки: " +  totalWeight + " kg");

        System.out.println("Все верно? да/нет");
        boolean isCorrect = reader.hasNextBoolean();



    }
}
