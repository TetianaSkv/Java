package HW_160523e;

public class HW_28_06 {
    public static void main(String[] args) {
        //Разработайте алгоритм с помощью цикла for,
        // который смог бы вывести в консоль такую последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512

        int[] a = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

        for (int cycle : a){
            System.out.print(cycle + " ");
        }
    }
}
