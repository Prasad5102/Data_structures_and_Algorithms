

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node curr=head;
        Node prev=null;
        if(curr.next==null){
            return true;
        }
        while(curr!=null){
            if(curr.next==null && head.data==curr.data){
              head=head.next;
              prev.next=null;
                
                curr=head;
            }
            prev=curr;
            curr=curr.next;
        }
        if(head.next==null){
            return true;
        }
        else {
            return false;
        }

        
    }    
}

  /* Node slow =head;
        Node fast =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
             curr=next;
        }
        Node right=prev;
        Node left = head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
        }
        return true;*/
