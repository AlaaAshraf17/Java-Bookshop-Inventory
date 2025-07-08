public abstract class  Books {
    private String isbn;
    private String title;
    private int yearOfPublish;
    private float price;
    private int quantity;

    public Books(String isbn, String title, int yearOfPublish,float price,int quantity){
        this.isbn=isbn;
        this.title=title;
        this.yearOfPublish=yearOfPublish;
        this.price=price;
        this.quantity=quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public abstract void buy(String address,String email) throws Exception;


}
