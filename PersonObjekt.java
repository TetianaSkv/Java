package Homerwork.HW_260923;

public class PersonObjekt {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Sasha");
        personOne.setFullName("Krutow");
        personOne.setAge(30);

        personOne.move();
        personOne.talk();


        Person personTwo = new Person("Anna", "Dolgaja", 25);

        personTwo.move();
        personTwo.talk();


    }


}
