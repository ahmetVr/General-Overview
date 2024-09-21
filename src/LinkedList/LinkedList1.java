package LinkedList;

import org.w3c.dom.Node;

public class LinkedList1 {
    Node head;

    static class Node {
        Book book;
        Node next;

        public Node(Book book) {
            this.book = book;
        }
    }


    public void addNode(int year,String author,String type,int pageNumber,String publisher) {
        Node node1 = new Node(new Book(year,author,type,pageNumber,publisher));
        if(head == null) {
            head = node1;
        } else {
            Node tmp = head;
            while(tmp != null) {
                tmp = tmp.next;
            }
            tmp.next = node1;
        }
    }

    public void addNode(Book book) {
        Node node1 = new Node(book);
        if(head == null) {
            head = node1;
        } else {
            Node tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node1;
        }
    }

    public Book searchByAuthor(String name) {
        Node tmp = head;
        while(tmp != null) {
            if(tmp.book.getAuthor().equals(name)) {
               return tmp.book;
            }
            tmp = tmp.next;
        }
        return null;
    }



}
