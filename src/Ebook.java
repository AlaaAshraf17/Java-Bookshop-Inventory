public class Ebook extends Books{
    public Ebook(String isbn, String title, int yearOfPublish, float price, int quantity) {
        super(isbn, title, yearOfPublish, price, quantity);
    }

    @Override
    public void buy(String address, String email) throws Exception {
       if (getQuantity()<=0){
           throw new Exception("Not available : Out of stock");
       }
       else {
           setQuantity(getQuantity()-1);
           System.out.println("Send Ebook to MailService with the email provided: "+email);
           System.out.println("Paid amout: "+getQuantity()*getPrice());
       }
    }


}
