import java.util.Scanner;

public class Lesson11 {
    public static char[][] field;
    public static final int SIZE = 3;
    public static final char DOT_USER = 'X';
    public static final char DOT_PC = 'O';
    public static final char DOT_EMPTY = '.';
    public static Scanner scanner = new Scanner (System.in);
    public static int x, y;

    public static void main(String[] args) {
        System.out.println ("Игра в крестики нолики \nВы ходите крестиками");
        init ();
        printField ();
        playUser ();

    }

    //Инициализируем двумерный массив(наше поле) и присваиваем каждому элементу символ EMPTY
    public static void init() {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    //Выводим в консоль наш двумерный массив(поле)
    public static void printField() {
        for (int i = 0; i <= field.length * 2; i++) {
            for (int j = 0; j <= field[0].length * 4; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0 && j % 4 != 0 && j != 0 && j != field[0].length * 4)
                        System.out.print (field[(i - 1) / 2][(j - 2) / 4]);
                    else if (j % 4 == 0)
                        System.out.print ('▌');
                    else
                        System.out.print (' ');
                } else {
                    System.out.print ('▃');
                }
            }
            System.out.println ();
        }
/*        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print (field[i][j] + " ");
            }
            System.out.println ();
        }*/
    }

    //Ход игрока
    public static void playUser() {
        System.out.println ("Ваш ход");
        System.out.println ("Введите первую кординату хода от 0 до " + (SIZE - 1));
        x = scanner.nextInt ();
        System.out.println ("Введите вторую кординату хода от 0 до " + (SIZE - 1));
        y = scanner.nextInt ();
        if (isValid (x, y)) {
            if (field[x][y] == DOT_EMPTY) {
                field[x][y] = DOT_USER;
                printField ();
                playPC ();
            } else {
                System.out.println ("Данная клетка занята");
                playUser ();
            }
        } else {
            System.out.println ("Ошибка в кординатах\nЦирфы должны быть в промежутке от 0 до " + (SIZE - 1));
            playUser ();
        }
    }

    //Проверяем на валидность наши координаты
    public static boolean isValid(int a, int b) {
        return ((a >= 0 && a < SIZE) && (b >= 0 && b < SIZE));
    }

    //ход компьютера
    public static void playPC() {
        x = (int) (0 + Math.random () * (SIZE - 1));
        y = (int) (0 + Math.random () * (SIZE - 1));
        if (field[x][y] == DOT_EMPTY) {
            field[x][y] = DOT_PC;
            printField ();
            playUser ();
        } else {
            playPC ();
        }
    }
}
