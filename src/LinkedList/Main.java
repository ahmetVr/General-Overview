package LinkedList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(2011,"Arnold","History",200,"Doğu");
        Book book2 = new Book(2012,"Harry","Lec",300,"Kuzey");
        Book book3 = new Book(2012,"Micheal","Kids",100,"Batı");
        Book book4 = new History(1999,"Ahmet","history",120,"West", 200);
        LinkedList1 list = new LinkedList1();
        list.addNode(book1);
        list.addNode(book2);
        list.addNode(book3);
        list.addNode(book4);
        History tmp = (History) list.searchByAuthor("Ahmet");
        System.out.println(tmp.getDate());
    }
}
