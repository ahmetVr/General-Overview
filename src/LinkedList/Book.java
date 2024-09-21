package LinkedList;

public class Book {
    private int year;
    private String author;

    private String type;

    private int pageNumber;
    private String publisher;

    public Book(int year,String author,String type,int pageNumber,String publisher) {
        this.year = year;
        this.author = author;
        this.type = type;
        this.pageNumber = pageNumber;
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
