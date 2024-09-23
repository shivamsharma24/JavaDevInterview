package creationaldesignnpatterns.prototypedesignpattern.singletonpatterns;

public class Test {
    public static void main(String[] args) {
        Student student= new Student(33,1,":shivam");
        Student clone = (Student) student.clone();
        System.out.println(student);
        System.out.println(clone);
    }
}
