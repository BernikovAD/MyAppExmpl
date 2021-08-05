import OOP.Cat;

import java.util.Scanner;

public class Lesson11 {
    private static char[][] field;
    private static final int SIZE = 3;
    private static final char DOT_USER = 'X';
    private static final char DOT_PC = 'O';
    private static final char DOT_EMPTY = '.';
    private static Scanner scanner = new Scanner (System.in);
    private static int x, y;

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
                if (evaluate (field) == 1) {
                    System.out.println ("Вы выиграли!");
                } else if (evaluate (field) == 0) {
                    System.out.println ("Ход компьютера");
                    playPC ();
                }
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
            if (evaluate (field) == -1) {
                System.out.println ("Вы проиграли!");
            } else if (evaluate (field) == 0) {
                playUser ();
            }
        } else {
            playPC ();
        }
    }

    //Метод проверки 3 символов,вызывается из метода проверки выигрыша
    static boolean equals3(char a, char b, char c) {
        return (a == b) && (b == c) && (a != DOT_EMPTY);
    }

    static int evaluate(char[][] field) {
        // Проверка строк на победу
        for (int i = 0; i < SIZE; i++)
            if (equals3 (field[i][0], field[i][1], field[i][2])) {
                if (field[i][0] == DOT_USER) return 1;
                else if (field[i][0] == DOT_PC) return -1;
            }
        // Проверка столбцов для победы
        for (int col = 0; col < SIZE; col++) {
            if (equals3 (field[0][col], field[1][col], field[2][col])) {
                if (field[0][col] == DOT_USER) return 1;
                else if (field[0][col] == DOT_PC) return -1;
            }
        }
        // Проверка диагоналей на победу
        if (equals3 (field[0][0], field[1][1], field[2][2])) {
            if (field[0][0] == DOT_USER) return 1;
            else if (field[0][0] == DOT_PC) return -1;
        }
        if (equals3 (field[0][2], field[1][1], field[2][0])) {
            if (field[0][2] == DOT_USER) return 1;
            else if (field[0][2] == DOT_PC) return -1;
        }
        // Иначе, если ни один из них не выиграл, вернуть 0
        return 0;
    }

}
