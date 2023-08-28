GFG

  Remove duplicate element from sorted Linked List

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here
	    Node left = head;
	    Node right = head.next;
	    left.next = null;
	    Node newHead = left;
	    while(right != null) {
	        if(right.data != left.data) {
	            left.next = right;
	            left = left.next;
	            right = right.next;
	            left.next = null;

	            continue;
	        }

	        right = right.next;
	    }

	    return newHead;
    }
}
