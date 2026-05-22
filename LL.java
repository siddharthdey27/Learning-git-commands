import java.util.*;
public class LL {
    Node head = null;
  class Node{
    String data;
    Node next; 
    Node(String data){
        this.data = data;
    }
    Node(){}
  }
 public void addFirst(String data){
   Node newNode = new Node(data);
    if(head == null){
      head =  newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
 }  
 public void addLast(String data){
    Node newNode = new Node(data);
    Node currNode = new Node();
    if(head == null){
      head = newNode;
      return;
    }
    else{
    currNode = head;
    while(currNode.next != null){
      currNode = currNode.next;
    }
    currNode.next = newNode;
    newNode.next = null;
    }
 }
 public void printList(){
  if(head == null){
    System.out.println("List is empty");
  }
  else{
   Node temp = new Node();
   temp = head;
   while(temp!=null){
      System.out.print(temp.data);
      System.out.print("-> ");
      temp = temp.next;
   }
   System.out.print("null\n");
   }
 }
 public void deleteFirst(){
  if(head == null){
    System.out.println("The list is empty");
  }
  else{
    head = head.next;
  }
 }
 public void  deleteLast(){
  Node temp= head;
  Node btemp = head;
  if(head.next == null){
    head = null;
    return;
  }
  if(head == null){
    System.out.print("list is empty");
  }
  while(temp.next != null){
    temp = temp.next;
  }
  while(btemp.next != temp){
    btemp = btemp.next;
  }
  btemp.next = null;
 }
public static void main(String[] args) {
  LL list1 = new LL();
  list1.addLast("hello");
  list1.addLast("my");
  list1.addLast("name");
  list1.addFirst("Skibidi");
  list1.addLast("Fuck off");
  list1.printList();
  list1.deleteFirst();
  list1.printList();
  list1.deleteLast();
  list1.printList();
  list1.deleteLast();
}
}

