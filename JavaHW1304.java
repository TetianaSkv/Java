import java.util.Scanner;

public class JavaHW1304 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String firstName = reader.nextLine();
        System.out.println("Введите Вашу фамилию");
        String secondName = reader.nextLine();
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);
    }
}
