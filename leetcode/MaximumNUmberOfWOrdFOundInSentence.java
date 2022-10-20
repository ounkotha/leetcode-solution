package leetcode;

public class MaximumNUmberOfWOrdFOundInSentence {
    public int mostWordsFound(String[] sentences) {

        int count=1;
        int max=0;
        for(int i=0;i<sentences.length;i++){

            char[] ch = sentences[i].toCharArray();

            for(int j=0;j<ch.length;j++){

                if(ch[j]==' '){
                    count++;
                }
            }

            if( max < count){

                max=count;
            }
            count=1;
        }

        return max;
    }
}
