public class HW4 {

    public static int task = 1;

    public static void task() {

        System.out.println("Task " + task);
        task++;
    }


    public static int sumAB(int a, int b) {

        return a + b;
    }

    public static int subAB(int a, int b) {

        return a - b;
    }

    public static int multiAB(int a, int b) {

        return a * b;
    }

    public static int divisionAB(int a, int b) {

        return a / b;
    }

    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        task();
        hw41();
        task();
        hw42();
        task();
        hw43();
        task();
        System.out.println(String.format("a = %d, b = %d  a + b = %d", a, b, sumAB(a,b)));
        System.out.println(String.format("a = %d, b = %d  a - b = %d", a, b, subAB(a,b)));
        System.out.println(String.format("a = %d, b = %d  a * b = %d", a, b, multiAB(a,b)));
        System.out.println(String.format("a = %d, b = %d  a / b = %d", a, b, divisionAB(a,b)));


    }
//0  1  2  3  4  5  6  7  8  9
//0  1  2  3  4  5  6  7  8
//0  1  2  3  4  5  6  7
//0  1  2  3  4  5  6
//0  1  2  3  4  5
//0  1  2  3  4
//0  1  2  3
//0  1  2
//0  1
//0

    public static void hw41() {
        int t = 9;
        for (int i = t; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
    }


//0  1  2  3  4  5  6  7  8  9
//   0  1  2  3  4  5  6  7  8
//      0  1  2  3  4  5  6  7
//         0  1  2  3  4  5  6
//            0  1  2  3  4  5
//               0  1  2  3  4
//                  0  1  2  3
//                     0  1  2
//                        0  1
//                           0

    public static void hw42() {

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void hw43() {

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        System.out.println("\n");
    }
}
//    task();
//
//    sumAB(5,5);
//
//    subAB(6,3);
//
//    multiAB(6,3);
//
//    divisionAB(6,2);
//
//        }















