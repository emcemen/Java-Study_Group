package InterviewQA;

public class EvenOdd {
    public static void main(String[] args) {

        //x----->it is a number is it even or odd?
        System.out.println(evenOrOdd(0));

    }



    public static String evenOrOdd(int number){
        String result = "";
        if(number%2==0){
             result ="Number is Even";
        }else{
            result="Number is Odd";
        }

        return result;

    }
}
