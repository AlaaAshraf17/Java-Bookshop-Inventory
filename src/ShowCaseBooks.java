public class ShowCaseBooks extends Books{
    public ShowCaseBooks(String isbn, String title, int yearOfPublish, float price, int quantity) {
        super(isbn, title, yearOfPublish, price, quantity);
    }

    @Override
    public void buy(String address, String email) throws Exception {
        throw new Exception("Showcase books Not for sale");
    }

}
