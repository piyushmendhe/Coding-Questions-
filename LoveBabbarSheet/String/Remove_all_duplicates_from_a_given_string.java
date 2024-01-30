package LoveBabbarSheet.String;

import java.util.HashSet;

public class Remove_all_duplicates_from_a_given_string {

     String removeDuplicates(String str) {
     
        HashSet<Character> set = new HashSet<>();
        
        StringBuilder S = new StringBuilder();
        
        for(char c: str.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
                S.append(c);
            }
            
        }
        return S.toString();
    }
    
}
