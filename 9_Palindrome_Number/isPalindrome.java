
import java.util.*;


class isPalindrome {
 // Half Traversal - takes 5ms
//    public boolean isPalindrome(int x) {
//        if(x<0 || (x%10 ==0 && x!=0) ) return false;
//        else{
//            int rev =0;
//            while(x > rev){
//                rev = (rev * 10) + (x%10);
//                x = x/10;
//            }
//            return rev == x || x == rev/10;
//        }
//    }
//
//    Full traversal : 5ms
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else {
            int rev = 0;
            int num = x;
            while (x > 0) {
                rev = (rev * 10) + (x % 10);
                x = x / 10;
            }
            return rev == num;

        }
    }
}