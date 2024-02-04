package LoveBabbarSheet.String;
import java.util.*;
public class Find_first_repeated_character{

String firstRepChar(String s) 
{ 
    // code here
    HashMap<Character,Integer> set = new HashMap<>();
    
    for(char c:s.toCharArray())
    {
        if(set.containsKey(c)) return Character.toString(c);
        set.put(c,1);
    }
    
    return "-1";
}
}