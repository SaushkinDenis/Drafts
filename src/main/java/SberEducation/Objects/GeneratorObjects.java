package SberEducation.Objects;

import java.util.Random;

public class GeneratorObjects {
    public static void main(String[] args) {
//        rectangle();
//        stock();
//        random();
//        largestTable();
//        createTime();
//        createMyInteger();
//        createMyDate();
    }


    public static void stock(){
        Stock stock = new Stock("USD-RUB", "Доллар США", 53.665, 55.82);
        System.out.println(stock.getChangePercent());
    }

    public static void rectangle(){
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle2.getPerimeter());
    }

    public static void random(){
        Random random = new Random(100);
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(100));
        }
    }

    public static void largestTable(){
        double[][] table = {
                {1.3, 3.2, 5.2},
                {1.4, 5.2, 2.8}};

        System.out.println(Location.locateLargest(table));
    }

    public static void createTime(){
        MyTime myTime = new MyTime();
        System.out.println(myTime.getTime());

        MyTime nextTime = new MyTime(817550900);
        System.out.println(nextTime.getTime());
    }

    public static void createMyInteger(){
        MyInteger myInteger = new MyInteger(55);
        MyInteger myInteger1 = new MyInteger(54);
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.equals(54));
        System.out.println(myInteger.equals(myInteger1));

        System.out.println(MyInteger.isPrime(12));
        System.out.println(MyInteger.isPrime(myInteger1));
        System.out.println(MyInteger.parseInt("2222"));
        System.out.println(MyInteger.parseInt(new char[]{'2', '3', '4'}));
    }

    public static void createMyDate(){
        MyDate myDate = new MyDate();
        System.out.println(myDate.getDay() + "." + myDate.getMonth() + "." + myDate.getYear());

        MyDate myDate1 = new MyDate(561555550000L);
        System.out.println(myDate1.getDay() + "." + myDate1.getMonth() + "." + myDate1.getYear());
    }
}
