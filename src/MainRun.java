import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();
        System.out.print("Enter value c: ");
        int c = sc.nextInt();

        Account account = new Account(a,b,c);
        System.out.println(account.display());
    }
}
