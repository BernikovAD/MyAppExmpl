public class Lesson5 {
    public static void main(String[] args) {
        int x = 1;
        switch (x) {
            case 1,5:
                System.out.println ("Switch: x = 1 или 5");
                break;
            case 3:
                System.out.println ("Switch: x = 3");
                break;
            case 4:
                System.out.println ("Switch: x = 4" );
                break;
            case 2:
                System.out.println ("Switch: x = 2" );
                break;
            case 6:
                System.out.println ("Switch: x = 6");
                break;
            default:
                System.out.println ("Switch: x = " + x);
        }
        if (x == 1) {
            System.out.println ("IF: x=1");
        } else if (x == 2) {
            System.out.println ("IF: x=2");
        } else if (x == 3) {
            System.out.println ("IF: x=3");
        } else if (x == 4) {
            System.out.println ("IF: x=4");
        } else if (x == 5) {
            System.out.println ("IF: x=5");
        } else if (x == 6) {
            System.out.println ("IF: x=6");
        }else if (x > 6) {
            System.out.println ("IF: x= " + x);
        }
    }
}
