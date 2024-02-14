package Day3;

import java.util.Arrays;

public class Anagram {
    /*
     [IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word
     Ex:
       listen
       silent

The letters of the two words are the same so they are anagram
      */
    public static void main(String[] args) {
        String word1 ="Token";
                       // 012345
        String word2= "Poker";

        char[] anagramCheck1 =word1.toLowerCase().toCharArray();
        char[] anagramCheck2 =word2.toLowerCase().toCharArray();

        Arrays.sort(anagramCheck1);
        Arrays.sort(anagramCheck2);

        if(Arrays.equals(anagramCheck1,anagramCheck2)){
            System.out.println("ANAGRAM");
            System.out.println(Arrays.toString(anagramCheck1));
            System.out.println(Arrays.toString(anagramCheck2));
        }else{
            System.out.println(" ITS NOT AN ANAGRAM");
            System.out.println(Arrays.toString(anagramCheck1));
            System.out.println(Arrays.toString(anagramCheck2));
        }
















    }
}
