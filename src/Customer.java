import java.util.ArrayList;

public class Customer {
    private  static int staticId=0;
    private int id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String deliveryAdress;
    private CustomerType customerType;
    private Discount discount;
    private Gift gift;
    private ArrayList<Items> listOfFavItems;

    public Customer(String firstName, String lastName, String email,Discount discount, String deliveryAdress, CustomerType customerType) {
        this.id=staticId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAdress = deliveryAdress;
        this.customerType = customerType;
        this.listOfFavItems = new ArrayList<>();
    }

    public void takeGift(Gift gift){
      this.gift=gift;
    }
    public void openGift() {
         this.gift.openGift();
    }

    public Discount getDiscount() {
        return discount;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public ArrayList<Items> getListOfFavItems() {
        return listOfFavItems;
    }

    public void addfavItem(Items item) {
        this.listOfFavItems.add(item);
    }
    public void removeItem(Items item){
        if(this.listOfFavItems.contains(item)){
            this.listOfFavItems.remove(item);
        }
    }

}//end class
