package String;

import java.util.ArrayList;

public class Rotate_bit {

    ArrayList<Integer> rotate(int N, int D)
    {
        D=D%16;
        ArrayList<Integer> ans = new ArrayList<>();
        int left = ((N<<D | N>>(16-D)) & 65535);
        int right = ((N>>D | N<<(16-D)) & 65535);
        
        ans.add(left);
        ans.add(right);
        
        return ans;
    }
}