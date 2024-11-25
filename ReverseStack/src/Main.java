import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        String sc = input.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < sc.length(); i++) {
            char digitChar = sc.charAt(i);
            if (Character.isDigit(digitChar)) {
                stack.push(Character.getNumericValue(digitChar));
            }

        }
        System.out.println("Chuỗi ban đầu: ");
        System.out.println(stack);

        System.out.println("Lấy các phần tử từ Stack (đảo ngược):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        input.close();
    }
}