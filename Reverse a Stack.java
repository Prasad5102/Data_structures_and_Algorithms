

//User function Template for Java

class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
      
       
     reverseP(s, new ArrayList<Integer>());
    }
    static void reverseP(Stack<Integer> s, ArrayList<Integer> list){
         if(s.isEmpty()){
        
            return ;
        }
       list.add(s.pop());
        reverseP(s,list);
        s.push(list.remove(0)); 
    }
}
