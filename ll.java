public class ll {


   public static Node head;
   public static Node tail;
   public static int size;

   
   public static class Node {
     int value;
     Node next;
     
     Node( int value){
      this.value = value;
      this.next = null;
     }
      
   }
   public void addfirst(int value){
      Node newNode = new Node(value);
      size++;
      if (head == null) {
         head = tail = newNode ;   
      }
      newNode.next = head;
      head = newNode;

 
   }
   public void addlast(int value){
      Node newnode = new Node(value);
      if (head== null) {
         head = tail = newnode;
   
         
       }
     
      tail.next = newnode;
      tail = newnode;

   }
   public void insertAt(int val, int index) {
      Node newnNode = new Node(val);

      if (index == 0) {
         addfirst(val);
         return;
      }
      if (index == size) {
         addlast(val);
         return;
      }
      

      Node temp = head;
      int i = 0;
      while (i<index -1) {
         temp = temp.next;
         i++;
         
      }
      newnNode.next = temp.next;
      temp.next = newnNode;
      
   }
   public int deletefirst(){
      int val = head.value;
      if (head == null) {
         tail = null;
   
         
      }
      head = head.next;
      return val;
   }

   public int deletelast(){
      Node temp = head;
      for (int i = 0; i < size; i++) {
         temp = temp.next;
      }
      int val = temp.value;
      temp.next = null;
      tail = temp;
      return val;
   }



   void display(){
      Node temp = head;
      while (temp != null) {
         System.out.print(temp.value + " -> ");
         temp = temp.next;
         
      }
      System.out.println("null");
     
   }
   public static void main(String[] args) {
      ll list = new ll();
      list.addfirst(2);
      list.addfirst(20);
      list.addfirst(200);
      list.addfirst(2000);
      list.addlast(30000);
      list.insertAt(69, 3);
      list.display();

      System.out.println();
      System.out.println(list.deletelast());
      list.display();
   }
}

