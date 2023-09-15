package l6hw01;

public class Fraction {
    private final int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Знаменатель не может быть равен нулю.");
        }
    }


    public String Sign() {
        return numerator + " / " + denominator;
    }

    public Fraction add(Fraction otherFraction) {
        int commonDenominator = this.denominator * otherFraction.denominator;
        int newNumerator1 = this.numerator * otherFraction.denominator;
        int newNumerator2 = otherFraction.numerator * this.denominator;
        int resultNumerator = newNumerator1 + newNumerator2;
        return new Fraction(resultNumerator, commonDenominator);
    }

    public Fraction multiply(double number) {
        int newNumerator = (int) (this.numerator * number);
        return new Fraction(newNumerator, this.denominator);
    }

    public Fraction divide(double number) {
        if (number != 0) {
            int newDenominator = (int) (this.denominator * number);
            return new Fraction(this.numerator, newDenominator);
        } else {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
    }
}