import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap so nguyen: ");
        int input = sc.nextInt();

       while (input > 0) {
           int soDu = input % 2;
           stack.push(soDu);
           input = input / 2;
       }
        System.out.println("Nhi phan: ");
       int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}