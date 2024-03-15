GFG Java Solution
  Linked List that is Sorted Alternatingly


  class Solution {
    
   public Node sort(Node head){
        Node tmp = head;
        Node h1 = new Node(-1); 
        Node h2 = h1;
        h2=h1;
        
        while(tmp!=null && tmp.next!=null && tmp.next.next!=null  ){
            Node n = new Node(tmp.data);
            tmp=tmp.next.next;
            h1.next=n;
            h1=n;
        }
        if(tmp.next==null || tmp.next.next==null){
            Node n = new Node(tmp.data);
            h1.next=n;
            h1=n;
        }
        h1=fun(head.next, h1);
        h1.next=null;
        return h2.next;
    
   }
   public static Node fun(Node head, Node h1){
       if(head.next==null || head.next.next==null){
            Node n = new Node(head.data);
           h1.next=n;
           h1=n;
           return h1;
       }
       h1=fun(head.next.next, h1);
        Node n = new Node(head.data);
       h1.next=n;
       h1=n;
       return h1;
   }


}
