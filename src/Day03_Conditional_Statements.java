import java.util.Scanner;

public class Day03_Conditional_Statements {
    public static void main(String[] args) {
//        int age = 29;
//        if(age>=18){
//            System.out.println("you can vote");
//        }
//        else{
//            System.out.println("you are not adult");
//        }

//        //largest of two numbers
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("enter the second number: ");
//        int num2 = sc.nextInt();
//        if(num1>num2){
//            System.out.println(num1+" is the largest");
//        } else{
//            System.out.println(num2+" is the largest");
//        }


//        print if a number is even or odd
        System.out.print("enter the number: ");
        int num1 = sc.nextInt();
        if(num1%2==0){
            System.out.println(num1+" is an even number");
        } else{
            System.out.println(num1+" is an odd number");
        }

//        else if
//        System.out.println("enter your age: ");
//        int age = sc.nextInt();
//        if(age<=5){
//            System.out.println("you are a kid");
//        } else if (age>5 && age<=13) {
//            System.out.println("you are a child");
//        } else if (age>13 && age<=18) {
//            System.out.println("you are a teenager");
//        } else{
//            System.out.println("you are an adult person");
//        }

//        income tax calculator
//        System.out.print("enter your income in rs: ");
//        float income = sc.nextFloat();
//        if(income<500000){
//            System.out.println((0.0f/100)*income+" tax you need to pay on "+income);
//        } else if(income>=500000 && income <1000000){
//            System.out.println((20.0f/100)*income+" tax you need to pay on "+income);
//        } else{
//            System.out.println((30.0f/100)*income+" tax you need to pay on "+income);
//        }

//        print the largest of three numbers
//        System.out.print("enter the first number: ");
//        int num1 = sc.nextInt();
//        System.out.print("enter the second number: ");
//        int num2 = sc.nextInt();
//        System.out.print("enter the third number: ");
//        int num3 = sc.nextInt();
//        if(num1>num2 && num1>num3){
//            System.out.println(num1+" is the largest number");
//        }
//        else if(num2>num3){
//            System.out.println(num2+" is the largest number");
//        } else{
//            System.out.println(num3+" is the largest number");
//        }


//        ternary operator
//        variable = condition?statement1:statement2;
//        int larger = (5>3)?5:3;
//        System.out.println(larger);

//        int num = sc.nextInt();
//        String type = (num%2==0)?"even":"odd";
//        System.out.println(type);


//        switch statement
//        System.out.print("enter the week number: ");
//        int num = sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("invalid number");
//        }


//        int num = sc.nextInt();
//        if(num>0){
//            System.out.println(num+" is a positive number");
//        }
//        else if(num==0){
//            System.out.println("it is zero");
//        }else{
//            System.out.println(num+" is a negative number");
//        }

//        float temp = 103.5f;
//        if(temp>100){
//            System.out.println("you have a fever");
//        } else{
//            System.out.println("you don't have a fever");
//        }

//        leap year
        System.out.print("enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a leap year");
                } else{
                    System.out.println(year+" is not a leap year");
                }
            } else{
                System.out.println(year+" is a leap year");
            }
        } else{
            System.out.println(year+" is not a leap year");
        }
    }
}
