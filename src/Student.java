public class Student extends Persona {
    private int age;

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public String toString() {
      return "Student[super=" + super.toString() + ",idade=" + age +"]";
    }
}