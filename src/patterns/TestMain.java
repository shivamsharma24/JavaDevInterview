package patterns;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student= new Student();
		Object cloneObj = student.clone();
		System.out.println(student);
		System.out.println(cloneObj);		

	}

}
