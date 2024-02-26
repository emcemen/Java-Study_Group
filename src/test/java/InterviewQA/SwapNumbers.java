package InterviewQA;

public class SwapNumbers {
    public static void main(String[] args) {

        int x = 8;  //---->16
        int y =16;   //----.8
        //swap numbers

        x=x+y; // x=24 iki rakami bir araya getirdik en buyuk sayiyi x'e donusturduk

        y=x-y;// y=8   en buyuk olan x sayisindan y cikarsa normalde x ' in ilk degerine ulasiriz buda degistirmek
        //istedigimiz y sayisina esittir.


        x=x-y;// x=16 en buyuk olan x sayisindan y cikarsa normalde y 'nin ilk degerine ulasiriz buda degistirmek istedigimiz x sayisina esittir.

        int z =34;
        int t =4;
        System.out.println("-----------------------------------");
        z=z+t; //38
        t=z-t; //34   z=34 y=4 ---->z=38  y=34
        z=z-t; //4       z=4   y=34

        System.out.println("-----------------------------------");

        int num1 =5;
        int num2=10;
        int temp =num1; //temp=5
        num1=num2; //num1=10
        num2=temp;// num2=5;








    }
}
