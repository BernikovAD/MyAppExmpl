import java.util.Arrays;
import java.util.Scanner;


public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt ();
        int n = scanner.nextInt ();
        int[][] arr = new int[m][n];
        //Вызовем метод заполнения числами
        System.out.println ("результат метода");
        //Вызовем метод подсчета суммы элементов массива
        System.out.println ("результат метода");
        //Вызываем метод подсчета среднего арифметического
        System.out.println ("результат метода");
        //Вызываем метод вычесть из суммы максимальное и минимальное число
        System.out.println ("результат метода");
        //sumMinusMaxMin (mass);

 /*      Дан двумерный целочисленный массив m * n
        (где m — количество строк, а n — количество элементов в строке).
        Размеры мы определяем сами.  Нужно заполнить последовательно массив от 1 до x. Пример
        1, 2, 3, 4
        5, 6, 7, 8
        9,10,11,12
        После посчитать сумму всех элементов.
        Вычислить среднее арифметическое  сумму / кол-во элементов массива m * n
        После вычесть из суммы максимальное и минимальное число
        Каждую подзадачу вывести в отдельный метод*/
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine(); //Создаем новую строку и спрашиваем пользователя что в нее
        System.out.println(str); // Выводим ее на экран
        int i = scanner.nextInt (); //Создаем новую переменную типа инт и спрашиваем пользователя что записать в нее
        System.out.println(i);
    }
    //метод заполнения цифрами public static int[][] fsdgsdfgdf (int[][] array){ как будет заполняться return array}
    public static int[][] nameMet (int[][] array){
        //как будет заполняться
    return array;
    }
    //Метод который считаем сумму всех элементов массива
    //Метод среднее арифметическое
    //Метод сумма минус макс и мин
    public static int sum(int[][] array){
        int sum = 0;

        return sum;
    }
    public static int sumMinusMaxMin(int[][] array){
        int max = array[0][0];
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(max > array[i][j]) max = array[i][j];

            }
        }
        int result = 0;
        result = sum(array) - max - min;
        return result;
    }
    //Дан массив m * n. Вывести в консоль ровными столбиками
    // 1   2   3
    // 11  12  13
    // 111 112 113


}
