
public class IncrementAndDecrement {
    public static void main(String[] args) {
        int test = 5;
        ++test;
        System.out.println(test);
        --test;
        System.out.println(test);
        System.out.println();

        int x = 34;
        int y = ++x; // y = 35
        System.out.println(y);

        int z = 34;
        int a = z++; // z = 34
        System.out.println(a);
        System.out.println();

        int num1 = 4;
        int num2 = 8;
        num2 += num1; // num2 = num2 + num1; 12
        System.out.println(num2);
        System.out.println();
    }
}
