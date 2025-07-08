public class PaperBook extends Books{
    public PaperBook(String isbn, String title, int yearOfPublish, float price, int quantity) {
        super(isbn, title, yearOfPublish, price, quantity);
    }

    @Override
    public void buy(String address,String email) throws Exception {
        if (getQuantity()<=0){
            throw new Exception("Not available : Out of stock");
        }
        else {
          setQuantity(getQuantity()-1);
          System.out.println("Send the paperBook to shipping service to the address: "+address);
            System.out.println("Paid amout: "+getQuantity()*getPrice());
        }
    }
}
