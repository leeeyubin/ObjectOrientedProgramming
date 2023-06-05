import java.util.*;
public class Exercise7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hs = new HashMap<>();
        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true){
            System.out.print("이름과 포인터 입력>> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            int point = scanner.nextInt();
            if(hs.containsKey(name)){
               int newPoint =  hs.get(name) + point;
               hs.put(name, newPoint);
            }
            else
                hs.put(name, point);
            Set<String> key = hs.keySet();
            Iterator<String> it = key.iterator();
            while(it.hasNext()){
                String search = it.next();
                System.out.print("(" + search + "," + hs.get(search) + ")");
            }
            System.out.println();
        }
    }
}
