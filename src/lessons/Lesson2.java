package lessons;

public class Lesson2 {

    public static void main (String[] args) {
        float a = 19.99F;
        double b = 19.99;
        long L = 1L;
        String line = "_______________________";

        System.out.println((a - b));
        System.out.println(Math.abs(a - b));
        System.out.println(true == false);
        System.out.println(false == false);
        System.out.println(false == true);
        System.out.println(true == true);

        a = 3;
        b = 9;
//исследуем оба числа и выясняем - выполняются ли условия
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("a and b are even");
        } else {
            if (b % 2 != 0) {
                System.out.println("b is odd");
            }
            if (a % 2 != 0) {
                System.out.println("a is odd");
            }
        }

        if (a % 2 == 0 && b / 0 == 0) {
            System.out.println("a and b are even");
        }

        System.out.println(line);
//исследуем каждое число и выясняем- четное оно или нечетное
        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }
        if (b % 2 == 0) {
            System.out.println("b is even");
        } else {
            System.out.println("b is odd");
        }

        System.out.println(line);

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("a and b are even");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("a and b are odd");
        } else {
            if (b % 2 != 0) {
                System.out.println("b is odd");
            }
            if (a % 2 != 0) {
                System.out.println("a is odd");
            }
        }
        System.out.println(line);

        System.out.println((char) 48);
        System.out.println((char) 49);
        System.out.println((char) 50);

        System.out.println(line);
//цикл до 10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(line);
//цикл до 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("go!");

        System.out.println(line);
//цикл с остановкой брейк
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            if (i == 2) {
                break;
            }
        }
        System.out.println("go!");

        System.out.println(line);
//цикл с пропуском значения (если не надо выводить 2)
        for (int i = 10; i >= 0; i--) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("go!");

//принцип наращивания/уменьшения числа
        int i = 0;
        i++;
        i +=1;
        i = i + 1;

        i--;
        i -=1;
        i = i - 1;

        int k = -3;
        boolean b2 = true;
        boolean b3 = !b2;
        b3 = !true;

        i = 2;
        int j = 2;
        i = ++i;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        i = 2;
        int res1 = i++;
        int res2 = ++j;
        System.out.println(String.format(" i = %d     j = %d", i, j));
        System.out.println(String.format(" res1 = %d     res2 = %d", res1, res2));

        a = 1;
        b = 2;
        int a1 = (int)a;
        int b1 = (int)b;
        j = a1 + b1;
        System.out.println(j);
        System.out.println(a1 + b1);
        System.out.println(Math.abs(a1 + b1));
        System.out.println(Math.pow(2, Math.abs(a1 + b1)));
        int j1 = (int)(Math.pow(2,5));
        System.out.println(j1);

    }
}
