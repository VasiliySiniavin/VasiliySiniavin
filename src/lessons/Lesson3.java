package lessons;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, -4, 7, 1, 30_000, -2_000_000, 0};
        int i = 11;
        Integer i1 = null;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);

        int[] arr2 = {1, 2, -4, 7, 1, 30_000, -2_000_000, 0};
//если надо найти значение в массиве по списку, остановиться на нужном значении.
        for (i = 0; i < arr.length; i++) {
            System.out.println("i = " + "arr[i] = " + arr[i]);
            if (arr[i] == -4) {
                System.out.println("found -4 index is " + i + "\n");
                break;
            }
        }
//ищем значение но не печатаем какой он по номеру в массиве
        for (i = 0; i < arr.length; i++) {
            System.out.println("i = " + "arr[i] = " + arr[i]);
            if (arr[i] == -4) {
                continue;
            }
            System.out.println("found -4 index is " + i);
        }
//меняем значение внутри массива и производим умножение
        for (i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
        System.out.println(Arrays.toString(arr) + "\n");
//проверяем что массив содержит
        String[] strings = null;
        System.out.println(strings);
        if (strings != null) {
            System.out.println(strings.length);
        }

        strings = new String[]{}; //создаем новый массив в котором не будет ни одной ячейки
        System.out.println(strings);
        System.out.println(strings.length); // смотри длину массива
        System.out.println(Arrays.toString(strings)); //печатаем содержимое в стринг

        strings = new String[3];
        System.out.println(strings);
        System.out.println(strings.length);
        System.out.println(Arrays.toString(strings) + "\n");

        int[][] c1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 2, 3}
        };

        System.out.println(Arrays.toString(c1[2]));
        System.out.println(c1[1][1]);
        System.out.println(Arrays.deepToString(c1) + "\n");

        int[][] c2 = {
                {1, 2, 3},
                {1, 2},
                {7, 8, 9},
                {1, 2, 3}
        };
        System.out.println(c2.length);
        System.out.println("c2: " + c2);
        System.out.println("toString: " + Arrays.toString(c2));
        System.out.println("deeptoString: " + Arrays.deepToString(c2) + "\n");

        /*myPrintArray2(c2);*/
//многомерные массивы поиск сначала строки массива потом колонки в массиве а потом значение в массиве
        int[][][] c3 = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        System.out.println(c3[1][1][2]);

        int[] c4 = {33, -2, 4, 67, 4, 9, 4};
        int min = c4[0];
        int minIndex = 0;
        for (i = 1; i < c4.length; i++) {
            if (min > c4[i]) {
                min = c4[i];
                minIndex = i;
            }
        }
        System.out.println(String.format("minimal element is c4[%d] and value is %d", minIndex, min));

        int max = c4[0];
        for (i = 1; i < c4.length; i++) {
            if (max < c4[i]) {
                max = c4[i];
            }
        }
        System.out.println(String.format("minimal element is c4[%d] and value is %d, max element is %d"
                , minIndex, min, max));

        int sum = 0;
        for (i = 0; i < c4.length; i++) {
            sum += Math.abs(c4[i]);
        }
        System.out.println(String.format("minimal element is c4[%d] and value is %d, max element is %d and sum is %d "
                , minIndex, min, max, sum));
        {
            i = 0;
            while (i < 10) {
                System.out.print(i + " ");
                i++;
            }
//            {
//                System.out.println("\n");
//                Scanner input = new Scanner(System.in);
//                sum = 0;
//                int number = 1;
//                while (number != 0) {
//                    System.out.println("Enter number, to stop enter 0: ");
//                    number = input.nextInt();
//                    sum += number;
//                    System.out.println("sum so far is " + sum);
//                }

            {
                System.out.println("\n");
                Scanner input = new Scanner(System.in);
                sum = 0;
                int number = 8;
                do {
                    System.out.println("Enter number, to stop enter 0: ");
                    number = input.nextInt();
                    sum += number;
                    System.out.println("sum so far is " + sum);
                } while (number != 0);
            }
            }
            }
        }




