import java.util.Arrays;

public class Lesson8 {
    public static void main(String[] args) {
        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println ("Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        int[] arrEmpty = new int[8];
        System.out.println (arrEmpty.length);
        System.out.println (Arrays.toString (arrEmpty));
        for (int i = 0, j = 0; i < arrEmpty.length; i++,j+=3) {
            arrEmpty[i] = j;
            //System.out.println ("i = " + i +" j = " + j);
            //System.out.print (arrEmpty[i]);
        }
        System.out.println (Arrays.toString (arrEmpty));
        int[][] arr = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
                {2, 5, 6}
        };
        //System.out.println (Arrays.toString (arr[2]));
        for (int i = 0; i < arr.length; i++) {
            System.out.println (Arrays.toString (arr[i]));

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println (arr[i][j]);
            }
        }
        /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 5;
                if(i == j) {
                    array[i][j] = 1;
                }
                System.out.print (array[i][j] + " ");
            }
            System.out.println ();
        }

        /*Создать  двумерный целочисленный массив 7 на 8,
        и заполнить каждый элемент рандомным числом;    Math.random() */
    }
}
