import java.util.Scanner;
public class Exercise6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        String myString = scanner.nextLine();
        for(int i =0; i<myString.length(); i++){
            String temp = myString.substring(0,1);
            myString = myString.substring(1);
            myString = myString.concat(temp);
            System.out.println(myString);
        }
        scanner.close();
    }
}
