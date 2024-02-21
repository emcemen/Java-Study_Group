package CodingBat_QA;

public class FirstHalf {
   /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
*/

    //if it is even length what we need to do-------->if the length diveded by 2 equally we can do it
    //if it is odd length what we need to do -------> if the length not diveded by 2 equally that means it is length odd
    //so we need extra info for solve the QA


    public static String firstHalf(String str){
        int substringEndIndex =str.length()/2;
        String result = str.substring(0,substringEndIndex);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoor"));
        System.out.println(7 / 2);//----->3,5--------->3
        //WOO-H-OOR

    }
}
