import java.util.Scanner;

public class Exercise2_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int num = scanner.nextInt();
        int x, y;
        x = num / 10;
        y = num % 10;

        if (x == 3 || x == 6 || x == 9) {
            if (y == 3 || y == 6 || y == 9)
                System.out.println("박수짝짝");
            else
                System.out.println("박수짝");
        }

        if (x != 3 && x!= 6 && x!=9){
            if (y == 3 || y== 6 || y ==9)
                System.out.println("박수짝");
        }


        scanner.close();


    }
}