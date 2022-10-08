public class HW3 {

    public static int task = 1;

    public static void task() {

        System.out.println("Task " + task);
        task++;
    }

    public static void main(String[] args) {

        task();
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести сумму всех значений массива.
        {
            int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(String.format("сумма всех значений массива = %d", sum));

            System.out.print("\n");

            task();
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести максимальное значение массива.

            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println(String.format("максимальное значение массива %d", max));

            System.out.print("\n");

            task();
//Дан массив:
//int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//необходимо вывести минимальное значение массива.

            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println(String.format("минимальное значение массива %d", min));
        }
        System.out.print("\n");

        task();
//Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.
        {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int sum = 0;
            int average = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
                average = sum / array.length;
            }
            System.out.println(String.format("сумма всех значений массива = %d", average));
        }
        System.out.print("\n");
        {
            task();
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.
            int[][] array = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9},
                    {-1, -2, -3, -4},
                    {-5, -6}
            };
            int sumA = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sumA = sumA + array[i][j];
                }
            }
            System.out.println(sumA);

            System.out.print("\n");

            task();
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести максимальное значение массива.

            int sumB = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (sumB < array[i][j]) {
                        sumB = array[i][j];
                    }
                }
            }
            System.out.println(sumB);

            System.out.print("\n");

            task();
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести количество элементов в массиве.
//метод без использования массива
            int sumC = array[0].length;
            int sumD = array[1].length;
            int sumE = array[2].length;
            int sumF = array[3].length;
            int total = sumC + sumD + sumE + sumF;

            System.out.println(total);
//метод с использованием массива
            int sumBB = 0;
            for (int i = 0; i < array.length; i++) {;
                for (int j = 0; j < array[i].length; j++) {
                    sumBB++;
                }
            }
            System.out.println(sumBB);
        }
//Экстра-задача от Алисы - нарисовать круг
        System.out.print("\n");

        task();

        int r = 20;
        for (int y = 0; y <= (r*2); y=y+2) {
            for (int x = 0; x <= (r*2); x++) {
                if ((x-r)*(x-r) + (y-r)*(y-r) <= r*r) {
                    System.out.print("x");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

