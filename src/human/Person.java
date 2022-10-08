package human;

public class Person {
    private String name;

    private char sex;

    private int age;

    private Person mother;

    private Person father;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        if (this.sex == 'M') {
            return "Mr. " + this.name;
        } else {
            return "Ms. " + this.name;
        }
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
    return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
    return father;
    }

    public Person (String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void setFather (String name, char sex, int age) {
        this.father = new Person(name, sex, age);
    }

    public void setMother (String name, char sex, int age) {
            this.mother = new Person(name, sex, age);
    }

    public void printName() {
        System.out.println(this.name);

    }



}

