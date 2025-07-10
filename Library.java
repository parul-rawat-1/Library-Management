class Book {
    int number;
    boolean isIssued = false;

    Book(int number) {
        this.number = number;
    }

    public String toString() {
        return "Book " + number + " (Issued: " + isIssued + ")";
    }
}

class Member {
    String name;
    Book issuedBook = null;

    Member(String name) {
        this.name = name;
    }

    void issueBook(Book b) {
        if (!b.isIssued && issuedBook == null) {
            b.isIssued = true;
            issuedBook = b;
            System.out.println(name + " issued Book " + b.number);
        } else {
            System.out.println("Cannot issue Book " + b.number + " to " + name);
        }
    }

    void returnBook() {
        if (issuedBook != null) {
            issuedBook.isIssued = false;
            System.out.println(name + " returned Book " + issuedBook.number);
            issuedBook = null;
        }
    }
}

public class Library {
    public static void main(String[] args) {
        // Hardcoded books and members
        Book b1 = new Book(1);
        Book b2 = new Book(2);

        Member m1 = new Member("Ravi");
        Member m2 = new Member("Neha");

        // Issue and return
        m1.issueBook(b1);
        m2.issueBook(b1);  // already issued
        m1.returnBook();
        m2.issueBook(b1);  // now available

        // Display status
        System.out.println(b1);
        System.out.println(b2);
    }
}
 
