import java.time.LocalDate;
import java.util.ArrayList;

public abstract class  Order {
    private  static int staticId=0;
    private int id;
    private  String name;
    private String deliveryAdress;
    private ArrayList<Items> listOfItems;
    private Customer customer;
    private double totalPrice;
    private LocalDate date;


    public Order(String name, String deliveryAdress, Customer customer, LocalDate date) throws Exception {
        this.id = staticId++;
        this.name = name;
        this.deliveryAdress = deliveryAdress;
        this.customer = customer;
        this.listOfItems = new ArrayList<>();
        listItems();
        this.totalPrice = calculatetotalPrice();
        this.date = date;

    }

    private void listItems(){
        int listLength=this.customer.getListOfFavItems().size();
        if(listLength>0){
            for(Items e : this.customer.getListOfFavItems()){
                for(Items i:this.listOfItems){
                    if(i.getId()==e.getId() && i.getName()==e.getName()){
                        break;
                    }else{
                        listOfItems.add(e);
                    }
                }
            }
        }
    }


    public void addItem(Items item) {
        this.listOfItems.add(item);
    }

    public double calculatetotalPrice() throws Exception {
        double totPrice = 0;
        for(Items e : this.listOfItems){
            totPrice += e.getPrice();
        }
        return totPrice;
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public ArrayList<Items> getListOfItems() {
        return listOfItems;
    }



    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}//endClass
