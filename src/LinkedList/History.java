package LinkedList;

public class History extends Book {
    private int date;


    public History(int year, String author, String type, int pageNumber, String publisher,int date) {
        super(year, author, type, pageNumber, publisher);
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
