package SberEducation.Objects.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalendar {
    final String[] months = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

    final int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        MyCalendar myCalendar = new MyCalendar();
        try {
            myCalendar.createCalendar();
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException ex){
            System.out.println("Incorrect month!");
        }
    }

    public void createCalendar() throws ArrayIndexOutOfBoundsException{
        System.out.print("Input month:");

        int month = scanner.nextInt();

        if (month < 0 || month > 12){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println(this.months[month - 1] + " " + this.dom[month - 1]);
    }
}
