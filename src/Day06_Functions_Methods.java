import java.util.Scanner;

public class Day06_Functions_Methods {

    public static void printHelloWorld(){
        System.out.println("Hello World");
    }

//    public static void calculateSum(int a, int b){
//        int sum = a+b;
//        System.out.print("the sum is: "+ sum);
//    }
    public static int calculateSum(int a, int b){
        return a+b;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }

    public static int product(int a, int b){
        return a*b;
    }

    public static int calculateFactorial(int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int binomialCoefficient(int a, int b){
        int facta = calculateFactorial(a);
        int factb = calculateFactorial(b);
        int factc = calculateFactorial(a-b);
        return facta/(factb*factc);
    }


    //method or function overloading using different parameters
    //fun to calculate sum of 2 nums
    public static int sum(int a, int b){
        return a+b;
    }
    //fun to calculate sum of 3 nums
    public static int sum(int a, int b, int c){
        return a+b+c;
    }


    //method or function overloading using different datatypes
    //fun to calculate sum of 4 integer nums
    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    //fun to calculate sum of 4 float nums
    public static float sum(float a, float b, float c, float d){
        return a+b+c+d;
    }


    //check the number is prime or not
    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }
        else{
            for(int i=2; i<=Math.sqrt(a); i++){         // ------> optimized method
                if(a%i==0)
                    return false;
            }
            return true;
        }
    }

    //check the prime numbers in a range
    public static void primeRange(int a){
        for(int i=2; i<=a; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }


    //conversion from binary to decimal
    public static int binToDec(int n){
        int dec = 0;
        int power = 0;
        while(n>0){
            int lastDigit = n%10;
            dec = dec+(lastDigit*(int)Math.pow(2, power));
            power++;
            n = n/10;
        }
        return dec;
    }

    //conversion from decimal to binary
    public static int decToBin(int n){
        int bin = 0;
        int power = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10, power));
            power++;
            n = n/2;
        }
        return bin;
    }


    //average of three numbers
    public static float average(int a, int b, int c){
        return (a+b+c)/3.0f;
    }

    //even number
    public static boolean isEven(int a){
        return a % 2 == 0;
    }

    //check the number is palindrome or not
    public static boolean checkPalindrome(int n){
        int original = n;
        int rev=0;
        while(n>0){
            int last_digit = n%10;
            rev = (rev*10) + last_digit;
            n = n/10;
        }
        return rev==original;
    }

    //sum of digits
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum+lastDigit;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("this is the functions or methods class");
        printHelloWorld();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
//        calculateSum(a, b);
//        System.out.println("the result is: "+ calculateSum(a, b));

//        swap(a, b);

//        System.out.println("the product is: " + product(a, b));

//        System.out.println("the factorial is: "+ calculateFactorial(a));

//        System.out.println("the binomial cofficient is: " + binomialCoefficient(a, b));

//        System.out.println(sum(2,4,5));
//        System.out.println(sum(3,6));

//        System.out.println(sum(4,5,6,6));
//        System.out.println(sum(4.2f,5.6f, 8.9f, 2.1f));

//        System.out.println(isPrime(a));

//        primeRange(a);

//        System.out.println(binToDec(1101));

//        System.out.println(decToBin(11));

//        System.out.println(average(2, 5, 6));

//        System.out.println(isEven(a));

//        System.out.println(checkPalindrome(100));

        System.out.println(sumOfDigit(12358));
    }
}
