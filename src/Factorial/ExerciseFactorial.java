package Factorial;

import java.util.Scanner;


public class ExerciseFactorial {
    public static void main(String[] args){


        System.out.println("Enter your Birth Year: ");
        Scanner sc = new Scanner(System.in);
        int birthYear = sc.nextInt();
        int result=birth(birthYear);
        System.out.println("You are "+ result + " years old.");


    }

    public static int birth ( int age){
        int age1 = 2018 - age;
        return age1;
    }

    public static int getFactorial(int someNumber){
        int factorial = 1;
        //5! = 5*4*3*2*1
        for(int i = someNumber; i >= 1; i=i-1){
            factorial = factorial * i;
        }
        return 0;
    }

}
