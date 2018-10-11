import java.util.Scanner;

public class Exercise4 {
    public static void  main(String [] args)
    {
        // OMAE WA MO SHINDEIRU
        //int age = 25;

        Scanner pacman = new Scanner(System.in);

        System.out.print("Please type your name: ");
        String line = pacman.nextLine();

        System.out.println(line);

        System.out.println("Please type your age: ");
        int age = pacman.nextInt();

        System.out.println("Name is " + line + " age is " + age);


    }
}