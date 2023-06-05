import java.util.*;
public class Exercise7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        ArrayList<Character> charAl = new ArrayList<>();
        ArrayList<Double> doubleAl = new ArrayList<>();
        for(int i = 0; i<6; i++) {
            String temp = scanner.next();
            charAl.add(temp.charAt(0));
        }
        for(char temp : charAl){
            switch(temp) {
                case 'A':
                    doubleAl.add(4.0); break;
                case 'B':
                    doubleAl.add(3.0); break;
                case 'C':
                    doubleAl.add(2.0); break;
                case 'D':
                    doubleAl.add(1.0); break;
                case 'F':
                    doubleAl.add(0.0); break;
            }
        }
        Iterator<Double> it = doubleAl.iterator();
        double sum = 0.0;
        while(it.hasNext()){
           sum += it.next();
        }
        double average = sum / 6;
        System.out.println(average);
        scanner.close();
    }
}
