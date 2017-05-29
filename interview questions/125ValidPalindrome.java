
// Given a string, determine if it is a palindrome, 
//considering only alphanumeric characters and ignoring cases.

// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.

// Note:
// Have you consider that the string might be empty? This is a good question to ask during an interview.

// For the purpose of this problem, we define empty string as valid palindrome.


public class Solution {
    public boolean isPalindrome(String s) {
        // if s is null
        if(s == null) return true;
        //else
        String strings[] = s.split(", ");
        for(i = 0; i< strings.length()-1;i++){
	        String s1[] = strings[i].split(" ");
	        String s2[] = strings[i+1].split(" ");
	        if(s1[1]!=s2[1]){
	        	return false;
	        }
        }
        return true;
        
    }
}