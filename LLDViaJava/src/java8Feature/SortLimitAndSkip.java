package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee1{

    private int id;
     private int salary;

    public Employee1(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class SortLimitAndSkip {

    public static void main(String[] args) {

        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1(1,5000));
        empList.add(new Employee1(2,1000));
        empList.add(new Employee1(3,6000));
        empList.add(new Employee1(4,7000));
        empList.add(new Employee1(5,8000));
        empList.add(new Employee1(6,9000));

        //compacter sort
       List<Employee1>empSortedList = empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
        System.out.println(empSortedList);

        //limit function
        System.out.println("limit function");
        List<Employee1> collect = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).limit(3).collect(Collectors.toList());
        System.out.println("limit= "+collect);


        //skip function
        System.out.println("skip function");
        List<Employee1> collect1 = empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
        System.out.println("skip function=="+collect1);
    }
}
