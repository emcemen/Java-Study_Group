package Day4;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {

            String str = "Today is Friday. Have a good weekend!";

            // reverse: yadoy si .yadirF evah a doog !dnekeew

            String [] words = str.split(" ");  //--> [Today,is,Friday.,Have,a,good,weekend!]
            System.out.println(Arrays.toString(words));
            String reverse = "";   //"yadoT si

            for(String each : words){ // goes through one element at a time in the array

                String eachReverse = "";  //" si
                for(int i = each.length() - 1; i >= 0; i--){  // reversing a String, from last index to 0
                    eachReverse += each.charAt(i);
                }

             //   reverse += eachReverse + " ";
                System.out.println(eachReverse);
            }

          //  System.out.println(reverse);



    }
}
