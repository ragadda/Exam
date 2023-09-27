import java.time.LocalDate;

public class RegularOrder extends Order{
    public RegularOrder(String name, String deliveryAdress, Customer customer, LocalDate date) throws Exception {
        super(name, deliveryAdress, customer, date);
    }

    @Override
    public double calculatetotalPrice() throws Exception {
        return super.calculatetotalPrice();
    }
}//endVCass
