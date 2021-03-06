public class Product {
    private boolean borrowed;
    private String title;
    private int value;
    private int id;
    private int length;
    private float rating;
    private int pages;
    private String publisher;
    private String CustomerName;
    private String CustomerPhoneNo;

    public String getTitle() {
        return title;
    }

    public int getValue() {
        return value;
    }

    public int getLength(){return length;}

    public int getPages(){return pages;}

    public String getPublisher(){return publisher;}

    public float getRating(){return rating;}

    public Product(int id, String title, int value, boolean borrowed) {
        this.id = id;
        this.title = title;
        this.value = value;
        this.borrowed = borrowed;
    }
    public int getType(){return getType();}

    public Product() {
        super();
    }

    public void setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
    }
    public void setCustomerPhoneNo(String CustomerPhoneNo){
        this.CustomerPhoneNo = CustomerPhoneNo;
    }
    public String getCustomerName(){return CustomerName;}

    public String getCustomerPhoneNo(){return CustomerPhoneNo;}

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public int getId() {
        return id;
    }

}
