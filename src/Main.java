import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

       Scanner in = new Scanner(System.in);
       int  Age ;
        System.out.print("please enter your age: ");
        Age = in.nextInt();

        if (Age >= 21)
        {
            System.out.println(" You get a paper wrist band: ");
            System.out.println(" your age is 21 or older: ");
        }
        else if (Age !=21)

        {
           System.out.println("you do not get a wrist band: " );
           System.out.println(" you are not 21 years old: ");
        }
        else
        {
            System.out.println("No paper wrist band for you: ");
            System.out.println(" you are not 21 years or older: ");
        }

    }
}