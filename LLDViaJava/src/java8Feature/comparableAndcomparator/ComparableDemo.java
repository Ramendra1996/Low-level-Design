package java8Feature.comparableAndcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmpComparable implements Comparable<EmpComparable>{
    private String name;
    private String phone;
    private int empId;

    @Override
    public int compareTo(EmpComparable o) {
        //for integer
        return this.empId-o.empId;
        //for String
        // the list will be sorted by the phone attribute in lexicographical order.
       // return this.phone.compareTo(o.phone);
    }

    public EmpComparable(String name, String phone, int empId) {
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
        return "EmpComparable{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }


}

public class ComparableDemo {

    public static void main(String[] args) {

        List<EmpComparable>empList = new ArrayList<>();
        empList.add(new EmpComparable("ramendra","245",12));
        empList.add(new EmpComparable("Ankit","33678",11));
        empList.add(new EmpComparable("Bhavesh","177",45));
        System.out.println(empList);

        //comparable sort
        Collections.sort(empList);
        System.out.println(empList);
    }
}
