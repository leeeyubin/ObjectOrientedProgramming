import java.util.Scanner;
public abstract class Shape{
    private Shape next;
    public Shape() {next = null;}
    public void setNext(Shape obj) {next = obj;}
    public Shape getNext() {return next;}
    public abstract void draw();
}
class Line extends Shape{
    @Override
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Circle");
    }
}
class GraphicEditor {
    public static void main(String[] args) {
        Shape start = null, last = null, go = null, temp = null;
        int sum1 = 0;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            switch(num1)
            {
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    int num2 = scanner.nextInt();
                    if (num2 == 1){
                        if(sum1 == 0){
                            start = new Line();
                            last = start;
                        }else {
                            Shape obj = new Line();
                            last.setNext(obj);
                            last = obj;
                        }
                        sum1++;
                    }
                    if(num2 == 2){
                        if(sum1 == 0){
                            start = new Rect();
                            last = start;
                        }else {
                            Shape obj = new Rect();
                            last.setNext(obj);
                            last = obj;
                        }
                        sum1++;
                    }
                    if (num2 == 3){
                        if(sum1 == 0){
                            start = new Circle();
                            last = start;
                        }else {
                            Shape obj = new Circle();
                            last.setNext(obj);
                            last = obj;
                        }
                        sum1++;
                    }
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int deleteLocation = scanner.nextInt();
                    if (deleteLocation > sum1) {
                        System.out.println("삭제할 수 없습니다.");
                    } else {
                        if (deleteLocation == 1) {
                            start = start.getNext();
                            if (start == null) {
                                last = null;
                            }
                        } else {
                            go = start;
                            for (int i = 1; i < deleteLocation - 1; i++) {
                                go = go.getNext();
                            }
                            go.setNext(go.getNext().getNext());
                            if (deleteLocation == sum1) {
                                last = go;
                            }
                        }
                        sum1--;
                    }
                    break;
                case 3:
                    go = start;
                    while(go != null){
                        go.draw();
                        go = go.getNext();
                    }
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    System.exit(0);
                    break;
            }
        }
    }
}