package Day1;

public class Variables_01 {
  public static void main(String[]args){

      int number= 2;
     // int emre%sr= 3;  variable can only start with underscore or dolar sign it can not start with digits and other special char.


      String bookName ="Rain";

      int newNumber =34;

     // ++newNumber;
      --newNumber;
      System.out.println(newNumber); // first decrement------>34--->33
      --newNumber;
      System.out.println(newNumber); // second decrement ---->33---->32

      //POST DECREMENT
      System.out.println("================================");
      System.out.println(newNumber--);//----> first decrement will be stay same ---->32 ----->32
      System.out.println(newNumber);//31
      System.out.println(newNumber--);//31
      System.out.println(newNumber);//30

      System.out.println("=================================");
      int b =25;
      int c =25;

      System.out.println(b++);

      System.out.println(++c);


     int x = 6;
     int y =5;


     x+=y;
     //x=x+y;
      System.out.println(x);

      System.out.println((x >= y) && (x <= y));
      //                   true   &&    false  ----->false
      System.out.println("__________________________________");

      String v1 = new String(" Java Heap or String Pool");
      String v2 = new String("Java Heap or String Pool");
      String v3 ="Java Heap or String Pool";
      String v4 ="Java Heap or String Pool";

      System.out.println(v3 == v4);
      System.out.println(v1 == v2);
      System.out.println(v1 == v3);
      System.out.println(v2 == v4);

  }




}
