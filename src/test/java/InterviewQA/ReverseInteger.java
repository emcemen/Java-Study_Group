package InterviewQA;

import javax.swing.*;

public class ReverseInteger {
    public static void main(String[] args) {


        int num = 23456;
        //output=65432
        String output="";

        String str = String.valueOf(num);//--->number to String
        for(int i =str.length()-1;i>=0;i--){
            output+=str.charAt(i);
        }//-------------------------------------->reversed number but it is string.
        //String to int

        int reversed =Integer.parseInt(output);
        System.out.println(reversed);
        //System.out.println(reversed + 10);
        System.out.println("================================================");


        int reversed2 = 0;

        while (num != 0) {   //23456
            int digit = num % 10; ///6
            reversed2 = reversed2 * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed2);
    }

    }

