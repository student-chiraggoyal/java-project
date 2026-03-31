import java.util.Scanner;

public class Day01_Basics {
    public static void main(String[] args) {
        System.out.println("hello world");
//        data types in java
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean var = true;
        float price = 10.5f;    //double-> for large float type values
        System.out.println(price);
        int num = 25;    //long-> for large integer type values
        System.out.println(num);
        short n = 240;
        System.out.println(n);

/*        size of datatypes
        byte -> 1 byte [-128 to +128]
        short -> 2 bytes
        char -> 2 bytes
        boolean -> 1 byte
        int -> 4 bytes [-2B to +2B]
        long -> 8 bytes
        float -> 4 bytes
        double -> 8 bytes
 */

//        Scanner class
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  //sc.next() function sirf space tak hi kam krta hai mtlb iskoo jaha bhi space dikhega ye bss wahi pe ruk jyega aage k words ko nahi dekhega
        System.out.println(input);

        String name = sc.nextLine(); //ye function mere sare spaces ko include krta hai mtlb full name print ho skta hai
        System.out.println(name);

        int number = sc.nextInt();
        System.out.println(number);

        float large_price = sc.nextFloat();
        System.out.println(large_price);

        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        short a = sc.nextShort();
        System.out.println(a);

        long l = sc.nextLong();
        System.out.println(l);


//        sum of two numbers
        System.out.print("enter value of a: ");
        int a1 = sc.nextInt();
        System.out.print("enter value of c: ");
        int c = sc.nextInt();
        System.out.println("the sum is: "+(a1+c));

//        area of circle
        System.out.print("enter the radius: ");
        float r = sc.nextFloat();
        float area = (3.14f * r * r);
        System.out.println("area of circle is: "+area);

        //type conversion or implicit conversion -> which means we have to store a small size datatype value into a large size datatype value.
        //it is automatically done by the compiler
        //integer -> float
        float f = sc.nextInt();
        System.out.println(f);

        //type casting or explicit conversion -> which means by forcing we have to store a large size datatype value intp a small size datatype value.
        //it is forciblly done by the user and some data is lost here
        float g = sc.nextFloat();
        System.out.println((int)g);

        long l1 = sc.nextLong();
        System.out.println((short)l1);


        //average of three numbers
        System.out.print("enter the first number: ");
        float n1 = sc.nextFloat();
        System.out.print("enter the second number: ");
        float n2 = sc.nextFloat();
        System.out.print("enter the third number: ");
        float n3 = sc.nextFloat();
        float avg = (n1+n2+n3)/3;
        System.out.println("the average is: "+avg);

//      area of the square
        System.out.print("enter the side of square: ");
        float side = sc.nextFloat();
        System.out.println("the are of square is: "+(side*side));

        //gst 18% in the bill
        System.out.print("enter the price of book: ");
        float c1 = sc.nextFloat();
        System.out.print("enter the price of comic: ");
        float c2 = sc.nextFloat();
        System.out.print("enter the price of novel: ");
        float c3 = sc.nextFloat();
        float g1 = (c1+(18/100f)*c1);
        float g2 = (c2+(18/100f)*c2);
        float g3 = (c3+(18/100f)*c3);
        float total_price = g1+g2+g3;
        System.out.println("total price of book after adding 18% GST: "+g1);
        System.out.println("total price of comic after adding 18% GST: "+g2);
        System.out.println("total price of novel after adding 18% GST: "+g3);
        System.out.println("the total cost of the bill is: "+total_price);

        int $ = 24;
        System.out.println($);
    }
}
