public class Book {
    private String bookId = "0";
    private BookType bType;

    public Book () throws Exception {
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    public void setType(BookType database) {
        this.bType = database;
    }
}
