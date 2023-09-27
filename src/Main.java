import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main  {
    public static void main(String[] args) throws Exception {
        Discount d=new Discount();

        Customer c1=new Customer("ragad","faris","aaa",d,"aa",CustomerType.REGULAR);
        VipOrder order1=new VipOrder("aaa","aa",c1, LocalDate.now());
        System.out.println(order1.calculatetotalPrice());
    }
}//endClass