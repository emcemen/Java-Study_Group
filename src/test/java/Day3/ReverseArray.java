package Day3;

import java.util.Arrays;

public class ReverseArray {
     /*

    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */
     public static void main(String[] args) {


         int[] numbers = {1, 2, 3, 4, 5};
                      //  0  1  2  3  4
         int[] reverse = new int[numbers.length];
                   //  [5,4,3,2,1]
                  //   0  1 2 3 4

     // numbers index will go from last index to first index and I created e new Array which is name reverse.
    // That Arrays length equal to my numbers array so i need to conver all elements reverse side with the help of for loop

    for(int i=numbers.length-1, y=0; i>=0;i--,y++){

        reverse[y]=numbers[i];
    }
         System.out.println(Arrays.toString(reverse));









     }
}
