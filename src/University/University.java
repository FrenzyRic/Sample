//class path
package lecture_180912; //Declaring a package

import java.util.Scanner; // from another package

public class University
{
    public static void main(String[] args)
    {
        Scanner msPacman = new Scanner (System.in);

        System.out.println();
        System.out.println("Please, type the name of the student:");
        System.out.println();


        //Option 1
        //String name
        //name = msPacman.nextLine();

        //Option 2
        String name = msPacman.nextLine(); //this is declaring AND assigning

        System.out.println();
        System.out.println("Please type your points: ");
        System.out.println();
        double points = msPacman.nextDouble();

        //System.out.println(name);

        System.out.println("Welcome " + name + " to our university! " );
        System.out.println();
        System.out.println( name + " you have " + points + " points." );


    }
}
