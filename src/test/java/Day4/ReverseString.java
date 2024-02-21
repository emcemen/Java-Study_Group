package Day4;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[]Args){

       String word = "Study Group";

        StringBuilder reversedString = new StringBuilder(word).reverse();
        System.out.println(reversedString.toString());


        System.out.println("------------------------------------");

        int [] str = {1,2,3,4,5};             //-->[1,2,3,4,5] ----->i index will change
        int []reverse = new int[str.length];  //-->[0,0,0,0,0] ------> y indez will change
                                              //-->[5,4,3,2,1] ------->output array will be reverse

        for (int i = str.length-1 ,y=0; i>=0 ; i--,y++) {

            reverse[y]=str[i];
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------------------------");

        String[]group = {"Study group","kazim","emre","turgut"};
        String[] reversedArray=new String[group.length];

        for (int i = group.length-1,y=0; i>=0 ; i--,y++) {

            reversedArray[y]=group[i];
        }
       System.out.println(Arrays.toString(reversedArray));

        //String[]reversedArray={turgut, emre, kazim, Study group}

        String outputReverse="";


        //String eachReverse="";
        //We creared that eachReverse object because we wanted to store each reversed elements into that object
        for (String eachElement:reversedArray) {

            String eachReverse ="";
            for(int i =eachElement.length()-1,y=0;i>=0;i--,y++){
                eachReverse+=eachElement.charAt(i);
            }
            outputReverse+=eachReverse+",";
        }

        System.out.println(outputReverse);

        }

    }


