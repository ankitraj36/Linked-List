public class LinkedList {
    public static void displayr(Node head){
        if (head== null) return; 
            
           // head = head.next;
            displayr(head.next);
            System.out.print(head.data + " ");
            
        }
       

//    public static void display(Node head){
//      while(head!= null) {
//         System.out.print(head.data + " ");
//         head = head.next;
        
//     }
//    }
      public static int length(Node head){
        int count = 0;
        while (head!=null) {
            count++;
            head = head.next;
            
        }
        return count;
      }

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

    }
        

    public static void main(String[] args) {
        Node a  = new Node(9);
        Node b  = new Node(19);
        Node c  = new Node(29);
        Node d  = new Node(39);
        Node e  = new Node(49);
        Node F  = new Node(49);
       
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = F;

        
     //   Node temp = a;

        // for (int i = 0; i < 5; i++) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
        // }

        // while (temp!=null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
            
        // }
     // displayr(a);
       System.out.println(length(a));
    }


}