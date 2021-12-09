package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        System.out.println("Your age is: " + age());

        //exercise 2
        System.out.println("My name is: " + name());

        Scanner in = new Scanner(System.in);
        Random rand = new Random(); //new class

        int a, b, e3_start, e3_end;

        System.out.println("\nOPERATIONS ON TWO NUMBERS (sum, subtract, multiply)");
        System.out.println("Please type first number from which system will start looking for number: ");
        e3_start = in.nextInt();

        System.out.println("Please type second number which will be the end of the searching range: ");
        e3_end = in.nextInt();

        //choose random numbers from the given range
        a = rand.nextInt(e3_end-e3_start+1)+e3_start;
        b = rand.nextInt(e3_end-e3_start+1)+e3_start;

        System.out.println("Chosen range: from " + e3_start + " to " + e3_end);
        System.out.println("Numbers from this range: " + a + " and " + b);

        operations(a,b);

        //exercise 4
        System.out.println(even(5));

        //exercise 5
        System.out.println(div(10));

        //exercise 6
        System.out.println(pov(2));

        //exercise 7
        System.out.println(Square(4));

        //exercise 8

        int e8_start,e8_end, side_a, side_b, sice_c;

        System.out.println("\nCHECK IF WE CAN BUILD A TRIANGLE FROM VALUES IN CHOSEN RANGE");
        System.out.println("Please type first number from which system will start looking for number: ");
        e8_start = in.nextInt();

        System.out.println("Please type second number which will be the end of the searching range: ");
        e8_end = in.nextInt();

        side_a = rand.nextInt(e8_end-e8_start+1)+e8_start;
        side_b = rand.nextInt(e8_end-e8_start+1)+e8_start;
        sice_c = rand.nextInt(e8_end-e8_start+1)+e8_start;

        System.out.println("Sides of the triangle: side a - "+side_a+", side b - "+side_b+", side c - "+sice_c);

        System.out.println("Can we build triangle from those numbers?: " + Triangle(side_a,side_b,sice_c));
    }

    //Exercise 1 method,that returns age
    public static int age(){ //dlaczego static - powoduje to, że możemy taką metodę statyczną wywołać bez tworzenia instancji kalsy. Czyli możemy tą metodę wywołać w mainie. Gdyby tego nie było trzeba byłoby mieć jakieś rzeczy, coby możnma było w mainie to wywołać
        return 30;
    }

    //Exercise 2 method, that returns my name
    public static String name(){
        return "Sylwia";
    }

    //Exercise 3 method, that make operations on two arguments
    public static void operations(int x, int y){
        System.out.println("Sum: "+x+" + "+y+": " + (x+y));
        System.out.println("Subtraction: "+x+" - "+y+": " + (x-y));
        System.out.println("Multiplication: "+x+" * "+y+": " + (x*y));
    }

    //Exercise 4 method that get argument and return true if arg is even
    public static boolean even(int value){
        if (value % 2==0) return true;
        else return false;
    }

    //Exercise 5 method, that returns true if value is devided by 3 and 5
    public static boolean div(int value){
        return (value % 3 == 0 && value % 5 == 0);
    }

    //Exercise 6 method, that returns pov of the argument
    public static double pov(int value){
        return Math.pow(value,3);
    }

    //Exercise 7 method, that returns square of the argument
    public static double Square(int value){
        return Math.sqrt(value);
    }

    //Exercise 8 method, that returns true if triangle can be build
    public static boolean Triangle(int a, int b, int c){
        if (a + b <= c || a + c <= b || b + c <= a) return false;
        else return true;
    }
}
