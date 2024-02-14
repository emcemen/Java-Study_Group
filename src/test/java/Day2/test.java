package Day2;

public class test {
    public static void main(String[] args) {

        //frequency of letter in word

        // word -> java
        // how many 'a' chars?

        int counter = 0;
        String word = "Javamatasaka";
                    // 0123
        for(int i =0;i<=word.length()-1;i++){
            if(word.charAt(i)=='a'){
             ++counter;
            }
        }
        System.out.println( counter);



    }

}
