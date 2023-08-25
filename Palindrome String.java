gfg

Palindrome String



class Solution {
    int isPalindrome(String S) {
        // code here
        for(int i = 0; i<S.length()/2; i++){
            if(S.charAt(i) != S.charAt(S.length() - i - 1)){
                return 0;
    }
        }
        return 1;
    }
};
