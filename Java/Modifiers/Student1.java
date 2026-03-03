class Student {
    public String name;
    private int age;
    protected String course;
    String college;

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Shruthi";
        s.course = "BCA";
        s.college = "ABC College";
        s.setAge(20);

        System.out.println(s.name);
        System.out.println(s.course);
        System.out.println(s.college);
        System.out.println(s.getAge());
    }
}