package java8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class EmployeeDemo{
     private int id;
     private String name;
     private List<String> citiesWorkedIn;

    public EmployeeDemo(int id, String name, List<String> citiesWorkedIn) {
        this.id = id;
        this.name = name;
        this.citiesWorkedIn = citiesWorkedIn;
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

    public List<String> getCitiesWorkedIn() {
        return citiesWorkedIn;
    }

    public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
        this.citiesWorkedIn = citiesWorkedIn;
    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citiesWorkedIn=" + citiesWorkedIn +
                '}';
    }
}

public class MapAndFlatMapDemo {

    public static void main(String[] args) {
        List<String>citiesWorkedIn1 = new ArrayList<>();
        citiesWorkedIn1.add("pune");
        citiesWorkedIn1.add("Mumbai");
        citiesWorkedIn1.add("Noida");
        citiesWorkedIn1.add("Bangalore");
        EmployeeDemo emp1 = new EmployeeDemo(1,"code1",citiesWorkedIn1);
        List<String>citiesWorkedIn2 = new ArrayList<>();
        citiesWorkedIn2.add("Pune");
        citiesWorkedIn2.add("Nagpur");
        citiesWorkedIn2.add("Indore");
        EmployeeDemo emp2 = new EmployeeDemo(2,"code2",citiesWorkedIn2);
        List<String>citiesWorkedIn3 = new ArrayList<>();
        citiesWorkedIn3.add("pune");
        citiesWorkedIn3.add("Bangalore");
        EmployeeDemo emp3 = new EmployeeDemo(3,"code3",citiesWorkedIn3);

        List<EmployeeDemo>empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        System.out.println(empList);

        List<Integer>ids = new ArrayList<>();
        for (EmployeeDemo employee:empList){
            ids.add(employee.getId());
        }
        System.out.println("ids== "+ids);

        //using java 8
        List<Integer> collect = empList.stream().map(emp -> emp.getId()).collect(Collectors.toList());
        System.out.println(collect);

        Set<List<String>> collect1 = empList.stream().map(emp -> emp.getCitiesWorkedIn()).collect(Collectors.toSet());
        System.out.println("using map=="+collect1);
        Set<String> collect2 = empList.stream().flatMap(emp -> emp.getCitiesWorkedIn().stream()).collect(Collectors.toSet());
        System.out.println("using flat map== "+collect2);
    }
}
