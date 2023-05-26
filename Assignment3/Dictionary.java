import java.util.Scanner;
public class Dictionary {
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};
    public static String Kor2Eng(String word){
        int sum = 0;
        for (int i = 0; i < kor.length; i++) {
            sum++;
                if (kor[i].equals(word)) {
                    String res = kor[i] + "은 " + eng[i];
                    return res;
                }
            }
            if (sum == kor.length) {
                String res = word + "는 저의 사전에 없습니다.";
                return res;
            }
            return null;
    }
}
class DicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("힌글 단어?");
            String word = scanner.next();
            if (word.equals("그만"))
                break;
            String res = Dictionary.Kor2Eng(word);
            System.out.println(res);
        }
        scanner.close();
    }
}

