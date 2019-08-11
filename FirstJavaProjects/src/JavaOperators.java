public class JavaOperators {
    public static void main(String [] args) {

        /*
        == TYPES OF JAVA OPERATORS ==

        Arithmetic operators
        + - * / % ++ --

        Relational operators
        == != > < >= <=

        Logical operators
        && || !

        Assignment operators
        = += -= *= /= %=

        Conditional operators
        ?:
         */

        int a = 10, b = 20, c = 15, d = 25;

        //Arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("c % a = " + (c % a));

        a++; //Equivalent to a = a + 1;
        System.out.println("a++ = " + a);

        a--;
        System.out.println("a-- = " + a);

        //Relational operators
        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));

        //Logical operators
        System.out.println("&& : " + ((a > b) && (a != b)));
        System.out.println("|| : " + ((a < b) || (a != b)));
        System.out.println("! : " + !(a > b));

        //Assignment operator
        a += b; //a = a + b;
        System.out.println("a += b = " + a);

        a -= b;
        System.out.println("a -= b = " + a);

        a *= b;
        System.out.println("a *= b = " + a);

        a /= b;
        System.out.println("a /= b = " + a);

        a %= b;
        System.out.println("a %= b = " + a);

    }
}

