public class Items {
    private static int idStat=0;
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public Items(String name, double price) {
        this.id=idStat++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }






}//endCLass
