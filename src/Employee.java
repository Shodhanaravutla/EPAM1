import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
   String firstname,lastname;
    int age;
      double salary;
    public  Employee(String firstname, String lastname,int age, double salary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.salary=salary;
    }
    public static void main(String[] args) {
        List<Employee> emp= new ArrayList<>();
        emp.add(new Employee("ram","miryala",23,30000));
        emp.add(new Employee("raj","singh",32,20000));
        emp.add(new Employee("soniya","joseph",21,35000));

        System.out.println(emp);
        Collections.sort(emp);
        System.out.println(emp);

    }
    public  int compareTo(Employee obj)
    {
        return this.firstname.compareTo(obj.firstname);
    }

    @Override
    public String toString() {
        return this.firstname+"."+this.lastname+"."+this.age+"."+this.salary;
    }
}
