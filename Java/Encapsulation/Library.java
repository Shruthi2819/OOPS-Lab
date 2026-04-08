class LibraryBook {
    private String bookName;
    private boolean isIssued;


    public LibraryBook(String name) {
        bookName = name;
        isIssued = false; // initially available
    }

    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(bookName + " has been issued.");
        } else {
            System.out.println(bookName + " is already issued.");
        }
    }

    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(bookName + " has been returned.");
        } else {
            System.out.println(bookName + " was not issued.");
        }
    }

    public void getStatus() {
        if (isIssued) {
            System.out.println(bookName + " is Not Available.");
        } else {
            System.out.println(bookName + " is Available.");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming");

        book.getStatus();     
        book.issueBook();    
        book.getStatus();  
        book.issueBook();     
        book.returnBook();   
        book.getStatus();   
    }
}