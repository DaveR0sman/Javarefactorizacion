package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        int num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        int num2 = console.nextInt();
        System.out.println( num1+" + "+num2+" = "+ suma(num1, num2));

        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        System.out.println( num1+" - "+num2+" = "+ resta(num1, num2));

        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        System.out.println( num1+" * "+num2+" = "+ multiplicacion(num1, num2));

        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        System.out.println( num1+" / "+num2+" = "+ division(num1, num2));
    }
    public static int suma(int num1, int num2){
        return  num1 + num2;
    }
    public static int resta(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicacion(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;*/
        int num1,num2;
        Scanner console = new Scanner( System.in);
        System.out.print("Enter addition number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter addition number 2  ");
        num2 = console.nextInt();
        sum(num1,num2);

        System.out.print("Enter subtraction number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter subtraction number 2  ");
        num2 = console.nextInt();
        subtraction(num1,num2);

        System.out.print("Enter multiplication number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter multiplication number 2  ");
        num2 = console.nextInt();
        multiplication(num1, num2);

        System.out.print("Enter division number 1  ");
        num1 = console.nextInt();
        System.out.print("Enter division number 2  ");
        num2 = console.nextInt();
        division(num1,num2);
    }
    public static int sum(int n1,int n2){
        int addition = n1 + n2;
        System.out.println( n1+" + "+n2+" = "+ addition);
        return 0;
    }
    public static int subtraction(int num1,int num2){
        int subtraction = num1 - num2;
        System.out.println( num1+" - "+num2+" = "+ subtraction);
        return 0;
    }
    public static int multiplication(int num1,int num2){
        int multiplication = num1 * num2;
        System.out.println( num1+" * "+num2+" = "+ multiplication);
        return 0;
    }
    public static int division(int num1,int num2){
        if (num1==0||num2==0)
            System.out.println("operacion no valida");
        else {
            int division = num1 / num2;
            System.out.println( num1+" / "+num2+" = "+ division);
        }
        return 0;
    }
}
