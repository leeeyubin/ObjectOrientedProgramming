import java.util.Scanner;

public class Exercise2_2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 자리 정수 입력(10~99)>>");
        int num = scanner.nextInt();
        int x, y;

        x = num / 10;
        y = num % 10;

        if (x == y)
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");

        scanner.close();
    }

}
