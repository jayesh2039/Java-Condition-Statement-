public class pr2_5 {
    public static void main(String args[]) {
        int sub1 = 55;
        int sub2 = 67;
        int sub3 = 88;
        int sub4 = 76;

        int total = sub1+sub2+sub3+sub4;
        float per = (total/400.0f)*100;

        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && sub4 >= 33) {
            System.out.println("Total Is : "+total);
            System.out.println("Per Is : "+per);

            if (per >= 80) {
                System.out.println("You Got an A+ Grade");
            }
            if (per >= 70 && per < 80) {
                System.out.println("You Got an A Grade");
            }
            if (per >= 60 && per < 70) {
                System.out.println("You Got a B Grade");
            }
            if (per >= 50 && per < 60) {
                System.out.println("You Got a C Grade");
            }
            if (per >= 40 && per < 50) {
                System.out.println("You Got a D Grade");
            }
            if (per >= 33 && per < 40) {
                System.out.println("You Are Pass With Low Marks & Low Grade");
            }
        }
        else {
            System.out.println("You Are Feild");
        }
    }
}
