//not solved
package leetcode;

public class ShuffleString {

    public static void main(String[] arg){
        String s="codeleet";
        int[] indices = new int []{4,5,6,7,0,2,1,3};

        char[] ch = s.toCharArray();
        char[] res = new char[indices.length];

        for(int i=0;i< indices.length;i++){

            res[i]=ch[indices[i]];
        }
         System.out.println(String.valueOf(res));
    }


}
