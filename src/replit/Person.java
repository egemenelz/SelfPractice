package replit;

public class Person {
    private String firstName, lastName;
    private int age;

    public Person() {
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getFirstName() + " | " + getLastName() + " | " + getAge();
    }


}


class Main2 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName());  //"undefined"
        System.out.println(person.getAge());       // -1
        System.out.println(person.toString());     //"undefined | undefined | -1"

    }
}
