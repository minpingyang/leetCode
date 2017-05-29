
//125ValidPalindrome 
//Given a string, determine if it is a palindrome, 
//considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

// Note:
// Have you consider that the string might be empty? This is a good question to ask during an interview.

// For the purpose of this problem, we define empty string as valid palindrome.

class Test{
    public boolean isPalindrome(String s) {
        // if s is empty or spaces
        if(s.isEmpty() || s.trim().length() == 0) return true;

        //if s only has spaces

        //else
        String strings[] = s.split(", ");
        if(strings.length == 1){
            String firstC[] = strings[0].split(" ");
            if(firstC.length==1){
                return true;
            }
            return false;
        }
        for(int i = 0; i< strings.length-1;i++){
            String s1[] = strings[i].split(" ");
            String s2[] = strings[i+1].split(" ");
            if(!s1[0].equalsIgnoreCase(s2[0])){
                return false;
            }
        }
         return true;
        
    }
}


public class Solution {
    //test
    public static void main(String[] args) {
        Test s = new Test();

        boolean f = s.isPalindrome("               ");
        boolean f2 = s.isPalindrome("");
        if(f2){
            System.out.println("22true");
        }
        if(f){
            System.out.println("11true");
        }
        
    }
}



// public class Solution {
//     public boolean isPalindrome(String s) {
//         if (s.isEmpty()) {
//             return true;
//         }
//         int head = 0, tail = s.length() - 1;
//         char cHead, cTail;
//         while(head <= tail) {
//             cHead = s.charAt(head);
//             cTail = s.charAt(tail);
//             if (!Character.isLetterOrDigit(cHead)) {
//                 head++;
//             } else if(!Character.isLetterOrDigit(cTail)) {
//                 tail--;
//             } else {
//                 if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
//                     return false;
//                 }
//                 head++;
//                 tail--;
//             }
//         }
        
//         return true;
//     }
// }