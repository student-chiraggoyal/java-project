/* Types of operators are
1. arithmetic operators
2. unary operators
3. relational operators
4. logical operators
6. assignment operators
*/

public class Day02_Operators {
    public static void main(String[] args) {

//        arithmetic operators -> binary operators(they need 2 operands) and unary operators(they need only one operator)
//        binary operators are +, -, *, / (gives the quotient), % (gives the reminder)
//        if both operands are int then result is int
//        int a = 9;
//        int b = 7;
//        System.out.println("add = "+(a+b));
//        System.out.println("sub = "+(a-b));
//        System.out.println("mul = "+(a*b));
//        System.out.println("division = "+(a/b));
//        System.out.println("reminder = "+(a%b));

//        is one is float and other is int then result is int
//        float a = 9.0f;
//        int b = 7;
//        System.out.println("add = "+(a+b));
//        System.out.println("sub = "+(a-b));
//        System.out.println("mul = "+(a*b));
//        System.out.println("division = "+(a/b));
//        System.out.println("reminder = "+(a%b));

//        if both are float then result is float
//        float a = 9.0f;
//        float b = 7.0f;
//        System.out.println("add = "+(a+b));
//        System.out.println("sub = "+(a-b));
//        System.out.println("mul = "+(a*b));
//        System.out.println("division = "+(a/b));
//        System.out.println("reminder = "+(a%b));

//        unary operators are ++a(pre increment means pehle value change hogi uske bad use hogi mtlb pehle value change ho jayegi bad mein print hogi) and a++(post increment means pehle value use hogi uske bad change hogi mtlb pehle value print hogi uske bad increase hogi)
//        and also --a(pre decrement means pehle value change hogi uske bad use hogi mtlb pehle value change ho jayegi bad mein print hogi) and a--(post decrement means pehle value use hogi uske bad change hogi mtlb pehle value print hogi uske bad decrease hogi)
//        int a1 = 4;
//        System.out.println(a1);     //4
//        System.out.println(a1++);   // pehle value use hogi means output is 4
//        System.out.println(a1);     //5
//        int a2 = 7;
//        System.out.println(a2);     //7
//        System.out.println(++a2);   //pehle value change hogi means output is 8
//        System.out.println(a2);     //8
//        int a3 = 9;
//        System.out.println(a3);     //9
//        System.out.println(a3--);   //9
//        System.out.println(a3);     //8
//        int a4 = 8;
//        System.out.println(a4);     //8
//        System.out.println(--a4);   //7
//        System.out.println(a4);     //7


//        relational operators -> ==, !=, >, <, >=, <=
//        System.out.println(5==6);
//        System.out.println(4!=8);
//        System.out.println(5>7);
//        System.out.println(6<8);
//        System.out.println(6>=9);
//        System.out.println(7<=9);


//        logical operators
//        && (AND -> * if one is false then complete result is false)
//        || (OR -> + if one is true then complete result is true)
//        ! (NOT)
//        System.out.println(4>3 && 6<5);
//        System.out.println(4>3 || 6<5);
//        System.out.println(!(2>3));


//        assignment operator -> =, +=, -=, *=, /=
//        int as1 = 10;
//        System.out.println(as1+=10); //10+10=20
//        System.out.println(as1-=9); //20-9=11
//        System.out.println(as1*=7); //11*7=77
//        System.out.println(as1/=7); //77/7=11

//        int x, y, z;
//        x = y = z = 2;
//        x += y;
//        y -= z;
//        z /= (x+y);
//        System.out.println(x + " " + y + " " + z);

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
