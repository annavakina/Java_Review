package week04_review;

import java.util.Scanner;


public class TestStringObjects {

    public static void main(String[] args) {

  Scanner input =new Scanner(System.in);

String str1 = new String("Java");//Heap
String str2 = "Java";

// Scanner input = System.in;

        System.out.println("str1 = +str1");
        System.out.println("str2 = + str2");

        System.out.println(str1 ==str2);
        System.out.println(str1.equals(str2));
        System.out.println("____________________________________________________________");

      String s1 = "Batch 28";

       String s2 = "Batch 28";

        System.out.println(s1 == s2);

        String s3 = new Scanner(System.in).nextLine();//new String("Batch28")

        System.out.println(s2 ==s3);//false
        System.out.println(s2.equals(s3));

        System.out.println("_________________________________________");

        String a1 = "Wooden Spoon";
        String a2 = "Wooden Spoon";
        String a3 ="Wooden Spoon";

        String b1 = new String("Wooden Spoon");
        String b2 = new String("Wooden Spoon");
        String b3 = new String("Wooden Spoon");


    }




}
