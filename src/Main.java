//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    try{
        Inventory inventory=new Inventory();
        Books paperBook=new PaperBook("12345","Java Basics",2018,50,10);
        Books ebook =new Ebook("67890","Advanced java",2020,30,5);
        Books showcase=new ShowCaseBooks("00000","Demo Book",2021,0,0);

        inventory.addBooks(paperBook);
        inventory.addBooks(ebook);
        inventory.addBooks(showcase);


        inventory.removeBooks(2025,7);
        Books b1=inventory.getBooks("12345");
        b1.buy("123st ,Giza","memo@gmail.com");
        Books b2 = inventory.getBooks("67890");
        b2.buy(null,"ahmed@gmail.com");
        Books b3 =inventory.getBooks("00000");
        b3.buy("45elNozha,Cairo","noha@gmail.com");
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}