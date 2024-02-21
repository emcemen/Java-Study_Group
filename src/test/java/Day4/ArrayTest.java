package Day4;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        String[]test =new String[4];//------>  [0,0,0,0]
                                   //--index-> [0,1,2,3]
        System.out.println(Arrays.toString(test));

        test[0]="emre";
        test[1]="kazim";
        test[2]="turgut";
        test[3]="group";

        System.out.println(Arrays.toString(test));

        String []test2 ={"D","C","B","D"};
        System.out.println(Arrays.toString(test2));




    }
}
