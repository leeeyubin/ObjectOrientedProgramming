import java.util.Scanner;
class Phone {
    String name, tel;
    public Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }
}
public class PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int people = scanner.nextInt();
        Phone[] p = new Phone[people];
        for(int i=0; i<p.length; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true){
            System.out.print("검색할 이름>>");
            String search = scanner.next();
            if(search.equals("그만"))
                break;
            int sum = 0;
            for(int i = 0; i<p.length; i++){
                sum++;
                if (search.equals(p[i].name)){
                    System.out.println(p[i].name+"의 번호는 "+p[i].tel+" 입니다.");
                    sum ++;
                }
            }
            if(sum == p.length)
            System.out.println(search + " 이 없습니다.");

        }
        scanner.close();
    }
}
