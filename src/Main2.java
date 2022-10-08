
import lessons.Lesson4;

public class Main2 {

    public static void main (String [] args) {
//        {
//            int a = 5;
//            int b = 5 + a;
//            if (a > b) {
//                System.out.println("a > b");
//            } else if (a < b) {
//                System.out.println("a < b");
//            } else {
//                System.out.println("a == b");
//            }
//        }
    String a = "my test";
    String b = "this is";
    String c;

    switch (a) {
        case "MY TEST":
            c = a + b;
            break;
        case "My Test":
            c = a + b;
            break;
        case "my_test":
            c = a + b;
            break;
        default:
        c = a+ a;
    }
        System.out.println(c);

    }
    }
