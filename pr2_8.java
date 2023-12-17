public class pr2_8 {
    public static void main(String args[]) {
        int unit = 50;
        if (unit < 100) {
            System.out.println("You Pay Amount Is 7.00 Rs Per Unit");
        }
        if (unit >= 100 && unit < 200) {
            System.out.println("You Pay Amount Is 7.50 Rs Per Unit");
        }
        if (unit >= 200 && unit < 300) {
            System.out.println("You Pay Amount Is 8.00 Rs Per Unit");
        }
        if (unit > 300) {
            System.out.println("You Pay Amount Is 8.50 Rs Per Unit");
        }
    }
}
