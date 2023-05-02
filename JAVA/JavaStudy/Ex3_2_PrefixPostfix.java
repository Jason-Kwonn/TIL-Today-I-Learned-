package JavaStudy;

public class Ex3_2_PrefixPostfix {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i; // Postfix
        i++;
        // i = 5, j = 5 로 참조 이후 i 값 1 증가, i = 6, j = 5
        System.out.println("j = i++; 실행 후, i=" + i + ", sj=" + j);

        i = 5;
        j = 0;

        ++i;
        j = i; // Prefix
        // i = 5, j = 5 로 참조 이후 i 값 1 증가, i = 6, j = 5
        System.out.println("j = ++i; 실행 후, i=" + i + ", j=" + j);
    }
}
