package lessons;

import human.Person;

public class Lesson5 {

    static String prePrintArray (int[] array) {

        StringBuilder stringBuilder = new StringBuilder("(");

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("1,").append("2, ").append("3, ").append("dmgdmnimd");
        stringBuilder.append(")");
        String result = stringBuilder.toString();
        return result;
    }

    static double toF(double cel)  {
        return (9.0 * cel / 5) + 32;
    }

public static void main (String[] args) {

    System.out.println("temp = " + (toF(25)));


    Person john = new Person("John", 'M', 22);

    john.setMother("Jessika", 'F', 55);


    Person jane = new Person("Jane", 'F', 22);

    jane.setFather("Scott", 'M', 57);

    john.printName();
    System.out.println(String.format("name = %s, sex = %s, age = %d mother.name = %s, mother.sex = %s, mother.age = %d",
            john.getName(), john.getSex(), john.getAge(), john.getMother().getName(), john.getMother().getSex(), john.getMother().getAge()));

    jane.printName();
    System.out.println(String.format("name = %s, sex = %s, age = %d father.name = %s, father.sex = %s, father.age = %d",
            jane.getName(), jane.getSex(), jane.getAge(), jane.getFather().getName(), jane.getFather().getSex(), jane.getFather().getAge()));

}
}

