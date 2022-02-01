import java.util.*;

public class Aladdin{
// also known as the Gas Station problem in leetCode
    private static int optimalPoint(int[] magic, int[] dist) {
        int start = 0;
        int magic_left = 0;
        int magic_used = 0;

        int i = 0;
        
        while (i<magic.length) {    
            magic_left += magic[i] - dist[i];
            if (magic_left < 0) {
                start = i + 1;
                magic_used += magic_left;
                magic_left = 0;
            }
            i+=1;
        }

        if (magic_used + magic_left >= 0)
            return start;
        else
            return -1;
    }

    public static void main(String[] args){

    int[] a = {2,4,5,2};
    int[] b = {4,3,1,3};

    System.out.println(optimalPoint(a, b)); //prints 1
    }
}