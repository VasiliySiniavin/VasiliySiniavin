import java.util.Scanner;

public class Review02 {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();*/
        int age = 5;

        if (age <= 7) {
            System.out.println("Baby");
        } else if (age > 7 && age <= 14) {
            System.out.println("kid");
        } else if (age >= 15 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("Old man");
        }
//цикл в цикле
        for (int i = 0; i <= 5; i = i + 1) { //выполеение блока кода
            System.out.print(i + "|" + " ");
            for (int j = 0; j <= 5; j = j + 1) { // вложение for
                System.out.print(j);
            }
            System.out.println("\n");
        }

        System.out.println("Add integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(sum);
        }
        System.out.print("\n");
    }
}
