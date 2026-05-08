// Create a class named Book.Attributes: title (String), author (String), and price (double)
// .Method: displayDetails() to print all the book info.Task: In your main method,
//  create two different book objects, set their values, and display them
class Book
{
    String title;
    String author;
    double price;

    Book(String title , String author , double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;

    }
    void displayDetails()
    {
        System.out.println("Title of the Book " + title);
        System.out.println("Author of the Book " + author);
        System.out.println("Price of the Book " + price);

    }

}

public class BookDetails
{
    public static void main(String[] args) {
        {
            Book b1 = new Book("Harry potter" , "J K Rowling",400);
            Book b2 = new Book("Java","Balaguruswamy",350);
            b1.displayDetails();
            b2.displayDetails();

        }
    }
}