package Day3;

public class Palindrome {
    /*
    given a String determine if it is palindrome
    palindrome means the String is read the same forwards and backwards

    ex:
    anna
    racecar
     */
    public static void main(String[] args) {

        String word="anastasmumsatsana";
                  // 0123456 ----->index
        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);//-----------reverse="r";----->ra---->rac
        }
        System.out.println(reverse);
        if(word.equals(reverse)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }






    }


}