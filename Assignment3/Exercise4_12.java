import java.util.Scanner;
class ConcertHall{
    static Scanner scanner = new Scanner(System.in);
    static String[] S = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    static String[] A = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    static String[] B = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
    public static void print_seat(String[] sab){
        for(int i = 0;i< sab.length; i++){
            System.out.print(" " + sab[i]);
        }
    }
    public static void put_name(String[] sab){
        System.out.print("이름>>");
        String name = scanner.next();
        System.out.print("번호>>");
        try{
        int seat_num = scanner.nextInt();
        sab[--seat_num] = name;
    } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1부터 10까지의 좌석으로 다시 입력하세요.");
        }
    }
    public static void delete_seat(String[] sab){
        int i;
        System.out.print("이름>>");
        String delete_name = scanner.next();
        for (i = 0; i < sab.length; i++){
            if (delete_name.equals(sab[i])) {
                sab[i] = "---";
                break;
            }
        }
        if (i == sab.length)
            System.out.println("이름이 존재하지 않습니다. 다시 입력하세요.");
    }
    public static void reservation(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int seat = scanner.nextInt();
        switch(seat){
            case 1:
                System.out.print("S>>");
                print_seat(S);
                System.out.println(" ");
                put_name(S);
                break;
            case 2:
                System.out.print("A>>");
                print_seat(A);
                System.out.println(" ");
                put_name(A);
                break;
            case 3:
                System.out.print("B>>");
                print_seat(B);
                System.out.println(" ");
                put_name(B);
                break;
            default:
                System.out.println("1부터 3까지 다시입력하세요.");
        }
    }
    public static void search(){
        System.out.print("S>> ");
        for (int i = 0; i < S.length; i++)
            System.out.print(" "+ S[i]+ " ");
        System.out.println();
        System.out.print("A>> ");
        for (int i =0; i< A.length; i++)
            System.out.print(" " + A[i] + " ");
        System.out.println();
        System.out.print("B>> ");
        for (int i = 0; i < B.length; i++)
            System.out.print(" " +B[i]+" ");
        System.out.println();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public static void cancle(){
        System.out.print("좌석: S:1, A:2, B:3>> ");
        int seat = scanner.nextInt();
        switch(seat){
            case 1:
                System.out.print("S>>");
                print_seat(S);
                System.out.println();
                delete_seat(S);
                break;
            case 2:
                System.out.print("A>>");
                print_seat(A);
                System.out.println();
                delete_seat(A);
                break;
            case 3:
                System.out.print("B>>");
                print_seat(B);
                System.out.println();
                delete_seat(B);
                break;
            default:
                System.out.println("1부터 3까지 다시 입력하세요.");
        }
    }

}
public class Exercise4_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int number = scanner.nextInt();
            if (number == 4)
                break;
            switch(number){
                case 1:
                    ConcertHall.reservation();
                    break;
                case 2:
                    ConcertHall.search();
                    break;
                case 3:
                    ConcertHall.cancle();
                    break;
                default:
                    System.out.println("1부터 4까지 다시 입력하세요.");
            }
        }
    }
}