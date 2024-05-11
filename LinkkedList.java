class Node {
  char element;
  Node next;
  
  public Node(char element){
      this.element = element;
      this.next = null;

  }
}

public static class LinkedList{
  Node head = null;

  public void addFirst(char element){
    Node newNode = new Node(element);
    newNode.next = head;
    head = newNode;

  }

  void display(){
    Node current = head;
    if (head == null) {
      System.out.println("list is null");
      
    } else {
      while (current!=null) {
        System.out.println(current.element);
        current = current.next;
        
      }
    }
  }

}

class Test {
public static void main(String[] args) {
  LinkedList l1 = new LinkedList();
  l1.addFirst('2');
}
}