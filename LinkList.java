//reversing a linkedList
import java.io.*; // for handling input/output
import java.util.*;
import java.util.Scanner;
public class LinkList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data= d;
            next=null;

        }
    }
    // function to reverse the link list
    Node reverse(Node node){
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current !=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current =next;
        }
        node = prev;
        return node;


    }
    // prints content of double linked list
    void printList(Node node){
        while (node!= null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String [] args ){
    LinkedList list = new LinkedList();
    list.head = new Node(85);
    list.head.next = new Node(15);
    list.head.next.next = new Node(4);
    list.head.next.next..next = new Node(20);
    System.out.println("Given Linked list");
    list.printList(head);
    head = list.reverse(head);
    System.out.println("");
    System.out.println("Reversed lisnked list");
    list.printList(head);    
    }
}
