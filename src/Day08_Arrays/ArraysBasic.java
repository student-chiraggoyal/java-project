package Day08_Arrays;

import java.util.Scanner;

public class ArraysBasic {

    //passing array as an argument
    public static void update(int marks[]){     //yaha pe humne apne pure array ko is function ke argument mein pass kr dia
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }


    public static void main(String[] args) {
        System.out.println("this is the array class");

        //normal as we do
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the marks");
//        int m1 = sc.nextInt();
//        System.out.println(m1);

//        int marks[] = new int[100];             //array formation

        Scanner sc = new Scanner(System.in);    //for input
//        System.out.print("enter the physics marks");
//        marks[0] = sc.nextInt();                //input in the array
//        System.out.print("enter the chem marks");
//        marks[1] = sc.nextInt();
//        System.out.print("enter the maths marks");
//        marks[2] = sc.nextInt();
//
//        System.out.println("physics marks are: " + marks[0]);       //output of the array
//        System.out.println("chem marks are: " + marks[1]);
//        System.out.println("maths marks are: " + marks[2]);
//
//        marks[2]  =marks[2] + 1;                //update the array value using index
//        System.out.println("maths marks are: " + marks[2]);

//        System.out.println("length of the array is: " + marks.length);          //length of the array


        //passing array as an argument
        int marks[] = {98, 85, 45};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");           //array ki jo values update hui hai wo humare main function mein bhi change hui hai
        }
        System.out.println();
    }
}
