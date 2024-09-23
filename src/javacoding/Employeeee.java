package javacoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeeee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employeeee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
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

    public static void main(String[] args) {
        //countOfMalesAndFemales();
        sortEmployeeBySalaryAndYOJ();
    }

    public static void averageSalary(){
        List<Employeeee> employeeList = new ArrayList<Employeeee>();

        employeeList.add(new Employeeee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employeeee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employeeee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employeeee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employeeee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        //actual code
        double doubleSalry = employeeList.stream()
                .mapToDouble(Employeeee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Avg salary is :: " + doubleSalry);
    }

    public static void countOfMalesAndFemales(){
        List<Employeeee> employeeList = new ArrayList<Employeeee>();

        employeeList.add(new Employeeee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employeeee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employeeee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employeeee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employeeee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));


        Map<String, Long> countOfMalesAndFemales = employeeList.stream()
                .collect(Collectors.groupingBy(Employeeee::getGender, Collectors.counting()));

        System.out.println("Count of Males:  "+countOfMalesAndFemales.getOrDefault("Male",0L));
        System.out.println("Count of Female:  "+countOfMalesAndFemales.getOrDefault("Female",0L));
    }

    public static void sortEmployeeBySalaryAndYOJ(){
        List<Employeeee> employeeList = new ArrayList<Employeeee>();

        employeeList.add(new Employeeee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employeeee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employeeee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employeeee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employeeee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employeeee::getSalary)
                        .thenComparingInt(Employeeee::getYearOfJoining))
                            .forEach(System.out::println);


    }

    public static void sortEmployeeByCity(){

    }
}
