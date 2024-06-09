package java8Feature.comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<EmpComparator>{

    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class IdComparator implements Comparator<EmpComparator>{

    @Override
    public int compare(EmpComparator o1, EmpComparator o2) {
        return o1.getEmpId()-o2.getEmpId();
    }
}

class EmpComparator{
    private String name;
    private String phone;
    private int empId;

    public EmpComparator(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "EmpComparator{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<EmpComparator>empList = new ArrayList<>();
        empList.add(new EmpComparator("ramendra","245",12));
        empList.add(new EmpComparator("Ankit","33678",11));
        empList.add(new EmpComparator("Bhavesh","177",45));
        //id wise sort
        Collections.sort(empList,new IdComparator());
        System.out.println(empList);

        //name wise sort
        Collections.sort(empList,new NameComparator());
        System.out.println(empList);

    }
}
