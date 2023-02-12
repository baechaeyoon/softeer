import java.util.Scanner;

/**
 * 주행거리 비교하기
 * level 1
 */
public class toCompareMileage {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = a == b ? "same" : a > b ? "A" : "B";
        System.out.println(result);
    }
}
