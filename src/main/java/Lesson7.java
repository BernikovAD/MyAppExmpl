import java.util.Arrays;

public class Lesson7 {

    public static void main(String[] args) {
/*        Циклы while
        while (условие) {
            набор_операторов;
        }
        int i = 0;
        while (i < 10) {
            System.out.println (i);
            i++;
        }
        do {
            набор_операторов;
            while (условие);*/
/*        int x= 10;
        while(x<5){
            ++x;
            System.out.println ("x = " + x);
        }
        do{
            System.out.println ("x = " + x);
            x++;
        }while(x<5);

*//*        Массивы
        тип_данных[] имя_массива = new тип_данных[размер_массива];
        Двумерные массивы*//*
        int[][] table = new int[10][20];

        int num1 = 10, num2 = 12, num3 = 5;
        int[] arrayInt = new int[]{num1, num2, num3};

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println (arrayInt[i]);
        }
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0};
        System.out.println (Arrays.toString (arr));
        System.out.println ("Длинна массива " +arr.length);
         for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            }else if(arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println (Arrays.toString (arr));

        int[] arr1 = new int[200];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] =1+(int)(Math.random ()+11);
        }
        System.out.println (Arrays.toString (arr1));*/

/*        Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/


/*        Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/



    }
}
