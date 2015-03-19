/**
 * Created by fattyduck on 3/19/15.
 */


public class person {

    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public person(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }
}