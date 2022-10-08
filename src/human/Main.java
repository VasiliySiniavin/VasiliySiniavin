package human;

public class Main {

    public static void main(String[] args) {

        Person vasya = new Person("Vasiliy", 'M', 33);
//        vasya.name = "Vasiliy";
//        vasya.sex = 'M';
//        vasya.age = 33;

        Person Ola = new Person("Ola",'F', 34);
//        Ola.name = "Ola";
//        vasya.printName();
//        Ola.printName();


        System.out.println(String.format("name: %s, sex: %s, age: %d", Ola.getName(), Ola.getSex(), Ola.getAge()));
        System.out.println(String.format("name: %s, sex: %s, age: %d", vasya.getName(), vasya.getSex(), vasya.getAge()));

    }
}
