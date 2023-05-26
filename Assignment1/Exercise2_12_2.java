import java.util.Scanner;

public class Exercise2_12_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("연산>>");
        int x = scanner.nextInt();
        String calculation = scanner.next();
        int y = scanner.nextInt();

        switch (calculation){
            case "+":
                System.out.printf("%d + %d의 계산 결과는 %d", x, y, x+y);
                break;
            case "-":
                System.out.printf("%d - %d의 계산 결과는 %d", x, y, x-y);
                break;
            case "*":
                System.out.printf("%d * %d의 계산 결과는 %d", x, y, x*y);
                break;
            case "/":
                if (y == 0)
                    System.out.println("0으로 나눌 수 없습니다.");
                else
                    System.out.printf("%d / %d의 계산 결과는 %d", x, y, x/y);
                break;
        }

        scanner.close();

    }

}
