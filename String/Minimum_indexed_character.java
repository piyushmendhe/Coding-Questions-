package String;

public class Minimum_indexed_character {
    public static int minIndexChar(String str, String patt)
    {
        int min = 0;
       for(char c :str.toCharArray())
       {
           if(patt.contains(Character.toString(c)))
           {
               return min;
           }
           min++;
       }
       return -1;
    }
}
