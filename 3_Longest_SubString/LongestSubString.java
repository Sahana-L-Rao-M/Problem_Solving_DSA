
import java.util.*;


class LongestSubString{
//    Need improvment
//    Current time: 108ms
//
//    public int lengthOfLongestSubstring(String s) {
//        public int lengthOfLongestSubstring (String s){
//            int maxLength = 0;
//
//            for (int i = 0; i < s.length(); i++) {
//                Set<Character> set = new HashSet<>();
//                int currentLength = 0;
//
//                for (int j = i; j < s.length(); j++) {
//                    if (set.contains(s.charAt(j))) {
//                        break;
//                    }
//                    set.add(s.charAt(j));
//                    currentLength++;
//                }
//
//                maxLength = Math.max(maxLength, currentLength);
//            }
//
//            return maxLength;
//        }
//    }
    // 2ms to solve
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int[] charList = new int[256];
            int maxLength = 0;
            int length = s.length();

            while(right < length){
                if(charList[s.charAt(right)] == 1){
                    while(charList[s.charAt(right)] == 1){
                        charList[s.charAt(left)]--;
                        left++;
                    }
                }
                charList[s.charAt(right)]=1;
                maxLength = Math.max(maxLength, right-left+1);
                right++;

            }
}