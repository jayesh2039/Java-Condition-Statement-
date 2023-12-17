import java.util.Scanner;

class pr2_1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        double num = sc.nextDouble();

        if (num > 0)
        {
            System.out.println("Number Is Positive");
        }
        else if (num < 0)
        {
            System.out.println("Number Is Negative");
        }
        else
        {
            System.out.println("Number Is Zero");
        }
    }

}
