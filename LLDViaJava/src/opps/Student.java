package opps;

public class Student {
 public  int id;
 public int age;
 public String name;
 public int nos;

 //default constructor
    Student(){

    }
    //parametrized constructor

    Student(int id, int age, String name, int nos){
        System.out.println("parametrized ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy constructor

    Student(Student srcObj){
        System.out.println("copy ctor called");
        this.id = srcObj.id;
        this.age = srcObj.age;
        this.name = srcObj.name;
        this.nos = srcObj.nos;
    }
    //method
    public void study(){
        System.out.println(name +"studing");
    }
    public void sleep(){
        System.out.println(name +"sleeping");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", nos=" + nos +
                '}';
    }
}
