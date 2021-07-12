public class Lesson5 {
    public static void main(String[] args) {
        int x = 1;
        String month = "";
        switch (x) {
            case 1:
                month = "Понедельник";
                break;
            case 2:
                month = "Вторник";
                break;
            case 3:
                month = "Среда";
                break;
            case 4:
                month = "Четверг";
                break;
            case 5:
                month = "Пятница";
                break;
            case 6:
                month = "Суббота";
                break;
            case 7:
                month = "Воскресение";
                break;
            default:
                System.out.println ("Такого дня недели не существует");
        }
        System.out.println ("Сегодня у нас " + month);

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
