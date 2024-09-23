import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static List<StreamEmployee> employeeList = new ArrayList<StreamEmployee>();

    public static void main(String[] args) {
        employeeList.add(new StreamEmployee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new StreamEmployee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new StreamEmployee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new StreamEmployee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new StreamEmployee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new StreamEmployee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new StreamEmployee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new StreamEmployee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new StreamEmployee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new StreamEmployee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new StreamEmployee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new StreamEmployee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new StreamEmployee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new StreamEmployee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new StreamEmployee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new StreamEmployee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new StreamEmployee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        //method1();
        //method6();
        m1();
    }

    public static void m1(){
        // Group by gender and count the number of males and females in the Sales and Marketing team
        Map<String, Long> genderCount = employeeList.stream()
                .filter(e -> e.getDepartment().equals("Sales And Marketing"))
                .collect(Collectors.groupingBy(StreamEmployee::getGender, Collectors.counting()));
        genderCount.forEach((gender, count) -> System.out.println(gender + ": " + count));
    }

    //Count no of males & females are there in the organization
    public static void method1() {
        Map<String, Long> gendersCount = employeeList.stream().
                collect(Collectors.groupingBy(StreamEmployee::getGender, Collectors.counting()));
        System.out.println(gendersCount);
    }

    //Print the name of all departments in an organization
    public static void method2() {
        employeeList.stream().map(StreamEmployee::getDepartment).distinct().forEach(System.out::println);
    }

    //Avg age of male and female employees
    public static void method3() {
        Map<String, Double> avgAgeOfMaleAndFemaleEmployee = employeeList.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getGender, Collectors.averagingInt(StreamEmployee::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployee);
    }

    //Get the details of highest paid employee in an org
    public static void method4() {
        Optional<StreamEmployee> highestEmployeePaidByEmployer = employeeList.stream()
                .max(Comparator.comparingDouble(StreamEmployee::getSalary));
        highestEmployeePaidByEmployer.ifPresent(employee -> System.out.println(employee.getName()));
    }

    //get all the employee joined after 2015
    public static void method5() {
        employeeList.stream()
                .filter(emp -> emp.getYearOfJoining() > 2015)
                .map(StreamEmployee::getName)
                .forEach(System.out::println);
    }

    //count the no of employees in each department
    public static void method6() {
        Map<String, Long> empCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = empCountByDepartment.entrySet();

        for (Map.Entry<String, Long> stringLongEntry : entrySet) {
            System.out.println(stringLongEntry.getKey() + " " + stringLongEntry.getValue());
        }
    }
}


class StreamEmployee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public StreamEmployee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : " + department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
    }
}
