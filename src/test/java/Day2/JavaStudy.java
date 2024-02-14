package Day2;

import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {

     //   calculateTwoNumber();
        evenOrOdd();

    }

      /*
    Create a method that will ask the user to enter two numbers. Add the numbers and print the result
     */

    public static void calculateTwoNumber(){
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        System.out.println(firstNumber + secondNumber);
    }

    public static void evenOrOdd(){
        System.out.println("Please enter a number between 0.....to 100 see if it is Even or Odd ");
        Scanner input = new Scanner(System.in);
        int number1= input.nextInt();
        if(number1 % 2 ==0){
            System.out.println("Your number is even");
        }else if (number1 % 2 ==1) {
            System.out.println("Your number is odd");
        }

    }



        }







