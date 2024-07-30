public class Relational {
    public static void main(String[] args) {
        //Equality Operators(==, !=)
        //Relational Operator(<,<=,>,>=)
        //Logical Operators(&&,||) AND(&&) OR(||)

        int a = 10;
        int b = 16;
        int c = 20;

        boolean BisNotGreatest = (b<a) || (b<c);
        System.out.println(BisNotGreatest);
        boolean CisNotGreatest = (c<a) || (c<b);
        System.out.println(CisNotGreatest);

        // boolean isAGreatest = (a>b) && (a>c);
        // boolean isBGreatest = (b>a) && (b>c);
        // boolean isCGreatest = (c>a) && (c>b);

        // System.out.println(isAGreatest);
        // System.out.println(isBGreatest);
        // System.out.println(isCGreatest);

        // System.out.print("\n");

        // System.out.println(a == b);
        // System.out.println(a != b);
        // System.out.println(a > b);
        // System.out.println(a >= b);
        // System.out.println(a < b);
        // System.out.println(a <= b);

    }
}
