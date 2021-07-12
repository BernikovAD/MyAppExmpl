import java.sql.SQLOutput;

public class Lesson6 {
    public static void main(String[] args) {
/*        for (инициализация; условие; итерация) {
            набор_операторов;
        }*/
        System.out.println (1);
        System.out.println (2);
        System.out.println (3);
        System.out.println (4);
        System.out.println (5);

        for (int i = 1; i < 6; i++) {
            System.out.println ("for " +i);
        }

        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");
        System.out.println ("Привет");

        for (int i = 0; i < 10; i++) {
            System.out.println ("Привет");
        }
        String s = "AB";
        String[] sm = {"A", "B", "C", "D"};
        for (String o : sm) {
            s += o;
        }
        System.out.println (s);
/*        Цикл foreach
        public static void main(String[] args) {
            String[] sm = {"A", "B", "C", "D"};
            for (String o : sm) {
                System.out.print(o + " ");
            }
        }
        Результат:
        A B C D
        Вложенные циклы
        public static void main(String args[]) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + i + j);
                }
            }
        }
        Результат:
        00 01 02 10 11 12 20 21 22*/








    }

}
