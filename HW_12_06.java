package HW_160523e;

public class HW_12_06 {
    public static void main(String[] args) {
        //создайте три переменные типа char, равные 0,
        // разработайте подход для перевода значения из char в int тремя способами


        char q = '0';
        char w = '0';
        char b = '0';

        // 1.

        int r = q;
        System.out.println(r);

        //2.

        String t = String.valueOf(w);
        int tt = Integer.parseInt(t);
        System.out.println(tt);

        //3.
        int y = Character.getNumericValue(b);
        System.out.println(y);













    }
}
