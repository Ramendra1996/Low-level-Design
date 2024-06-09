package basic;

  final  class Employee{
   final  String panCardNumber;
   public Employee(String panCardNumber){
       this.panCardNumber = panCardNumber;
   }
   public String getPanCardNumber(){
       return panCardNumber;
   }
}
public class ImmutableDemo {
    public static void main(String[] args) {
       Employee emp = new Employee("ABC1234");
        String panCard = emp.getPanCardNumber();
        System.out.println("panCardNumber="+ panCard);
    }
}
