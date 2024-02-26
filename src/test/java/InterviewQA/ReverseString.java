package InterviewQA;

public class ReverseString {
    public static void main(String[] args) {
        String word ="Hello World";
        //output = dlroW olleH
        String output="";
        for(int i =word.length()-1;i>=0;i--){
            output+=word.charAt(i);
        }

        System.out.println(output);



        //2.method

       StringBuilder object = new StringBuilder(word);
       object.reverse();

       String output2 =object.toString();

        System.out.println(output2);


    }
}
