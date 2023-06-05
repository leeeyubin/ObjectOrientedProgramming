import java.util.Iterator;
import java.util.Vector;
import java.util.Scanner;
public class Exercise7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        while(true) {
            System.out.print("강수량 입력 (0입력시 종료)>>");
            int n = scanner.nextInt();
            if( n == 0 )
                break;
            v.add(n);
            for(int i =0; i<v.size(); i++){
                System.out.print(v.get(i)+ " ");
            }
            System.out.println();
            System.out.print("현재 평균 ");
            Iterator<Integer> it = v.iterator();
            int sum = 0, count = 0;
            while(it.hasNext()){
                sum += it.next();
                count++;
            }
            int average = sum / count;
            System.out.println(average);
        }
        scanner.close();
    }
}
