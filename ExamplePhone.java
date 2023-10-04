package Homerwork.HW_260923;

public class ExamplePhone {
    public static void main(String[] args) {


        Phone phone1 = new Phone(13458, "iPhone", 200);
        phone1.receiveCall("Anna");
        System.out.println(phone1.getNumber());
        System.out.println("phone1: " + " " + phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());

        Phone phone2 = new Phone(1424235, "Nokia", 123);
        phone2.receiveCall("Olga");
        System.out.println(phone2.getNumber());
        System.out.println("phone2: " + " " + phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());


        Phone phone3 = new Phone(652459, "Motorola", 345);
        phone3.receiveCall("Mimi");
        System.out.println(phone3.getNumber());
        System.out.println("phone3: " + " " + phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());



    }
}