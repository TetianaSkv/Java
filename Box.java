package HW_160523e;

public class Box {
    // Создайте класс Box, в котором будут три поля:
    // ширина, высота, длина этой коробки. Создайте внутри
    // этого класса конструктор, который принимает 3 значения
    // и определяет их в вышеописанные поля, помимо этого в
    // конструкторе подсчитывается объём коробки и печатается на экран.


    public double length;
    public double height;
    public double width;



    public Box(double length,double height,double width) {
        this.length = length;
        this.height = height;
        this.width = width;

        printSquare();

    }
    public void printSquare (){
        System.out.println("Square = " + length * height * width);
    }
}