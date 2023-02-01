import java.util.Scanner;

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
