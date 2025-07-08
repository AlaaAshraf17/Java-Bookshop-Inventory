import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Books> books =new LinkedList<>();


   public Inventory(){

   }


    public void addBooks(Books book){
          books.add(book);
    }
    public void removeBooks(int currentYear,int maxYears){
        for(int i =books.size()-1;i>=0;i--){
            Books book =books.get(i);
            if (currentYear- book.getYearOfPublish()>maxYears){
                books.remove(i);
            }
        }
    }

    public Books getBooks(String isbn) {
        for (Books book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

}
