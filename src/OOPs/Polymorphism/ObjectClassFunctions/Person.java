package OOPs.Polymorphism.ObjectClassFunctions;
// toString()
public class Person {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person -> [name= " + name + ", age= " + age + "]";
    }
}
