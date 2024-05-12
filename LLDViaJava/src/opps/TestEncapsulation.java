package opps;

public class TestEncapsulation {

    public static void main(String[] args) {


        AccountEncapsulation encap = new AccountEncapsulation();
        encap.setAcc_no(7560504000L);
        encap.setName("Sonoo Jaiswal");
        encap.setEmail("sonoojaiswal@javatpoint.com");
        encap.setAmount(500000f);
        //getting values through getter methods
        System.out.println(encap.getAcc_no() + " " + encap.getName() + " " + encap.getEmail() + " " + encap.getAmount());
    }
}
