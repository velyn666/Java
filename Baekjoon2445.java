import java.util.Scanner;

public class Baekjoon2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = -n + 1; i<n; i++){
            for (int j = 1; j<= n*2; j++) {
                if (n-((i>=0)?i:-i)<j&&n+((i>=0)?i:-i)>=j) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}