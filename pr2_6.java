public class pr2_6 {
    public static void main(String[] args) {
            int sub1 = 63;
            int sub2 = 67;
            int sub3 = 65;
            int sub4 = 68;

            int total = sub1 + sub2 + sub3 + sub4;
            float percentage = (total / 400.0f) * 100;


            if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && sub4 >= 33) {

                System.out.println("Total Is : " + total);
                System.out.println("Per Is : " + percentage);

                if (percentage >= 80) {
                    System.out.println("You Are A+ Grade");
                }
                else if (percentage >= 70) {
                    System.out.println("You Are A Grade");
                }
                else if (percentage >= 60) {
                    System.out.println("You Are B Grade");
                }
                else if (percentage >= 50) {
                    System.out.println("You Are C Grade");
                }
                else if (percentage >= 40) {
                    System.out.println("You Are D Grade");
                }
                else if (percentage >= 33) {
                    System.out.println("You Are Pass With Low Marks & Grade");
                }
            }
            else {
                System.out.println("You Are Fail");
            }
    }
}


