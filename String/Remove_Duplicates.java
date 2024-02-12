package String;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
    String removeDups(String S) {
    Set<Character> set = new HashSet<>();
    String res = "";
    int i = 0;
    while(i <S.length())
    {
        if(!set.contains(S.charAt(i)))
        {
            res+=S.charAt(i);
            set.add(S.charAt(i));
            i++;
        }
        else
        {
            i++;
        }
    }
    return res;
}
}