class Book 
{
    int number;
    boolean isIssued;

    Book(int number) 
    {
        this.number = number;
        this.isIssued = false;
    }

    public String toString() 
    {
        return "Book " + number + " (Issued: " + isIssued + ")";
    }
}

class Member 
{
    String name;
    Book issuedBook;

    Member(String name) 
    {
        this.name = name;
        this.issuedBook = null;
    }

    void issueBook(Book b) 
    {
        if (!b.isIssued && issuedBook == null) 
        {
            b.isIssued = true;
            issuedBook = b;
            System.out.println(name + " issued Book " + b.number);
        } 
        else 
        {
            System.out.println("Cannot issue Book " + b.number + " to " + name);
        }
    }

    void returnBook() 
    {
        if (issuedBook != null) 
        {
            issuedBook.isIssued = false;
            System.out.println(name + " returned Book " + issuedBook.number);
            issuedBook = null;
        }
    }
}

public class Library 
{
    public static void main(String[] args) 
    {
        Book b1 = new Book(1);
        Book b2 = new Book(2);

        Member m1 = new Member("Ravi");
        Member m2 = new Member("Neha");

        m1.issueBook(b1);
        m2.issueBook(b1); 
        m1.returnBook();
        m2.issueBook(b1);

        System.out.println(b1);
        System.out.println(b2);
    }
}
