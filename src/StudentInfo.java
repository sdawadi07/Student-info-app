public class StudentInfo {

    private String name;
    private int age;
    private double grade;

    public StudentInfo(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

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

    public double getGrade() {
        return grade;

    }

    public void setGrade(double grade) {
        this.grade = grade;

    }

    public void displayInfo() {
        System.out.println("    Student Information");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Grade:" + grade);
    }

}


