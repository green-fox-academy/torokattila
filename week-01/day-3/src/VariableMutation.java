
public class VariableMutation {
    public static void main(String[] args) {

        System.out.print("a, ");
        int a = 3;
        a += 10;
        System.out.println(a);

        System.out.print("b, ");
        int b = 100;
        b -= 7;
        System.out.println(b);

        System.out.print("c, ");
        int c = 44;
        c *= 2;
        System.out.println(c);

        System.out.print("d, ");
        int d = 125;
        d /= 5;
        System.out.println(d);

        System.out.print("e, ");
        int e = 8;
        e = e*e*e;
        System.out.println(e);

        System.out.print("f, ");
        int f1 = 123;
        int f2 = 345;
        boolean bigger = f1 > f2;
        System.out.println(bigger);

        System.out.print("g, ");
        int g1 = 350;
        int g2 = 200;
        g2 *= 2;
        boolean biggerThan = g2 > g1;
        System.out.println(biggerThan);

        System.out.print("h, ");
        int h = 135798745;
        boolean isDivisibleBy11 = h % 11 == 0;
        System.out.println(isDivisibleBy11);

        System.out.print("i, ");
        int i1 = 10;
        int i2 = 3;
        boolean logic = (i1 > (i2 * i2) && (i1 < (i2 * i2 * i2)));
        System.out.println(logic);

        System.out.print("j, ");
        int j = 1521;
        boolean k = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(k);






    }
}
