package java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private  int id;
    private  String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void printName(){
        System.out.println("In Emp Class "+name);
    }
}

public class TerminalVsNonTerminalOperations {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"code1");
        Employee e2 = new Employee(2,"code2");
        Employee e3 = new Employee(3,"code3");
        Employee e4 = new Employee(4,"code4");
        List<Employee> empList = Arrays.asList(e1,e2,e3,e4);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        intList.stream().filter(a->a%2==0).map(a->a+a).filter(a->a>5).forEach(a-> System.out.println(a));
        //peek method use
        System.out.println(intList.stream().filter(a->a%2==0).peek(System.out::println).map(a->a+a).filter(a->a>5).count());

        //reduce method use for single result
        System.out.println("reduce method");
        System.out.println(intList.stream().reduce((a,b)->a+b).get());
        //limit method
        System.out.println("limit method");
        intList.stream().limit(2).collect(Collectors.toList()).forEach(integer -> System.out.print(integer+" "));
        System.out.println();
        empList.stream().filter(e->e.getId()%2==0).map(e->{
            e.printName();
            return e.getName();
        }).forEach(e-> System.out.println("AT last "+e));

        //find first method and findLast , findAny , anyMatch
        System.out.println("find first method");
        Employee code = empList.stream().filter(emp -> emp.getName().contains("code")).findFirst().get();
        System.out.println(code);

    }
}
