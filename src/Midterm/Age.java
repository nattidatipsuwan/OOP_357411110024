package Midterm;
import java.util.Scanner;
public class Age {
    private static final int x = 2561;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        for (; i <= 3; ) {
            System.out.print("กรุณากรอกข้อมูลปี พ.ศ. เกิดของคุณ:  ");
            int y = scanner.nextInt();

            System.out.println("อายุของคุณคือ: " + (x - y));
            i++;
        }
    }
}
