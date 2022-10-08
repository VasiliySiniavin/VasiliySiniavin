import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW1 {
    /*Написать программу которая будет печатать/выводить следующий текст:
     3
     2
     1
     Поехали!!!*/
    public static void main (String[] args) {

        String task = "Task";
        int c = 3;
        String text = "Поехали!!!";

        System.out.println(task + " 1" + "\n"
                + c + "\n"
                + (c - 1) + "\n"
                + (c - 2) + "\n"
                + text + "\n");

        System.out.println(task + " 2" + "\n" +
                "____888888______________________________\n" +
                "____888888______________________________\n" +
                "___8888888888___________________________\n" +
                "__888888888888__________________________\n" +
                "__8888111188888_________________________\n" +
                "_888881111188888___11___________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111188888_11____________________\n" +
                "_8888811111118888_11____________________\n" +
                "_8888881111118888_11___11__8888888______\n" +
                "_8888881111118888__1__11__88888888888___\n" +
                "_8888888111111888____11__8888888888888__\n" +
                "__888888111111888_111___88888888888888__\n" +
                "__8888888111118881111__888881111118888__\n" +
                "___888888811188881111_8888811111111888__\n" +
                "____8888888188881111188888111111118888__\n" +
                "_____88888888888111118888111111118888___\n" +
                "______888888888111118888811111188888____\n" +
                "______8888888881111188888888888888______\n" +
                "_____888888888811111888888888888________\n" +
                "____88888888888111118888888888__________\n" +
                "___88881111888811111888888888___________\n" +
                "__8888111111888111118888888888__________\n" +
                "_888881111118881111188811118888_________\n" +
                "_8888881111888811111881111118888________\n" +
                "_8888888118888811111888111188888________\n" +
                "__888888888888_1111888881188888_________\n" +
                "___8888888888___111_8888888888__________\n" +
                "____88888888_____1___88888888___________\n" +
                "_____888888___________888888____________\n" +
                "_______________________8888_____________\n"
        );

        int a = 10;
        int b = 2;
        String emoji = "\uD83D\uDE0A";

        System.out.println(task + " 1" + "\n"
                + "сложение" + "\n"
                + (a + b) + "\n"
                + "умножение" + "\n"
                + (a * b) + "\n"
                + "вычитание" + "\n"
                + (a - b) + "\n"
                + "деление" + "\n"
                + (a / b) + "\n"
                + "остаток от деления" + "\n"
                + (a % b) + "\n"
                + "переменная a четное число = " + (a % 2 == 0) + "\n"
                + "переменная b четное число = " + (b % 2 == 0) + "\n");

        System.out.println("\u2764");
        System.out.println(emoji);
        System.out.println("\ud83e\udd70");
        System.out.println("\u1F60E");
        System.out.println(Character.toChars(0x1f642));
        System.out.println(Character.toString(0x1f642));
//печать бабочки
        try { // определяет блок кода, в котором может произойти исключение;
            File butterfly = new File("/C:/Users/krimi/IdeaProjects/JavaTheory/src/butterfly");
            Scanner myReader = new Scanner(butterfly);
            while (myReader.hasNextLine()) { // Метод hasNextLine () класса java.util.Scanner возвращает значение true,
                // если на входе этого сканера есть другая строка.
                String data = myReader.nextLine();
                System.out.println(data);
            }
            } catch (FileNotFoundException e) {  //определяет блок кода, в котором происходит обработка исключения;
            System.out.println("Error");
            e.printStackTrace(); // Метод в Java — это инструмент, используемый для обработки исключений и ошибок
            // printStackTrace(). Это метод класса throwable Java, который печатает throwable вместе с другими деталями, такими как номер строки и имя класса, в котором произошло исключение.printStackTrace()очень полезен при диагностике исключений.
        }
            a = 3;
            System.out.println(String.format("%s\n%s\n%s\nПоехали!", "03", "02", "01"));
            System.out.println(String.format("%s\n%d\n%d\nПоехали!", "03", 2, 1));

            int [] arr = new int[4];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;

            int[] variable = {1,2,3,4};
        System.out.println(
          "____888888______________________________\n"
        +  "____888888______________________________\n"
        +  "___8888888888___________________________\n"
        +  "__888888888888__________________________\n"
        +  "__8888111188888_________________________\n"
        +  "_888881111188888___11___________________\n"
        +  "_8888811111188888_11____________________\n"
        +  "_8888811111188888_11____________________\n"
        +  "_8888811111118888_11____________________\n"
        +  "_8888881111118888_11___11__8888888______\n"
        +  "_8888881111118888__1__11__88888888888___\n"
        +  "_8888888111111888____11__8888888888888__\n"
        +  "__888888111111888_111___88888888888888__\n"
        +  "__8888888111118881111__888881111118888__\n"
        +  "___888888811188881111_8888811111111888__\n"
        +  "____8888888188881111188888111111118888__\n"
        +  "_____88888888888111118888111111118888___\n"
        +  "______888888888111118888811111188888____\n"
        +  "______8888888881111188888888888888______\n"
        +  "_____888888888811111888888888888________\n"
        +  "____88888888888111118888888888__________\n"
        +  "___88881111888811111888888888___________\n"
        +  "__8888111111888111118888888888__________\n"
        +  "_888881111118881111188811118888_________\n"
        +  "_8888881111888811111881111118888________\n"
        +  "_8888888118888811111888111188888________\n"
        +  "__888888888888_1111888881188888_________\n"
        +  "___8888888888___111_8888888888__________\n"
        +  "____88888888_____1___88888888___________\n"
        +  "_____888888___________888888____________\n"
        +  "_______________________8888_____________\n"
        );
    }
}