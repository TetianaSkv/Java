package HW_160523e;

public class HW_19_06 {
    // Напишите программу, которая вычисляет, сколько лишних калорий будет,
    // если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
    // Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
    // пиццы содержит 40 калорий.
    // В качестве подсказки - лучше всего создать метод для вычисления калорий
    // в зависимости от диаметра пиццы, его можно использовать дважды
    // (не забываем про переиспользование) и получим дельту, это и будет ответ.
    // Формулу для нахождения площади пиццы (и не только)
    // можно найти на просторах интернета.

    public static void main(String[] args) {

        // S = dˆ2 / 4 × π
        // kcal = (S1 - S2)*40
        // classic way
        int d1 = 28;
        int d2 = 24;
        double kcal = ((Math.pow(d1, 2) / 4 * Math.PI) - (Math.pow(d2, 2) / 4 * Math.PI)) * 40;
        System.out.println(kcal);

        // way using void methods
        PizzaOne s1 = new PizzaOne(d1,d2);



    }}