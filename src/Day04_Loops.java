import java.util.Scanner;

public class Day04_Loops {
    public static void main(String[] args) {
        System.out.println("this is the chapter of loops");
        Scanner sc = new Scanner(System.in);

//        //while loop
//        int i=1;
//        System.out.print("enter the number: ");
//        int num = sc.nextInt();
//        while(i<=10){
//            System.out.println(num + "*" + i + "=" + num*i);
//            i++;

//        //print numbers from 1 to 10
//        int i=1;
//        while(i<=10){
//            System.out.print(i+" ");
//            i++;

//        //print number from 1 to n
//        int i=1;
//        System.out.print("enter the number: ");
//        int n = sc.nextInt();
//        while(i<=n){
//            System.out.print(i + " ");
//            i++;

//        //print sum of first n natural numbers
//        System.out.print("enter the number: ");
//        int num = sc.nextInt();
//        int i=1, sum=0;
//        while(i<=num){
//            sum+=i;
//            i++;
//        }
//        System.out.println("the sum is: "+sum);


//        //for loop
//        System.out.print("enter the number: ");
//        int n = sc.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(n + "*" + i + "=" + n*i);

//        //square pattern
////        * * * *
////        * * * *
////        * * * *
////        * * * *
//        System.out.println("enter the no of lines");
//        int lines = sc.nextInt();
//        for(int i=1; i<=lines; i++){
//            for(int j=1; j<=lines; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //print reverse of a number
//        System.out.println("enter a number: ");
//        int num = sc.nextInt();
//        while(num>0){
//            int lastdigit = num%10;
//            System.out.print(lastdigit);
//            num = num/10;
//        }

//        //reverse the given number
//        System.out.println("enter the number: ");
//        int num = sc.nextInt();
//        int rev = 0;
//        while(num>0){
//            int lastdigit = num%10;
//            rev = (rev*10) + lastdigit;
//            num = num/10;
//        }
//        System.out.println(rev);

//        //do-while
//        int counter = 1;
//        do{
//            System.out.println("hello world");
//            counter++;
//        }while(counter<=10);

//        //break statement - loop wahi end ho jayeg aage chalega hi nahi
//        for(int i=1; i<=10; i++){
//            if(i==3){
//                break;
//            }
//            System.out.print(i +" ");
//        }

//        //keep entering numbers till user enters a multiple of 10
//        do{
//            System.out.println("enter the number: ");
//            int n = sc.nextInt();
//            if(n%10==0){
//                break;
//            }
//            System.out.println(n);
//        }while(true);

//        //continue statement - koi number ya item ko skip kr dega lekin loop chalta rahega
//        for(int i=1; i<=10; i++){
//            if(i==6){
//                continue;
//            }
//            System.out.print(i + " ");
//        }

//        //display all the numbers entered by user except multiples of 10
//        do{
//            System.out.print("enter the number: ");
//            int num = sc.nextInt();
//            if(num%10==0){
//                continue;
//            }
//            System.out.println(num);
//        }while (true);

        //check if a number is prime or not
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        if(num==2){
            System.out.print(num + "is a prime number");
        }
        else{
            boolean isprime = true;
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i==0){
                    isprime = false;
                }
            }
            if (isprime==true){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is a composite number");
            }
        }
    }
}