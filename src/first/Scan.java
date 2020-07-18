package first;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("this is my first file");
        System.out.println("enter your name");
        String name = scan.nextLine();
        System.out.println("enter the your code");
        short code = scan.nextShort();
        System.out.println("name: " + name);
        System.out.println("code: " + code);
    }
}
