package ClassAndObjects;

public class Book {
    String title;
    String author;
    int price;
}

class B1 {
    static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book();
        book.title = "Vaidik Math";
        book1.title = "Poos Ki Raat";

        book.author = "Aaryabhatt";
        book1.author = "Munshi Prem Chand";

        book.price = 89;
        book1.price = 40;

        System.out.println( );
        System.out.println("*****---***** 1st Book *****---*****");
        System.out.println( );

        System.out.println("Title: "+book.title);
        System.out.println("Author: "+book.author);
        System.out.println("Price: "+book.price);

        System.out.println( );
        System.out.println("*****---***** 2nd Book *****---*****");
        System.out.println( );

        System.out.println("Title: "+book1.title);
        System.out.println("Author: "+book1.author);
        System.out.println("Price: "+book1.price);
    }
}
