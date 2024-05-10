

//User function Template for Java

class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        
        Node curr=head;
        Node prev =head;
        while(curr.next!=null){
            curr=curr.next;
            if(prev.data==curr.data){
                if(curr.next==null){
                    prev.next=null;
                }
                else{
                prev.next=curr.next;
                curr.next.prev=prev;
                }
                
            }
            
            else{
                prev=prev.next;
            }
        }
        return head;
    }
}
