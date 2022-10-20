package leetcode;

import java.util.*;

public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        List<Boolean> ar = new ArrayList<>();
        for(int i = 0; i < candies.length;i++)
        {
            if(candies[i] > max)
            {
                max = candies[i];
            }
        }
        for(int i = 0; i < candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            {
                ar.add(true);
            }else{
                ar.add(false);
            }
        }

        return ar;
    }

}
