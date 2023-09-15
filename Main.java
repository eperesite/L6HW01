package l6hw01;

import l6hw01.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 5);

        System.out.println("Дробь 1: " + fraction1.Sign());
        System.out.println("Дробь 2: " + fraction2.Sign());

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Сумма: " + sum.Sign());

        Fraction product = fraction1.multiply(1.5);
        System.out.println("Произведение: " + product.Sign());

        Fraction quotient = fraction1.divide(2.0);
        System.out.println("Частное: " + quotient.Sign());
    }
}
