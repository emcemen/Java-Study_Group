package Day4;

public class StringToInt {
    public static void main(String[] args) {


        //1-String to int converting

        String number = "198";
        int a = 2;
        System.out.println((number + a));//------>String+ int-----> 1982

        int b=Integer.parseInt(number);//String converted to an int number which is name b.
        System.out.println(a + b);//---------->int+int------------>200

        //2-int to String converting
        int c = 5;
        String number2 ="198";
        System.out.println(number2 + (c+3));//------>String+ int-----> 1988

        String output= number2+c;
        System.out.println(output);
        System.out.println(output.substring(3)+5);

        String n1= String.valueOf(c);
        System.out.println(number2 + c);//----->String+String---->1985





    }
}