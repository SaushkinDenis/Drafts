package SberEducation.Objects;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() { return this.value; }

    public boolean isEven(){ return isEven(getValue()); }

    public boolean isOdd(){ return isOdd(getValue()); }

    public boolean isPrime(){ return isPrime(getValue()); }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static boolean isPrime(int value){
        if ((value == 1) || (value == 2)) {
            return true;
        }

        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger integer){ return isEven(integer.getValue()); }

    public static boolean isOdd(MyInteger integer){ return isOdd(integer.getValue()); }

    public static boolean isPrime(MyInteger integer){ return isPrime(integer.getValue()); }

    public boolean equals(int value){ return getValue() == value;}

    public boolean equals(MyInteger integer){ return getValue() == integer.getValue();}

    public static int parseInt(char[] chars){
        int result = 0;
        for (char aChar : chars) {
            result = result * 10 + (aChar - '0');
        }
        return result;
    }

    public static int parseInt(String string){
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            result = result * 10 + (string.charAt(i) - '0');
        }

        return result;
    }
}




