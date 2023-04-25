package Main;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person() {
        this.name = "None";
        this.age = 0;
        this.gender = 'N';
    }
    
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0)? age : 0;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = (Character.toUpperCase(gender) == 'M' || Character.toUpperCase(gender) == 'F')? Character.toUpperCase(gender) : 'N';
    }

    @Override
    public String toString() {
        return "Person Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\n";
    }
}
