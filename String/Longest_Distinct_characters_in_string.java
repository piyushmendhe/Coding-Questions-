package String;
import java.util.*;
public class Longest_Distinct_characters_in_string {
    
    static int longestSubstrDistinctChars(String S){
    Set<Character> set = new HashSet<>();

    int MaxL = 0;
    int left = 0;
    int right= 0;

    while(right<S.length())
    {
        if(!set.contains(S.charAt(right)))
        {
            set.add(S.charAt(right));
            MaxL = Math.max(MaxL, right- left +1);
            right++;
        }
        else
        {
            set.remove(S.charAt(left));
            left++;
        }
    }
    return MaxL;
    }

}
