import java.util.Scanner;

public class Day05_Patterns {
    public static void main(String[] args) {
        System.out.println("this is the pattern class");


        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of lines: ");
        int num = sc.nextInt();

//        * * * *
//        * * *
//        * *
//        *
//        for(int i=1; i<=num; i++){
//            for(int j=i; j<=num; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//        *
//        * *
//        * * *
//        * * * *
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//        1
//        12
//        123
//        1234
//        for(int i=1; i<=num; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }

        char ch = 'A';
        for(int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
