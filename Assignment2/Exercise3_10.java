import java.util.Random;

public class Exercise3_10 {

    public static void main(String[] args) {
        Random rn = new Random();

        int myArray[][] = new int[4][4];
        int row, column;

        for (int i = 0; i<10; i++) {

            do {
                row = rn.nextInt(4);
                column = rn.nextInt(4);

            }while (myArray[row][column] != 0);

            myArray[row][column] = rn.nextInt(10) + 1;
        }
        for (int i = 0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(myArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}