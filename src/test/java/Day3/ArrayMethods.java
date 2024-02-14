package Day3;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] numbers1 = new int[3];//-----  [0,0,0,]
        numbers1[0] = 30;
        numbers1[1] = 25;
        numbers1[2] = 125;

        int[] numbers2 = {23, 34, 45, 12, 98, 78, 24, 29};

        System.out.println(Arrays.toString(numbers1));//print
        System.out.println("----------------");

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));//sorted numbers print
        System.out.println("----------------");

        System.out.println(Arrays.equals(numbers1, numbers2));
        System.out.println("----------------");

        String words = "Today is Wednesday and the weather is very nice";
        System.out.println(Arrays.toString(words.split(" ")));
        System.out.println("----------------");

        System.out.println(Arrays.toString(words.toCharArray()));//char array allw us to turn each char to an array element
        System.out.println("----------------");

        for (char eachChar:words.toCharArray()) {
            System.out.print(eachChar+"");
        }
        System.out.println("----------------");

        int[]numbers3=Arrays.copyOf(numbers2,9);
        System.out.println(Arrays.toString(numbers3));


    }}
