public class pr2_3 {

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;

        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("The largest number is: " + largest);
    }
}
