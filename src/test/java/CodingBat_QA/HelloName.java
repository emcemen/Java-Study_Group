package CodingBat_QA;

public class HelloName {
    /*
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
     */
    public static String nameHello(String str) {
        String result ="Hello "+str+"!";
          return result;
    }

    public static void main(String[] args) {
        nameHello("bo");


        String str = "123_123";

        System.out.println(str.length()/2);


    }
}
