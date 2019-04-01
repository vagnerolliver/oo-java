public class Employee extends Persona {
    private int age;

    public Employee(String name, int age) {
        super(name);
        this.age = age;
    }

    public String toString() {
      return "Employee[super=" + super.toString() + ",idade=" + age +"]";
    }
}
