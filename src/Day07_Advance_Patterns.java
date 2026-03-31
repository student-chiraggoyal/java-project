import java.util.Scanner;

public class Day07_Advance_Patterns {

    public static void hollowRectangle(int rows, int columns){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                if(i==1 || i==rows || j==1 || j==columns){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotHalfPyramid(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalPyramid(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int lines){
        int counter = 1;
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterflyPattern(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(2*(lines-i)); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=lines; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(2*(lines-i)); j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=lines; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=lines; j++){
                if(i==1 || j==1 || i==lines || j==lines){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=lines; i>=1; i--){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i + "   ");
            }
            System.out.println();
        }
    }

    public static void plaindromePattern(int lines){
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("this is the advanced pattern class");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("enter no of columns: ");
        int columns = sc.nextInt();
        System.out.print("enter the number of lines: ");
        int lines = sc.nextInt();

//        hollowRectangle(rows, columns);
//        invertedRotHalfPyramid(lines);
//        invertedHalPyramid(lines);
//        floydTriangle(lines);
//        zeroOneTriangle(lines);
//        butterflyPattern(lines);
//        solidRhombus(lines);
//        hollowRhombus(lines);
//        diamondPattern(lines);
//        numberPyramid(lines);
        plaindromePattern(lines);
    }
}
