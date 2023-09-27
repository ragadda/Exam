import java.time.LocalDate;
import java.util.ArrayList;

public class VipOrder extends Order{
    public VipOrder(String name, String deliveryAdress, Customer customer,  LocalDate date) throws Exception {
        super(name, deliveryAdress, customer, date);
    }

    @Override
    public double calculatetotalPrice() throws Exception {
        if(this.getCustomer().getCustomerType()==CustomerType.VIP){
            double totPrice = 0;
            for(Items e : this.getListOfItems()){
                totPrice += e.getPrice();
            }
            return totPrice * this.getCustomer().getDiscount().getDiscount();
        }else{
            throw new Exception(this.getCustomer().getFirstName()+" not a VIP customer");
        }
    }
}//endClass
