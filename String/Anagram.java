package String;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char[] s1 = a.toCharArray();
        Arrays.sort(s1);
        char[] s2 = b.toCharArray();
        Arrays.sort(s2);
        // if(s1.length!=s2.length) return false;
        
        // for(int i=0; i<s1.length;i++)
        // {
        //     if(s1[i]!=s2[i]) return false;
        // }
        //return true;
        return Arrays.equals(s1,s2);
        
    }
    
}
