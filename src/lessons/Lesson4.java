package lessons;

import java.util.Arrays;

public class Lesson4 {

    public static void main(String[] args) {

        {
            int[] a = {1, 5, 3, 4, 5};
            int[] b = {5, 1, 3, 4, 5};

            System.out.println("a: " + Arrays.toString(a));
            System.out.println("b: " + Arrays.toString(b));
            System.out.println("a == b is " + Arrays.equals(a, b));

            Integer x = 10;
            Integer y = 18;
            System.out.println(String.format("x = %d | y = %d | x == y is %b", x, y, x.equals(y)));

            System.out.println("\n");
        }

        {

        }

        {
            int[] a = {1, 2, 3, 4, 5};

            int[] b = {1, 2, 3, 4, 5};

            a[0] = 23;
            b[0] = 32;

            //    "1".
//переменная содержит референс (уазатель на то место в памяти где хранятся данные)
            System.out.println("a: " + Arrays.toString(a));
            System.out.println("b: " + Arrays.toString(b));
            System.out.println("a == b is " + (a == b));
//массивы одинаковые. при сравнении объектов они будут не равны т.к находятся в разных участках памяти. Важно! - объекты сравнивать нельзя
//Для этого есть специальные способы.

            a[0] = 25;
            b[0] = 25;

            System.out.println("a == b is " + Arrays.equals(a, b));
        }


        int x = 10;
        int y = 10;
        System.out.println(String.format(" x = %d |  y = %d |  x == y is %b", x, y, x == y));
//где %b в строке - означает boolean

        //a = null;
        String aa = "354";
        if (aa != null) {
            System.out.println(aa.length());
        } else {
            System.out.println("It is null");
        }

        {
            System.out.println("Hello " + "world!");

            System.out.println("Hello \t" + "world!");

            String a = "5";
            System.out.println("a = " + a);
        }
//String it is reference type

        {
            String s1 = "Apple";
            String s2 = new String("Apple");
            String s3 = "Apple";
            String[] str = {s1, s2, s3};

            System.out.println(s1 == "Apple");
            System.out.println(s1 == s2);

            System.out.println(s1.equals("Apple"));
            System.out.println(s1.equals(s2));
        }

        {

            String str = "Hello";
            System.out.println(str);

            str.replace('l', 'L');
            System.out.println(str);

            int[] arr = {1, 2, 3};
            System.out.println(Arrays.toString(arr));

            String s = "[";
            for (int i = 0; i < arr.length; i++) {
                s += arr[i] + " ";
            }
            s += "]";
            System.out.println(s);

        }

        {
            String str = "Hello Lord";
            System.out.println(str.charAt(8));
        }

        {
            String str = "Hello Lena and Eric";

            System.out.println(str.indexOf('l'));
            System.out.println(str.indexOf('l', 4));
            System.out.println(str.toLowerCase().indexOf('l', 3 + 1));
//почему 6? 7 символ в строке 6 по счету в строке (начинаем считать от 0)
            System.out.println(str.lastIndexOf('l'));
//проверяем строку на наличие текста/слова/буквы. Используется очень часто
            System.out.println(str.contains("Le"));
        }

        {
//Слияние строк в одну. Задаем разделитель и указываем элементы
            String a = "a";

            System.out.println(String.join(", ", "1", "2", "3", "4"));
        }

        {
//Разделяем строку на элементы массива
            String a = "1|2|3|4|5|6";
            String[] arr = a.split("\\|");

            System.out.println("arr " + Arrays.toString(arr));
        }

        {
//Разделяем строку на элементы массива. Для двухмерных массивов есть deepToString
            String a = "1|2|3|4|5|6";
            //    String [] arr = a.split("\\|");
            int arr[] = {1, 2, 5, 8, 0};
            System.out.println("arr " + arr);
            System.out.println("arr " + preparePrintArray(arr));
        }
    }

    //Эта функция она возвращает значение. Функция это курьер которому вы задаете какое то задание
//Вы ей задаете команду, она идет делает и возвращает результат. Когда мы объявляем функцию - мы задаем тип этого результата
//функция должна начинаться с маленькой буквы. Первое слово - глагол. Каждое отдельное слово пишем по методу CamelCase
    static String preparePrintArray(int[] arr) {

        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            stringBuffer.append(arr[i]);
            if (i != arr.length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("1, ").append("2, ").append("3, ").append("domvdmdmvdlsds");
        stringBuffer.append(']');
        String result = stringBuffer.toString();
        return result;
    }
    //stringBuffer позволяет оптимизировать процесс и ускорить выполнение задачи за счет создания меньшего количества строк

    //void означает пустота. Указывается когда метод ничего не возвращает. В некоторых языках такие методы называются процедурами
    static void printString(String str1, String str2) {

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("\n");



    }
}












