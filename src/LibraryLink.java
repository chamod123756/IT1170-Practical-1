public class LibraryLink {

    int bookID;
    String title;
    int copies;
    LibraryLink next;

    public LibraryLink(int bookID, String title, int copies) {
        this.bookID = bookID;
        this.title = title;
        this.copies = copies;
        this.next = null;
    }

    public void displayBook() {
        System.out.println(
                "ID: " + bookID +
                        ", Title: " + title +
                        ", Copies: " + copies);
    }
}