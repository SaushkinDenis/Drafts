package SberEducation.Objects.Exceptions;

public class Fraction {
    final int numerator;
    final int divider;

    public Fraction(int numerator, int divider) throws NullDenominatorException {
        this.numerator = numerator;
        this.divider = divider;

        if (divider == 0){
            throw new NullDenominatorException(String.format("\nIncorrect divider!\n numerator: %d \n divider: %d", numerator, divider));
        }
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.divider;
    }

    public static void main(String[] args) throws NullDenominatorException {
        try {
            Fraction fraction = new Fraction(3, 0);
            System.out.println(fraction);
        }catch (NullDenominatorException ex){
            System.out.println(ex.getMessage());
        }
    }
}
