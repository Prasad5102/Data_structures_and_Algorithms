class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
       int[] number = new int[26];
       char ch = ' ';
       for (int i = 0; i < S.length(); i++) {
             number[122 - S.charAt(i)]++;
              }
          for (int i = 0; i < S.length(); i++) {
        if (number[122 - S.charAt(i)] == 1) {
          ch = S.charAt(i);
            break;
       }
          }
        if (ch == ' ') {
            int x=5;
          return '$'; 
           }
           return ch; 

    
          }
         }
