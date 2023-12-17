import java.util.Scanner;
public class pr2_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Your Gender : ");
        String gen = sc.next();//.charAt(0);
        System.out.println("Enter Your Height : ");
        double height = sc.nextDouble();

        System.out.println("Your Name Is : "+name);
        System.out.println("Your Age Is : "+age);
        System.out.println("Your Gender Is : "+gen);
        System.out.println("Your Height Is : "+height);
    }
}
