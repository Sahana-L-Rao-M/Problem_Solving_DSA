
import java.util.*;


class LongestSubString{
//Need improvment
//    Current time: 108ms
    public int lengthOfLongestSubstring(String s) {
        public int lengthOfLongestSubstring (String s){
            int maxLength = 0;

            for (int i = 0; i < s.length(); i++) {
                Set<Character> set = new HashSet<>();
                int currentLength = 0;

                for (int j = i; j < s.length(); j++) {
                    if (set.contains(s.charAt(j))) {
                        break;
                    }
                    set.add(s.charAt(j));
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }

            return maxLength;

        }
    }
}