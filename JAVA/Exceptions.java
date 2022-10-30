
/* 
0. Import a new Scanner
1. Create Exception class
2. Create a new Scanner in the main method()
3. Crt some arr
4. try, catch(Exception )
*/

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        int[] categories = { 11, 22, 33, 44, 55, 66 };

        try {
            System.out.println(categories[choice]);
        } catch (Exception NotIntError) {
            System.out.println("Caterogy Exception Occured.");
        }

        scanner.close();
    }
}